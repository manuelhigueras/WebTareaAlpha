<%-- 
    Document   : index
    Created on : 22-dic-2020, 10:25:09
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/view/bootstrap.jspf" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <title>Asistente de Tareas</title>
    </head>
    <body class="container p-3 my-3">
        <%@include file="WEB-INF/view/header.jspf" %>
        <div class="espaciadoHor">
            <%@include file="WEB-INF/view/menu.jspf" %>
        </div>
        <div class="border">
            <table class="table">
                <thead class="bg-ToDo tableSpecial">
                <tr>
                  <th>Id_Cliente</th>
                  <th>Descripcion</th>
                  <th>Estado</th>
                  <th></th>
                  <th></th>
                </tr> 
                </thead>
                <tbody class="table-primary">
                  <tr>
                      <td><a class="text-body">1</a></td>
                      <td><a class="text-body">Implementar Bootstrap</a></td>
                      <td><a class="text-body">To Do</a></td>
                      <td><button class="btn btn-warning" type="submit">In Progress</button></td>
                      <td><button class="btn btn-success" type="submit">Done</button></td>
                  </tr>
                  <tr>
                      <td><a class="text-body">2</a></td>
                      <td><a class="text-body">Implementar Gui del canvas en Html</a></td>
                      <td><a class="text-body">To Do</a></td>
                      <td><button class="btn btn-warning" type="submit">In Progress</button></td>
                      <td><button class="btn btn-success" type="submit">Done</button></td>
                  </tr>
                  <tr>
                    <td><a class="text-body">3</a></td>
                    <td><a class="text-body">Implementar Botones Add, modif, Elim en html</a></td>
                    <td><a class="text-body">To Do</a></td>
                    <td><button class="btn btn-warning" type="submit">In Progress</button></td>
                    <td><button class="btn btn-success" type="submit">Done</button></td>
                  </tr>
                </tbody>
            </table>         
            <table class="table">
                <thead class="bg-InProgress tableSpecial">
                <tr>
                  <th>Id_Cliente</th>
                  <th>Descripcion</th>
                  <th>Estado</th>
                  <th></th>
                  <th></th>
                </tr> 
                </thead>
                <tbody class="table-primary">
                  <tr>
                      <td><a class="text-body">1</a></td>
                      <td><a class="text-body">Implementar Bootstrap</a></td>
                      <td><a class="text-body">To Do</a></td>
                      <td><button class="btn btn-danger" type="submit">To Do</button></td>
                      <td><button class="btn btn-success" type="submit">Done</button></td>
                  </tr>
                  <tr>
                      <td><a class="text-body">2</a></td>
                      <td><a class="text-body">Implementar Gui del canvas en Html</a></td>
                      <td><a class="text-body">To Do</a></td>
                      <td><button class="btn btn-danger" type="submit">To Do</button></td>
                      <td><button class="btn btn-success" type="submit">Done</button></td>
                  </tr>
                  <tr>
                    <td><a class="text-body">3</a></td>
                    <td><a class="text-body">Implementar Botones Add, modif, Elim en html</a></td>
                    <td><a class="text-body">To Do</a></td>
                    <td><button class="btn btn-danger" type="submit">To Do</button></td>
                    <td><button class="btn btn-success" type="submit">Done</button></td>
                  </tr>
                </tbody>
            </table>
            <table class="table">
                <thead class="bg-Done tableSpecial">
                <tr>
                  <th>Id_Cliente</th>
                  <th>Descripcion</th>
                  <th>Estado</th>
                  <th></th>
                  <th></th>
                </tr> 
                </thead>
                <tbody class="table-primary">
                  <tr>
                      <td><a class="text-body">1</a></td>
                      <td><a class="text-body">Implementar Bootstrap</a></td>
                      <td><a class="text-body">To Do</a></td>
                      <td><button class="btn btn-danger" type="submit">To Do</button></td>
                      <td><button class="btn btn-warning" type="submit">In Progress</button></td>
                  </tr>
                  <tr>
                      <td><a class="text-body">2</a></td>
                      <td><a class="text-body">Implementar Gui del canvas en Html</a></td>
                      <td><a class="text-body">To Do</a></td>
                      <td><button class="btn btn-danger" type="submit">To Do</button></td>
                      <td><button class="btn btn-warning" type="submit">In Progress</button></td>
                  </tr>
                  <tr>
                    <td><a class="text-body">3</a></td>
                    <td><a class="text-body">Implementar Botones Add, modif, Elim en html</a></td>
                    <td><a class="text-body">To Do</a></td>
                    <td><button class="btn btn-danger" type="submit">To Do</button></td>
                    <td><button class="btn btn-warning" type="submit">In Progress</button></td>
                  </tr>
                </tbody>
            </table>            
        </div>     
        <%@include file="WEB-INF/view/pie.jspf" %>
    </body>
</html>
