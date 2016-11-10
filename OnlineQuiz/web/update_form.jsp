<%--
    Document   : update_form
    Created on : Jul 20, 2012, 12:37:54 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%
    ArrayList data=(ArrayList)session.getAttribute("s1");
    System.out.println("DATA::"+data);
    ArrayList d1=(ArrayList)data.get(0);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="Updata_servlet" method="post">
           Question :<input type="text"  name="question" value="<%=d1.get(1)%>"><br>
		OPTION1:<input type="text" name="option1" value="<%=d1.get(2)%>"><br>
                OPTION2:<input type="text" name="option2" value="<%=d1.get(3)%>"><br>
        OPTION3:<input type="text" name="option3" value="<%=d1.get(4)%>"><br>
        OPTION4:<input type="text" name="option4" value="<%=d1.get(5)%>"><br>
        CORRECT:<input type="text" name="correct" value="<%=d1.get(6)%>"><br>
       

		<input type="hidden" name="hid_id" value="<%=d1.get(0)%>">
		<input type="submit" name="button" value="Update">
	</form>
    </body>
</html>
