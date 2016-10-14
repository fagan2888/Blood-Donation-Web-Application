/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sanyam
 */
@WebServlet(urlPatterns = {"/Change"})
public class Change extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String p=(String)request.getParameter("c");
        String p1=(String)request.getParameter("p1");
        String p2=(String)request.getParameter("p2");
        
        PrintWriter out = response.getWriter();
        try {
        HttpSession session=request.getSession();
        String email=(String)session.getAttribute("email");
            try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sachin123");
                //out.println(email);
            PreparedStatement ps;
            
             ps=con.prepareStatement("select password from login where email=? ");
             ps.setString(1,email);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
             if(!(rs.getString(1).equals(p)))
             {
             //out.println("Incorrect Password");
                   response.sendRedirect("changePassword.jsp?w=1");
             }
             
             }
                     
                   
            ps=con.prepareStatement("update login set passoword='"+p1+"' where email=?  ");
            //"\"SELECT * FROM login WHERE username ='\"+username1+\"' AND password='\"+password1+\"'\""
           //password1="hey";
           
            ps.setString(1,email);
            ps.executeUpdate();
             response.sendRedirect("Home.jsp");
                 out.println(email); 
                                  
          }
            catch(Exception e){
                System.out.println(e);}
            
                                 
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
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
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
