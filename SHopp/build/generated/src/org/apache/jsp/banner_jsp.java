package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class banner_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>banner</title>\n");
      out.write("              <link href=\"css2/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<link href=\"css2/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
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
      out.write("\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"banner-mat\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"banner\">\n");
      out.write("\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t   <div class=\"slider\">\n");
      out.write("\t\t\t<ul class=\"rslides\" id=\"slider1\">\n");
      out.write("\t\t\t  <li><img src=\"images/banner.jpg\" alt=\"\">\n");
      out.write("\t\t\t  </li>\n");
      out.write("\t\t\t  <li><img src=\"images/banner1.jpg\" alt=\"\">\n");
      out.write("\t\t\t  </li>\n");
      out.write("\t\t\t  <li><img src=\"images/banner.jpg\" alt=\"\">\n");
      out.write("\t\t\t  </li>\n");
      out.write("\t\t\t  <li><img src=\"images/banner2.jpg\" alt=\"\">\n");
      out.write("\t\t\t  </li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"banner-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"banner-matter\">\n");
      out.write("\t\t\t\t\t\t<p>Childish Gambino - Camp Now Available for just $9.99</p> \n");
      out.write("\t\t\t\t\t\t<a href=\"single.jsp\" class=\"hvr-shutter-in-vertical \">Purchase</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"purchase\">\n");
      out.write("\t\t\t\t\t\t<a href=\"single.jsp\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">Purchase</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
