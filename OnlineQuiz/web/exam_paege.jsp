<%-- 
    Document   : exam_paege
    Created on : Aug 9, 2012, 1:47:17 AM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
    String data=(String)session.getAttribute("cmb_question");
     String data1=(String)session.getAttribute("cmb_exam");
    

    
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="exam_servlet" method="post">
            Exam_name:<input type="text" name="e1">
            Exam_totalquestion :<input type="text" name="e2" >
            marks:<input type="text" name="e3"><br>
            questions:<%=data%>
            exam:<%=data1%>
            
            <input type="submit" name="button" value="submit">
            <in><input type="submit" name="button" value="exam_submit">
            </form>
    </body>
</html>
