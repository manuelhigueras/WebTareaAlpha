<%-- 
    Document   : viewModificaTarea
    Created on : 22-dic-2020, 10:28:15
    Author     : user
--%>

<%@page import="com.modal.Cuaderno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@page import="com.servicio.bd"%>
<%@page import="java.util.Collection"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/view/bootstrap.jspf" %>
        <title>Modificacion de tareas</title>
    </head>
    <body class="container p-3 my-3 border bg-dark"">
        <section class="container p-3 my-3 border bg-dark container-fluid">
            <c:if test="${not empty requestScope.msgErrorApp }" >
                <div class="alert alert-warning" role="alert">
                    ${requestScope.msgErrorApp}
                </div>
            </c:if>            
            <div class="col text-danger">${ requestScope.msgDescripcion }</div>
            <div class="col text-danger">${ requestScope.msgEstado }</div>         
            <form action="modificar-tarea" method="get">             
                <div class="form-group">
                  <label class="text-secondary" for="desc">Descripcion:</label>
                  <input type="text" class="form-control" id="desc" value="" name="desc" required>
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
                  <button type="submit" class="btn btn-primary">Modificar</button>
                </div>                
            </form>
        </section> 
        <footer class="text-center pie"> Derechos Reservados &copy; 2020-9999 </footer> 
    </body>
</html>
