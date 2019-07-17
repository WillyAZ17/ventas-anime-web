<%-- 
    Document   : Login
    Created on : 20/04/2019, 02:46:17 PM
    Author     : LAB-USR-AQ265-A0806
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<style>
    #login{
        padding: 10px;
    }
</style>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/cabecera.jspf" %>
        <title>Pagina Login</title>
    </head>
    <body>
        <div class="modal-title">
            <div class="container">
                <div class="container" id="login">
                    <div class="col-lg-6">
                        <div class="panel-heading text-center">
                            <h2>LOGIN</h2>
                        </div>
                        <div class="panel-body">
                            <h4>Usuario : </h4>
                            <input type="text" class="form-control" name="usuario" placeholder="email"> <br>
                            <h4>Contraseña : </h4>
                            <input type="password" class="form-control" name="contraseña">
                        </div><br>
                        <div class="panel-footer">
                            <button class="btn btn-primary">Ingresar</button>
                            <button class="btn btn-info">Registrar</button>
                        </div>



                    </div>
                </div>

            </div>

    </body>
</html>
