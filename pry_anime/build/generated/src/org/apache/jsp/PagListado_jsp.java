package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controlador.DaoCategoria;
import clase.*;

public final class PagListado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/cnav.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cabecera.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cfooter.jspf");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Resources/css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            css\n");
      out.write("            /*Eliminamos los margenes y paddings que agrega el navegador por defecto*/\n");
      out.write("            * {\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Agregamos margenes inferiores a los parrafos*/\n");
      out.write("            p {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            header {\n");
      out.write("                background: rgba(0,0,0,0.9);\n");
      out.write("                width: 100%;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 100;\n");
      out.write("            }\n");
      out.write("            nav {\n");
      out.write("                float: left; /* Desplazamos el nav hacia la izquierda */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul {\n");
      out.write("                list-style: none;\n");
      out.write("                overflow: hidden; /* Limpiamos errores de float */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul li {\n");
      out.write("                float: left;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul li a {\n");
      out.write("                display: block; /* Convertimos los elementos a en elementos bloque para manipular el padding */\n");
      out.write("                padding: 5px;\n");
      out.write("                color: #fff;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav ul li:hover {\n");
      out.write("                background: #3ead47;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .contenido {\n");
      out.write("                padding-top: 80px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .wrapper {\n");
      out.write("                width: 80%;\n");
      out.write("                margin: auto;\n");
      out.write("                overflow:hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        ");
      out.write("<header>\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"PagListado.jsp\">Inicio</a></li>\n");
      out.write("            <li><a href=\"PagQuienesSomos.jsp\">Nosotros</a></li>\n");
      out.write("            <li><a href=\"#\">Servicios</a></li>\n");
      out.write("            <li><a href=\"#\">Contactenos</a></li>\n");
      out.write("    \n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("</header>");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"Resources/bootstrap/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Resources/bootstrap/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Resources/bootstrap/bootstrap-grid.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"Resources/bootstrap/bootstrap-reboot.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");

DaoCategoria obj = new DaoCategoria();

      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>.</h1>\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div class=\"alert alert-primary\" role=\"alert\">\n");
      out.write("                <h3>Buscador avanzado</h3>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <main class=\"container\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <form class=\"form-inline\">\n");
      out.write("                    <label class=\"my-1 mr-2\" >Seleccione categoria</label>\n");
      out.write("                    <select class=\"custom-select my-1 mr-sm-2\" id=\"inlineFormCustomSelectPref\" name=\"combo\">\n");
      out.write("\n");
      out.write("                        ");
                        for (Categoria c : obj.ListaCategoria()) {

                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(c.getIdCategoria());
      out.write('"');
      out.write('>');
      out.print(c.getNomeCategoria());
      out.write("</option>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary my-1\">Aceptar</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <main class=\"container\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                ");

                    int cont = 0;
                    int codSerie = 1000;
                    String cod = request.getParameter("combo");

                    if (cod != null) {
                        codSerie = Integer.parseInt(cod);
                        out.print("<table class='table table-borderless'><tr>");

                        for (Serie s : obj.ListaSerie(codSerie)) {
                            out.print(" <td> <img src='Resources/img/" + s.getIdSerie() + ".jpg' width='260' height='300'>");

                            cont++;

                            if (cont == 3) {
                                out.print("</tr><tr>");
                                cont = 0;
                            }
                        }
                        out.print("</table>");
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("\n");
      out.write("<footer class=\"abajo\">\n");
      out.write("    <div class=\"redes\">\n");
      out.write("        <img src=\"Resources/imagenes/twitter.png\" alt=\"\" class=\"sociales\">\n");
      out.write("        <img src=\"Resources/imagenes/facebook.png\" alt=\"\" class=\"sociales\">\n");
      out.write("        <img src=\"Resources/imagenes/linkedin.png\" alt=\"\" class=\"sociales\">\n");
      out.write("  \n");
      out.write("        <img src=\"Resources/imagenes/youtube.png\" alt=\"\" class=\"sociales\">\n");
      out.write("    </div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write(" \n");
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
