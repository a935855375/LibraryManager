package models

import javax.inject.{Inject, Singleton}

import play.api.libs.json.{JsValue, Json}
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.play.json.collection.JSONCollection
import reactivemongo.play.json._
import scala.concurrent.ExecutionContext

@Singleton
class MongoDB @Inject()(reactiveMongoApi: ReactiveMongoApi)(implicit ec: ExecutionContext) {
  def bookCol = reactiveMongoApi.database.map(_.collection[JSONCollection]("book"))

  def userCol = reactiveMongoApi.database.map(_.collection[JSONCollection]("user"))

  def bookIncrement(sequenceName: String) = bookCol.map(_.findAndUpdate(Json.obj("_id" -> sequenceName),
      Json.obj("$inc" -> Json.obj("sequence_value" -> 1)), fetchNewObject = true))
    .flatMap(_.map(_.result[JsValue])).map(_.get.\("sequence_value").as[Int])

  def userIncrement(sequenceName: String) = userCol.map(_.findAndUpdate(Json.obj("_id" -> sequenceName),
    Json.obj("$inc" -> Json.obj("sequence_value" -> 1)), fetchNewObject = true))
    .flatMap(_.map(_.result[JsValue])).map(_.get.\("sequence_value").as[Int])

  def preOrderCol = reactiveMongoApi.database.map(_.collection[JSONCollection]("preorder"))

  def preOrderIncrement(sequenceName: String) = preOrderCol.map(_.findAndUpdate(Json.obj("_id" -> sequenceName),
    Json.obj("$inc" -> Json.obj("sequence_value" -> 1)), fetchNewObject = true))
    .flatMap(_.map(_.result[JsValue])).map(_.get.\("sequence_value").as[Int])

  def orderCol = reactiveMongoApi.database.map(_.collection[JSONCollection]("order"))

  def orderIncrement(sequenceName: String) = preOrderCol.map(_.findAndUpdate(Json.obj("_id" -> sequenceName),
    Json.obj("$inc" -> Json.obj("sequence_value" -> 1)), fetchNewObject = true))
    .flatMap(_.map(_.result[JsValue])).map(_.get.\("sequence_value").as[Int])
}
