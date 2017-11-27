
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

object head extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<title>"""),_display_(/*3.9*/title),format.raw/*3.14*/("""</title>
<link rel="shortcut icon" href=""""),_display_(/*4.34*/routes/*4.40*/.Assets.at("images/logo.ico")),format.raw/*4.69*/(""""/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<meta name="keywords" content="Learn Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
<script type="application/x-javascript"> addEventListener("load", function () """),format.raw/*9.79*/("""{"""),format.raw/*9.80*/("""
    """),format.raw/*10.5*/("""setTimeout(hideURLbar, 0);
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/(""", false);

function hideURLbar() """),format.raw/*13.23*/("""{"""),format.raw/*13.24*/("""
    """),format.raw/*14.5*/("""window.scrollTo(0, 1);
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/(""" """),format.raw/*15.3*/("""</script>
<link href=""""),_display_(/*16.14*/routes/*16.20*/.Assets.at("css/bootstrap-3.1.1.min.css")),format.raw/*16.61*/("""" rel='stylesheet' type='text/css'/>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.at("js/jquery.min.js")),format.raw/*18.51*/(""""></script>
<script src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.at("js/bootstrap.min.js")),format.raw/*19.54*/(""""></script>
    <!-- Custom Theme files -->
<link href=""""),_display_(/*21.14*/routes/*21.20*/.Assets.at("css/index.css")),format.raw/*21.47*/("""" rel='stylesheet' type='text/css'/>
<link href=""""),_display_(/*22.14*/routes/*22.20*/.Assets.at("css/style.css")),format.raw/*22.47*/("""" rel='stylesheet' type='text/css'/>
<link rel="stylesheet" href=""""),_display_(/*23.31*/routes/*23.37*/.Assets.at("css/jquery.countdown.css")),format.raw/*23.75*/(""""/>

<link href='https://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700' rel='stylesheet' type='text/css'>
    <!----font-Awesome----->
<link href=""""),_display_(/*27.14*/routes/*27.20*/.Assets.at("css/font-awesome.css")),format.raw/*27.54*/("""" rel="stylesheet">
    <!----font-Awesome----->
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Nov 27 16:28:31 CST 2017
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/head.scala.html
                  HASH: 7b39ca2195b66c27b63e7d39836a98f584feca45
                  MATRIX: 728->1|838->16|866->18|899->26|924->31|992->73|1006->79|1055->108|1556->582|1584->583|1616->588|1670->615|1698->616|1759->649|1788->650|1820->655|1870->678|1898->679|1926->680|1976->703|1991->709|2053->750|2198->868|2213->874|2264->904|2317->930|2332->936|2386->969|2470->1026|2485->1032|2533->1059|2610->1109|2625->1115|2673->1142|2767->1209|2782->1215|2841->1253|3025->1410|3040->1416|3095->1450
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|34->9|34->9|35->10|36->11|36->11|38->13|38->13|39->14|40->15|40->15|40->15|41->16|41->16|41->16|43->18|43->18|43->18|44->19|44->19|44->19|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|52->27|52->27|52->27
                  -- GENERATED --
              */
          