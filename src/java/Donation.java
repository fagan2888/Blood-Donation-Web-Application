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
import java.sql.*;
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
@WebServlet(urlPatterns = {"/Donation"})
public class Donation extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String blood = request.getParameter("blood_group");
        //System.out.println(blood);
java.sql.Timestamp t1, t2;
        int days = 0,credit=0;
        String credits="";
        
        try {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            String email = (String) session.getAttribute("email");
            blood = blood.toUpperCase();
            //out.println(blood);
            String state = "", city = "",name="";
            long mobile=0;
            int counter = 0;
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Sachin123");
                //out.println(email);
                PreparedStatement ps;

                ps = con.prepareStatement("select city,state,name,mobile from information where email=?");
                ps.setString(1, email);
                ResultSet r = ps.executeQuery();
                while (r.next()) {
                    city = r.getString(1);
                    state = r.getString(2);
                    name=r.getString(3);
                    mobile=r.getLong("mobile");
                }
                ps = con.prepareStatement("select name,city,state,mobile,email,last_donation from information where bloodgp=? and city=? and email<>?");
                ps.setString(1, blood);
                ps.setString(2, city);
                ps.setString(3, email);
                ResultSet rs = ps.executeQuery();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Donor Details</title>");
                out.println("<style>\n" +
"            \n" +
"            .p1{\n" +
"                color: #333333;\n" +
"                font-weight: bold;\n" +
"                font-family: myriad pro;\n" +
"                font-size: 18px;\n" +
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
"            \n" +
"             table\n" +
"            {\n" +
"                \n" +
"                border-collapse:collapse;\n" +
"                width:100%;\n" +
"                font-size: 18px;\n" +
"                margin-top: 1%;\n" +
"                \n" +
"                    \n" +
"            }\n" +
"            table, td, th\n" +
"            {\n" +
"                border:1px solid dodgerblue;\n" +
"                padding:1.5%;\n" +
"                font-family: Myriad Pro;\n" +
"            }\n" +
"            \n" +
"           \n" +
"            #div1\n" +
"            {\n" +
"                background-color: #22BE6B;\n" +
"                text-align: center;\n" +
"                padding:30px;\n" +
"                border-radius:10px;\n" +
"                font-size:50px;\n" +
"                font-weight: normal;\n" +
"                width:50%;\n" +
"                position:relative;\n" +
"                left:23%;\n" +
"                box-shadow: 15px 15px 5px gainsboro;\n" +
"            }\n" +
"            \n" +"pre{\n" +
"                color: #333333;\n" +
"                font-weight: bold;\n" +
"                font-family: myriad pro;\n" +
"                font-size: 18px;\n" +
"                margin-left: 10%;\n" +
"                margin-bottom: 30px;\n" +
"            }"+
"        </style>");
                out.println("</head>");
                out.println("<body>");
                
                out.println("<div style=\"background-color: #fbfff1;position:absolute;top:5%;left:15%;width:70%;border: double 5px #ccccff;border-radius: 5px;\">");
                
                out.println(" <p class=\"p1\" style=\"float:left;margin-left:10px;\"> Hello &nbsp;&nbsp;</p>");
            try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sachin123");
                //out.println(email);
            PreparedStatement ps3,ps2;
            
             ps3=con.prepareStatement("select * from information where email=?");
             ps3.setString(1,session.getAttribute("email").toString());
             ResultSet rs3=ps3.executeQuery();
             rs3.next();
            out.println("<p class=\"p1\" style=\"float:left;text-decoration:underline;\"> "+rs3.getString(1) + " !</p>");
            
            ps2=con.prepareStatement("select * from credits where email=?");
            ps2.setString(1,session.getAttribute("email").toString());
             ps2.executeQuery();
             rs3=ps2.executeQuery();
             rs3.next();
             out.println("<p class=\"p2\" style=\"float:left;margin-left: 10px;margin-right:10px;\">|</p>");
             
            out.println("<p class=\"p1\" style=\"float:left;\">  Credits : " + rs3.getInt(2) +"</p>");
            
            }catch(Exception e)
            {
                System.out.println(e);}
            
            out.println("<div style=\"font-family: myriad pro;margin: 15px;font-weight: bolder;text-align: right;\"><a style=\"float:right;\" href=\"Logout\" >Logout</a> <p style=\"float:right;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p> <a style=\"float: none;\" href=\"Home.jsp\">Home</a></div> \n" +
"        \n" +
"         <div style=\"position: relative;top:1%;left:4%;height:80%;width:90%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;margin-bottom:5%;\">\n" +
"        \n" +
"             <center><h3 style=\"font-family: Myriad Pro;color: #003366;\"> Donors belonging to "+ city +" are: </h3></center>");
                
         
                out.println("<table>");
                out.println("<tr>\n" +
"                \n" +
"                <th>Name</th>\n" +
"                <th>City</th>\n" +
"                <th>State</th>\n" +
"                <th>Mobile No.</th>\n" +
"                <th>Email Id</th>\n" +
"            </tr>");
                while (rs.next()) {
 t1 = rs.getTimestamp(6);
                    if (t1 != null) {
                        java.util.Date date = new java.util.Date();
                        Timestamp n = new Timestamp(date.getTime());
                        days = (int) ((n.getTime() - t1.getTime()) / 86400000);
                        //out.println("days are " + days);

                    }

                    if (days > 90 || t1 == null) //out.println("Days are"+days);
                    {
                                       
                    out.println("<tr>");
                    out.println("<td>" + rs.getString(1) + "</td>");
                    
                    out.println("<td>" + rs.getString(2) + "</td>");
                    
                    out.println("<td>" + rs.getString(3) + "</td>");
                    
                    out.println("<td>" + rs.getLong(4) + "</td>");
                    
                    out.println("<td>" + rs.getString(5) + "</td>");
                    
                    out.println("</tr>");
                    counter++;
                }}
                out.println("</table>");
                if (counter == 0) {
                    out.println("<center><pre style=\"color:red;\"> No donors from " + city + "</pre></center>");
                }

                ps = con.prepareStatement("select name,city,state,mobile,email,last_donation from information where bloodgp=? and state=? and city<>?");
                ps.setString(1, blood);
                ps.setString(2, state);
                ps.setString(3, city);
                ResultSet rs1 = ps.executeQuery();
counter=0;
                out.println("<center><h3 style=\"font-family: Myriad Pro;color: #003366;\"> Other Donors belonging to " + state + " are: </h3></center>");
                
                out.println("<table>");
                out.println("<tr>\n" +
"                \n" +
"                <th>Name</th>\n" +
"                <th>City</th>\n" +
"                <th>State</th>\n" +
"                <th>Mobile No.</th>\n" +
"                <th>Email Id</th>\n" +
"            </tr>");
                while (rs1.next()) {
                    t1 = rs1.getTimestamp(6);
                    if (t1 != null) {
                        java.util.Date date = new java.util.Date();
                        Timestamp n = new Timestamp(date.getTime());
                        days = (int) ((n.getTime() - t1.getTime()) / 86400000);
                        //out.println("days are " + days);

                    }

                    if (days > 90 || t1 == null) //out.println("Days are"+days);
                    {
                    out.println("<tr>");
                    out.println("<td>" + rs1.getString(1) + "</td>");
                    System.out.println(rs1.getString(1));
                    out.println("<td>" + rs1.getString(2) + "</td>");
                    
                    out.println("<td>" + rs1.getString(3) + "</td>");
                    
                    out.println("<td>" + rs1.getLong(4) + "</td>");
                    
                    out.println("<td>" + rs1.getString(5) + "</td>");
                    
                    out.println("</tr>");
                    counter++;
                }}
                out.println("</table>");
                if (counter == 0) {
                    out.println("<center><pre style=\"color:red;\"> No donors from " + state + "</pre></center>");
                }

                ps = con.prepareStatement("select name,city,state,mobile,email,last_donation from information where bloodgp=? and state<>? and city<>?");
                ps.setString(1, blood);
                ps.setString(2, state);
                ps.setString(3, city);
                ResultSet rs2 = ps.executeQuery();
counter=0;

                out.println("<center><h3 style=\"font-family: Myriad Pro;color: #003366;\"> Other Donors are: </h3></center>");
               
                out.println("<table>");
                out.println("<tr>\n" +
"                \n" +
"                <th>Name</th>\n" +
"                <th>City</th>\n" +
"                <th>State</th>\n" +
"                <th>Mobile No.</th>\n" +
"                <th>Email Id</th>\n" +
"            </tr>");
                while(rs2.next()) {
                    t1 = rs2.getTimestamp(6);
                    if (t1 != null) {
                        java.util.Date date = new java.util.Date();
                        Timestamp n = new Timestamp(date.getTime());
                        days = (int) ((n.getTime() - t1.getTime()) / 86400000);
                        //out.println("days are " + days);

                    }

                    if (days > 90 || t1 == null) //out.println("Days are"+days);
                    {
                    
                    
                    
                    
                    out.println("<tr>");
                    out.println("<td>" + rs2.getString(1) + "</td>");
                    
                    out.println("<td>" + rs2.getString(2) + "</td>");
                    
                    out.println("<td>" + rs2.getString(3) + "</td>");
                    
                    out.println("<td>" + rs2.getLong(4) + "</td>");
                    
                    out.println("<td>" + rs2.getString(5) + "</td>");
                    
                    out.println("</tr>");
                    counter++;
                }}
                out.println("</table>");
                if (counter == 0) {
                    out.println("<center><pre style=\"color:red;\"> No donors </pre></center>" );
                }
                out.println("</body>");
                out.println("</html>");
         // out.println("Sanyam");  
                ps = con.prepareStatement("insert into blood_request values (?,?,?,?,?,?,?)");
                ps.setString(1, email); 
                ps.setString(2, null);  
                ps.setString(3, name);
                ps.setTimestamp(4, new java.sql.Timestamp((new java.util.Date()).getTime()));
                ps.setLong(5, mobile);
                ps.setTimestamp(6, new java.sql.Timestamp((new java.util.Date()).getTime()));
                ps.setString(7, blood);
                ps.executeUpdate();
                
                ps = con.prepareStatement("select credits from credits where email=?");
                ps.setString(1, email);
                r = ps.executeQuery();
                while (r.next()) {
                    credits = r.getString(1);
                    credit = Integer.parseInt(credits);
                }
                credit = credit - 10;
                ps = con.prepareStatement("update credits set credits=? where email=?");
                ps.setInt(1, credit);
                ps.setString(2, email);
                ps.executeUpdate();
                
 
            } catch (Exception e) {
                System.out.println(e);
            }

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
