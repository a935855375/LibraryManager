package controllers

import javax.inject.{Inject, Singleton}

import models.MongoDB
import play.api.libs.json._
import play.api.mvc.{MessagesAbstractController, MessagesControllerComponents}
import reactivemongo.play.json._
import services.{CommonService, MailerService}

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class User @Inject()(cc: MessagesControllerComponents,
                     mongoDB: MongoDB,
                     mailer: MailerService,
                     common: CommonService)
                    (implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def test = Action.async { implicit request =>
    Future {
      mailer.sendEmail("笨蛋", "1060238139@qq.com", views.html.mail.activeMail("笨蛋", "1234").body)
      Ok("hello")
    }
  }

  def index = Action.async { implicit request =>
    Future.successful(Ok(views.html.index()))
  }

  def introduce = Action.async { implicit request =>
    Future.successful(Ok(views.html.introduce()))
  }

  def readerService = Action.async { implicit request =>
    Future.successful(Ok(views.html.readerService()))
  }

  def register = {

  }

  def doRegister = {

  }

  def login = Action.async { implicit request =>
    Future.successful(Ok(views.html.login()))
  }


  def preOrder = Action.async { implicit request =>
    mongoDB.preOrderCol.flatMap(_.update(Json.obj("uid" -> 1), Json.obj("$push" -> Json.obj("book" -> Json.obj("pid" -> 1, "bid" -> 1, "time" -> System.currentTimeMillis, "outdate" -> 0)))))
    Future.successful(Ok)
  }

  /**
    * 在这里测试mongodb的elem查询 查询所有预定过bid为1的用户
    *db.order.find({"book":{$elemMatch:{"bid":1}}}).pretty()
    */
  def elemMatchTest = Action.async { implicit request =>
    Future.successful(Ok)
  }

  def returnBook = Action.async { implicit request =>
    Future.successful(Ok)
  }


  def borrow = Action.async { implicit request =>
    mongoDB.bookCol.flatMap(_.find(Json.obj("id" -> 1)).requireOne[JsValue]).map(_.\("rest").as[Int]).flatMap {
      // 如果书柜还有该类书
      case x if x > 0 =>
        mongoDB.bookCol.flatMap(_.update(Json.obj("id" -> 1), Json.obj("$inc" -> Json.obj("rest" -> -1))).map(_.n)).flatMap {
          // 同步修改数据
          case t if t > 0 =>
            mongoDB.orderCol.flatMap(_.update(Json.obj("uid" -> 1), Json.obj("$push" -> Json.obj("book" -> Json.obj("bid" -> 1, "ifreturn" -> 0, "time" -> System.currentTimeMillis))), upsert = true).map(_.n)).flatMap {
              case z if z > 0 => Future.successful(Ok("借书成功"))
              // 由于之前书数量减1 若在此出现异常 应该把数据回滚
              case 0 => Future.successful(Ok("借书失败1"))
            }
          // 虽然不会出错 仍要预防未知情况
          case 0 => Future.successful(Ok("借书失败"))
        }
      // 如果没有书 提醒是否预订
      case 0 => Future.successful(Ok("可借阅书数量不足"))
    }
  }

}