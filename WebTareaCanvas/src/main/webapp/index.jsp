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
        <title>Asistente de Tareas</title>
    </head>
    <body>
        <header class="text-white" id="cabecera">
            <h3>Canva Asistente</h3>
        </header>
        <section class="">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-4">
                        <table class="table table-warning table-striped table-hover">
                        <thead>
                        <tr>
                          <th>Id_Cliente</th>
                          <th>Descripcion</th>
                          <th>Estado</th>
                          <th>Archivado</th>
                        </tr> 
                        </thead>
                        <tbody>
                          <tr>
                              <td><a class="text-body" href="#">1</a></td>
                              <td><a class="text-body" href="#">Implementar Bootstrap</a></td>
                              <td><a class="text-body" href="#">To Do</a></td>
                              <td><a class="text-body" href="#">1</a></td>
                          </tr>
                          <tr>
                              <td><a class="text-body" href="">2</a></td>
                              <td><a class="text-body" href="">Implementar Gui del canvas en Html</a></td>
                              <td><a class="text-body" href="">To Do</a></td>
                              <td><a class="text-body" href="">1</a></td>
                          </tr>
                          <tr>
                            <td><a class="text-body" href="">3</a></td>
                            <td><a class="text-body" href="">Implementar Botones Add, modif, Elim en html</a></td>
                            <td><a class="text-body" href="">To Do</a></td>
                            <td><a class="text-body" href="">1</a></td>
                          </tr>
                        </tbody>
                      </table>
                    </div>
                    <div class="container-fluid">
                        <input class="btn-outline-primary" type="submit" value=">"/>
                    </div>
                    <div class="container-fluid">
                        <input class="btn-outline-primary" type="submit" value="<"/>
                    </div>
                    <div class="col-md-4">
                        <table class="table table-warning table-striped table-hover">
                        <thead>
                        <tr>
                          <th>Id_Cliente</th>
                          <th>Descripcion</th>
                          <th>Estado</th>
                          <th>Archivado</th>
                        </tr> 
                        </thead>
                        <tbody>
                          <tr>
                              <td><a class="text-body" href="">1</a></td>
                              <td><a class="text-body" href="">Implementar Bootstrap</a></td>
                              <td><a class="text-body" href="">In Process</a></td>
                              <td><a class="text-body" href="">1</a></td>
                          </tr>
                          <tr>
                              <td><a class="text-body" href="">2</a></td>
                              <td><a class="text-body" href="">Implementar Gui del canvas en Html</a></td>
                              <td><a class="text-body" href="">In Process</a></td>
                              <td><a class="text-body" href="">1</a></td>
                          </tr>
                          <tr>
                              <td><a class="text-body" href="">3</a></td>
                              <td><a class="text-body" href="">Implementar Botones Add, modif, Elim en html</a></td>
                              <td><a class="text-body" href="">In Process</a></td>
                              <td><a class="text-body" href="">1</a></td>
                          </tr>
                        </tbody>
                      </table>
                      <div class="container-fluid">
                        <input class="btn-outline-primary" type="submit" value=">"/>
                      </div>
                      <div class="container-fluid">
                        <input class="btn-outline-primary" type="submit" value="<"/>
                      </div>                        
                    </div>
                    <div class="col-md-4">
                        <table class="table table-warning table-striped table-hover">
                        <thead>
                        <tr>
                          <th>Id_Cliente</th>
                          <th>Descripcion</th>
                          <th>Estado</th>
                          <th>Archivado</th>
                        </tr> 
                        </thead>
                        <tbody>
                            <tr class="text-body">
                              <td><a class="text-body" href="">1</a></td>
                              <td><a class="text-body" href="">Implementar Bootstrap</a></td>
                              <td><a class="text-body" href="">Done</a></td>
                              <td><a class="text-body" href="">1</a></td>
                          </tr>
                          <tr class="text-body">
                              <td><a class="text-body" href="">2</a></td>
                              <td><a class="text-body" href="">Implementar Gui del canvas en Html</a></td>
                              <td><a class="text-body" href="">Done</a></td>
                              <td><a class="text-body" href="">1</a></td>
                          </tr>
                          <tr class="text-body">
                              <td><a class="text-body" href="">3</a></td>
                              <td><a class="text-body" href="">Implementar Botones Add, modif, Elim en html</a></td>
                              <td><a class="text-body" href="">Done</a></td>
                              <td><a class="text-body" href="">1</a></td>
                          </tr>
                        </tbody>
                      </table>                    
                    </div>
                </div>
            </div>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-4 container-fluidSpecial">
                        <a class="btn btn btn-outline-primary" href="#">Agregar una tarea</a>
                    </div>
                    <div class="col-md-4 container-fluidSpecial">
                        <a class="btn btn btn-outline-primary" href="#">Modificar una tarea</a>
                    </div>
                    <div class="col-md-4 container-fluidSpecial">
                        <a class="btn btn btn-outline-primary" href="#">Eliminar una tarea</a>
                    </div>
                </div>
            </div>
        </section>
        <footer class="text-white" id="pie"> Derechos Reservados &copy; 2020-9999 </footer>
    </body>
</html>
