<%-- 
    Document   : PagLista2
    Created on : 20/04/2019, 07:26:27 PM
    Author     : LAB-USR-PT116-C309
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="Resources/css/estilos.css" rel="stylesheet" type="text/css"/>
        <%@include file="WEB-INF/jspf/cabecera.jspf" %>

    </head>
    <body>
        <%@include file="WEB-INF/jspf/cnav2.jspf" %>

        <%        String codc = "";

            if (request.getParameter("combo") != null) {
                codc = request.getParameter("combo");
            } else {
                codc = "0";
            }
        %>

        <main>
            <div class="alert alert-primary" role="alert">
                <h3>Buscador avanzado</h3>
            </div>
        </main>

        <main class="container">
            <div class="form-group">
                <form class="form-inline">
                    <label class="my-1 mr-2" >Seleccione categoria</label>
                    <select class="custom-select my-1 mr-sm-2" id="inlineFormCustomSelectPref" name="combo">

                        <%
                            for (Categoria c : obj.ListaCategoria()) {

                                if (Integer.parseInt(codc) == c.getIdCategoria()) {

                        %>
                        <option value="<%=c.getIdCategoria()%>" selected=""><%=c.getNomeCategoria()%></option>
                        <%
                        } else {
                        %>
                        <option value="<%=c.getIdCategoria()%>"><%=c.getNomeCategoria()%></option>
                        <%
                                }
                            }

                        %>
                    </select>
                    <button type="submit" class="btn btn-primary my-1">Aceptar</button>
                </form>
            </div>
        </main>

        <div class="cuerpo">
            <%            String cod = request.getParameter("combo");

                int codcat;

                try {
                    codcat = Integer.parseInt(cod);

                } catch (Exception ex) {
                    codcat = 1001;

                }

                for (Serie s : obj.ListaSerie(codcat)) {
            %>

            <div class="cuadro">
                <img src="Resources/img/<%=s.getIdSerie()%>.jpg" width="327" height="304">	
                <article class="descripcion">
                    <h4 class="subtitulo"><%=s.getName()%></h4>
                </article>
            </div>

            <%
                }
            %>
        </div>  

        <%@include file="WEB-INF/jspf/cfooter.jspf" %>
    </body>
</html>
