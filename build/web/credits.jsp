<%-- 
    Document   : credits
    Created on : 19 Apr, 2014, 9:42:41 PM
    Author     : Sanyam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
            out.println("Credits = " +request.getAttribute("credits"));
        
            
        %>
        
    </body>
</html>
