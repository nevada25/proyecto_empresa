package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/cabeza.jsp");
    _jspx_dependants.add("/pie.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"file/css/estilos.css\" >\r\n");
      out.write("        <link rel=\"stylesheet\"  href=\"file/bootstrap-3.3.4-dist/css/bootstrap.css\">\r\n");
      out.write("        <title>\tINICIO</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\"   href=\"file/img/1432285816_home.ico\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <section id=\"general\">\r\n");
      out.write("   \r\n");
      out.write("    <header>\r\n");
      out.write("    <div>\r\n");
      out.write("      <div class=\"cabecera\">\r\n");
      out.write("      <img   class=\"logo_cabeza\" src=\"file/img/icono pestaña.png\"/>\r\n");
      out.write("\t\tSELVA AMAZONICA\r\n");
      out.write("\t\t</div>\r\n");
      out.write("      </div>\r\n");
      out.write("\t</header>\r\n");
      out.write("    <!-- codigo de navegacion-->\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("        <span class=\"sr-only\" >MENU</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\"  href=\"inicio.jsp\">MENU PRINCIPAL</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"active\"><a  href=\"inicio.jsp\">INICIO <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("        <li><a   href=\"quienes_somos.jsp\">QUIENES SOMOS</a></li>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">REGISTRO <span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("            <li><a  href=\"registros_persona.jsp\">PERSONAS</a></li>\r\n");
      out.write("            <li><a href=\"registro_vehiculo.jsp\">VEHICULO</a></li>\r\n");
      out.write("            \r\n");
      out.write("          </ul>\r\n");
      out.write("          \r\n");
      out.write("           ");
      out.write(" \r\n");
      out.write("         \r\n");
      out.write("         <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">VISTAS<b class=\"caret\"></b></a>\r\n");
      out.write("            <ul  class=\"dropdown-menu\">\r\n");
      out.write("              <li><a href=\"\">PERSONAL</a></li>\r\n");
      out.write("              <li><a href=\"\">VEHICULOS</li>\r\n");
      out.write("            </ul> \r\n");
      out.write("\r\n");
      out.write(" <li><a    href=\"login.jsp\">SALIR</a></li>   \r\n");
      out.write("         </li>\r\n");
      out.write("         \r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("        </li>\r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("           \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      </ul>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("    </div><!-- /.navbar-collapse -->\r\n");
      out.write("  </div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("\t<script  src=\"file/js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script  src=\"file/bootstrap-3.3.4-dist/js/bootstrap.js\"></script>     \r\n");
      out.write("       \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".container2{\r\n");
      out.write("\tmargin:5%;\r\n");
      out.write("\tborder-radius:1em;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("  <!-- Indicators -->\r\n");
      out.write("  <ol class=\"carousel-indicators\">\r\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("  </ol>\r\n");
      out.write("\r\n");
      out.write("  <!-- Wrapper for slides -->\r\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("    <div class=\"item active\">\r\n");
      out.write("      <img src=\"...\" alt=\"...\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        ...\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("      <img src=\"...\" alt=\"...\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        ...\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ...\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Controls -->\r\n");
      out.write("  <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Next</span>\r\n");
      out.write("  </a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container2\">\r\n");
      out.write("<!--Comienzo del cÃ³digo para pase de imÃ¡genes (Carrusel)-->\r\n");
      out.write("\r\n");
      out.write("<div id=\"miCarrusel\" class=\"carousel slide\">\r\n");
      out.write("  \r\n");
      out.write("  <!-- indicadores de elementos -->\r\n");
      out.write("  <ol class=\"carousel-indicators\">\r\n");
      out.write("      <li data-target=\"#miCarrusel\" data-slide-to=\"0\"></li>\r\n");
      out.write("      <li data-target=\"#miCarrusel\" data-slide-to=\"1\" class=\"active\"></li>\r\n");
      out.write("      <li data-target=\"#miCarrusel\" data-slide-to=\"2\"></li>\r\n");
      out.write("  </ol>\r\n");
      out.write("          \r\n");
      out.write("  <div class=\"carousel-inner\"><!-- Carrusel elementos (items) -->\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("      <img src=\"http://lorempixel.com/1200/780/animals\" alt=\"\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        <h4>Primera etiqueta de miniatura de imagen (thumbnail)</h4>\r\n");
      out.write("        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("      <img src=\"http://lorempixel.com/1200/780/sports\" alt=\"\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        <h4>Segunda etiqueta de miniatura de imagen (thumbnail)</h4>\r\n");
      out.write("        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"item\">\r\n");
      out.write("      <img  src=\"file/img/123.jpg\" alt=\"\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        <h4>cuarta etiqueta de miniatura de imagen (thumbnail)</h4>\r\n");
      out.write("        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"item active\">\r\n");
      out.write("      <img src=\"http://lorempixel.com/1200/780/technics\" alt=\"\">\r\n");
      out.write("      <div class=\"carousel-caption\">\r\n");
      out.write("        <h4>Tercera etiqueta de miniatura de imagen (thumbnail)</h4>\r\n");
      out.write("        <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div><!-- cierre carousel-inner-->\r\n");
      out.write("\r\n");
      out.write("  <!-- Carrusel navegaciÃ³n -->\r\n");
      out.write("  <a class=\"left carousel-control\" href=\"#miCarrusel\" data-slide=\"prev\">&lsaquo;</a>\r\n");
      out.write("  <a class=\"right carousel-control\" href=\"#miCarrusel\" data-slide=\"next\">&rsaquo;</a>\r\n");
      out.write("\r\n");
      out.write("</div><!-- cierre miCarrusel-->\r\n");
      out.write("\r\n");
      out.write("<!--Final del cÃ³digo para pase de imÃ¡genes (Carrusel)-->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("<footer>\r\n");
      out.write("\t\t\t<div class=\"pie\">\r\n");
      out.write("\t\t\t\t&copy; Derechos reservador por el autor, kevin , flor y elar\r\n");
      out.write("               <a  href=\"https://www.facebook.com/kevo.calderon22\" target=\"_blank\"><img   class=\"logo_f\" src=\"file/img/fb-logo.png\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("\t\r\n");
      out.write("    </body>\r\n");
      out.write("    </html>");
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
