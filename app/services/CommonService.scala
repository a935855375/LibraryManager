package services

import javax.inject._

import models._
import play.api.libs.json._
import reactivemongo.play.json._
import models.JsonFormats._

import scala.concurrent.ExecutionContext

@Singleton
class CommonService @Inject()(mongoDB: MongoDB)(implicit ec: ExecutionContext) {

  // 当有新书可用时 通知预订者
  def notifyPreOrder(id: Int) = {
    val bookFut = mongoDB.getABook(id)
    val personsFut = mongoDB.preOrderCol.flatMap(_.find(Json.obj("book" -> Json.obj("$elemMatch" -> Json.obj("bid" -> id, "outdate" -> 0)))).cursor[PreOrder]().collect[List]())
    for {
      book <- bookFut
      persons <- personsFut
    } yield {
      (book, persons)
    }
  }

}
