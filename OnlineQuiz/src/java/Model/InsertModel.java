/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import DAO.Connectionsql;
import Bean.InsertBean;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class InsertModel {
    Connectionsql sql;
    public InsertModel() {
        sql=new Connectionsql();
    }
     public boolean InsertDetails(InsertBean _InsertBean)
    {
        boolean result=false;
        String Query="insert into questionbank(Question,option1,option2,option3,option4,correct) values ('"+_InsertBean.getQuestion()+"','"+_InsertBean.getOption1()+"','"+_InsertBean.getOption2()+"','"+_InsertBean.getOption3()+"','"+_InsertBean.getOption4()+"','"+_InsertBean.getCorrect()+"')";
        System.out.println("QUERY........."+Query);
        result=sql.executeUpdate(Query);
        return result;
    }
     public boolean InsertDetails1(InsertBean _InsertBean)
    {
        boolean result=false;
        String Query="insert into exam(exam_name,totalque,marks) values ('"+_InsertBean.getE1()+"','"+_InsertBean.getE2()+"','"+_InsertBean.getE3()+"')";
        System.out.println("QUERY........."+Query);
        result=sql.executeUpdate(Query);
        return result;
    }
    public ArrayList getData()
    {
        ArrayList data=new ArrayList();
        try{
        String query="select id,Question,option1,option2,option3,option4,correct from questionbank";
            System.out.println("select....."+query);
        data=sql.selectQuery(query);
            System.out.println("data in model"+data);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return data;
    }
      public boolean UpDate(InsertBean _InsertBean)
    {

        String query="update questionbank set question='"+_InsertBean.getQuestion()+"',option1='"+_InsertBean.getOption1()+"', option2='"+_InsertBean.getOption2()+"',option3='"+_InsertBean.getOption3()+"',option4='"+_InsertBean.getOption4()+"',correct='"+_InsertBean.getCorrect()+"' where id="+_InsertBean.getId();
        System.out.println("update Q:"+query);
        boolean result=sql.executeUpdate(query);
        return result;
    }
      public ArrayList getData1(String id)
    {
        ArrayList data=new ArrayList();
        String query="select id,Question,option1,option2,option3,option4,correct from questionbank where id="+id;
        System.out.println("getData1");
        data=sql.selectQuery(query);
        System.out.println("ARR::"+data);

        return data;
    }

     public boolean  Delete(String id)
    {

        String query="delete from questionbank where id="+id;
        System.out.println("DELETE....."+query);
       boolean result=sql.executeUpdate(query);
        return result;
    }
 

    public ArrayList getData2(String id) {
          ArrayList data=new ArrayList();
        String query="select id,Question,option1,option2,option3,option4 from questionbank where id="+id;
        System.out.println("getData2");
        data=sql.selectQuery(query);
        System.out.println("ARR::"+data);

        return data;
    }
    public String getexamData()
    {
        ArrayList exam_data=new ArrayList();
        String emp_sel="";
        try
        {
        String query="select id,exam_name from exam";
        exam_data=sql.selectQuery(query);
            System.out.println(query);
         emp_sel="<select name='cmb_exam'>";
        for(int i=0;i<exam_data.size();i++)
        {
            ArrayList inner=(ArrayList)exam_data.get(i);
            if(inner.get(0).toString().equals("1"))
                emp_sel+="<option value='"+inner.get(0)+"' selected>"+inner.get(1)+"</option>";
            else
                emp_sel+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        emp_sel+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return emp_sel;
    }

    public String getqueData()
    {

        ArrayList que_data=new ArrayList();
        String dept_sel="";
        try
        {
        String query="select id,Question from questionbank";
        que_data=sql.selectQuery(query);
        System.out.println(query);
         dept_sel="<select multiple='multiple' name='cmb_question'>";
        for(int i=0;i<que_data.size();i++)
        {
            ArrayList inner=(ArrayList)que_data.get(i);
            dept_sel+="<option value='"+inner.get(0)+"'>"+inner.get(1)+"</option>";
        }
        System.out.println(dept_sel);
        dept_sel+="</select>";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return dept_sel;

    }
    public boolean insertexamque(InsertBean edb)
    {
        boolean result=false;
        String query="insert into questionpaper (exam_id,question_id) values ("+edb.getExam_id()+","+edb.getQuestion_id()+")";
        result=sql.executeUpdate(query);
        System.out.println(query);
        return result;
    }
    
    public ArrayList getqueData1()
    {

        ArrayList que_data=new ArrayList();
        //ArrayList que_data1=new ArrayList();
        
        try
        {
        //String query="select exam_name,totalque,marks,Question,option1,option2,option3,option4,correct from questionpaper inner join exam on questionpaper.exam_id=exam.id inner join questionbank on questionpaper.question_id=questionbank.id where exam_id=1";
         String query ="select id,Question,option1,option2,option3,option4 from questionpaper inner join questionbank on questionpaper.question_id=questionbank.id where exam_id=1";
         //String query1="select exam_name,totalque,marks from questionpaper inner join exam on questionpaper.exam_id=exam.id where exam_id=1 ";
        que_data=sql.selectQuery(query);
       // que_data1=sql.selectQuery(query1);
        System.out.println(query);
       
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return que_data;


    }
     public ArrayList getqueData2(String id)
    {

        ArrayList que_data=new ArrayList();
        
        try
        {
       String query="select correct from questionbank where id="+id;
        que_data=sql.selectQuery(query);
        System.out.println(query);

        }


        catch(Exception e)
        {
            e.printStackTrace();
        }
        return que_data;

    }
      public ArrayList getqueData3()
    {

        ArrayList que_data=new ArrayList();

        try
        {
       String query="select exam_name,totalque,marks from questionpaper inner join exam on questionpaper.exam_id=exam.id where exam_id=1";
        que_data=sql.selectQuery(query);
        System.out.println(query);

        }


        catch(Exception e)
        {
            e.printStackTrace();
        }
        return que_data;

    }

}

   


    

    
  

   

  


