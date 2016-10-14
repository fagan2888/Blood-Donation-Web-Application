import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SONY
 */
@WebServlet(urlPatterns = {"/CheckCaptcha"})
public class CheckCaptcha extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
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
                String cap1,cap2;
                cap1=request.getParameter("capt");
                cap2=request.getParameter("cap");//Correct value
                
                try{
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sachin123");
            String url = "select * from login where email='" + request.getParameter("email") + "'";
            Statement st3 = con.createStatement();
            ResultSet rs = st3.executeQuery(url);

            if (rs.next()) {
                response.sendRedirect("login.jsp?t=5");

            } else {
                url = "insert into login values(?,?)";
                PreparedStatement st2 = con.prepareStatement(url);
                st2.setString(1, request.getParameter("email"));
                st2.setString(2, request.getParameter("pass"));

                st2.executeUpdate();
                String date="";
                date+=request.getParameter("day");
                date+="-";
                date+=request.getParameter("month");
                date+="-";
                date+=request.getParameter("year");
                
                url = "insert into information values(?,?,?,?,?,?,?,?)";
                PreparedStatement st = con.prepareStatement(url);
                st.setString(1, request.getParameter("name"));
                st.setString(2, request.getParameter("city"));
                st.setString(3, request.getParameter("state"));
                st.setString(4, request.getParameter("mobile"));
                st.setString(5, request.getParameter("email"));
                st.setString(6, request.getParameter("gender"));
                st.setString(7, date);
                st.setString(8, request.getParameter("blood_group"));
                System.out.println(date);
                st.executeUpdate();
                
                String cred="insert into credits values(?,20)";
                PreparedStatement st_cred=con.prepareStatement(cred);
                
                st_cred.setString(1,request.getParameter("email"));
                st_cred.executeUpdate();
                
                response.sendRedirect("login.jsp?t=6");
            }      
                   }catch(Exception e){
                     System.out.println(e);
                   }
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
