package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

   char arr[]=new char[63];
   
   String cap="";
        int i,var;
        
        for(i=0;i<=9;i++)
            arr[i]=(char)(i+48);
        
        for(;i<36;i++)
        {
            arr[i]=(char)(i+87);
        }
        
        for(;i<62;i++)
        {
            arr[i]=(char)(i+29);
        }
       
        for(i=0;i<6;i++)
        {
            var=(int) (Math.random()*62);
            cap+=arr[var];
        }
         

      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("      \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"sign_up.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function validateForm()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                var a=document.forms[\"myForm\"][\"name\"].value;\n");
      out.write("  \n");
      out.write("                var b=document.forms[\"myForm\"][\"state\"].value;\n");
      out.write("  \n");
      out.write("                var z=document.forms[\"myForm\"][\"city\"].value;\n");
      out.write("  \n");
      out.write("                var c=document.forms[\"myForm\"][\"pass\"].value;\n");
      out.write("  \n");
      out.write("                var d=document.forms[\"myForm\"][\"confirm\"].value;\n");
      out.write("  \n");
      out.write("                var e=document.forms[\"myForm\"][\"mobile\"].value;\n");
      out.write("  \n");
      out.write("                var f=document.forms[\"myForm\"][\"blood_group\"].value;\n");
      out.write("  \n");
      out.write("                var g=document.forms[\"myForm\"][\"email\"].value;\n");
      out.write("  \n");
      out.write("                \n");
      out.write("                var i=document.getElementById(\"i8\").checked;\n");
      out.write("  \n");
      out.write("                var j=document.getElementById(\"i9\").checked;\n");
      out.write("               \n");
      out.write("               var x=document.forms[\"myForm\"][\"cap\"].value;\n");
      out.write("               \n");
      out.write("               var y=document.forms[\"myForm\"][\"capt\"].value;\n");
      out.write("  \n");
      out.write("                if (a==null || a==\"\")\n");
      out.write("                {\n");
      out.write("                    \n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Please fill in the Name\";\n");
      out.write("                    window.scrollTo(0,0);\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (b==null || b==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Please fill in the State\";\n");
      out.write("                    window.scrollTo(0,0);\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (z==null || z==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Please fill in the City\";\n");
      out.write("                    window.scrollTo(0,0);\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (c==null || c==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Please fill in the Password\";\n");
      out.write("                    window.scrollTo(0,0); \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (d==null || d==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Please fill in the Confirm Password\";\n");
      out.write("                    window.scrollTo(0,0); \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (e==null || e==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Please fill in the Mobile Number\";\n");
      out.write("                    window.scrollTo(0,0); \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (f==null || f==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Please fill in the Blood Group\";\n");
      out.write("                    window.scrollTo(0,0); \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (g==null || g==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Please fill in the Email_ID\";\n");
      out.write("                    window.scrollTo(0,0); \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(i==false && j==false)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Please fill in the Gender\";\n");
      out.write("                    window.scrollTo(0,0); \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(c!=d)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*The passwords don't match\";\n");
      out.write("                    window.scrollTo(0,0); \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(x!=y)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para\").innerHTML=\"*Captcha does not match\";\n");
      out.write("                    window.scrollTo(0,0); \n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
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
      out.write("            .p3{\n");
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
      out.write("                font-size: 17px;\n");
      out.write("                width: 50%;\n");
      out.write("                background: #fff1fa;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .input2 {\n");
      out.write("                \n");
      out.write("                width: 17%;\n");
      out.write("                margin-top: 40px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                border-radius: 7px;\n");
      out.write("                border: double;\n");
      out.write("                padding-top: 4px;\n");
      out.write("                padding-bottom: 4px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                background: #cef8f6;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 40%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("    <body>\n");
      out.write("  \n");
      out.write("        ");

    String msg="",val;
    
    val=request.getParameter("t");
    
    if(val!=null)
    {
        msg="*Captcha did not match";
    }


      out.write("\n");
      out.write("  \n");
      out.write("    \n");
      out.write("        <div style=\"background-color: #fbfff1;margin-bottom: 5px;position:absolute;top:5%;left:15%;width:70%;border: double 5px #ccccff;border-radius: 5px;\">\n");
      out.write("\n");
      out.write("            <center ><h1 style=\"font-family: Myriad Pro;color: #990099;\"> Sign Up </h1></center>  \n");
      out.write("         \n");
      out.write("        <div style=\"position:absolute;top:5px;right:5px;font-family: myriad pro;float:none;margin: 15px;font-weight: bolder;text-align: right;\"><a style=\"float:right;\" href=\"login.jsp\" >Back to Login</a> <p style=\"float:right;\"></div>     \n");
      out.write("        <div style=\"margin-bottom: 100px;float:none;margin-top: 20px;position: relative;top:2%;left:9%;height:70%;width:80%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;box-shadow: 10px 10px 5px #888888;\">   \n");
      out.write("            \n");
      out.write("        <form action=\"CheckCaptcha\" method=\"post\" name=\"myForm\" onsubmit=\"return validateForm()\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <p id=\"para\" style=\"color: red;font-family: Myriad Pro;\"></p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <pre> Name                   -->         <input class=\"input1\" type=\"text\" name=\"name\" id=\"i1\"></pre>\n");
      out.write("            \n");
      out.write("            <pre> City                       -->         <input class=\"input1\" type=\"text\" name=\"city\" id=\"i2\" ></pre>\n");
      out.write("            \n");
      out.write("            <pre> State                    -->         <input class=\"input1\" type=\"text\" name=\"state\" id=\"i17\" ></pre>\n");
      out.write("          \n");
      out.write("            <pre> E-Mail Id             -->         <input class=\"input1\" type=\"text\" name=\"email\" id=\"i10\"></pre>\n");
      out.write("            \n");
      out.write("            <pre> Password           -->          <input class=\"input1\" type=\"password\" name=\"pass\" id=\"i4\"></pre>\n");
      out.write("            \n");
      out.write("            <pre> Confirm              -->          <input class=\"input1\" type=\"password\" name=\"confirm\" id=\"i5\"></pre>\n");
      out.write("            \n");
      out.write("            <pre> Mobile No.         -->          <input type=\"text\" class=\"input1\" name=\"mobile\" id=\"i6\"></pre>\n");
      out.write("            \n");
      out.write("            <div>\n");
      out.write("            <p class=\"p3\"> Last Donation Date         -->  \n");
      out.write("\n");
      out.write("<select  class=\"input1\" style=\"width:10%;float: right;margin-right: 30%;\" name=\"year\" id=\"i7\">\n");
      out.write("                \n");
      out.write("                            <option>00</option>\n");
      out.write("                            <option>01</option>\n");
      out.write("                            <option>02</option>\n");
      out.write("                            <option>03</option>\n");
      out.write("                            <option>04</option>\n");
      out.write("                            <option>05</option>\n");
      out.write("                            <option>06</option>\n");
      out.write("                            <option>07</option>\n");
      out.write("                            <option>08</option>\n");
      out.write("                            <option>09</option>\n");
      out.write("                            <option>10</option>\n");
      out.write("                            <option>11</option>\n");
      out.write("                            <option>12</option>\n");
      out.write("                            <option>13</option>\n");
      out.write("                            <option>14</option>\n");
      out.write("                            <option>15</option>\n");
      out.write("                            <option>16</option>\n");
      out.write("                            <option>17</option>\n");
      out.write("                            <option>18</option>\n");
      out.write("                            <option>19</option>\n");
      out.write("                            <option>20</option>\n");
      out.write("                            <option>21</option>\n");
      out.write("                            <option>22</option>\n");
      out.write("                            <option>23</option>\n");
      out.write("                            <option>24</option>\n");
      out.write("                            <option>25</option>\n");
      out.write("                            <option>26</option>\n");
      out.write("                            <option>27</option>\n");
      out.write("                            <option>28</option>\n");
      out.write("                            <option>29</option>\n");
      out.write("                            <option>30</option>\n");
      out.write("                            <option>31</option>\n");
      out.write("                            <option>32</option>\n");
      out.write("                            <option>33</option>\n");
      out.write("                            <option>34</option>\n");
      out.write("                            <option>35</option>\n");
      out.write("                            <option>36</option>\n");
      out.write("                            <option>37</option>\n");
      out.write("                            <option>38</option>\n");
      out.write("                            <option>39</option>\n");
      out.write("                            <option>40</option>\n");
      out.write("                            <option>41</option>\n");
      out.write("                            <option>42</option>\n");
      out.write("                            <option>43</option>\n");
      out.write("                            <option>44</option>\n");
      out.write("                            <option>45</option>\n");
      out.write("                            <option>46</option>\n");
      out.write("                            <option>47</option>\n");
      out.write("                            <option>48</option>\n");
      out.write("                            <option>49</option>\n");
      out.write("                            <option>50</option>\n");
      out.write("                </select>\n");
      out.write("                   \n");
      out.write("                <select  class=\"input1\" style=\"width:10%;float: right;\" name=\"month\" id=\"i7\">\n");
      out.write("                \n");
      out.write("                            <option>Jan</option>\n");
      out.write("                            <option>Feb</option>\n");
      out.write("                            <option>Mar</option>\n");
      out.write("                            <option>Apr</option>\n");
      out.write("                            <option>May</option>\n");
      out.write("                            <option>Jun</option>\n");
      out.write("                            <option>Jul</option>\n");
      out.write("                            <option>Aug</option>\n");
      out.write("                            <option>Sep</option>\n");
      out.write("                            <option>Oct</option>\n");
      out.write("                            <option>Nov</option>\n");
      out.write("                            <option>Dec</option>\n");
      out.write("                            \n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <select  class=\"input1\" style=\"width:10%;float:right;\" name=\"day\" id=\"i7\">\n");
      out.write("                \n");
      out.write("                            <option>1</option>\n");
      out.write("                            <option>2</option>\n");
      out.write("                            <option>3</option>\n");
      out.write("                            <option>4</option>\n");
      out.write("                            <option>5</option>\n");
      out.write("                            <option>6</option>\n");
      out.write("                            <option>7</option>\n");
      out.write("                            <option>8</option>\n");
      out.write("                            <option>9</option>\n");
      out.write("                            <option>10</option>\n");
      out.write("                            <option>11</option>\n");
      out.write("                            <option>12</option>\n");
      out.write("                            <option>13</option>\n");
      out.write("                            <option>14</option>\n");
      out.write("                            <option>15</option>\n");
      out.write("                            <option>16</option>\n");
      out.write("                            <option>17</option>\n");
      out.write("                            <option>18</option>\n");
      out.write("                            <option>19</option>\n");
      out.write("                            <option>20</option>\n");
      out.write("                            <option>21</option>\n");
      out.write("                            <option>22</option>\n");
      out.write("                            <option>23</option>\n");
      out.write("                            <option>24</option>\n");
      out.write("                            <option>25</option>\n");
      out.write("                            <option>26</option>\n");
      out.write("                            <option>27</option>\n");
      out.write("                            <option>28</option>\n");
      out.write("                            <option>29</option>\n");
      out.write("                            <option>30</option>\n");
      out.write("                            <option>31</option>\n");
      out.write("                </select>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                   \n");
      out.write("            </p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <pre> Blood Group      -->          <select  class=\"input1\" name=\"blood_group\" id=\"i7\">\n");
      out.write("                \n");
      out.write("                            <option>B+</option>\n");
      out.write("                            <option>B-</option>\n");
      out.write("                            <option>A+</option>\n");
      out.write("                            <option>A-</option>\n");
      out.write("                            <option>AB+</option>\n");
      out.write("                            <option>AB-</option>\n");
      out.write("                            <option>O+</option>\n");
      out.write("                            <option>O-</option>\n");
      out.write("                            <option>A1+</option>\n");
      out.write("                            <option>A1-</option>\n");
      out.write("                            <option>A2+</option>\n");
      out.write("                            <option>A2-</option>\n");
      out.write("                            <option>A1B+</option>\n");
      out.write("                            <option>A1B-</option>\n");
      out.write("                            <option>A2B+</option>\n");
      out.write("                            <option>A2B-</option>\n");
      out.write("                            <option>Bombay Blood Group</option>\n");
      out.write("                            \n");
      out.write("                </select></pre>\n");
      out.write("            \n");
      out.write("            <pre> Gender                -->         Male  <input type=\"radio\" name=\"gender\" value=\"male\" id=\"i8\"></pre>\n");
      out.write("            <pre>                                               Female <input type=\"radio\" name=\"gender\" value=\"female\" id=\"i9\"></pre>\n");
      out.write("            \n");
      out.write("            <div style=\"margin-left:30%;height:20%;width:40%;font-size: 50px;font-family: Myriad Pro;background-color: #ff6666;\">\n");
      out.write("                <center>");
      out.print(cap);
      out.write("</center>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <pre>Enter                   -->         <input class=\"input1\" type=\"text\" name=\"capt\" id=\"i12\"></pre>\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"cap\" value=\"");
      out.print(cap);
      out.write("\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <input class=\"input2\" type=\"submit\" id=\"b1\" value=\"Sign Up\" name=\"lol\"> \n");
      out.write("        </form>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
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
