package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controlador.DaoCategoria;
import clase.*;

public final class PagLista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/cabecera.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/cnav2.jspf");
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
      out.write("        <title>Pagina Listado</title>\n");
      out.write("        <link href=\"Resources/css/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!---\n");
      out.write("        <div class=\"logo\"><img src=\"Resources/imagenes/login.png\" alt=\"\" class=\"parque\"></div>\n");
      out.write("--->\n");
      out.write("\n");
      out.write("<div class=\"contenedor\">\n");
      out.write("    <div class=\"superior\">\n");
      out.write("        <nav class=\"menusup\">\n");
      out.write("            <ul class=\"opciones\">\n");
      out.write("                <li><a href=\"#\">Inicio</a></li>\n");
      out.write("                <li><a href=\"#\">Nosotros</a></li>\n");
      out.write("                <li><a href=\"#\">Servicios</a></li>\n");
      out.write("                <li><a href=\"#\">Noticias</a></li>\n");
      out.write("                <li><a href=\"#\">Contacto</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"baner\">\n");
      out.write("        <section class=\"mayor\">\n");
      out.write("            <img src=\"Resources/imagenes/banner.jpg\" id=\"corredizo\" width=\"100%\" height=\"220px\">\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </section>");
      out.write("\n");
      out.write("\n");
      out.write("        ");
        String codc = "";

            if (request.getParameter("combo") != null) {
                codc = request.getParameter("combo");
            }
        
      out.write("\n");
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
                                
                                if (Integer.parseInt(codc) == c.getIdCategoria()) {

                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(c.getIdCategoria());
      out.write("\" selected=\"\">");
      out.print(c.getNomeCategoria());
      out.write("</option>\n");
      out.write("                        ");

                        } else {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(c.getIdCategoria());
      out.write('"');
      out.write('>');
      out.print(c.getNomeCategoria());
      out.write("</option>\n");
      out.write("                        ");

                                }
                            }

                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary my-1\">Aceptar</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <div class=\"cuerpo\">\n");
      out.write("            ");
            String cod = request.getParameter("combo");
                int codSerie = Integer.parseInt(cod);

                for (Serie s : obj.ListaSerie(codSerie)) {
            
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"cuadro\">\n");
      out.write("                <img src=\"Resources/img/");
      out.print(s.getIdSerie());
      out.write(".jpg\" width=\"327\" height=\"314\">\t\n");
      out.write("                <article class=\"descripcion\">\n");
      out.write("                    <h4 class=\"subtitulo\">");
      out.print(s.getName());
      out.write("</h4>\n");
      out.write("                </article>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
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
