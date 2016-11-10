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
public class selectque_servlet extends HttpServlet {

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
        String button = request.getParameter("button");
        HttpSession session = request.getSession();
        InsertModel _InsertModel = new InsertModel();
        try {
         

            if (button.equals("get_data")) {
                ArrayList data = _InsertModel.getqueData1();
                 
               
                session.setAttribute("stud_data", data);
                System.out.println("data....." + data);
                response.sendRedirect("examque.jsp");
            }
            if (button.equals("submit")) {
                ArrayList data = (ArrayList) session.getAttribute("stud_data");
                int c = 0;
                for (int i = 0; i < data.size(); i++) {
                    ArrayList temp = (ArrayList) data.get(i);
                    String que1 = request.getParameter("radio_" + temp.get(0) + "");


                    ArrayList data1 = _InsertModel.getqueData2(temp.get(0).toString());
                    String correct_ans = ((ArrayList) data1.get(0)).get(0).toString();
                    System.out.println(que1 + "  " + data1);


                    if (que1.equals(correct_ans)) {
                          
                        c++;
                        System.out.println("correct_ans" + c);
                        int j = data.size();
                        System.out.println(j);
                        session.setAttribute("a", c);
                      
                      

                    }
                     
                     


                }
                response.sendRedirect("Result_servlet?button=get_data1");

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
