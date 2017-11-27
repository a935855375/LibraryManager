
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

object top extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<nav class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
            data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
                <!--<a class="navbar-brand" href="index.html">JSUCCW LIBRARY</a>-->
            <img src=""""),_display_(/*14.24*/routes/*14.30*/.Assets.at("images/logo.png")),format.raw/*14.59*/("""" alt="创新创业工作室图书馆" class="img-responsive"
            style="height: 50px;
                width: 250px;
                margin-top: 5px">
        </div>
            <!--/.navbar-header-->
        <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a href=""""),_display_(/*23.31*/routes/*23.37*/.User.login()),format.raw/*23.50*/(""""><i class="fa fa-user"></i><span>登录</span></a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                    class="fa fa-list"></i><span>资源</span></a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                    class="fa fa-globe"></i><span>反馈</span></a>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                    class="fa fa-search"></i><span>搜索</span></a>
                    <ul class="dropdown-menu search-form">
                        <form>
                            <input type="text" class="search-text" name="s" placeholder="Search...">
                            <button type="submit" class="search-submit"><i class="fa fa-search"></i></button>
                        </form>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
        <!--/.navbar-collapse-->
</nav>
<nav class="navbar nav_bottom" role="navigation">
    <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header nav_2">
            <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse"
            data-target="#bs-megadropdown-tabs">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"></a>
        </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
            <ul class="nav navbar-nav nav_1">
                <li><a href=""""),_display_(/*65.31*/routes/*65.37*/.User.index()),format.raw/*65.50*/("""">首页</a></li>
                <li><a href=""""),_display_(/*66.31*/routes/*66.37*/.User.introduce()),format.raw/*66.54*/("""">本馆概况</a></li>
                <li><a href=""""),_display_(/*67.31*/routes/*67.37*/.User.readerService()),format.raw/*67.58*/("""">读者服务</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">本馆通知<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="terms.html">工作动态</a></li>
                        <li><a href="shortcodes.html">公告通知</a></li>
                        <li><a href="faq.html">新书通报</a></li>
                        <li><a href="faq.html">读者荐购</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">本馆服务<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="terms.html">图书续借</a></li>
                        <li><a href="shortcodes.html">学长学姐有话说</a></li>
                        <li><a href="faq.html">留言板</a></li>
                        <li><a href="faq.html">方向推荐</a></li>
                        <li><a href="faq.html">学长学姐联系</a></li>
                        <li><a href="faq.html">爱心图书捐赠</a></li>
                    </ul>
                </li>
                <li><a href="BuyBook.html">购书指南</a></li>
                <li><a href="WorkRoom.html">创新创业工作室</a></li>
                <li><a href="blog.html">其他</a></li>
                    <!--<li><a href="career.html">Career</a></li>
                <li class="last"><a href="contact.html">Contacts</a></li>-->
            </ul>
        </div><!-- /.navbar-collapse -->
    </div>
</nav>"""))
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
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/top.scala.html
                  HASH: cdf360fe75dfe612392139b45dab42c49f64c82b
                  MATRIX: 720->1|816->3|844->5|1468->602|1483->608|1533->637|1959->1036|1974->1042|2008->1055|4074->3094|4089->3100|4123->3113|4194->3157|4209->3163|4247->3180|4320->3226|4335->3232|4377->3253
                  LINES: 21->1|26->1|28->3|39->14|39->14|39->14|48->23|48->23|48->23|90->65|90->65|90->65|91->66|91->66|91->66|92->67|92->67|92->67
                  -- GENERATED --
              */
          