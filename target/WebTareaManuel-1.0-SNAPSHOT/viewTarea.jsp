<%-- 
    Document   : viewTarea
    Created on : 22-dic-2020, 10:27:02
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/view/bootstrap.jspf" %>
        <title>Vista de la Tarea</title>
    </head>
    <body class="container p-3 my-3 border bg-dark">
        <div class="container-sm">
            <div class="divView">
                <section class="container p-3 my-3 border bg-dark container-fluid">
                    <form action="" method="">
                        <div class="form-group">
                          <label class="text-secondary" for="id">Id:</label>
                          <input type="text" class="form-control" id="id" value="XXXXX" name="id" disabled>
                        </div>                
                        <div class="form-group">
                          <label class="text-secondary" for="desc">Descripcion:</label>
                          <input type="text" class="form-control" id="desc" value="XXXXXX" name="desc" disabled>
                        </div>
                        <div class="form-group">
                          <label class="text-secondary" for="est">Estado:</label>
                          <input type="text" class="form-control" id="est" value="XXXXXX" name="est" disabled>
                        </div>
                        <div class="container-fluid">
                          <button type="submit" class="btn btn-primary">Volver al administrador</button>
                        </div>                
                    </form>
                </section>
                <footer class="text-center pie"> Derechos Reservados &copy; 2020-9999 </footer> 
            </div>
        </div>
    </body>
</html>
