
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

object template extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*3.1*/("""<table style="width: 99.8%;height:99.8% ">
    <tbody>
    <tr>
        <td style="background:#FAFAFA url(//labpic.qiniudn.com/a873524e5ac9465dc4d6fd6d133bc58d.png)">
            <div style="background-color:white;border-top:2px solid #12ADDB;box-shadow:0 1px 3px #AAAAAA;line-height:180%;padding:0 15px 12px;width:500px;margin:50px auto;color:#555555;font-family:'Century Gothic','Trebuchet MS','Hiragino Sans GB',微软雅黑,'Microsoft Yahei',Tahoma,Helvetica,Arial,'SimSun',sans-serif;font-size:12px;">
                <h2 style="border-bottom:1px solid #DDD;font-size:14px;font-weight:normal;padding:13px 0 10px 8px;">
                    <span style="color: #12ADDB;font-weight: bold;">&gt;</span>您在
                    <a style="text-decoration:none;color: #12ADDB;" href="//lab.benwong.cn">"""),format.raw/*10.93*/("""{"""),format.raw/*10.94*/("""site"""),format.raw/*10.98*/("""}"""),format.raw/*10.99*/("""</a>博客上的留言有回复啦！
                </h2>
                <div style="padding:0 12px 0 12px;margin-top:18px">
                    <p>"""),format.raw/*13.24*/("""{"""),format.raw/*13.25*/("""author_p"""),format.raw/*13.33*/("""}"""),format.raw/*13.34*/(""" """),format.raw/*13.35*/("""同学，您曾在文章《"""),format.raw/*13.44*/("""{"""),format.raw/*13.45*/("""title"""),format.raw/*13.50*/("""}"""),format.raw/*13.51*/("""》上发表评论:</p>
                    <p style="background-color: #f5f5f5;border: 0px solid #DDD;padding: 10px 15px;margin:18px 0">"""),format.raw/*14.114*/("""{"""),format.raw/*14.115*/("""text_p"""),format.raw/*14.121*/("""}"""),format.raw/*14.122*/("""</p>
                    <p>"""),format.raw/*15.24*/("""{"""),format.raw/*15.25*/("""author"""),format.raw/*15.31*/("""}"""),format.raw/*15.32*/(""" """),format.raw/*15.33*/("""给您的回复如下:</p>
                    <p style="background-color: #f5f5f5;border: 0px solid #DDD;padding: 10px 15px;margin:18px 0">"""),format.raw/*16.114*/("""{"""),format.raw/*16.115*/("""text"""),format.raw/*16.119*/("""}"""),format.raw/*16.120*/("""</p>
                    <p>您可以点击
                        <a style="text-decoration:none; color:#12addb" href=""""),format.raw/*18.78*/("""{"""),format.raw/*18.79*/("""permalink"""),format.raw/*18.88*/("""}"""),format.raw/*18.89*/("""">查看回复的完整內容</a>，欢迎再次光临
                        <a style="text-decoration:none; color:#12addb" href="//lab.benwong.cn">"""),format.raw/*19.96*/("""{"""),format.raw/*19.97*/("""site"""),format.raw/*19.101*/("""}"""),format.raw/*19.102*/("""</a>。
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

  def render(title:String,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(title)(request)

  def f:((String) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (title) => (request) => apply(title)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Nov 22 20:21:48 CST 2017
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/mail/template.scala.html
                  HASH: cfef355ca6971eb3960cc142d5efafc5a106544d
                  MATRIX: 751->1|894->49|922->51|1740->841|1769->842|1801->846|1830->847|1987->976|2016->977|2052->985|2081->986|2110->987|2147->996|2176->997|2209->1002|2238->1003|2392->1128|2422->1129|2457->1135|2487->1136|2543->1164|2572->1165|2606->1171|2635->1172|2664->1173|2819->1299|2849->1300|2882->1304|2912->1305|3051->1416|3080->1417|3117->1426|3146->1427|3292->1545|3321->1546|3354->1550|3384->1551
                  LINES: 21->1|26->1|28->3|35->10|35->10|35->10|35->10|38->13|38->13|38->13|38->13|38->13|38->13|38->13|38->13|38->13|39->14|39->14|39->14|39->14|40->15|40->15|40->15|40->15|40->15|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|44->19|44->19|44->19|44->19
                  -- GENERATED --
              */
          