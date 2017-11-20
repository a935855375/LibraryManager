package controllers

import javax.inject._

import play.api.libs.ws._
import play.api.mvc._
import play.modules.reactivemongo.ReactiveMongoApi

import scala.concurrent.{ExecutionContext, Future}


@Singleton
class Application @Inject()(cc: MessagesControllerComponents,
                            ws: WSClient,
                            mg: ReactiveMongoApi)
                           (implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def index = Action.async {
    Future.successful(Ok("hello,world"))
  }

}
