
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
    """),format.raw/*7.5*/("""<script>
            $(document).ready(function () """),format.raw/*8.43*/("""{"""),format.raw/*8.44*/("""
                """),format.raw/*9.17*/("""$(".dropdown").hover(
                        function () """),format.raw/*10.37*/("""{"""),format.raw/*10.38*/("""
                            """),format.raw/*11.29*/("""$('.dropdown-menu', this).stop(true, true).slideDown("fast");
                            $(this).toggleClass('open');
                        """),format.raw/*13.25*/("""}"""),format.raw/*13.26*/(""",
                        function () """),format.raw/*14.37*/("""{"""),format.raw/*14.38*/("""
                            """),format.raw/*15.29*/("""$('.dropdown-menu', this).stop(true, true).slideUp("fast");
                            $(this).toggleClass('open');
                        """),format.raw/*17.25*/("""}"""),format.raw/*17.26*/("""
                """),format.raw/*18.17*/(""");
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/(""");
    </script>
    </head>
    <body>
        """),_display_(/*23.10*/top()),format.raw/*23.15*/("""
            """),format.raw/*24.13*/("""<!-- banner -->
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
                        <li class="icon6"><a href=""""),_display_(/*35.53*/routes/*35.59*/.User.index()),format.raw/*35.72*/("""">首页</a></li>
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
                        <input autocomplete="off" type="text" name="username" class="required form-control" id="mail"
                        placeholder="邮箱">
                    </div>
                    <div class="form-group">
                        <input autocomplete="off" type="password" class="password required form-control" placeholder="密码" id="password"
                        name="password">
                    </div>
                    <div class="form-group">
                        <input type="checkbox" name="remember" value="true"> 记住我
                        <input type="button" class="btn btn-primary btn-lg1 btn-block" onclick="commit()" value="登录">
                    </div>
                    <p>还没有注册账户吗？<a href=""""),_display_(/*58.43*/routes/*58.49*/.User.register()),format.raw/*58.65*/("""" title="Sign Up">注册</a></p>
                </form>
            </div>
        </div>
        """),_display_(/*62.10*/footer()),format.raw/*62.18*/("""
    """),format.raw/*63.5*/("""</body>

    <script>
            var $mail = $('#mail');
            var $password = $('#password');

            function commit() """),format.raw/*69.31*/("""{"""),format.raw/*69.32*/("""
                """),format.raw/*70.17*/("""$.ajax("""),format.raw/*70.24*/("""{"""),format.raw/*70.25*/("""
                    """),format.raw/*71.21*/("""url: """"),_display_(/*71.28*/routes/*71.34*/.User.doLogin()),format.raw/*71.49*/("""",
                    contentType: "application/json; charset=utf-8",
                    data: JSON.stringify("""),format.raw/*73.42*/("""{"""),format.raw/*73.43*/("""
                        """),format.raw/*74.25*/("""mail: $mail.val(),
                        password: $password.val()
                    """),format.raw/*76.21*/("""}"""),format.raw/*76.22*/("""),
                    dataType: "json",
                    type: "POST",
                    success: function (data) """),format.raw/*79.46*/("""{"""),format.raw/*79.47*/("""
                        """),format.raw/*80.25*/("""var ok = data.valid;
                        if (ok === 0)
                            alert('登录成功');
                        else
                            alert(data.cause)
                    """),format.raw/*85.21*/("""}"""),format.raw/*85.22*/(""",
                    error: function () """),format.raw/*86.40*/("""{"""),format.raw/*86.41*/("""
                        """),format.raw/*87.25*/("""alert('sorry, 未能连接至服务器')
                    """),format.raw/*88.21*/("""}"""),format.raw/*88.22*/("""
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/(""")
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/("""
    """),format.raw/*91.5*/("""</script>
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
                  DATE: Tue Nov 28 17:17:25 CST 2017
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/login.scala.html
                  HASH: fa8d50c24824aef89e3d8a3dae609624e3610937
                  MATRIX: 722->1|818->3|846->5|915->48|945->58|976->63|1054->114|1082->115|1126->132|1212->190|1241->191|1298->220|1469->363|1498->364|1564->402|1593->403|1650->432|1819->573|1848->574|1893->591|1936->606|1965->607|2041->656|2067->661|2108->674|2762->1301|2777->1307|2811->1320|3978->2460|3993->2466|4030->2482|4153->2578|4182->2586|4214->2591|4375->2724|4404->2725|4449->2742|4484->2749|4513->2750|4562->2771|4596->2778|4611->2784|4647->2799|4787->2911|4816->2912|4869->2937|4986->3026|5015->3027|5163->3147|5192->3148|5245->3173|5470->3370|5499->3371|5568->3412|5597->3413|5650->3438|5723->3483|5752->3484|5797->3501|5826->3502|5868->3516|5897->3517|5929->3522
                  LINES: 21->1|26->1|28->3|31->6|31->6|32->7|33->8|33->8|34->9|35->10|35->10|36->11|38->13|38->13|39->14|39->14|40->15|42->17|42->17|43->18|44->19|44->19|48->23|48->23|49->24|60->35|60->35|60->35|83->58|83->58|83->58|87->62|87->62|88->63|94->69|94->69|95->70|95->70|95->70|96->71|96->71|96->71|96->71|98->73|98->73|99->74|101->76|101->76|104->79|104->79|105->80|110->85|110->85|111->86|111->86|112->87|113->88|113->88|114->89|114->89|115->90|115->90|116->91
                  -- GENERATED --
              */
          