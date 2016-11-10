/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Connectionsql {

    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    public Connectionsql() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "root");
           System.out.println("CONNECTION..........."+con);
            st=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   
    }
     public boolean executeUpdate(String query)
    {
        boolean result=false;
        try{
            int c=st.executeUpdate(query);
            if(c>0)
                result=true;
            else
                result=false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return result;
    }

    public ArrayList selectQuery(String query)
    {
        ArrayList data=new ArrayList();
        try{
            rs=st.executeQuery(query);
            ResultSetMetaData rsmd=rs.getMetaData();
            int cc=rsmd.getColumnCount();
            while(rs.next())
            {
                ArrayList temp=new ArrayList();
                    for(int i=1;i<=cc;i++)
                    {
                        temp.add(rs.getObject(i));
                    }
                data.add(temp);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return data;
    }

   


}


