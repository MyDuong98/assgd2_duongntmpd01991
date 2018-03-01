package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<title>Shop ban hang</title>\n");
      out.write("<link href=\"css1/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<link href=\"css1/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--fonts-->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("<!--//fonts-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("<!--slider-script-->\n");
      out.write("\t\t<script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t\t$(function () {\n");
      out.write("\t\t\t\t  $(\"#slider1\").responsiveSlides({\n");
      out.write("\t\t\t\t\tauto: true,\n");
      out.write("\t\t\t\t\tspeed: 500,\n");
      out.write("\t\t\t\t\tnamespace: \"callbacks\",\n");
      out.write("\t\t\t\t\tpager: true,\n");
      out.write("\t\t\t\t  });\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("<!--//slider-script-->\n");
      out.write("<script>$(document).ready(function(c) {\n");
      out.write("\t$('.alert-close').on('click', function(c){\n");
      out.write("\t\t$('.message').fadeOut('slow', function(c){\n");
      out.write("\t  \t\t$('.message').remove();\n");
      out.write("\t\t});\n");
      out.write("\t});\t  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>$(document).ready(function(c) {\n");
      out.write("\t$('.alert-close1').on('click', function(c){\n");
      out.write("\t\t$('.message1').fadeOut('slow', function(c){\n");
      out.write("\t  \t\t$('.message1').remove();\n");
      out.write("\t\t});\n");
      out.write("\t});\t  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>>\n");
      out.write("        <!--header-->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t<div class=\"container\">\t\n");
      out.write("\t\t\t<div class=\"header-top-in\">\t\t\t\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("                                    <a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\" \" ></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"header-in\">\n");
      out.write("\t\t\t\t\t<ul class=\"icon1 sub-icon1\">\n");
      out.write("                                            <li  ><a href=\"login.jsp\">Login</a> </li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"header-bottom\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"h_menu4\">\n");
      out.write("\t\t\t\t<a class=\"toggleMenu\" href=\"#\">Menu</a>\n");
      out.write("\t\t\t\t<ul class=\"nav\">\n");
      out.write("                                    <li class=\"active\"><a href=\"index.jsp\"><i> </i>Trang chủ</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"#\" >Clothes and Shoes</a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"drop\">\n");
      out.write("                                                    <li><a href=\"products.jsp\">Clothes</a></li>\n");
      out.write("                                                    <li><a href=\"products.jsp\">Shoes</a></li>\n");
      out.write("                                                    <li><a href=\"products.jsp\">Hat</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li> \t\t\t\t\t\t\n");
      out.write("                                                <li><a href=\"products.jsp\" >  Clothes</a></li>            \n");
      out.write("                                                <li><a href=\"products.jsp\" >Coat</a></li>\t\t\n");
      out.write("                                                <li><a href=\"SanPham.jsp\">SanPham</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\" src=\"js/nav.js\"></script>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"header-bottom-in\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"header-bottom-on\">\n");
      out.write("\t\t\t<p class=\"wel\"><a href=\"#\">Welcome visitor you can login or create an account.</a></p>\n");
      out.write("\t\t\t<div class=\"header-can\">\n");
      out.write("\t\t\t\t<ul class=\"social-in\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"facebook\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"twitter\"> </i></a></li>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"skype\"> </i></a></li>\n");
      out.write("\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t<div class=\"down-top\">\t\t\n");
      out.write("\t\t\t\t\t\t\t<select class=\"in-drop\">\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"Dollars\" class=\"in-of\">Dollars</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"Euro\" class=\"in-of\">Euro</option>\n");
      out.write("\t\t\t\t\t\t\t  <option value=\"Yen\" class=\"in-of\">Yen</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = '';}\" >\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("         <div class=\"total\">\n");
      out.write("\t                        \t\n");
      out.write("\t                        </div>\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<div class=\"footer-top\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 footer-in\">\n");
      out.write("\t\t\t\t\t\t<h4><i> </i>Suspendisse sed</h4>\n");
      out.write("\t\t\t\t\t\t<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 footer-in\">\n");
      out.write("\t\t\t\t\t\t<h4><i class=\"cross\"> </i>Suspendisse sed</h4>\n");
      out.write("\t\t\t\t\t\t<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 footer-in\">\n");
      out.write("\t\t\t\t\t\t<h4><i class=\"down\"> </i>Suspendisse sed</h4>\n");
      out.write("\t\t\t\t\t\t<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!---->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"footer-middle\">\n");
      out.write("\t\t\t\t<div class=\" container\">\t\n");
      out.write("\t\t\t\t\t<div class=\"footer-middle-in\">\n");
      out.write("                                            <h6>Link</h6>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Facebook</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Zalo</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Zingme</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Wechat</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                                        </div>\n");
      out.write("                                            <div class=\"footer-middle-in\">\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t\t<h6>My Account</h6>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"account.html\">My Account</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Order History</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"wishlist.html\">Wish List</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Newsletter</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                                            </div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-middle-in\">\n");
      out.write("\t\t\t\t\t\t<h6>Tiện ích</h6>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Nhãn hiệu</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Quà tặng</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Chi nhánh</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Đặc biệt</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                </div>\n");
      out.write("\t\t\t<p class=\"footer-class\">Copyright © 2017 </p>\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\t\t  \t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\t\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\t\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\t\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t\t \t\t};\n");
      out.write("\t\t\t\t\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
