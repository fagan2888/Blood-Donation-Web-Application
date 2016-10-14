package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.sql.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <style>\n");
      out.write("            .p1{\n");
      out.write("                color: #333333;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-family: myriad pro;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            pre{\n");
      out.write("                color: #333333;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-family: myriad pro;\n");
      out.write("                font-size: 18px;\n");
      out.write("                text-align: left;\n");
      out.write("                margin-left: 10%;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .p2{\n");
      out.write("                color: #660066;\n");
      out.write("                margin-left: 5px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("                font-weight: bolder;\n");
      out.write("                font-family: myriad pro;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a {\n");
      out.write("                color: #003366;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            a:hover{\n");
      out.write("                color: #006633;\n");
      out.write("            }\n");
      out.write("            a:active{\n");
      out.write("                color: #fa684c;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a.a1 {\n");
      out.write("                color: #003366;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            a.a1:hover{\n");
      out.write("                color: #006633;\n");
      out.write("            }\n");
      out.write("            a.a1:active{\n");
      out.write("                color: #fa684c;\n");
      out.write("            }\n");
      out.write("            .input1 {\n");
      out.write("                \n");
      out.write("                font-size: 20px;\n");
      out.write("                width: 50%;\n");
      out.write("                background: #fff1fa;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .input2 {\n");
      out.write("                \n");
      out.write("                width: 15%;\n");
      out.write("                margin-bottom: 1%;\n");
      out.write("                font-size: 13px;\n");
      out.write("                border-radius: 7px;\n");
      out.write("                border: double;\n");
      out.write("                padding-top: 4px;\n");
      out.write("                padding-bottom: 4px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                background: #cef8f6;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 40%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <div style=\"background-color: #fbfff1;position:absolute;top:5%;left:15%;height:90%;width:70%;border: double 5px #ccccff;border-radius: 5px;\">\n");
      out.write("        ");

            out.println(" <p class=\"p1\" style=\"float:left;margin-left:10px;\"> Hello &nbsp;&nbsp;</p>");
            try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sachin123");
                //out.println(email);
            PreparedStatement ps,ps2;
            
             ps=con.prepareStatement("select * from information where email=?");
             ps.setString(1,session.getAttribute("email").toString());
             ResultSet rs=ps.executeQuery();
             rs.next();
            out.println("<p class=\"p1\" style=\"float:left;text-decoration:underline;\"> "+rs.getString(1) + " !</p>");
            
            ps2=con.prepareStatement("select * from credits where email=?");
            ps2.setString(1,session.getAttribute("email").toString());
             ps2.executeQuery();
             rs=ps2.executeQuery();
             rs.next();
             out.println("<p class=\"p2\" style=\"float:left;margin-left: 10px;margin-right:10px;\">|</p>");
             
            out.println("<p class=\"p1\" style=\"float:left;\">  Credits : " + rs.getInt(2) +"</p>");
            
            }catch(Exception e)
            {}
            
         
      out.write("\n");
      out.write("         \n");
      out.write("                     \n");
      out.write("         <div style=\"font-family: myriad pro;margin: 15px;font-weight: bolder;text-align: right;\"><a style=\"float:right;\" href=\"Logout\" >Logout</a> <p style=\"float:right;\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p> <a style=\"float: none;\" href=\"Information\">View Profile</a></div> \n");
      out.write("          \n");
      out.write("         <div style=\"position: relative;top:1%;left:9%;height:80%;width:80%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;\">\n");
      out.write("             \n");
      out.write("            <div style=\"padding-bottom: 20px;position:relative;left:25%;\">\n");
      out.write("            <p style=\"float:left;margin-bottom: 10px;\"><a href=\"CreditsCheck\" style=\"text-align: left;font-weight: bold;\">Request Blood</a> &nbsp;&nbsp;&nbsp;||&nbsp;&nbsp;&nbsp;</p>\n");
      out.write("            <p style=\"float:left;margin-bottom: 10px;\"><a href=\"requestcredits.jsp\" style=\"text-align: left; float: left;font-weight: bold;\">Request Credits</a> &nbsp;&nbsp;&nbsp;||&nbsp;&nbsp;&nbsp;</p>\n");
      out.write("            <p style=\"float: left;margin-bottom: 10px;\"><a href=\"view_not.jsp\" style=\"text-align: left; float: left;font-weight: bold;\">Notification</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("             <img src=\"bd.jpg\" style=\"float:right;position:absolute;top:15%;left:52%;height:75%;width:45%;border: solid 2px black;\">\n");
      out.write("             <div style=\"border: solid 2px #cef8f6;height:75%;width:50%;position: absolute;top:15%; border-radius: 5px;\">\n");
      out.write("                 <p> News Feed Here </p>\n");
      out.write("             </div>\n");
      out.write("             \n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
