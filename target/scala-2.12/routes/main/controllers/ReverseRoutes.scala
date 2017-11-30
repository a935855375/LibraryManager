
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/Library Manager/conf/routes
// @DATE:Tue Nov 28 17:17:25 CST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:30
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:19
  class ReverseManager(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def createBook(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:23
    def deleteBook(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete")
    }
  
    // @LINE:21
    def uploadBook(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
  }

  // @LINE:5
  class ReverseUser(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def readerService(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "readerservice")
    }
  
    // @LINE:9
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "doLogin")
    }
  
    // @LINE:13
    def doRegister(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "doRegister")
    }
  
    // @LINE:27
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:11
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:25
    def borrow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrow")
    }
  
    // @LINE:15
    def introduce(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "introduce")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
