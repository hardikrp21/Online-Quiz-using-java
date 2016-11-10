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
        <form action="selectque_servlet" method="post">

        
        <%
        ArrayList data=(ArrayList)session.getAttribute("stud_data");

        %>
      
            
        <%
        for(int i=0;i<data.size();i++)
        {

            //out.println("");
            ArrayList temp=(ArrayList)data.get(i);
            for(int j=0;j<temp.size();j++)
            {
                if(j==1)
                {
                    out.println("("+(i+1)+") "+temp.get(j)+"<br>");
                }
                else if(j>1)
                {
                    out.println("&nbsp;&nbsp;&nbsp;<input type='radio' name='radio_"+temp.get(0)+"' value='"+(j-1)+"'>"+temp.get(j)+"<br>");
                }

            }
             //out.println("<input type='radio' name='radio'>");
              

            //out.println("");
        }
        %>
        <input type="submit" value="submit" name="button">
        
     </form>
        
       
        
    


                   </body>
</html>
