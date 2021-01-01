<%-- 
    Document   : viewTareaAll
    Created on : 25-dic-2020, 19:54:17
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/view/bootstrap.jspf" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
        <title>Index</title>
    </head>
    <body class="container p-3 my-3">
        <%@include file="WEB-INF/view/header.jspf" %>
        <div class="espaciadoHor">
            <%@include file="WEB-INF/view/menu.jspf" %>
        </div>
        <div class="border">
            <%@include file="WEB-INF/view/table.jspf" %>
        </div>
        <%@include file="WEB-INF/view/pie.jspf" %>
    </body>
</html>
