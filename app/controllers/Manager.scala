package controllers

import java.nio.file.Paths
import javax.inject.{Inject, Singleton}

import models.MongoDB
import play.api.libs.json._
import play.api.mvc.{MessagesAbstractController, MessagesControllerComponents}
import reactivemongo.play.json._

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class Manager @Inject()(cc: MessagesControllerComponents, mongoDB: MongoDB)
                       (implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  // 创建一本书
  def createBook = Action.async { implicit request =>
    for {
      auto <- mongoDB.getNextSequence("book")
      result <- mongoDB.bookCol.flatMap(_.insert(Json.obj("id" -> auto,
        "name" -> "贤者的智慧",
        "sdesc" -> "无",
        "desc" -> "无",
        "count" -> 100,
        "rest" -> 50,
        "tag" -> Json.arr("哲理", "人生"),
        "commentnum" -> 0,
        "sumrate" -> 0.0,
        "ratenum" -> 0,
        "perlevel" -> 50,
        "price" -> 0.0,
        "joindata" -> "",
        "collectioncount" -> 0))).map(_.n)
    } yield {
      Ok(result.toString)
    }
  }

  // 删除多本和一本书
  def deleteBook = Action.async { implicit request =>
    val pre = Json.obj("$or" -> Json.arr(Json.obj("id" -> 5), Json.obj("id" -> 6), Json.obj("id" -> 7)))
    mongoDB.bookCol.flatMap(_.remove(pre)).map(n => Ok("成功删除" + n.n + "条数据"))
  }

  // 查找
  def find = Action.async { implicit request =>

    Future.successful(Ok)
  }

  // 修改书
  def updateBook = Action.async(parse.json) { implicit request =>
    Future.successful(Ok)
  }

  // 上传电子书
  def uploadBook = Action(parse.multipartFormData(100 * 1024 * 1024)) { request =>
    request.body.file("book").map { picture =>
      val filename = Paths.get(picture.filename).getFileName
      println(filename)
      picture.ref.moveTo(Paths.get(s"/home/fan/book/$filename"), replace = true)
      Ok("File uploaded")
    }.getOrElse {
      Ok("File upload failed")
    }
  }

  def test = Action.async { implicit request =>
    Future.successful(Ok(views.html.uploadfile()))
  }

  def createCategory = Action.async(parse.json) { implicit request =>
    Future.successful(Ok)
  }

  def deleteCategory = Action.async(parse.json) { implicit request =>
    Future.successful(Ok)
  }

  def findSomeOneInfo = Action.async(parse.json) { implicit request =>
    Future.successful(Ok)
  }


  def updateSomeoneInfo = Action.async(parse.json) { implicit request =>
    Future.successful(Ok)
  }

  // 包含借阅记录,归还记录
  def findSomeoneHistory = Action.async(parse.json) { implicit request =>
    Future.successful(Ok)
  }

  def findBookHistory = Action.async(parse.json) { implicit request =>
    Future.successful(Ok)
  }


  // 确定还书


}
