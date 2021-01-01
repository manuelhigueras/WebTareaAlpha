<%-- 
    Document   : auth
    Created on : 22-dic-2020, 10:25:24
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/view/bootstrap.jspf" %>
        <title>Autenticacion de cuenta</title>
    </head>
    <body class="container p-3 my-3 border bg-dark">
        <header class="jumbotron text-center bg-dark ">
            <h3 class="text-secondary">Autenticacion de Usuario</h3>
        </header>
        <form action ="login" method="post" class="container p-3 my-3 border bg-dark">
            <div class="form-group">
                <label for="email" class="text-secondary">Email:</label>
               <input type="text" class="form-control" class="text-secondary" id="email" placeholder="Enter username" name="email" required>
               <div class="valid-feedback">${ requestScope.msgErrorEmail }</div>
             </div>
             <div class="form-group">
               <label for="pwd" class="text-secondary">Password:</label>
               <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required>
               <div class="valid-feedback">${ requestScope.msgErrorPwd }</div>
             </div>
            <div class="container-fluid">
                <div class="container-fluidSpecialInline">
                    <button type="submit" class="btn btn-primary">Enviar</button>
                </div>    
                <div class="espaciadoSpecial"></div><br>
                <div class="container-fluidSpecialInline">
                    <a class="btn btn-primary" href="authRegistro.jsp">Registrarse</a>
                </div>   
            </div>
        </form>
        <footer class="text-center pie"> Derechos Reservados &copy; 2020-9999 </footer> 
    </body>
</html>
