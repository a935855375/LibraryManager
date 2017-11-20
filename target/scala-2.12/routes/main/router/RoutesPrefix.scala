
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/fan/sbtProject/Library Manager/conf/routes
// @DATE:Mon Nov 20 14:32:15 CST 2017


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
