
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/Library Manager/conf/routes
// @DATE:Tue Nov 28 17:17:25 CST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  User_2: controllers.User,
  // @LINE:19
  Manager_0: controllers.Manager,
  // @LINE:30
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    User_2: controllers.User,
    // @LINE:19
    Manager_0: controllers.Manager,
    // @LINE:30
    Assets_1: controllers.Assets
  ) = this(errorHandler, User_2, Manager_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, User_2, Manager_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.User.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.User.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doLogin""", """controllers.User.doLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.User.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """doRegister""", """controllers.User.doRegister()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """introduce""", """controllers.User.introduce"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """readerservice""", """controllers.User.readerService"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create""", """controllers.Manager.createBook"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Manager.uploadBook"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete""", """controllers.Manager.deleteBook"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrow""", """controllers.User.borrow"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.User.test"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_User_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_User_index0_invoker = createInvoker(
    User_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_User_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_User_login1_invoker = createInvoker(
    User_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_User_doLogin2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doLogin")))
  )
  private[this] lazy val controllers_User_doLogin2_invoker = createInvoker(
    User_2.doLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "doLogin",
      Nil,
      "POST",
      this.prefix + """doLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_User_register3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_User_register3_invoker = createInvoker(
    User_2.register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_User_doRegister4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("doRegister")))
  )
  private[this] lazy val controllers_User_doRegister4_invoker = createInvoker(
    User_2.doRegister(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "doRegister",
      Nil,
      "POST",
      this.prefix + """doRegister""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_User_introduce5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("introduce")))
  )
  private[this] lazy val controllers_User_introduce5_invoker = createInvoker(
    User_2.introduce,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "introduce",
      Nil,
      "GET",
      this.prefix + """introduce""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_User_readerService6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("readerservice")))
  )
  private[this] lazy val controllers_User_readerService6_invoker = createInvoker(
    User_2.readerService,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "readerService",
      Nil,
      "GET",
      this.prefix + """readerservice""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Manager_createBook7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create")))
  )
  private[this] lazy val controllers_Manager_createBook7_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_Manager_uploadBook8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Manager_uploadBook8_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Manager_deleteBook9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_Manager_deleteBook9_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_User_borrow10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrow")))
  )
  private[this] lazy val controllers_User_borrow10_invoker = createInvoker(
    User_2.borrow,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "borrow",
      Nil,
      "GET",
      this.prefix + """borrow""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_User_test11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_User_test11_invoker = createInvoker(
    User_2.test,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.User",
      "test",
      Nil,
      "GET",
      this.prefix + """test""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
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
    case controllers_User_index0_route(params@_) =>
      call { 
        controllers_User_index0_invoker.call(User_2.index)
      }
  
    // @LINE:7
    case controllers_User_login1_route(params@_) =>
      call { 
        controllers_User_login1_invoker.call(User_2.login)
      }
  
    // @LINE:9
    case controllers_User_doLogin2_route(params@_) =>
      call { 
        controllers_User_doLogin2_invoker.call(User_2.doLogin())
      }
  
    // @LINE:11
    case controllers_User_register3_route(params@_) =>
      call { 
        controllers_User_register3_invoker.call(User_2.register)
      }
  
    // @LINE:13
    case controllers_User_doRegister4_route(params@_) =>
      call { 
        controllers_User_doRegister4_invoker.call(User_2.doRegister())
      }
  
    // @LINE:15
    case controllers_User_introduce5_route(params@_) =>
      call { 
        controllers_User_introduce5_invoker.call(User_2.introduce)
      }
  
    // @LINE:17
    case controllers_User_readerService6_route(params@_) =>
      call { 
        controllers_User_readerService6_invoker.call(User_2.readerService)
      }
  
    // @LINE:19
    case controllers_Manager_createBook7_route(params@_) =>
      call { 
        controllers_Manager_createBook7_invoker.call(Manager_0.createBook)
      }
  
    // @LINE:21
    case controllers_Manager_uploadBook8_route(params@_) =>
      call { 
        controllers_Manager_uploadBook8_invoker.call(Manager_0.uploadBook)
      }
  
    // @LINE:23
    case controllers_Manager_deleteBook9_route(params@_) =>
      call { 
        controllers_Manager_deleteBook9_invoker.call(Manager_0.deleteBook)
      }
  
    // @LINE:25
    case controllers_User_borrow10_route(params@_) =>
      call { 
        controllers_User_borrow10_invoker.call(User_2.borrow)
      }
  
    // @LINE:27
    case controllers_User_test11_route(params@_) =>
      call { 
        controllers_User_test11_invoker.call(User_2.test)
      }
  
    // @LINE:30
    case controllers_Assets_at12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_1.at(path, file))
      }
  }
}
