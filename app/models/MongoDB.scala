package models

import javax.inject.{Inject, Singleton}

import play.api.libs.json.{JsValue, Json}
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.play.json.collection.JSONCollection
import scala.concurrent.ExecutionContext
import reactivemongo.play.json._
import JsonFormats._

@Singleton
class MongoDB @Inject()(reactiveMongoApi: ReactiveMongoApi)(implicit ec: ExecutionContext) {
  def bookCol = reactiveMongoApi.database.map(_.collection[JSONCollection]("book"))

  def userCol = reactiveMongoApi.database.map(_.collection[JSONCollection]("user"))

  def getNextSequence(col: String) = {
    reactiveMongoApi.database.map(_.collection[JSONCollection](col)).map(_.findAndUpdate(Json.obj("_id" -> "productid"),
      Json.obj("$inc" -> Json.obj("sequence_value" -> 1)), fetchNewObject = true))
      .flatMap(_.map(_.result[JsValue])).map(_.get.\("sequence_value").as[Int])
  }


  def preOrderCol = reactiveMongoApi.database.map(_.collection[JSONCollection]("preorder"))

  def orderCol = reactiveMongoApi.database.map(_.collection[JSONCollection]("order"))


  def getABook(id: Int) = {
    bookCol.flatMap(_.find(Json.obj("id" -> id)).requireOne[Book])
  }
}
