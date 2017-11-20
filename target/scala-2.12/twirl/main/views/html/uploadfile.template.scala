
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

object uploadfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/helper/*3.8*/.form(action = routes.Manager.uploadBook, 'enctype -> "multipart/form-data")/*3.84*/ {_display_(Seq[Any](format.raw/*3.86*/("""

    """),format.raw/*5.5*/("""<input type="file" name="book">

    <p>
        <input type="submit">
    </p>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 19 15:55:27 CST 2017
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/uploadfile.scala.html
                  HASH: 1c9129d15319d52de8a3d1189759248b98352f8e
                  MATRIX: 727->1|823->3|851->6|864->12|948->88|987->90|1019->96
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|30->5
                  -- GENERATED --
              */
          