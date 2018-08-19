<%-- 
    Document   : sendj
    Created on : Aug 18, 2018, 11:22:44 PM
    Author     : Omar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" type="text/css">
        <title>Verify</title>
    </head>
    <body>
        <p>Verification Code</p>
        <form action="/FonixWebApp/sendj.jsp">
        <input name="code" type="number" step="1" min="1" class="quantity" />
        <input type="submit"/>
        </form>
        
<%@            page import= "com.mycompany.fonixwebapp.Main" %>
        <%
                    String string_mobile_no = request.getParameter("mobile_number");
                    Main main;
                    if(string_mobile_no != null)
                    {
                        long mobile_no = Long.parseLong(string_mobile_no);
                        main = new Main(mobile_no);
                        main.startVerification();
                        session.setAttribute("main", main);
                    }
                    else
                    {
                        int code = Integer.parseInt(request.getParameter("code"));
                        main = (Main)session.getAttribute("main");
                        if( main.verify(code) )
                            response.sendRedirect("/FonixWebApp/success.html");
                        else
                            response.sendRedirect("/FonixWebApp/Index.jsp");
                    }

             
                        
                    
            %>
    </body>
</html>
