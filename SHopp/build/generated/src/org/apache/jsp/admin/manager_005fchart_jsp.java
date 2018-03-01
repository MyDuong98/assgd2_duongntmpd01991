package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Category;
import java.util.ArrayList;
import model.CategoryDAO;

public final class manager_005fchart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Biểu đồ thống kê</title>\n");
      out.write("\n");
      out.write("       \n");
      out.write("        <link href=\" ");
      out.print(request.getContextPath() );
      out.write("/css/mos-style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("       <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("            // Load the Visualization API and the piechart package.\n");
      out.write("            google.load('visualization', '1', {'packages': ['columnchart']});\n");
      out.write("\n");
      out.write("            // Set a callback to run when the Google Visualization API is loaded.\n");
      out.write("            google.setOnLoadCallback(drawChart);\n");
      out.write("\n");
      out.write("            // Callback that creates and populates a data table,\n");
      out.write("            // instantiates the pie chart, passes in the data and\n");
      out.write("            // draws it.\n");
      out.write("            function drawChart() {\n");
      out.write("\n");
      out.write("                // Create the data table.    \n");
      out.write("                var data = google.visualization.arrayToDataTable([\n");
      out.write("                    ['Country', 'Area(square km)'],['Đồ  nữ', 20],['Đồ nam', 8],['Áo khoác', 13]\n");
      out.write("                ]);\n");
      out.write("                // Set chart options\n");
      out.write("                var options = {\n");
      out.write("                    'title': 'Biểu đồ thống kê',\n");
      out.write("                    is3D: true,\n");
      out.write("                    pieSliceText: 'label',\n");
      out.write("                    tooltip: {showColorCode: true},\n");
      out.write("                    'width': 700,\n");
      out.write("                    'height': 300\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                // Instantiate and draw our chart, passing in some options.\n");
      out.write("                var chart = new google.visualization.PieChart(document.getElementById('Chart'));\n");
      out.write("                chart.draw(data, options);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"rightContent\">\n");
      out.write("                    \n");
      out.write("                    <h3>Thống kê danh mục sản phẩm</h3>\n");
      out.write("\n");
      out.write("                    <table class=\"data\">\n");
      out.write("\n");
      out.write("                          <div id=\"Chart\"></div>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
