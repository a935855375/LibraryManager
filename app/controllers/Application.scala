package controllers

import javax.inject._

import play.api.libs.json._
import play.api.libs.ws._
import play.api.mvc._
import play.modules.reactivemongo.ReactiveMongoApi

import scala.concurrent.ExecutionContext


@Singleton
class Application @Inject()(cc: MessagesControllerComponents,
                            ws: WSClient,
                            mg: ReactiveMongoApi)
                           (implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def index = Action {
    Ok("hello, world!!")
  }



  def WS: Action[AnyContent] = Action.async { implicit request =>
    val data =
      """
        |{
        |    "query" : {
        |        "match" : {
        |            "about" : "rock climbing"
        |        }
        |    }
        |}
      """.stripMargin
    val a = 1
    a.toHexString
    ws.url("http://localhost:9200/megacorp/employee/_search?pretty").withBody(data).get().map { x =>
      Ok(x.body)
    }
  }

  

}
