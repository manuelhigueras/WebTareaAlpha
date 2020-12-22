<%-- 
    Document   : viewTareaCreada
    Created on : 22-dic-2020, 10:28:58
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/view/bootstrap.jspf" %>
        <title>Creando una tarea</title>
    </head>
    <body>
        <section class="container p-3 my-3 border bg-dark">
            <form action="" method="">              
                <div class="form-group">
                  <label class="text-secondary" for="desc">Descripcion:</label>
                  <input type="text" class="form-control" id="desc" value="XXXXXX" name="desc" required>
                </div>
                <div class="form-group">
                  <label class="text-secondary" for="est">Estado:</label>
                  <input type="text" class="form-control" id="est" value="XXXXXX" name="est" required>
                </div>
                <div class="container-fluid">
                  <button type="submit" class="btn btn-primary">Crear</button>
                </div>                
            </form>
        </section>   
        <footer class="text-center pie"> Derechos Reservados &copy; 2020-9999 </footer> 
    </body>
</html>
