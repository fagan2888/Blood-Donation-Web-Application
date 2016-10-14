/*
 * To change this template, choose Tools | Templates
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
 * @author SONY
 */
@WebServlet(urlPatterns = {"/Edit"})
public class Edit extends HttpServlet {

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
            HttpSession session = request.getSession();
            String email = (String) session.getAttribute("email");
            try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sachin123");
            PreparedStatement ps,ps2;
            ps=con.prepareStatement("select * from information where email=?");
            ps.setString(1,email);
            ResultSet rs2,rs=ps.executeQuery();
            
            while(rs.next())
            {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Profile</title>");
                out.println("<style>");
                
                out.println(".p1{\n" +
"                color: #333333;\n" +
"                font-weight: bold;\n" +
"                font-family: myriad pro;\n" +
"                font-size: 18px;\n" +
"            }\n" +
"            \n" +
"            pre{\n" +
"                color: #333333;\n" +
"                font-weight: bold;\n" +
"                font-family: myriad pro;\n" +
"                font-size: 18px;\n" +
"                text-align: left;\n" +
"                margin-left: 10%;\n" +
"                margin-bottom: 30px;\n" +
"            }\n" +
"            \n" +
"            .p2{\n" +
"                color: #660066;\n" +
"                margin-left: 5px;\n" +
"                margin-right: 5px;\n" +
"                font-weight: bolder;\n" +
"                font-family: myriad pro;\n" +
"            }\n" +
"            \n" +
"            a {\n" +
"                color: #003366;\n" +
"                font-size: 18px;\n" +
"            }\n" +
"            a:hover{\n" +
"                color: #006633;\n" +
"            }\n" +
"            a:active{\n" +
"                color: #fa684c;\n" +
"            }\n" +
"            \n" +
"            a.a1 {\n" +
"                color: #003366;\n" +
"                font-size: 18px;\n" +
"            }\n" +
"            a.a1:hover{\n" +
"                color: #006633;\n" +
"            }\n" +
"            a.a1:active{\n" +
"                color: #fa684c;\n" +
"            }\n" +
"            .input1 {\n" +
"                \n" +
"                font-size: 15px;\n" +
"                width: 50%;\n" +
"                background: #fff1fa;\n" +
"                border-radius: 3px;\n" +
"                \n" +
"            }\n" +
"            \n" +
"            .input2 {\n" +
"                \n" +
"                width: 15%;\n" +
"                margin-bottom: 1%;\n" +
"                font-size: 13px;\n" +
"                border-radius: 7px;\n" +
"                border: double;\n" +
"                padding-top: 4px;\n" +
"                padding-bottom: 4px;\n" +
"                font-weight: bold;\n" +
"                background: #cef8f6;\n" +
"                position: absolute;\n" +
"                left: 40%;\n" +
"            }\n" +
"            ");
                out.println("</style>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div style=\"background-color: #fbfff1;position:absolute;top:5%;left:15%;height:90%;width:70%;border: double 5px #ccccff;border-radius: 5px;\">");
                
                out.println(" <p class=\"p1\" style=\"float:left;margin-left:10px;\"> Hello &nbsp;&nbsp;</p>");
                try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sachin123");
                ps=con.prepareStatement("select * from information where email=?");
                ps.setString(1,session.getAttribute("email").toString());
                rs2=ps.executeQuery();
                rs2.next();
                out.println("<p class=\"p1\" style=\"float:left;text-decoration:underline;\"> "+rs2.getString(1) + " !</p>");

                ps2=con.prepareStatement("select * from credits where email=?");
                ps2.setString(1,session.getAttribute("email").toString());
                ps2.executeQuery();
                rs2=ps2.executeQuery();
                rs2.next();
                out.println("<p class=\"p2\" style=\"float:left;margin-left: 10px;margin-right:10px;\">|</p>");

                out.println("<p class=\"p1\" style=\"float:left;\">  Credits : " + rs2.getInt(2) +"</p>");

                }catch(Exception e)
                {
                    System.out.println("e");
                }
                
                out.println("<div style=\"font-family: myriad pro;margin: 15px;font-weight: bolder;text-align: right;\"><a style=\"float:right;\" href=\"Logout\" >Logout</a> <p style=\"float:right;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p> <a style=\"float: none;\" href=\"Home.jsp\">Home</a></div> ");   
                
                out.println("<div style=\"position: relative;top:1%;left:8%;height:80%;width:80%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;\">");
                
                out.println("<div style=\"position: relative;top:5%;left:15%;width:70%;height:83%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;box-shadow: 10px 10px 5px #888888;\">");
                
                out.println("<form action=Save method=post>");
                out.println("<pre style=\"margin-top:10%\">Name                      -        <input class=\"input1\" type=text name=na id=na value=\""+ rs.getString(1) +"\"></pre>");
                out.println("<pre>City                          -        <input class=\"input1\" type=text id=ci name=ci value=\""+ rs.getString(2) +"\"></pre>");
                out.println("<pre>State                       -        <input class=\"input1\" type=text id=sa name=sa value=\""+ rs.getString(3) +"\"></pre>");
                out.println("<pre>Blood Group         -        <input class=\"input1\" type=text id=bg name=bg value=\""+ rs.getString(4) +"\"></pre>");
                out.println("<pre>Mobile Number   -        <input class=\"input1\" type=text id=mb name=mb value=\""+ rs.getString(5) +"\"></pre>");
                out.println("<input type=submit value=\"Save\" class=\"input2\">");
                out.println("</form>");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            }
            }catch(Exception e)
            {
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
