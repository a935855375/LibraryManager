package models

import play.api.libs.json.Json

object JsonFormats {
  implicit val bookFormat = Json.format[Book]
  implicit val preOrderBookFormat = Json.format[PreOrderBook]
  implicit val preOrderFormat = Json.format[PreOrder]
  implicit val userFormat = Json.format[UserBean]
}
