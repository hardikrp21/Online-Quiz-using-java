<%-- 
    Document   : Result
    Created on : Aug 23, 2012, 11:18:23 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     
    <body>
        <form action="selectque_servlet" method="post">
            <%
        ArrayList data=(ArrayList)session.getAttribute("stud_data");
        int data1=(Integer)session.getAttribute("a");
        %>

        <h1> exam_name:<%=((ArrayList)data.get(0)).get(0)%></h1><br>
        <h1> total_que:<%=((ArrayList)data.get(0)).get(1)%></h1><br>
        <h1>correctMarks:<%=(Integer)data1%></h1><br>
        <h1>marks:<%=((ArrayList)data.get(0)).get(2)%></h1><br>
        
        </form>
    </body>
</html>
