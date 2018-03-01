package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>content</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"rightContent\">\n");
      out.write("            <h3>Dashboard</h3>\n");
      out.write("            <div class=\"welcome\">\n");
      out.write("              <b>Welcome :</b><br>\n");
      out.write("                <i style=\"color: #5b5b5b;\">\"Welcome to our store\"</i>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"\"><img src=\" ");
      out.print(request.getContextPath() );
      out.write("/img/posting.png\"><br>PhucAn</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"\"><img src=\" ");
      out.print(request.getContextPath() );
      out.write("/img/photo.png\"><br>Bomber DNA Basic</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"\"><img src=\" ");
      out.print(request.getContextPath() );
      out.write("/img/halaman.png\"><br>M.Y.M</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"\"><img src=\" ");
      out.print(request.getContextPath() );
      out.write("/img/template.png\"><br>ZigZag</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"\"><img src=\" ");
      out.print(request.getContextPath() );
      out.write("/img/quote.png\"><br>The Cosmo</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"shortcutHome\">\n");
      out.write("                <a href=\"\"><img src=\" ");
      out.print(request.getContextPath() );
      out.write("/img/bukutamu.png\"><br>Parka DNA Basic</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            <div id=\"smallRight\"><h3>Shirt manufacturers</h3>\n");
      out.write("                <table style=\"border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;\">\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">PhucAn</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">Bomber DNA Basic</td><td style=\"border: none;padding: 4px;\"><b>10</b></td></tr>\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">M.Y.M</td><td style=\"border: none;padding: 4px;\"><b>22</b></td></tr>\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">ZigZag</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">The Cosmo</td><td style=\"border: none;padding: 4px;\"><b>2</b></td></tr>\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">Parka DNA Basic</td><td style=\"border: none;padding: 4px;\"><b>12</b></td></tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"smallRight\"><h3>Data</h3>\n");
      out.write("\n");
      out.write("                <table style=\"border: none;font-size: 12px;color: #5b5b5b;width: 100%;margin: 10px 0 10px 0;\">\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">Member</td><td style=\"border: none;padding: 4px;\"><b>200</b></td></tr>\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">Online</td><td style=\"border: none;padding: 4px;\"><b>30</b></td></tr>\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">New member</td><td style=\"border: none;padding: 4px;\"><b>1</b></td></tr>\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">Current month</td><td style=\"border: none;padding: 4px;\"><b>55</b></td></tr>\n");
      out.write("                    <tr><td style=\"border: none;padding: 4px;\">Total visits</td><td style=\"border: none;padding: 4px;\"><b>100</b></td></tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("\n");
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
