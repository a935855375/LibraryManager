
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/Library Manager/conf/routes
// @DATE:Mon Nov 27 16:40:39 CST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:15
  class ReverseManager(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def createBook(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create")
    }
  
    // @LINE:19
    def deleteBook(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete")
    }
  
    // @LINE:17
    def uploadBook(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
  }

  // @LINE:5
  class ReverseUser(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def readerService(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "readerservice")
    }
  
    // @LINE:23
    def test(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:9
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:21
    def borrow(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrow")
    }
  
    // @LINE:11
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
