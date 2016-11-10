/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Bean.InsertBean;;
import Model.InsertModel;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class exam_servlet extends HttpServlet {

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
        HttpSession session=request.getSession();
        InsertModel _InsertModel=new InsertModel();
        try {
            String button=request.getParameter("button");
             String button1=request.getParameter("exam_button");

            if(button.equals("get_data"))
            {
                String exam_data=new InsertModel().getexamData();
                String que_data=new InsertModel().getqueData();

                session.setAttribute("cmb_exam", exam_data);
                session.setAttribute("cmb_question", que_data);

                response.sendRedirect("exam_paege.jsp");
               
            }
           if(button.equals("exam_submit"))
            {
                
                String exam_id=request.getParameter("cmb_exam");
                String question_id=request.getParameter("cmb_question");
                InsertBean edb=new InsertBean();
                edb.setExam_id(exam_id);
                edb.setQuestion_id(question_id);
                boolean result=new InsertModel().insertexamque(edb);
            }
             if(button.equals("submit")){
             String e1=request.getParameter("e1");
             String e2=request.getParameter("e2");
             String e3=request.getParameter("e3");


              InsertBean _InsertBean=new InsertBean();
              _InsertBean.setE1(e1);
              _InsertBean.setE2(e2);
              _InsertBean.setE3(e3);



               boolean result=_InsertModel.InsertDetails1(_InsertBean);

                if(result==true)
                    response.sendRedirect("exam_paege.jsp?button=exam_submit");
              
                else
                    response.sendRedirect("Error.jsp");

            }
        
        } finally {
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
