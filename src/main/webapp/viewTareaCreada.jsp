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
    <body class="container p-3 my-3 border bg-dark">      
        <section class="container p-3 my-3 border bg-dark container-fluid">
            <form action="alta-tarea" method="get">              
                <div class="form-group">
                  <label class="text-secondary" for="desc">Descripcion:</label>
                  <input type="text" class="form-control" id="desc" placeholder="Descripcion" name="desc" required>
                </div>
                <div class="form-group">
                  <label class="text-secondary" for="est">Estado:</label>
                  <select class="form-control" name="est">
                      <option value="1">To Do</option>
                      <option value="2">In Progress</option>
                      <option value="3">Done</option>
                  </select>
                </div>
                <div class="container-fluid">
                  <button type="submit" class="btn btn-primary">Crear</button>
                </div>                
            </form>
        </section>   
        <div class="container p-3 my-3 border bg-dark container-fluid">
            <footer class="text-center pie"> Derechos Reservados &copy; 2020-9999 </footer> 
        </div>
    </body>
</html>