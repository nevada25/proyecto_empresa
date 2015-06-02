package org.apache.jsp.WEB_002dINF.jspf;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class supe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<head>\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://getbootstrap.com/dist/js/bootstrap.js\"></script>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"http://getbootstrap.com/dist/css/bootstrap.css\">\n");
      out.write("<title>HTML5, CSS3 and JavaScript demo</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- Start your code here -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <nav role=\"navigation\" class=\"navbar navbar-inverse\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" data-target=\"#navbarCollapse\" data-toggle=\"collapse\" class=\"navbar-toggle\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a href=\"#\" class=\"navbar-brand\">Logotipo</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"navbarCollapse\" class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"#\">Inicio</a></li>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">Acerca de <b class=\"caret\"></b></a>\n");
      out.write("                    <ul role=\"menu\" class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"#\">Quienes somos</a></li>\n");
      out.write("                        <li><a href=\"#\">Ubicación</a></li>\n");
      out.write("                        <li><a href=\"#\">Historia</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">Blog</a></li>\n");
      out.write("                <li><a href=\"#\">Contacto</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <form role=\"search\" class=\"navbar-form navbar-right\">\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Search\" class=\"form-control\">\n");
      out.write("               </div>\n");
      out.write("           </form>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>/* Write JavaScript here */</script></body>\n");
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
