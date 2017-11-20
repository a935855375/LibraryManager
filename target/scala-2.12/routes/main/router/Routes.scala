
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/Library Manager/conf/routes
// @DATE:Mon Nov 20 14:32:15 CST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Application_2: controllers.Application,
  // @LINE:7
  Manager_0: controllers.Manager,
  // @LINE:13
  User_3: controllers.User,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_2: controllers.Application,
    // @LINE:7
    Manager_0: controllers.Manager,
    // @LINE:13
    User_3: controllers.User,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, Manager_0, User_3, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Manager_0, User_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.Manager.createBook"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Manager.uploadBook"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete""", """controllers.Manager.deleteBook"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.User.borrow"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Manager_createBook1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_Manager_createBook1_invoker = createInvoker(
    Manager_0.createBook,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "createBook",
      Nil,
      "GET",
      this.prefix + """create""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Manager_uploadBook2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Manager_uploadBook2_invoker = createInvoker(
    Manager_0.uploadBook,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "uploadBook",
      Nil,
      "POST",
      this.prefix + """upload""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Manager_deleteBook3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_Manager_deleteBook3_invoker = createInvoker(
    Manager_0.deleteBook,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Manager",
      "deleteBook",
      Nil,
      "GET",
      this.prefix + """delete""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_User_borrow4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_User_borrow4_invoker = createInvoker(
    User_3.borrow,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "borrow",
      Nil,
      "GET",
      this.prefix + """test""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_index0_route(params@_) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:7
    case controllers_Manager_createBook1_route(params@_) =>
      call { 
        controllers_Manager_createBook1_invoker.call(Manager_0.createBook)
      }
  
    // @LINE:9
    case controllers_Manager_uploadBook2_route(params@_) =>
      call { 
        controllers_Manager_uploadBook2_invoker.call(Manager_0.uploadBook)
      }
  
    // @LINE:11
    case controllers_Manager_deleteBook3_route(params@_) =>
      call { 
        controllers_Manager_deleteBook3_invoker.call(Manager_0.deleteBook)
      }
  
    // @LINE:13
    case controllers_User_borrow4_route(params@_) =>
      call { 
        controllers_User_borrow4_invoker.call(User_3.borrow)
      }
  
    // @LINE:16
    case controllers_Assets_at5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(Assets_1.at(path, file))
      }
  }
}
