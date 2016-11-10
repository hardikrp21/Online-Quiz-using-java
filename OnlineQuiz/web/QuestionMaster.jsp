<%-- 
    Document   : QuestionMaster
    Created on : Jul 21, 2012, 2:52:19 AM
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
        <form action="Questionservlet">
        Question :<input type="text"  name="question"><br>

        OPTION1:<input type="text" name="option1"><br>
        OPTION2:<input type="text" name="option2"><br>
        OPTION3:<input type="text" name="option3"><br>
        OPTION4:<input type="text" name="option4"><br>
        CORRECT:<input type="text" name="correct"><br>
        <input type="submit" name="button" value="inserted">
        </form>
        <%
        ArrayList data=(ArrayList)session.getAttribute("stud_data");

        %>
        <table border="1">
            <tr>

                <td><b>id</b></td>
              <td><b>question</b></td>
              <td><b>option1</b></td>
              <td><b>option2</b></td>
              <td><b>option3</b></td>
              <td><b>option4</b></td>
              <td><b>correct</b></td>



            </tr>
        <%
        for(int i=0;i<data.size();i++)
        {
            
            out.println("<tr>");
            ArrayList temp=(ArrayList)data.get(i);
            for(int j=0;j<temp.size();j++)
            {
               
                out.println("<td>"+temp.get(j)+"</td>");

            }
             out.println("<td><input type='checkbox' name='radio'>");
              out.println("<td><a href='Updata_servlet?id="+temp.get(0)+"&button=update_data'>Update</a>  | <a href='delete_servlet?id="+temp.get(0)+"&button=delete_data'>Delete</a> ");
              
            out.println("</tr>");
        }
        %>
        
        </table>
        
                   </body>
</html>
