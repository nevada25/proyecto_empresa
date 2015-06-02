package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_005fvehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"auth-form\" id=\"login\">\r\n");
      out.write("\r\n");
      out.write("    <form accept-charset=\"UTF-8\" action=\"/session\" method=\"post\"><div style=\"margin:0;padding:0;display:inline\"><input name=\"utf8\" type=\"hidden\" value=\"&#x2713;\" /><input name=\"authenticity_token\" type=\"hidden\" value=\"W5LmABAbnWpp8fuBK4FnaNJ4LHGl4lXlXQqVRCxHmAW0xZOCtXJU36sHnPqtv8DynJbhOmoQ+rYclTPqKnzv6A==\" /></div>      <div class=\"auth-form-header\">\r\n");
      out.write("        <h1>Sign in</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"auth-form-body\">\r\n");
      out.write("        <label for=\"login_field\">\r\n");
      out.write("          Username or Email\r\n");
      out.write("        </label>\r\n");
      out.write("        <input autocapitalize=\"off\" autocorrect=\"off\" autofocus=\"autofocus\" class=\"input-block\" id=\"login_field\" name=\"login\" tabindex=\"1\" type=\"text\" />\r\n");
      out.write("\r\n");
      out.write("        <label for=\"password\">\r\n");
      out.write("          Password <a href=\"/password_reset\">(forgot password)</a>\r\n");
      out.write("        </label>\r\n");
      out.write("        <input class=\"input-block\" id=\"password\" name=\"password\" tabindex=\"2\" type=\"password\" />\r\n");
      out.write("\r\n");
      out.write("        <input id=\"return_to\" name=\"return_to\" type=\"hidden\" value=\"/join\" />                <input class=\"btn\" data-disable-with=\"Signing in?\" name=\"commit\" tabindex=\"3\" type=\"submit\" value=\"Sign in\" />\r\n");
      out.write("      </div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("<footer>\r\n");
      out.write("\t\t\t<div  class = \"Panel-footer\"  align=\"center\"> \t&copy; Derechos reservador por el autor, kevin , flor y elar\r\n");
      out.write("               <a  href=\"https://www.facebook.com/kevo.calderon22\" target=\"_blank\"><img   class=\"logo_f\" src=\"file/img/fb-logo.png\" /></a> </div></footer> \r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
