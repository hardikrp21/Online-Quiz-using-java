/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Bean.InsertBean;
import Model.InsertModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author User
 */
public class Updata_servlet extends HttpServlet {
    private int count;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {

            String button=request.getParameter("button");

            InsertModel _InsertModel=new InsertModel();
            HttpSession session=request.getSession();
            if(button.equals("update_data"))
            {
                String id=request.getParameter("id");
                ArrayList data=_InsertModel.getData1(id);
                session.setAttribute("s1",data);
                response.sendRedirect("update_form.jsp");
                System.out.println(data);
            }
            if(button.equals("Update"))
            {
                String id=request.getParameter("hid_id");
                String question=request.getParameter("question");
                String option1=request.getParameter("option1");
                String option2=request.getParameter("option2");
                String option3=request.getParameter("option3");
                String option4=request.getParameter("option4");
                String correct=request.getParameter("correct");

                InsertBean _InsertBean=new InsertBean();
                _InsertBean.setId(id);
                _InsertBean.setQuestion(question);
                _InsertBean.setOption1(option1);
                _InsertBean.setOption2(option2);
                 _InsertBean.setOption3(option3);
                  _InsertBean.setOption4(option4);
                   _InsertBean.setCorrect(correct);

                 boolean result=_InsertModel.UpDate(_InsertBean);
                
                if(result==true)
                    response.sendRedirect("QuestionMaster.jsp?inserted=true");
                else
                    response.sendRedirect("QuestionMaster.jsp?inserted=false");
            }
        }
            

            finally {
            out.close();
        }

}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
