<%-- 
    Document   : registro
    Created on : 22-dic-2020, 10:26:23
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/view/bootstrap.jspf" %>
        <title>Registro de usuario</title>
    </head>
    <body>
        <header class="jumbotron text-center bg-dark">
            <h3 class="text-secondary">Registro de usuario</h3>
        </header>
        <section class="bg-dark seccion">
            <c:if test="${not empty requestScope.msgError }" >
                <div class="alert alert-warning" role="alert">
                    ${requestScope.msgError}
                </div>
            </c:if>
            <div class="col text-danger">${ requestScope.msgError }</div>
            <div class="col text-danger">${ requestScope.msgError }</div>
            <div class="col text-danger">${ requestScope.msgError }</div>
            <div class="col text-danger">${ requestScope.msgError }</div>
            <div class="container espaciado">
              <form action="alta" method="post" class="needs-validation" novalidate>
                <div class="form-group">
                  <label class="text-secondary" for="email">Email:</label>
                  <input type="text" class="form-control" id="email" placeholder="Introduce un correo" name="email" required>
                </div>
                <div class="form-group">
                  <label for="username" class="text-secondary">Username:</label>
                  <input type="text" class="form-control" id="username" placeholder="Introduce un usuario" name="username" required>
                </div>
                <div class="form-group">
                  <label for="password" class="text-secondary">Password:</label>
                  <input type="password" class="form-control" id="pwd" placeholder="Introduce una contraseña" name="pwd" required>
                </div>                  
                <div class="form-group">
                  <label for="nombre" class="text-secondary">Nombre:</label>
                  <input type="text" class="form-control" id="nombre" placeholder="Introduce un nombre" name="nombre" required>
                </div>
                <div class="form-group">
                  <label for="apellido" class="text-secondary">Apellido:</label>
                  <input type="text" class="form-control" id="apellido" placeholder="Introduce un apellido" name="apellido" required>
                </div>                  
                <div class="container-fluid">
                  <button type="submit" class="btn btn-primary">Subir</button>
                </div>
              </form>
            </div>
        </section>        
        <footer class="text-center pie"> Derechos Reservados &copy; 2020-9999 </footer> 
    </body>
</html>
