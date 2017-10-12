package controllers

import javax.inject._
import play.api.mvc._
import scala.concurrent.ExecutionContext


@Singleton
class Application @Inject()(cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def index = Action {
    Ok("hello, world!!")
  }
}
