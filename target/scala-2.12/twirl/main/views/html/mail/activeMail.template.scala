
package views.html.mail

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

object activeMail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, activeCode: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""


"""),format.raw/*4.1*/("""<table style="width: 99.8%;height:99.8% ">
    <tbody>
    <tr>
        <td style="background:#FAFAFA url(//labpic.qiniudn.com/a873524e5ac9465dc4d6fd6d133bc58d.png)">
            <div style="background-color:white;border-top:2px solid #12ADDB;box-shadow:0 1px 3px #AAAAAA;line-height:180%;padding:0 15px 12px;width:500px;margin:50px auto;color:#555555;font-family:'Century Gothic','Trebuchet MS','Hiragino Sans GB',微软雅黑,'Microsoft Yahei',Tahoma,Helvetica,Arial,'SimSun',sans-serif;font-size:12px;">
                <h2 style="border-bottom:1px solid #DDD;font-size:14px;font-weight:normal;padding:13px 0 10px 8px;">
                    <span style="color: #12ADDB;font-weight: bold;">@</span>"""),_display_(/*10.79*/{name}),format.raw/*10.85*/("""，感谢您注册
                    <a style="text-decoration:none;color: #12ADDB;" href=""""),_display_(/*11.76*/{App.siteSetting.url}),format.raw/*11.97*/("""">"""),_display_(/*11.100*/{App.siteSetting.name}),format.raw/*11.122*/("""</a>，请按照提示激活您的账户。
                </h2>
                <div style="padding:0 12px 0 12px;margin-top:18px">
                    <p>您的激活码是:</p>
                    <p style="background-color: #f5f5f5;border: 0px solid #DDD;padding: 10px 15px;margin:18px 0">"""),_display_(/*15.115*/{activeCode}),format.raw/*15.127*/("""</p>
                    <p>您可以点击
                        <a style="text-decoration:none; color:#12addb" href=""""),_display_(/*17.79*/{App.siteSetting.url}),format.raw/*17.100*/("""/user/activate">这里</a>开始激活账户。
                    </p>
                </div>
            </div>
        </td>
    </tr>
    </tbody>
</table>
"""))
      }
    }
  }

  def render(name:String,activeCode:String): play.twirl.api.HtmlFormat.Appendable = apply(name,activeCode)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,activeCode) => apply(name,activeCode)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 23 21:52:23 CST 2017
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/mail/activeMail.scala.html
                  HASH: e2fa480c0b09395bcc5f11458ff9786d0ba6085b
                  MATRIX: 746->1|875->35|904->38|1624->732|1651->738|1760->820|1802->841|1833->844|1877->866|2162->1123|2196->1135|2335->1247|2378->1268
                  LINES: 21->1|26->1|29->4|35->10|35->10|36->11|36->11|36->11|36->11|40->15|40->15|42->17|42->17
                  -- GENERATED --
              */
          