
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE HTML>
<html>
    <head>
        """),_display_(/*7.10*/head("注册")),format.raw/*7.20*/("""
    """),format.raw/*8.5*/("""<script>
            $(document).ready(function () """),format.raw/*9.43*/("""{"""),format.raw/*9.44*/("""
                """),format.raw/*10.17*/("""$(".dropdown").hover(
                        function () """),format.raw/*11.37*/("""{"""),format.raw/*11.38*/("""
                            """),format.raw/*12.29*/("""$('.dropdown-menu', this).stop(true, true).slideDown("fast");
                            $(this).toggleClass('open');
                        """),format.raw/*14.25*/("""}"""),format.raw/*14.26*/(""",
                        function () """),format.raw/*15.37*/("""{"""),format.raw/*15.38*/("""
                            """),format.raw/*16.29*/("""$('.dropdown-menu', this).stop(true, true).slideUp("fast");
                            $(this).toggleClass('open');
                        """),format.raw/*18.25*/("""}"""),format.raw/*18.26*/("""
                """),format.raw/*19.17*/(""");
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/(""");
    </script>
    </head>
    <body>
        """),_display_(/*24.10*/top()),format.raw/*24.15*/("""
            """),format.raw/*25.13*/("""<!-- banner -->
        <div class="courses_banner">
            <div class="container">
                <h3>注册</h3>
                <p class="description">
                    One of the most interesting places to learn is the library. There are a lot of professional books in the library, which can enrich your professional knowledge. When you confused professional, you can look at the same professional people you understand and recognize it.
                </p>
                <div class="breadcrumb1">
                    <ul>
                        <li class="icon6"><a href=""""),_display_(/*34.53*/routes/*34.59*/.User.index()),format.raw/*34.72*/("""">首页</a></li>
                        <li class="current-page">注册</li>
                    </ul>
                </div>
            </div>
        </div>
            <!-- //banner -->
        <div class="courses_box1">
            <div class="container">
                <form class="login" id="form">
                    <p class="lead">注册新账户</p>
                    <div class="form-group">
                        <input type="text" autocomplete="off" class="required form-control" placeholder="昵称" name="nickname" id="nickname"
                        value="">
                    </div>
                    <div class="form-group">
                        <input type="text" autocomplete="off" class="required form-control" placeholder="邮箱" name="mail" id="mail"
                        value="">
                    </div>
                    <div class="form-group">
                        <input type="password" class="required form-control" placeholder="密码" name="password" value="" id="password">
                    </div>
                    <div class="form-group">
                        <input type="password" class="required form-control" placeholder="确认密码" name="repassword" id="repassword"
                        name="Conform Password" value="">
                    </div>
                    <div class="form-group">
                        <input type="button" class="btn btn-primary btn-lg1 btn-block" value="Register" onclick="commit()">
                    </div>
                    <p>已经拥有账户了吗？ <a href=""""),_display_(/*63.44*/routes/*63.50*/.User.login()),format.raw/*63.63*/("""">登录</a></p>
                </form>
            </div>
        </div>
        """),_display_(/*67.10*/footer()),format.raw/*67.18*/("""
    """),format.raw/*68.5*/("""</body>

    <script>
            var $form = $('#form');

            function commit() """),format.raw/*73.31*/("""{"""),format.raw/*73.32*/("""
                """),format.raw/*74.17*/("""$.ajax("""),format.raw/*74.24*/("""{"""),format.raw/*74.25*/("""
                    """),format.raw/*75.21*/("""url: """"),_display_(/*75.28*/routes/*75.34*/.User.doRegister()),format.raw/*75.52*/("""",
                    data: $form.serialize(),
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
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Nov 28 19:22:55 CST 2017
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/register.scala.html
                  HASH: 5992e5936f16bc644333d09524617e91e85c7f2f
                  MATRIX: 725->1|821->3|850->6|919->49|949->59|980->64|1058->115|1086->116|1131->133|1217->191|1246->192|1303->221|1474->364|1503->365|1569->403|1598->404|1655->433|1824->574|1853->575|1898->592|1941->607|1970->608|2046->657|2072->662|2113->675|2727->1262|2742->1268|2776->1281|4338->2816|4353->2822|4387->2835|4494->2915|4523->2923|4555->2928|4672->3017|4701->3018|4746->3035|4781->3042|4810->3043|4859->3064|4893->3071|4908->3077|4947->3095|5140->3260|5169->3261|5222->3286|5447->3483|5476->3484|5545->3525|5574->3526|5627->3551|5700->3596|5729->3597|5774->3614|5803->3615|5845->3629|5874->3630|5906->3635
                  LINES: 21->1|26->1|29->4|32->7|32->7|33->8|34->9|34->9|35->10|36->11|36->11|37->12|39->14|39->14|40->15|40->15|41->16|43->18|43->18|44->19|45->20|45->20|49->24|49->24|50->25|59->34|59->34|59->34|88->63|88->63|88->63|92->67|92->67|93->68|98->73|98->73|99->74|99->74|99->74|100->75|100->75|100->75|100->75|104->79|104->79|105->80|110->85|110->85|111->86|111->86|112->87|113->88|113->88|114->89|114->89|115->90|115->90|116->91
                  -- GENERATED --
              */
          