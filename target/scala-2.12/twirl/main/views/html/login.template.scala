
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE HTML>
<html>
    <head>
        """),_display_(/*6.10*/head("登录")),format.raw/*6.20*/("""
            """),format.raw/*7.13*/("""<!----font-Awesome----->
        <script>
                $(document).ready(function () """),format.raw/*9.47*/("""{"""),format.raw/*9.48*/("""
                    """),format.raw/*10.21*/("""$(".dropdown").hover(
                            function () """),format.raw/*11.41*/("""{"""),format.raw/*11.42*/("""
                                """),format.raw/*12.33*/("""$('.dropdown-menu', this).stop(true, true).slideDown("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*14.29*/("""}"""),format.raw/*14.30*/(""",
                            function () """),format.raw/*15.41*/("""{"""),format.raw/*15.42*/("""
                                """),format.raw/*16.33*/("""$('.dropdown-menu', this).stop(true, true).slideUp("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*18.29*/("""}"""),format.raw/*18.30*/("""
                    """),format.raw/*19.21*/(""");
                """),format.raw/*20.17*/("""}"""),format.raw/*20.18*/(""");
        </script>
    </head>
    <body>
        """),_display_(/*24.10*/top()),format.raw/*24.15*/("""
            """),format.raw/*25.13*/("""<!-- banner -->
        <div class="courses_banner">
            <div class="container">
                <h3>登录</h3>
                <p class="description">
                    One of the most interesting places to learn is the library. There are a lot of professional books in the
                    library, which can enrich your professional knowledge. When you confused professional, you can look at the
                    same professional people who understand and recognize it.
                </p>
                <div class="breadcrumb1">
                    <ul>
                        <li class="icon6"><a href=""""),_display_(/*36.53*/routes/*36.59*/.User.index()),format.raw/*36.72*/("""">首页</a></li>
                        <li class="current-page">登录</li>
                    </ul>
                </div>
            </div>
        </div>
            <!-- //banner -->
        <div class="courses_box1">
            <div class="container">
                <form class="login">
                    <p class="lead">Welcome Back!</p>
                    <div class="form-group">
                        <input autocomplete="off" type="text" name="log_username" class="required form-control"
                        placeholder="用户名">
                    </div>
                    <div class="form-group">
                        <input autocomplete="off" type="password" class="password required form-control" placeholder="密码"
                        name="log_password">
                    </div>
                    <div class="form-group">
                        <input type="checkbox" name="remember" value="true"> 记住我
                        <input type="submit" class="btn btn-primary btn-lg1 btn-block" name="submit" value="Login">
                    </div>
                    <p>还没有注册账户吗？<a href=""""),_display_(/*59.43*/routes/*59.49*/.User.register()),format.raw/*59.65*/("""" title="Sign Up">注册</a></p>
                </form>
            </div>
        </div>

        """),_display_(/*64.10*/footer()),format.raw/*64.18*/("""
    """),format.raw/*65.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Nov 27 16:40:39 CST 2017
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/login.scala.html
                  HASH: 6c14a128e74ef6082cd17ed747563a3f22448fc1
                  MATRIX: 722->1|818->3|846->5|915->48|945->58|985->71|1100->159|1128->160|1177->181|1267->243|1296->244|1357->277|1536->428|1565->429|1635->471|1664->472|1725->505|1902->654|1931->655|1980->676|2027->695|2056->696|2136->749|2162->754|2203->767|2857->1394|2872->1400|2906->1413|4056->2536|4071->2542|4108->2558|4232->2655|4261->2663|4293->2668
                  LINES: 21->1|26->1|28->3|31->6|31->6|32->7|34->9|34->9|35->10|36->11|36->11|37->12|39->14|39->14|40->15|40->15|41->16|43->18|43->18|44->19|45->20|45->20|49->24|49->24|50->25|61->36|61->36|61->36|84->59|84->59|84->59|89->64|89->64|90->65
                  -- GENERATED --
              */
          