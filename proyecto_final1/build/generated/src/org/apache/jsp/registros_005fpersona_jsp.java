package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registros_005fpersona_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("         </li>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("        </li>\r\n");
      out.write("      \r\n");
      out.write("               \r\n");
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
      out.write("\t<script src=\"jquery/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap.js\"></script>     \r\n");
      out.write("       \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("input{\r\n");
      out.write("\tmargin:2%;\r\n");
      out.write("}\r\n");
      out.write("form{\r\n");
      out.write("\tbackground:#333333;\r\n");
      out.write("\twidth:360px;\r\n");
      out.write("\tborder:1px solid #4e4d4d;\r\n");
      out.write("\tborder-radius:8px;\r\n");
      out.write("\t-moz-border-radius:3px;\r\n");
      out.write("\t-webkit-border-radius:3px;\r\n");
      out.write("\tborder-radius:3px;\r\n");
      out.write("\tbox-shadow:inset 0 0 10px #000;\r\n");
      out.write("\tmargin:100px auto;\r\n");
      out.write("\tpadding:2.5%;\r\n");
      out.write("}\r\n");
      out.write("form input.form1{\r\n");
      out.write("\t\r\n");
      out.write("\twidth:280px;\r\n");
      out.write("\theight:35px;\r\n");
      out.write("\tpadding:2%;\r\n");
      out.write("\tmargin:2%;\r\n");
      out.write("\tcolor:#6d6d6d;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tborder-radius:0.5em;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("}\r\n");
      out.write("form input.form2{\r\n");
      out.write("\tpadding:2%;\r\n");
      out.write("\tmargin:2%;\r\n");
      out.write("}\r\n");
      out.write("form button{\r\n");
      out.write("\twidth:135px;\r\n");
      out.write("\tmargin:20px 0px 30px 30px;\r\n");
      out.write("\theight:50px;\r\n");
      out.write("\tbackground: #3c3c3c; /* Old browsers */\r\n");
      out.write("background: -moz-linear-gradient(top,  #3c3c3c 0%, #2a2828 100%); /* FF3.6+ */\r\n");
      out.write("background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#3c3c3c), color-stop(100%,#2a2828)); /* Chrome,Safari4+ */\r\n");
      out.write("background: -webkit-linear-gradient(top,  #3c3c3c 0%,#2a2828 100%); /* Chrome10+,Safari5.1+ */\r\n");
      out.write("background: -o-linear-gradient(top,  #3c3c3c 0%,#2a2828 100%); /* Opera 11.10+ */\r\n");
      out.write("background: -ms-linear-gradient(top,  #3c3c3c 0%,#2a2828 100%); /* IE10+ */\r\n");
      out.write("background: linear-gradient(to bottom,  #3c3c3c 0%,#2a2828 100%); /* W3C */\r\n");
      out.write("filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#3c3c3c', endColorstr='#2a2828',GradientType=0 ); /* IE6-9 */;\r\n");
      out.write("border:1px solid #232323;\r\n");
      out.write("color:#fff;\r\n");
      out.write("box-shadow:0px 2px 0px #000;\r\n");
      out.write("-moz-box-shadow:0px 2px 0px #000;\r\n");
      out.write("-webkit-box-shadow:0px 2px 0px #000;\r\n");
      out.write("border-radius:3px;\r\n");
      out.write("-moz-border-radius:3px;\r\n");
      out.write("-webkit-border-radius:3px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("form button.registrar:hover{\r\n");
      out.write("\tbackground:#232323;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("form button.registrar:active{\r\n");
      out.write("\tbackground: #2a2828; /* Old browsers */\r\n");
      out.write("background: -moz-linear-gradient(top,  #2a2828 0%, #3c3c3c 100%); /* FF3.6+ */\r\n");
      out.write("background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#2a2828), color-stop(100%,#3c3c3c)); /* Chrome,Safari4+ */\r\n");
      out.write("background: -webkit-linear-gradient(top,  #2a2828 0%,#3c3c3c 100%); /* Chrome10+,Safari5.1+ */\r\n");
      out.write("background: -o-linear-gradient(top,  #2a2828 0%,#3c3c3c 100%); /* Opera 11.10+ */\r\n");
      out.write("background: -ms-linear-gradient(top,  #2a2828 0%,#3c3c3c 100%); /* IE10+ */\r\n");
      out.write("background: linear-gradient(to bottom,  #2a2828 0%,#3c3c3c 100%); /* W3C */\r\n");
      out.write("filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#2a2828', endColorstr='#3c3c3c',GradientType=0 ); /* IE6-9 */\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<form action=\"\">\r\n");
      out.write("<center>\r\n");
      out.write("<h1>REGISTRO:</h1>\r\n");
      out.write("  </center>\r\n");
      out.write("  <br>\r\n");
      out.write("<input class=\"form1\" type=\"text\" placeholder=\"NOMBRE\">\r\n");
      out.write("<br>\r\n");
      out.write("<input class=\"form1\" type=\"text\" placeholder=\"APELLIDO PATERNO\">\r\n");
      out.write("<br>\r\n");
      out.write("<input  class=\"form1\" type=\"text\" placeholder=\"APELLIDO MATERNO\">\r\n");
      out.write("<br>\r\n");
      out.write("<input  class=\"form1\" type=\"text\" placeholder=\"DOCUMENTO DE INDENTIDAD\">\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<center><h2>SEXO:</h2></center><h3><input class=\"form2\" type=\"radio\" name=\"sexo\"  value=\"M\" >MASCULINO<br>\r\n");
      out.write("<input class=\"form2\" type=\"radio\" name=\"sexo\" value=\"F\">FEMENINO\r\n");
      out.write("</h3>\r\n");
      out.write("<br>\r\n");
      out.write("<input class=\"form1\" type=\"email\" placeholder=\"DIRRECION\">\r\n");
      out.write("<br>\r\n");
      out.write("<input class=\"form1\" type=\"text\" placeholder=\"TELEFONO\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"enviar\" align=\"center\">\r\n");
      out.write("<input  class=\"registrar\" type=\"button\"  value=\"REGISTRAR\">\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<footer>\r\n");
      out.write("\t\t\t<div class=\"pie\">\r\n");
      out.write("\t\t\t\t&copy; Derechos reservador por el autor, kevin , flor y elar\r\n");
      out.write("               <a  href=\"https://www.facebook.com/kevo.calderon22\"><img   class=\"logo_f\" src=\"file/img/fb-logo.png\"/></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("\t<script src=\"jquery/jquery-1.11.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap.js\"></script>\r\n");
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
