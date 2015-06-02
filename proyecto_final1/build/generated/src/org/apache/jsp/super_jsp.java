package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class super_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\"  src=\"file/js/jquery-latest.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"  src=\"file/js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"file/bootstrap-3.3.4-dist/js/bootstrap.js\"></script>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"file/bootstrap-3.3.4-dist/css/bootstrap.css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\"  href=\"file/css/estilos.css\">\r\n");
      out.write("<title>INICIO</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Start your code here -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    \r\n");
      out.write("    <header    class=\"cabecera\">\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("        SELVA AMAZONICA\r\n");
      out.write("        \r\n");
      out.write("    </header>\r\n");
      out.write("    \r\n");
      out.write("    <nav role=\"navigation\" class=\"navbar navbar-inverse\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" data-target=\"#navbarCollapse\" data-toggle=\"collapse\" class=\"navbar-toggle\">\r\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a href=\"#\" class=\"navbar-brand\"><img  src=\"file/img/icono pestaÃ±a.png\" class=\"img-rounded\" alt=\"LOGO\" ></a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"navbarCollapse\" class=\"collapse navbar-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"active\"><a href=\"#\">Inicio</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"#\">Acerca de <b class=\"caret\"></b></a>\r\n");
      out.write("                    <ul role=\"menu\" class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a href=\"#\">Quienes somos</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Ubicaciï¿½n</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Historia</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"#\">Blog</a></li>\r\n");
      out.write("                <li><a href=\"#\"><button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\".bs-example-modal-lg\">REGISTRO</button>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade bs-example-modal-lg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myLargeModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog modal-lg\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("     REGISTRAR PERSONA\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</div>\r\n");
      out.write("<section>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("  <div class=\"col-md-8\">.col-md-8</div>\r\n");
      out.write("  <div class=\"col-md-4\">.col-md-4</div>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("<footer align=\"center\" class=\"pie\">\r\n");
      out.write("\r\n");
      out.write("<b>&copy;COPYRIGHT . este programa fue echo por FUTUROS INGENIEROS DE SISTEMAS: KEVIN  CALDERON GUABLOCHE, FLOR SANGAMA, ELAR BECERRA </b>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<script>/* Write JavaScript here */</script>\r\n");
      out.write("</body>\r\n");
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
