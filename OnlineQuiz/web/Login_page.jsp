<%-- 
    Document   : Login_page
    Created on : Jul 21, 2012, 12:25:04 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <table>
            <form action="Login_servlet" >
            
                UserName:<input type="text" name="username" >
                Password:<input type="password" name="password" >
                <input type="submit" value="log-in" name="button">
        </form>

        </table>

        </center>
    </body>
</html>
