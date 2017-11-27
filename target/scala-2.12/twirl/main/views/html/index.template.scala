
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE HTML>
<html>
    <head>
        """),_display_(/*6.10*/head("首页")),format.raw/*6.20*/("""
    """),format.raw/*7.5*/("""</head>
    <body>
        """),_display_(/*9.10*/top()),format.raw/*9.15*/("""
            """),format.raw/*10.13*/("""<!-- banner -->
        <div class="banner">
                <!-- banner Slider starts Here -->
            <script src=""""),_display_(/*13.27*/routes/*13.33*/.Assets.at("js/responsiveslides.min.js")),format.raw/*13.73*/(""""></script>
            <script>
                    // You can also use "$(window).load(function() """),format.raw/*15.68*/("""{"""),format.raw/*15.69*/(""""
                    $(function () """),format.raw/*16.35*/("""{"""),format.raw/*16.36*/("""
                        """),format.raw/*17.25*/("""// Slideshow 4
                        $("#slider3").responsiveSlides("""),format.raw/*18.56*/("""{"""),format.raw/*18.57*/("""
                            """),format.raw/*19.29*/("""auto: true,
                            pager: true,
                            nav: true,
                            speed: 500,
                            namespace: "callbacks",
                            before: function () """),format.raw/*24.49*/("""{"""),format.raw/*24.50*/("""
                                """),format.raw/*25.33*/("""$('.events').append("<li>before event fired.</li>");
                            """),format.raw/*26.29*/("""}"""),format.raw/*26.30*/(""",
                            after: function () """),format.raw/*27.48*/("""{"""),format.raw/*27.49*/("""
                                """),format.raw/*28.33*/("""$('.events').append("<li>after event fired.</li>");
                            """),format.raw/*29.29*/("""}"""),format.raw/*29.30*/("""
                        """),format.raw/*30.25*/("""}"""),format.raw/*30.26*/(""");

                    """),format.raw/*32.21*/("""}"""),format.raw/*32.22*/(""");
            </script>
                <!--//End-slider-script -->
            <div id="top" class="callbacks_container">
                <ul class="rslides" id="slider3">
                    <li>
                        <div class="banner-bg">
                            <div class="container">
                                <div class="banner-info">
                                    <h3>Take the first step<span>to knowledge friends</span></h3>
                                    <p>Inspired by Brasil’s bold colors and matching up to football’s on-pitch
                                        playmakers, these kicks are ready to stand out.
                                    </p>
                                        <!--<a href="#"><i class="fa fa-thumbs-up icon_1"
                                           style="font-size: 20px; transition: color 0.2s ease 0s, border-color 0.2s ease 0s, background-color 0.2s ease 0s; min-height: 0px; min-width: 0px; line-height: 20px; border-width: 0px 2px 0px 0px; margin: 0px; padding:0px 10px 0 0; letter-spacing: 0px;"></i>非常棒</a>-->
                                </div>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="banner-bg banner-img2">
                            <div class="container">
                                <div class="banner-info">
                                    <h3>Stay in touch<span>Lorem Ipsum</span></h3>
                                    <p>Inspired by bold colors and matching up to football’s on-pitch
                                        playmakers, these kicks are ready to stand out.
                                    </p>
                                        <!-- <a href="#"><i class="fa fa-thumbs-up icon_1"
                                            style="font-size: 20px; transition: color 0.2s ease 0s, border-color 0.2s ease 0s, background-color 0.2s ease 0s; min-height: 0px; min-width: 0px; line-height: 20px; border-width: 0px 2px 0px 0px; margin: 0px; padding:0px 10px 0 0; letter-spacing: 0px;"></i>非常棒</a>-->
                                </div>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="banner-bg banner-img">
                            <div class="container">
                                <div class="banner-info">
                                    <h3>therefore always<span>looks reasonable</span></h3>
                                    <p>Inspired by Brasil’s bold colors and matching up to football’s on-pitch
                                        playmakers, these Brasil’s kicks are ready to stand out.
                                    </p>
                                        <!--<a href="#"><i class="fa fa-thumbs-up icon_1"
                                           style="font-size: 20px; transition: color 0.2s ease 0s, border-color 0.2s ease 0s, background-color 0.2s ease 0s; min-height: 0px; min-width: 0px; line-height: 20px; border-width: 0px 2px 0px 0px; margin: 0px; padding:0px 10px 0 0; letter-spacing: 0px;"></i>非常棒</a>-->
                                </div>
                            </div>
                        </div>
                    </li>
                        <!--<li>
                <div class="banner-bg">
                    <div class="container">
                        <div class="banner-info">
                            <h3>dolore magna<span>eaque ipsa</span></h3>
                            <p>Inspired by bold colors and matching up to football’s on-pitch
                                playmakers, these kicks are ready to stand out.
                            </p>
                            <a href="courses.html"><i class="fa fa-thumbs-up icon_1"
                                                      style="font-size: 20px; transition: color 0.2s ease 0s, border-color 0.2s ease 0s, background-color 0.2s ease 0s; min-height: 0px; min-width: 0px; line-height: 20px; border-width: 0px 2px 0px 0px; margin: 0px; padding:0px 10px 0 0; letter-spacing: 0px;"></i>View
                                Courses</a>
                        </div>
                    </div>
                </div>
            </li>
            <li>
                <div class="banner-bg banner-img2">
                    <div class="container">
                        <div class="banner-info">
                            <h3> trivial example,<span>who chooses</span></h3>
                            <p>Inspired by Brasil’s bold colors and matching up to football’s on-pitch
                                playmakers, these kicks Brasil’s are ready to stand out.
                            </p>
                            <a href="courses.html"><i class="fa fa-thumbs-up icon_1"
                                                      style="font-size: 20px; transition: color 0.2s ease 0s, border-color 0.2s ease 0s, background-color 0.2s ease 0s; min-height: 0px; min-width: 0px; line-height: 20px; border-width: 0px 2px 0px 0px; margin: 0px; padding:0px 10px 0 0; letter-spacing: 0px;"></i>View
                                Courses</a>
                        </div>
                    </div>
                </div>
            </li>-->

                </ul>
            </div>
        </div>
            <!-- //banner -->
            <!--<div class="copyrights">Collect from <a href="http://www.cssmoban.com/">手机网站模板</a></div>-->
        <div class="details">
            <div class="container">
                <div class="col-sm-10 dropdown-buttons">
                        <!--<div class="col-sm-3 dropdown-button">
                <div class="input-group">
                    <input class="form-control has-dark-background" name="slider-name" id="slider-name"
                           placeholder="Name" type="text" required="">
                </div>
            </div>-->
                    <div class="col-sm-4 dropdown-button">
                        <div class="section_1">
                                <!-- <select id="country" onChange="change_country(this.value)" class="frm-field required">-->
                            <select id="sources" class="frm-field required">
                                    <!--<option value="null">书柜资源</option>
                        <option value="null">电子资源</option>
                        <option value="AX">硬盘资源</option>-->
                                    <!--<option value="AX">Intermediate</option>-->
                            </select>
                        </div>
                    </div>
                    <div class="col-sm-4 dropdown-button">
                        <div class="section_1">
                            <select id="contents" class="frm-field required">
                                    <!-- <option value="null">题名</option>
                         <option value="null">作者</option>
                         <option value="AX">索书号</option>
                         <option value="AX">入馆时间</option>-->
                            </select>
                        </div>
                    </div>
                    <div class="col-sm-4 dropdown-button">
                        <div class="input-group">
                            <input class="form-control has-dark-background" name="slider-name" id="slider-name"
                            placeholder="本馆资源搜索" type="text" required="">
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="col-sm-2 submit_button">
                    <form>
                        <input type="submit" value="搜索">
                    </form>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <div class="grid_1">
            <div class="container">
                <div class="col-md-4">
                    <div class="news">
                        <h3>本馆读书排名</h3>
                        <div class="section-content">
                                <!--<article>
                        <figure class="date"><i class="fa fa-file-o"></i>07-25-2015</figure>
                        <a href="#">Lorem Ipsum is simply dummy text of the printing and typesetting industry.</a>
                    </article>
                    <article>
                        <figure class="date"><i class="fa fa-file-o"></i>08-24-2014</figure>
                        <a href="#">It is a long established fact that a reader will be distracted.</a>
                    </article>
                    <article>
                        <figure class="date"><i class="fa fa-file-o"></i>08-24-2014</figure>
                        <a href="#">Contrary to popular belief, Lorem Ipsum is not simply random text.</a>
                    </article>
                    <article>
                        <figure class="date"><i class="fa fa-file-o"></i>08-24-2014</figure>
                        <a href="#">Contrary to popular belief, Lorem Ipsum is not simply random text.</a>
                    </article>-->
                            <div class="rank_box">
                                <div class="rank_left">
                                    <img src=""""),_display_(/*185.48*/routes/*185.54*/.Assets.at("images/t9.jpg")),format.raw/*185.81*/("""" class="img-responsive" alt=""/>
                                </div>
                                <div class="rank_right">
                                    <div class="rank_right-item">
                                        <h4><a href="#">风轻云淡</a></h4>
                                        <p>当前已阅读<span id="num1">122</span>本书 </p>
                                    </div>
                                </div>
                            </div>
                            <div class="rank_box">
                                <div class="rank_left">
                                    <img src=""""),_display_(/*196.48*/routes/*196.54*/.Assets.at("images/t9.jpg")),format.raw/*196.81*/("""" class="img-responsive" alt=""/>
                                </div>
                                <div class="rank_right">
                                    <div class="rank_right-item">
                                        <h4><a href="#">风轻云淡</a></h4>
                                        <p>当前已阅读<span id="num2">122</span>本书 </p>
                                    </div>
                                </div>
                            </div>
                            <div class="rank_box">
                                <div class="rank_left">
                                    <img src=""""),_display_(/*207.48*/routes/*207.54*/.Assets.at("images/t9.jpg")),format.raw/*207.81*/("""" class="img-responsive" alt=""/>
                                </div>
                                <div class="rank_right">
                                    <div class="rank_right-item">
                                        <h4><a href="#">风轻云淡</a></h4>
                                        <p>当前已阅读<span id="num3">122</span>本书 </p>
                                    </div>
                                </div>
                            </div>
                            <div class="rank_box">
                                <div class="rank_left">
                                    <img src=""""),_display_(/*218.48*/routes/*218.54*/.Assets.at("images/t9.jpg")),format.raw/*218.81*/("""" class="img-responsive" alt=""/>
                                </div>
                                <div class="rank_right">
                                    <div class="rank_right-item">
                                        <h4><a href="#">风轻云淡</a></h4>
                                        <p>当前已阅读<span id="num4">122</span>本书 </p>
                                    </div>
                                </div>
                            </div>
                            <div class="rank_box">
                                <div class="rank_left">
                                    <img src=""""),_display_(/*229.48*/routes/*229.54*/.Assets.at("images/t9.jpg")),format.raw/*229.81*/("""" class="img-responsive" alt=""/>
                                </div>
                                <div class="rank_right">
                                    <div class="rank_right-item">
                                        <h4><a href="#">风轻云淡</a></h4>
                                        <p>当前已阅读<span id="num5">122</span>本书 </p>
                                    </div>
                                </div>
                            </div>
                        </div><!-- /.section-content -->
                        <a href="#" class="read-more">更多</a>
                    </div><!-- /.news-small -->
                </div>
                <div class="col-md-8 grid_1_right">
                    <h3>本馆通知</h3>
                    <div class="but_list">
                        <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
                            <ul id="myTab" class="nav nav-tabs nav-tabs1" role="tablist">
                                <li role="presentation" class="active"><a href="#home" id="home-tab" role="tab"
                                data-toggle="tab" aria-controls="home"
                                aria-expanded="true">工作动态</a></li>
                                <li role="presentation"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab"
                                aria-controls="profile">公告通知</a></li>
                                <li role="presentation"><a href="#profile1" role="tab" id="profile-tab1" data-toggle="tab"
                                aria-controls="profile1">新书通报</a></li>
                                <li role="presentation"><a href="#profile2" role="tab" id="profile-tab2" data-toggle="tab"
                                aria-controls="profile2">读者荐购</a></li>
                            </ul>
                            <div id="myTabContent" class="tab-content">
                                <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>From Who</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">标题</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                                <!-- <img src="images/t5.jpg" class="img-responsive" alt=""/>-->
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>From Who</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">标题</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                                <!-- <img src="images/t5.jpg" class="img-responsive" alt=""/>-->
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>From Who</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">标题</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                                <!-- <img src="images/t5.jpg" class="img-responsive" alt=""/>-->
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="profile" aria-labelledby="profile-tab">
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>From Who</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">标题</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                                <!-- <img src="images/t5.jpg" class="img-responsive" alt=""/>-->
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>From Who</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">标题</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                                <!-- <img src="images/t5.jpg" class="img-responsive" alt=""/>-->
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>From Who</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">标题</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                                <!-- <img src="images/t5.jpg" class="img-responsive" alt=""/>-->
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="profile1" aria-labelledby="profile-tab1">
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>作者</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">书名</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                            <img src=""""),_display_(/*420.56*/routes/*420.62*/.Assets.at("images/book.png")),format.raw/*420.91*/("""" class="img-responsive" alt=""/>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>作者</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">书名</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                            <img src=""""),_display_(/*443.56*/routes/*443.62*/.Assets.at("images/book.png")),format.raw/*443.91*/("""" class="img-responsive" alt=""/>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="profile2" aria-labelledby="profile-tab2">
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>作者</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">书名</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                            <img src=""""),_display_(/*468.56*/routes/*468.62*/.Assets.at("images/book.png")),format.raw/*468.91*/("""" class="img-responsive" alt=""/>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="events_box">
                                        <div class="event_left">
                                            <div class="event_left-item">
                                                <div class="icon_2"><i class="fa fa-clock-o"></i>2017/02/05 19:30</div>
                                                <div class="icon_2"><i class="fa fa-user"></i>作者</div>
                                                    <!--<div class="icon_2">
                                            <div class="speaker">
                                                <i class="fa fa-user"></i>
                                                <div class="speaker_item">
                                                    <a href="#">Lorem Ipsum</a>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>-->
                                            </div>
                                        </div>
                                        <div class="event_right">
                                            <h3><a href="#">书名</a></h3>
                                            <p>本文内容 <a href="#">更多</a></p>
                                            <img src=""""),_display_(/*491.56*/routes/*491.62*/.Assets.at("images/book.png")),format.raw/*491.91*/("""" class="img-responsive" alt=""/>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <a href="#" class="read-more">更多</a>
                    <div class="clearfix"></div>
                </div>
            </div>
                <!--<div class="bg">
        <div class="container">
            <div class="timer_wrap">
                <div id="counter"></div>
            </div>
            <div class="newsletter">
                <form>
                    <input type="text" name="ne" size="30" required="" placeholder="Please fill your email">
                    <input type="submit" value="Subscribe">
                </form>
            </div>
        </div>
    </div>-->
        </div>
        <div class="bottom_content">
            <h3>本馆服务</h3>
            <div class="grid_2">
                <div class="col-md-4 portfolio-left">
                    <div class="portfolio-img event-img">
                        <img src=""""),_display_(/*522.36*/routes/*522.42*/.Assets.at("images/bk.jpg")),format.raw/*522.69*/("""" class="img-responsive" alt=""/>
                        <div class="over-image"></div>
                    </div>
                    <div class="portfolio-description">
                        <h4><a href="#">图书续借</a></h4>
                        <p>希望各位读者好好珍惜书籍资料，及时续借，以免造成不必要的麻烦！</p>

                        <a href="events.html">
                            <span><i class="fa fa-chain chain_1"></i>查看详情</span>
                        </a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="col-md-4 portfolio-left">
                    <div class="portfolio-img event-img">
                        <img src=""""),_display_(/*537.36*/routes/*537.42*/.Assets.at("images/thank.jpg")),format.raw/*537.72*/("""" class="img-responsive" alt=""/>
                        <div class="over-image"></div>
                    </div>
                    <div class="portfolio-description">
                        <h4><a href="#">学长学姐有话说</a></h4>
                        <p>如果你对自己的大学学习充满迷茫，或许学长学姐的的忠告，可以给你们带来启示！</p>

                        <a href=""""),_display_(/*544.35*/routes/*544.41*/.Assets.at("events.html")),format.raw/*544.66*/("""">
                            <span><i class="fa fa-chain chain_1"></i>查看详情</span>
                        </a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="col-md-4 portfolio-left">
                    <div class="portfolio-img event-img">
                        <img src=""""),_display_(/*552.36*/routes/*552.42*/.Assets.at("images/message.jpg")),format.raw/*552.74*/("""" class="img-responsive" alt=""/>
                        <div class="over-image"></div>
                    </div>
                    <div class="portfolio-description">
                        <h4><a href="#">留言板</a></h4>
                        <p>把你想对实验室说的话，尽情的说出来吧！不要害羞哦~~</p>
                            <!--<span>-->
                            <!--<a href="students.html">School Studies</a>-->
                            <!--<a href="students.html">College Studies</a>-->
                            <!--</span>-->
                        <a href="events.html">
                            <span><i class="fa fa-chain chain_1"></i>查看详情</span>
                        </a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="grid_3">
                <div class="col-md-4 portfolio-left">
                    <div class="portfolio-img event-img">
                        <img src=""""),_display_(/*573.36*/routes/*573.42*/.Assets.at("images/program.jpg")),format.raw/*573.74*/("""" class="img-responsive" alt=""/>
                        <div class="over-image"></div>
                    </div>
                    <div class="portfolio-description">
                        <h4><a href="#">方向推荐</a></h4>
                        <p>当你不知道选什么方向，也许这里可以给你带来一些启示！</p>
                            <!--<span>
                  <a href="students.html">School Studies</a>
                  <a href="students.html">College Studies</a>
                </span>-->
                        <a href="events.html">
                            <span><i class="fa fa-chain chain_1"></i>查看详情</span>
                        </a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="col-md-4 portfolio-left">
                    <div class="portfolio-img event-img">
                        <img src=""""),_display_(/*591.36*/routes/*591.42*/.Assets.at("images/contract.png")),format.raw/*591.75*/("""" class="img-responsive" alt=""/>
                        <div class="over-image"></div>
                    </div>
                    <div class="portfolio-description">
                        <h4><a href="#">学长学姐联系</a></h4>
                        <p>想和学长学姐聊聊，点击这里，我们将告诉你他们的QQ号。</p>
                            <!--<span>-->
                            <!--<a href="students.html">School Studies</a>-->
                            <!--<a href="students.html">College Studies</a>-->
                            <!--</span>-->
                        <a href="events.html">
                            <span><i class="fa fa-chain chain_1"></i>查看详情</span>
                        </a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="col-md-4 portfolio-left">
                    <div class="portfolio-img event-img">
                        <img src=""""),_display_(/*609.36*/routes/*609.42*/.Assets.at("images/t10.jpg")),format.raw/*609.70*/("""" class="img-responsive" alt=""/>
                        <div class="over-image"></div>
                    </div>
                    <div class="portfolio-description">
                        <h4><a href="#">爱心图书捐赠</a></h4>
                        <p>大家都好有爱啊，给图书馆捐了这么多书，好感动啊！！</p>
                            <!--<span>-->
                            <!--<a href="students.html">School Studies</a>-->
                            <!--<a href="students.html">College Studies</a>-->
                            <!--</span>-->
                        <a href="events.html">
                            <span><i class="fa fa-chain chain_1"></i>查看详情</span>
                        </a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>

        """),_display_(/*629.10*/footer()),format.raw/*629.18*/("""

        """),format.raw/*631.9*/("""<script>
                $(document).ready(function () """),format.raw/*632.47*/("""{"""),format.raw/*632.48*/("""
                    """),format.raw/*633.21*/("""$(".dropdown").hover(
                            function () """),format.raw/*634.41*/("""{"""),format.raw/*634.42*/("""
                                """),format.raw/*635.33*/("""$('.dropdown-menu', this).stop(true, true).slideDown("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*637.29*/("""}"""),format.raw/*637.30*/(""",
                            function () """),format.raw/*638.41*/("""{"""),format.raw/*638.42*/("""
                                """),format.raw/*639.33*/("""$('.dropdown-menu', this).stop(true, true).slideUp("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*641.29*/("""}"""),format.raw/*641.30*/("""
                    """),format.raw/*642.21*/(""");

                    var data = [
                        """),format.raw/*645.25*/("""{"""),format.raw/*645.26*/("""
                            """),format.raw/*646.29*/("""source: "书柜资源",
                            content: [
                                "书名",
                                "作者",
                                "入馆时间",
                                "索书号"
                            ]
                        """),format.raw/*653.25*/("""}"""),format.raw/*653.26*/(""",
                        """),format.raw/*654.25*/("""{"""),format.raw/*654.26*/("""
                            """),format.raw/*655.29*/("""source: "硬盘资源",
                            content: [
                                "项目资料",
                                "学习视频",
                                "招新资料",
                                "活动资料",
                                "奖项资料",
                                "其他"
                            ]
                        """),format.raw/*664.25*/("""}"""),format.raw/*664.26*/(""",
                        """),format.raw/*665.25*/("""{"""),format.raw/*665.26*/("""
                            """),format.raw/*666.29*/("""source: "电子资源",
                            content: [
                                "题名",
                                "作者",
                                "入馆时间"
                            ]
                        """),format.raw/*672.25*/("""}"""),format.raw/*672.26*/("""
                    """),format.raw/*673.21*/("""];
                    var s1 = $("#sources");
                    var s2 = $("#contents");

                    $.each(data, function (d) """),format.raw/*677.47*/("""{"""),format.raw/*677.48*/("""
                        """),format.raw/*678.25*/("""var t = data[d].source;
                        s1.append("<option value='" + t + "'>" + t + "</option>")
                    """),format.raw/*680.21*/("""}"""),format.raw/*680.22*/(""");

                    var init = data[0].content;

                    $.each(init, function (d) """),format.raw/*684.47*/("""{"""),format.raw/*684.48*/("""
                        """),format.raw/*685.25*/("""s2.append("<option value='" + init[d] + "'>" + init[d] + "</option>")
                    """),format.raw/*686.21*/("""}"""),format.raw/*686.22*/(""");

                    s1.change(function () """),format.raw/*688.43*/("""{"""),format.raw/*688.44*/("""
                        """),format.raw/*689.25*/("""s2.empty();
                        var index = s1.get(0).selectedIndex;
                        var t = data[index].content;
                        $.each(t, function (d) """),format.raw/*692.48*/("""{"""),format.raw/*692.49*/("""
                            """),format.raw/*693.29*/("""s2.append("<option value='" + t[d] + "'>" + t[d] + "</option>")
                        """),format.raw/*694.25*/("""}"""),format.raw/*694.26*/(""")
                    """),format.raw/*695.21*/("""}"""),format.raw/*695.22*/(""")
                """),format.raw/*696.17*/("""}"""),format.raw/*696.18*/(""");
        </script>
        <script src=""""),_display_(/*698.23*/routes/*698.29*/.Assets.at("js/jquery.countdown.js")),format.raw/*698.65*/(""""></script>
        <script src=""""),_display_(/*699.23*/routes/*699.29*/.Assets.at("js/script.js")),format.raw/*699.55*/(""""></script>
    </body>
</html>"""),format.raw/*701.8*/("""}"""))
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
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/index.scala.html
                  HASH: 2de252aa421b64e855fa6924a257959f57c2a0af
                  MATRIX: 722->1|818->3|846->5|915->48|945->58|976->63|1030->91|1055->96|1096->109|1245->231|1260->237|1321->277|1449->377|1478->378|1542->414|1571->415|1624->440|1722->510|1751->511|1808->540|2068->772|2097->773|2158->806|2267->887|2296->888|2373->937|2402->938|2463->971|2571->1051|2600->1052|2653->1077|2682->1078|2734->1102|2763->1103|12151->10463|12167->10469|12216->10496|12863->11115|12879->11121|12928->11148|13575->11767|13591->11773|13640->11800|14287->12419|14303->12425|14352->12452|14999->13071|15015->13077|15064->13104|28558->26570|28574->26576|28625->26605|30241->28193|30257->28199|30308->28228|32084->29976|32100->29982|32151->30011|33767->31599|33783->31605|33834->31634|35060->32832|35076->32838|35125->32865|35846->33558|35862->33564|35914->33594|36275->33927|36291->33933|36338->33958|36725->34317|36741->34323|36795->34355|37848->35380|37864->35386|37918->35418|38822->36294|38838->36300|38893->36333|39853->37265|39869->37271|39919->37299|40819->38171|40849->38179|40887->38189|40971->38244|41001->38245|41051->38266|41142->38328|41172->38329|41234->38362|41414->38513|41444->38514|41515->38556|41545->38557|41607->38590|41785->38739|41815->38740|41865->38761|41955->38822|41985->38823|42043->38852|42335->39115|42365->39116|42420->39142|42450->39143|42508->39172|42883->39518|42913->39519|42968->39545|42998->39546|43056->39575|43309->39799|43339->39800|43389->39821|43557->39960|43587->39961|43641->39986|43796->40112|43826->40113|43954->40212|43984->40213|44038->40238|44157->40328|44187->40329|44262->40375|44292->40376|44346->40401|44548->40574|44578->40575|44636->40604|44753->40692|44783->40693|44834->40715|44864->40716|44911->40734|44941->40735|45012->40778|45028->40784|45086->40820|45148->40854|45164->40860|45212->40886|45271->40917
                  LINES: 21->1|26->1|28->3|31->6|31->6|32->7|34->9|34->9|35->10|38->13|38->13|38->13|40->15|40->15|41->16|41->16|42->17|43->18|43->18|44->19|49->24|49->24|50->25|51->26|51->26|52->27|52->27|53->28|54->29|54->29|55->30|55->30|57->32|57->32|210->185|210->185|210->185|221->196|221->196|221->196|232->207|232->207|232->207|243->218|243->218|243->218|254->229|254->229|254->229|445->420|445->420|445->420|468->443|468->443|468->443|493->468|493->468|493->468|516->491|516->491|516->491|547->522|547->522|547->522|562->537|562->537|562->537|569->544|569->544|569->544|577->552|577->552|577->552|598->573|598->573|598->573|616->591|616->591|616->591|634->609|634->609|634->609|654->629|654->629|656->631|657->632|657->632|658->633|659->634|659->634|660->635|662->637|662->637|663->638|663->638|664->639|666->641|666->641|667->642|670->645|670->645|671->646|678->653|678->653|679->654|679->654|680->655|689->664|689->664|690->665|690->665|691->666|697->672|697->672|698->673|702->677|702->677|703->678|705->680|705->680|709->684|709->684|710->685|711->686|711->686|713->688|713->688|714->689|717->692|717->692|718->693|719->694|719->694|720->695|720->695|721->696|721->696|723->698|723->698|723->698|724->699|724->699|724->699|726->701
                  -- GENERATED --
              */
          