
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

object footer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<div class="footer">
    <div class="container">
        <div class="col-md-3 grid_4">
            <h3>关于我们</h3>
            <p>感谢大家对本馆的使用，如果大家有什么建议可以联系我们的管理员或者直接在首页进行反馈，我们将慎重考虑大家的意见</p>
            <ul class="social-nav icons_2 clearfix">
                <li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
                <li><a href="#" class="facebook"> <i class="fa fa-facebook"></i></a></li>
                <li><a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a></li>
            </ul>
        </div>
        <div class="col-md-3 grid_4">
            <h3>其他图书馆</h3>
            <ul class="footer_list">
                <li><a href="#">-吉首大学图书馆 </a></li>
                <li><a href="#">- 中山大学图书馆</a></li>
                <li><a href="#">- 北京大学图书馆</a></li>
                <li><a href="#">- 清华大学图书馆</a></li>
                <li><a href="#">- 浙江大学图书馆</a></li>
            </ul>
        </div>
        <div class="col-md-3 grid_4">
            <h3>联系我们</h3>
            <address>
                <span>黄老师</span>
                <br>
                <abbr>手机号码 : </abbr> 18797537398
                <br>
                <abbr>邮箱 : </abbr> <a href="mailto@example.com">13221312@</a>
                <br><br>
                <span>馆长</span>
                <br>
                <abbr>手机号码 : </abbr> 18797537398
                <br>
                <abbr>邮箱 : </abbr> <a href="mailto@example.com">13221312@</a>
            </address>
        </div>
        <div class="col-md-3 grid_4">
            <h3>工作时间</h3>
            <table class="table_working_hours">
                <tbody>
                    <tr class="opened_1">
                        <td class="day_label">星期一</td>
                        <td class="day_value">19:00 am - 22.00 pm</td>
                    </tr>
                    <tr class="opened">
                        <td class="day_label">星期二</td>
                        <td class="day_value">19:00 am - 22.00 pm</td>
                    </tr>
                    <tr class="opened">
                        <td class="day_label">星期三</td>
                        <td class="day_value">19:00 am - 22.00 pm</td>
                    </tr>
                    <tr class="opened">
                        <td class="day_label">星期四</td>
                        <td class="day_value">19:00 am - 22.00 pm</td>
                    </tr>
                    <tr class="opened">
                        <td class="day_label">星期五</td>
                        <td class="day_value">19:00 am - 22.00 pm</td>
                    </tr>
                    <tr class="closed">
                        <td class="day_label">星期日</td>
                        <td class="day_value">09:00 am - 22.00 pm</td>
                    </tr>
                </tbody>
            </table>
        </div>
            <!--<div class="clearfix"></div>
        <div class="copy">
            <p>Copyright &copy; 2015.Company name All rights reserved.<a target="_blank"
                                                                         href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
            </p>
        </div>-->
    </div>
</div>"""))
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
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/footer.scala.html
                  HASH: c92767c9313c5a5e6b5349d6982e13126b7a9519
                  MATRIX: 723->1|819->3|847->5
                  LINES: 21->1|26->1|28->3
                  -- GENERATED --
              */
          