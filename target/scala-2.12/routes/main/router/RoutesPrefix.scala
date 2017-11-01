
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/play/Library Manager/conf/routes
// @DATE:Wed Oct 18 20:58:08 CST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
