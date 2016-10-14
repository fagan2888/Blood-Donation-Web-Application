package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                 var a=document.forms[\"f1\"][\"c\"].value;\n");
      out.write("                 var b=document.forms[\"f1\"][\"p1\"].value;\n");
      out.write("                 var c=document.forms[\"f1\"][\"p2\"].value;\n");
      out.write("                 \n");
      out.write("                 if(b==null || b==\"\")\n");
      out.write("                     {\n");
      out.write("                        document.getElementById(\"print\").innerHTML=\"Password feild can't be empty\";\n");
      out.write("                        window.scrollTo(0,0);\n");
      out.write("                        return false; \n");
      out.write("                     }\n");
      out.write("                 \n");
      out.write("                 if(b!=c)\n");
      out.write("                     {\n");
      out.write("                        document.getElementById(\"print\").innerHTML=\"New Password does not match\";\n");
      out.write("                        window.scrollTo(0,0);\n");
      out.write("                        return false; \n");
      out.write("                     }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  method=\"post\" action=\"Change\" name=\"f1\" onsubmit=\"return validate()\">\n");
      out.write("            ");

                String wrong=request.getParameter("w");
                String msg="";
                if(wrong==null)
                {
                    msg="";
                }
                else if(wrong.equals("1"))
                {
                     msg+="Wrong Password";
                }
                
      out.write("\n");
      out.write("            \n");
      out.write("            <p id=\"print\">");
      out.print(msg);
      out.write("</p>\n");
      out.write("           Current Password <input type=\"password\" id=\"c\" name=\"c\">\n");
      out.write("           New Password <input type=\"password\" id=\"p1\" name=\"p1\">\n");
      out.write("           Re Type Password <input type=\"password\" id=\"p2\" name=\"p2\">\n");
      out.write("            <input type=\"submit\" value=\"Change Password\" >                       \n");
      out.write("        </form>\n");
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
