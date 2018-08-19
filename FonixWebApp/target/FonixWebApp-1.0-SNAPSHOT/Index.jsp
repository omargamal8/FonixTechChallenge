<%-- 
    Document   : Index
    Created on : Aug 18, 2018, 10:51:22 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css">
        
        <title>Home</title>
    </head>
    <body>
        <h1>Fonix Tech Challenge</h1>
        <p> Enter Mobile Number </p>
        <form action="/FonixWebApp/sendj.jsp" method="get">  
        <input name="mobile_number" type="number" step="1" min="1" class="quantity" />
        <input type="submit" value="Send Code">
        </form>
        
    </body>
</html>
