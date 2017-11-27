
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
        <title>图书馆首页</title>
        <link rel="shortcut icon" href=""""),_display_(/*7.42*/routes/*7.48*/.Assets.at("images/logo.ico")),format.raw/*7.77*/(""""/>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <meta name="keywords" content="Learn Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
        <script type="application/x-javascript"> addEventListener("load", function () """),format.raw/*12.87*/("""{"""),format.raw/*12.88*/("""
            """),format.raw/*13.13*/("""setTimeout(hideURLbar, 0);
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/(""", false);

        function hideURLbar() """),format.raw/*16.31*/("""{"""),format.raw/*16.32*/("""
            """),format.raw/*17.13*/("""window.scrollTo(0, 1);
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/(""" """),format.raw/*18.11*/("""</script>
        <link href=""""),_display_(/*19.22*/routes/*19.28*/.Assets.at("css/bootstrap-3.1.1.min.css")),format.raw/*19.69*/("""" rel='stylesheet' type='text/css'/>
            <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src=""""),_display_(/*21.23*/routes/*21.29*/.Assets.at("js/jquery.min.js")),format.raw/*21.59*/(""""></script>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.at("js/bootstrap.min.js")),format.raw/*22.62*/(""""></script>
            <!-- Custom Theme files -->
        <link href=""""),_display_(/*24.22*/routes/*24.28*/.Assets.at("css/index.css")),format.raw/*24.55*/("""" rel='stylesheet' type='text/css'/>
        <link href=""""),_display_(/*25.22*/routes/*25.28*/.Assets.at("css/style.css")),format.raw/*25.55*/("""" rel='stylesheet' type='text/css'/>
        <link rel="stylesheet" href=""""),_display_(/*26.39*/routes/*26.45*/.Assets.at("css/jquery.countdown.css")),format.raw/*26.83*/(""""/>

        <link href='https://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700' rel='stylesheet' type='text/css'>
            <!----font-Awesome----->
        <link href=""""),_display_(/*30.22*/routes/*30.28*/.Assets.at("css/font-awesome.css")),format.raw/*30.62*/("""" rel="stylesheet">
            <!----font-Awesome----->
    </head>
    <body>
        <nav class="navbar navbar-default" role="navigation">
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
                    <img src=""""),_display_(/*45.32*/routes/*45.38*/.Assets.at("images/logo.png")),format.raw/*45.67*/("""" alt="创新创业工作室图书馆" class="img-responsive"
                    style="height: 50px;
                        width: 250px;
                        margin-top: 5px">
                </div>
                    <!--/.navbar-header-->
                <div class="navbar-collapse collapse" id="bs-example-navbar-collapse-1" style="height: 1px;">
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href=""""),_display_(/*54.39*/routes/*54.45*/.User.login()),format.raw/*54.58*/(""""><i class="fa fa-user"></i><span>登录</span></a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="fa fa-list"></i><span>资源</span></a>
                                <!--<ul class="dropdown-menu">
                        <li><a href="courses.html">学习网站</a></li>
                        <li><a href="courses.html">大一排名</a></li>
                        <li><a href="course_detail.html">大二排名</a></li>
                        <li><a href="course_detail.html">大三排名</a></li>
                    </ul>-->
                        </li>
                            <!--<li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="fa fa-calendar"></i><span>实验室事件</span></a>
                    <ul class="dropdown-menu">
                        <li><a href="events.html">Event1</a></li>
                        <li><a href="events.html">Event2</a></li>
                        <li><a href="events.html">Event3</a></li>
                    </ul>
                </li>-->
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                            class="fa fa-globe"></i><span>反馈</span></a>
                                <!--<ul class="dropdown-menu">
                        <li><a href="#"><span><i class="flags us"></i><span>English</span></span></a></li>
                        <li><a href="#"><span><i class="flags newzland"></i><span>Newzland</span></span></a></li>
                    </ul>-->
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
                        <li><a href=""""),_display_(/*115.39*/routes/*115.45*/.User.index()),format.raw/*115.58*/("""">首页</a></li>
                        <li><a href=""""),_display_(/*116.39*/routes/*116.45*/.User.introduce()),format.raw/*116.62*/("""">本馆概况</a></li>
                            <!--<li class="dropdown mega-dropdown active">-->
                            <!--<a href="#" class="dropdown-toggle" data-toggle="dropdown">Admissions<span class="caret"></span></a>-->
                            <!--<div class="dropdown-menu mega-dropdown-menu">-->
                            <!--<div class="container-fluid">-->
                            <!--&lt;!&ndash; Tab panes &ndash;&gt;-->
                            <!--<div class="tab-content">-->
                            <!--<div class="tab-pane active" id="men">-->
                            <!--<ul class="nav-list list-inline">-->
                            <!--<li><a href="admission.html"><img src="images/t7.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--<li><a href="admission.html"><img src="images/t8.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--<li><a href="admission.html"><img src="images/t9.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--<li><a href="admission.html"><img src="images/t1.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--</ul>-->
                            <!--</div>-->
                            <!--<div class="tab-pane" id="women">-->
                            <!--<ul class="nav-list list-inline">-->
                            <!--<li><a href="admission.html"><img src="images/t1.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--<li><a href="admission.html"><img src="images/t2.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--<li><a href="admission.html"><img src="images/t3.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--<li><a href="admission.html"><img src="images/t4.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--<li><a href="admission.html"><img src="images/t5.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--<li><a href="admission.html"><img src="images/t6.jpg" class="img-responsive"-->
                            <!--alt=""/></a></li>-->
                            <!--</ul>-->
                            <!--</div>-->
                            <!--</div>-->
                            <!--</div>-->
                            <!--&lt;!&ndash; Nav tabs &ndash;&gt;-->
                            <!--<ul class="nav nav-tabs" role="tablist">-->
                            <!--<li class="active"><a href="#men" role="tab" data-toggle="tab">School</a></li>-->
                            <!--<li><a href="#women" role="tab" data-toggle="tab">College</a></li>-->
                            <!--</ul>-->
                            <!--</div>-->
                            <!--</li>-->
                        <li><a href=""""),_display_(/*160.39*/routes/*160.45*/.User.readerService()),format.raw/*160.66*/("""">读者服务</a></li>
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
        </nav>
            <!-- banner -->
        <div class="banner">
                <!-- banner Slider starts Here -->
            <script src=""""),_display_(/*193.27*/routes/*193.33*/.Assets.at("js/responsiveslides.min.js")),format.raw/*193.73*/(""""></script>
            <script>
                    // You can also use "$(window).load(function() """),format.raw/*195.68*/("""{"""),format.raw/*195.69*/(""""
                    $(function () """),format.raw/*196.35*/("""{"""),format.raw/*196.36*/("""
                        """),format.raw/*197.25*/("""// Slideshow 4
                        $("#slider3").responsiveSlides("""),format.raw/*198.56*/("""{"""),format.raw/*198.57*/("""
                            """),format.raw/*199.29*/("""auto: true,
                            pager: true,
                            nav: true,
                            speed: 500,
                            namespace: "callbacks",
                            before: function () """),format.raw/*204.49*/("""{"""),format.raw/*204.50*/("""
                                """),format.raw/*205.33*/("""$('.events').append("<li>before event fired.</li>");
                            """),format.raw/*206.29*/("""}"""),format.raw/*206.30*/(""",
                            after: function () """),format.raw/*207.48*/("""{"""),format.raw/*207.49*/("""
                                """),format.raw/*208.33*/("""$('.events').append("<li>after event fired.</li>");
                            """),format.raw/*209.29*/("""}"""),format.raw/*209.30*/("""
                        """),format.raw/*210.25*/("""}"""),format.raw/*210.26*/(""");

                    """),format.raw/*212.21*/("""}"""),format.raw/*212.22*/(""");
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
                                    <img src=""""),_display_(/*365.48*/routes/*365.54*/.Assets.at("images/t9.jpg")),format.raw/*365.81*/("""" class="img-responsive" alt=""/>
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
                                    <img src=""""),_display_(/*376.48*/routes/*376.54*/.Assets.at("images/t9.jpg")),format.raw/*376.81*/("""" class="img-responsive" alt=""/>
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
                                    <img src=""""),_display_(/*387.48*/routes/*387.54*/.Assets.at("images/t9.jpg")),format.raw/*387.81*/("""" class="img-responsive" alt=""/>
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
                                    <img src=""""),_display_(/*398.48*/routes/*398.54*/.Assets.at("images/t9.jpg")),format.raw/*398.81*/("""" class="img-responsive" alt=""/>
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
                                    <img src=""""),_display_(/*409.48*/routes/*409.54*/.Assets.at("images/t9.jpg")),format.raw/*409.81*/("""" class="img-responsive" alt=""/>
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
                                            <img src=""""),_display_(/*600.56*/routes/*600.62*/.Assets.at("images/book.png")),format.raw/*600.91*/("""" class="img-responsive" alt=""/>
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
                                            <img src=""""),_display_(/*623.56*/routes/*623.62*/.Assets.at("images/book.png")),format.raw/*623.91*/("""" class="img-responsive" alt=""/>
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
                                            <img src=""""),_display_(/*648.56*/routes/*648.62*/.Assets.at("images/book.png")),format.raw/*648.91*/("""" class="img-responsive" alt=""/>
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
                                            <img src=""""),_display_(/*671.56*/routes/*671.62*/.Assets.at("images/book.png")),format.raw/*671.91*/("""" class="img-responsive" alt=""/>
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
                        <img src=""""),_display_(/*702.36*/routes/*702.42*/.Assets.at("images/bk.jpg")),format.raw/*702.69*/("""" class="img-responsive" alt=""/>
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
                        <img src=""""),_display_(/*717.36*/routes/*717.42*/.Assets.at("images/thank.jpg")),format.raw/*717.72*/("""" class="img-responsive" alt=""/>
                        <div class="over-image"></div>
                    </div>
                    <div class="portfolio-description">
                        <h4><a href="#">学长学姐有话说</a></h4>
                        <p>如果你对自己的大学学习充满迷茫，或许学长学姐的的忠告，可以给你们带来启示！</p>

                        <a href=""""),_display_(/*724.35*/routes/*724.41*/.Assets.at("events.html")),format.raw/*724.66*/("""">
                            <span><i class="fa fa-chain chain_1"></i>查看详情</span>
                        </a>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="col-md-4 portfolio-left">
                    <div class="portfolio-img event-img">
                        <img src=""""),_display_(/*732.36*/routes/*732.42*/.Assets.at("images/message.jpg")),format.raw/*732.74*/("""" class="img-responsive" alt=""/>
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
                        <img src=""""),_display_(/*753.36*/routes/*753.42*/.Assets.at("images/program.jpg")),format.raw/*753.74*/("""" class="img-responsive" alt=""/>
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
                        <img src=""""),_display_(/*771.36*/routes/*771.42*/.Assets.at("images/contract.png")),format.raw/*771.75*/("""" class="img-responsive" alt=""/>
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
                        <img src="images/t10.jpg" class="img-responsive" alt=""/>
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
        <div class="footer">
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
            <p>Copyright &copy;

                                                                                                                                                                                                                                                            href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
            </p>
        </div>-->
            </div>
        </div>
        <script>
                $(document).ready(function () """),format.raw/*886.47*/("""{"""),format.raw/*886.48*/("""
                    """),format.raw/*887.21*/("""$(".dropdown").hover(
                            function () """),format.raw/*888.41*/("""{"""),format.raw/*888.42*/("""
                                """),format.raw/*889.33*/("""$('.dropdown-menu', this).stop(true, true).slideDown("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*891.29*/("""}"""),format.raw/*891.30*/(""",
                            function () """),format.raw/*892.41*/("""{"""),format.raw/*892.42*/("""
                                """),format.raw/*893.33*/("""$('.dropdown-menu', this).stop(true, true).slideUp("fast");
                                $(this).toggleClass('open');
                            """),format.raw/*895.29*/("""}"""),format.raw/*895.30*/("""
                    """),format.raw/*896.21*/(""");

                    var data = [
                        """),format.raw/*899.25*/("""{"""),format.raw/*899.26*/("""
                            """),format.raw/*900.29*/("""source: "书柜资源",
                            content: [
                                "书名",
                                "作者",
                                "入馆时间",
                                "索书号"
                            ]
                        """),format.raw/*907.25*/("""}"""),format.raw/*907.26*/(""",
                        """),format.raw/*908.25*/("""{"""),format.raw/*908.26*/("""
                            """),format.raw/*909.29*/("""source: "硬盘资源",
                            content: [
                                "项目资料",
                                "学习视频",
                                "招新资料",
                                "活动资料",
                                "奖项资料",
                                "其他"
                            ]
                        """),format.raw/*918.25*/("""}"""),format.raw/*918.26*/(""",
                        """),format.raw/*919.25*/("""{"""),format.raw/*919.26*/("""
                            """),format.raw/*920.29*/("""source: "电子资源",
                            content: [
                                "题名",
                                "作者",
                                "入馆时间"
                            ]
                        """),format.raw/*926.25*/("""}"""),format.raw/*926.26*/("""
                    """),format.raw/*927.21*/("""];
                    var s1 = $("#sources");
                    var s2 = $("#contents");

                    $.each(data, function (d) """),format.raw/*931.47*/("""{"""),format.raw/*931.48*/("""
                        """),format.raw/*932.25*/("""var t = data[d].source;
                        s1.append("<option value='" + t + "'>" + t + "</option>")
                    """),format.raw/*934.21*/("""}"""),format.raw/*934.22*/(""");

                    var init = data[0].content;

                    $.each(init, function (d) """),format.raw/*938.47*/("""{"""),format.raw/*938.48*/("""
                        """),format.raw/*939.25*/("""s2.append("<option value='" + init[d] + "'>" + init[d] + "</option>")
                    """),format.raw/*940.21*/("""}"""),format.raw/*940.22*/(""");

                    s1.change(function () """),format.raw/*942.43*/("""{"""),format.raw/*942.44*/("""
                        """),format.raw/*943.25*/("""s2.empty();
                        var index = s1.get(0).selectedIndex;
                        var t = data[index].content;
                        $.each(t, function (d) """),format.raw/*946.48*/("""{"""),format.raw/*946.49*/("""
                            """),format.raw/*947.29*/("""s2.append("<option value='" + t[d] + "'>" + t[d] + "</option>")
                        """),format.raw/*948.25*/("""}"""),format.raw/*948.26*/(""")
                    """),format.raw/*949.21*/("""}"""),format.raw/*949.22*/(""")
                """),format.raw/*950.17*/("""}"""),format.raw/*950.18*/(""");
        </script>
        <script src=""""),_display_(/*952.23*/routes/*952.29*/.Assets.at("js/jquery.countdown.js")),format.raw/*952.65*/(""""></script>
        <script src=""""),_display_(/*953.23*/routes/*953.29*/.Assets.at("js/script.js")),format.raw/*953.55*/(""""></script>
    </body>
</html>"""),format.raw/*955.8*/("""}"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Nov 27 10:15:11 CST 2017
                  SOURCE: /home/fan/sbtProject/Library Manager/app/views/index.scala.html
                  HASH: 5bcdfbbfabcb5f96505f9363d2b1281ace8769cf
                  MATRIX: 722->1|818->3|846->5|976->109|990->115|1039->144|1573->650|1602->651|1643->664|1705->699|1734->700|1803->741|1832->742|1873->755|1931->786|1960->787|1989->788|2047->819|2062->825|2124->866|2285->1000|2300->1006|2351->1036|2412->1070|2427->1076|2481->1109|2581->1182|2596->1188|2644->1215|2729->1273|2744->1279|2792->1306|2894->1381|2909->1387|2968->1425|3176->1606|3191->1612|3246->1646|4046->2419|4061->2425|4111->2454|4609->2925|4624->2931|4658->2944|8248->6506|8264->6512|8299->6525|8379->6577|8395->6583|8434->6600|11674->9812|11690->9818|11733->9839|13679->11757|13695->11763|13757->11803|13886->11903|13916->11904|13981->11940|14011->11941|14065->11966|14164->12036|14194->12037|14252->12066|14513->12298|14543->12299|14605->12332|14715->12413|14745->12414|14823->12463|14853->12464|14915->12497|15024->12577|15054->12578|15108->12603|15138->12604|15191->12628|15221->12629|24609->21989|24625->21995|24674->22022|25321->22641|25337->22647|25386->22674|26033->23293|26049->23299|26098->23326|26745->23945|26761->23951|26810->23978|27457->24597|27473->24603|27522->24630|41016->38096|41032->38102|41083->38131|42699->39719|42715->39725|42766->39754|44542->41502|44558->41508|44609->41537|46225->43125|46241->43131|46292->43160|47518->44358|47534->44364|47583->44391|48304->45084|48320->45090|48372->45120|48733->45453|48749->45459|48796->45484|49183->45843|49199->45849|49253->45881|50306->46906|50322->46912|50376->46944|51280->47820|51296->47826|51351->47859|57135->53618|57165->53619|57215->53640|57306->53702|57336->53703|57398->53736|57578->53887|57608->53888|57679->53930|57709->53931|57771->53964|57949->54113|57979->54114|58029->54135|58119->54196|58149->54197|58207->54226|58499->54489|58529->54490|58584->54516|58614->54517|58672->54546|59047->54892|59077->54893|59132->54919|59162->54920|59220->54949|59473->55173|59503->55174|59553->55195|59721->55334|59751->55335|59805->55360|59960->55486|59990->55487|60118->55586|60148->55587|60202->55612|60321->55702|60351->55703|60426->55749|60456->55750|60510->55775|60712->55948|60742->55949|60800->55978|60917->56066|60947->56067|60998->56089|61028->56090|61075->56108|61105->56109|61176->56152|61192->56158|61250->56194|61312->56228|61328->56234|61376->56260|61435->56291
                  LINES: 21->1|26->1|28->3|32->7|32->7|32->7|37->12|37->12|38->13|39->14|39->14|41->16|41->16|42->17|43->18|43->18|43->18|44->19|44->19|44->19|46->21|46->21|46->21|47->22|47->22|47->22|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|55->30|55->30|55->30|70->45|70->45|70->45|79->54|79->54|79->54|140->115|140->115|140->115|141->116|141->116|141->116|185->160|185->160|185->160|218->193|218->193|218->193|220->195|220->195|221->196|221->196|222->197|223->198|223->198|224->199|229->204|229->204|230->205|231->206|231->206|232->207|232->207|233->208|234->209|234->209|235->210|235->210|237->212|237->212|390->365|390->365|390->365|401->376|401->376|401->376|412->387|412->387|412->387|423->398|423->398|423->398|434->409|434->409|434->409|625->600|625->600|625->600|648->623|648->623|648->623|673->648|673->648|673->648|696->671|696->671|696->671|727->702|727->702|727->702|742->717|742->717|742->717|749->724|749->724|749->724|757->732|757->732|757->732|778->753|778->753|778->753|796->771|796->771|796->771|911->886|911->886|912->887|913->888|913->888|914->889|916->891|916->891|917->892|917->892|918->893|920->895|920->895|921->896|924->899|924->899|925->900|932->907|932->907|933->908|933->908|934->909|943->918|943->918|944->919|944->919|945->920|951->926|951->926|952->927|956->931|956->931|957->932|959->934|959->934|963->938|963->938|964->939|965->940|965->940|967->942|967->942|968->943|971->946|971->946|972->947|973->948|973->948|974->949|974->949|975->950|975->950|977->952|977->952|977->952|978->953|978->953|978->953|980->955
                  -- GENERATED --
              */
          