package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("        <title>Blood Donation</title>\n");
      out.write("       \n");
      out.write("        <script>\n");
      out.write("            window.history.forward();\n");
      out.write("            \n");
      out.write("            function valid()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                var x=document.getElementById(\"field1\").value;\n");
      out.write("                var y=document.getElementById(\"field2\").value;\n");
      out.write("                \n");
      out.write("                //alert(x + \" \" + y)\n");
      out.write("                \n");
      out.write("                if(x==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para_error\").innerHTML=\"Please provide some Email Id\";\n");
      out.write("                    window.scrollTo(0,0);\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                else if(y==\"\")\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"para_error\").innerHTML=\"Please provide some Password\";\n");
      out.write("                    window.scrollTo(0,0);\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            .center1 {\n");
      out.write("              \n");
      out.write("              margin-top: 12%;\n");
      out.write("              font-family: calibri;\n");
      out.write("              color: purple;\n");
      out.write("              font-size: 25px;\n");
      out.write("            }\n");
      out.write("            \n");
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
      out.write("                width: 20%;\n");
      out.write("                margin-bottom: 1%;\n");
      out.write("                font-size: 17px;\n");
      out.write("                border-radius: 7px;\n");
      out.write("                border: double;\n");
      out.write("                padding-top: 7px;\n");
      out.write("                padding-bottom: 7px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                background: #cef8f6;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                font-size: 50px;\n");
      out.write("                font-family: Myriad Pro;\n");
      out.write("                font-weight: bolder;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("          <!-- BEGIN Google Pre-requisites -->\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js\">\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            (function() {\n");
      out.write("                var po = document.createElement('script');\n");
      out.write("                po.type = 'text/javascript';\n");
      out.write("                po.async = true;\n");
      out.write("                po.src = 'https://plus.google.com/js/client:plusone.js?onload=start';\n");
      out.write("                var s = document.getElementsByTagName('script')[0];\n");
      out.write("                s.parentNode.insertBefore(po, s);\n");
      out.write("            })();\n");
      out.write("        </script>\n");
      out.write("        <!-- END Pre-requisites -->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"background-color: #fbfffa\">\n");
      out.write("        \n");
      out.write("                <!-- Last part of BODY element in file index.html -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            var helper = (function() {\n");
      out.write("                var authResult = undefined;\n");
      out.write("\n");
      out.write("                return {\n");
      out.write("                    /**\n");
      out.write("                     * Hides the sign-in button and connects the server-side app after\n");
      out.write("                     * the user successfully signs in.\n");
      out.write("                     *\n");
      out.write("                     * @param {Object} authResult An Object which contains the access token and\n");
      out.write("                     *   other authentication information.\n");
      out.write("                     */\n");
      out.write("                    onSignInCallback: function(authResult) {\n");
      out.write("\n");
      out.write("                        if (authResult['access_token']) {\n");
      out.write("                            // The user is signed in\n");
      out.write("                            this.authResult = authResult;\n");
      out.write("\n");
      out.write("                            var name = authResult['code']\n");
      out.write("\n");
      out.write("                            //console.log(authResult);\n");
      out.write("\n");
      out.write("                            //window.location.href=\"http://localhost:8084/Google_Plus/connect?name=\" + name;\n");
      out.write("                            // After we load the Google+ API, render the profile data from Google+.\n");
      out.write("\n");
      out.write("                            gapi.client.load('plus', 'v1', this.renderProfile);\n");
      out.write("\n");
      out.write("                        } else if (authResult['error']) {\n");
      out.write("                            // There was an error, which means the user is not signed in.\n");
      out.write("                            // As an example, you can troubleshoot by writing to the console:\n");
      out.write("                            console.log('There was an error: ' + authResult['error']);\n");
      out.write("                          \n");
      out.write("                        }\n");
      out.write("                        //console.log('authResult', authResult);\n");
      out.write("                    },\n");
      out.write("                    /**\n");
      out.write("                     * Retrieves and renders the authenticated user's Google+ profile.\n");
      out.write("                     */\n");
      out.write("                    renderProfile: function() {\n");
      out.write("\n");
      out.write("                        //$('#authOps').show('slow');\n");
      out.write("                        //$('#gConnect').hide();\n");
      out.write("\n");
      out.write("                        var request = gapi.client.plus.people.get({'userId': 'me'});\n");
      out.write("\n");
      out.write("                        request.execute(function(profile) {\n");
      out.write("\n");
      out.write("                            console.log(profile);\n");
      out.write("\n");
      out.write("                            var name = profile.displayName;\n");
      out.write("\n");
      out.write("                            email = profile['emails'][0].value;\n");
      out.write("\n");
      out.write("                            if(profile.gender)    \n");
      out.write("                            var gender = profile.gender;\n");
      out.write("                        \n");
      out.write("                            else\n");
      out.write("                            gender=\"\";    \n");
      out.write("\n");
      out.write("                            if(profile['placesLived'])\n");
      out.write("                            city = profile['placesLived'][0].value;\n");
      out.write("                        \n");
      out.write("                            else\n");
      out.write("                            city=\"\";    \n");
      out.write("\n");
      out.write("                     //       window.location.href = \"http://localhost:8084/Features/middle?email=\" + email + \"&name=\" + name + \"&gender=\" + gender + \"&city=\" + city;\n");
      out.write("\n");
      out.write("                        });\n");
      out.write("                    },\n");
      out.write("                };\n");
      out.write("            })();\n");
      out.write("\n");
      out.write("\n");
      out.write("            function onSignInCallback(authResult) {\n");
      out.write("                helper.onSignInCallback(authResult);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <div id = \"fb-root\" ></div>\n");
      out.write("        <script> //FB\n");
      out.write("\n");
      out.write("            // Load the SDK asynchronously\n");
      out.write("\n");
      out.write("            (function(d, s, id) {\n");
      out.write("                var js, fjs = d.getElementsByTagName(s)[0];\n");
      out.write("                if (d.getElementById(id))\n");
      out.write("                    return;\n");
      out.write("                js = d.createElement(s);\n");
      out.write("                js.id = id;\n");
      out.write("                js.src = \"//connect.facebook.net/en_US/sdk.js\";\n");
      out.write("                fjs.parentNode.insertBefore(js, fjs);\n");
      out.write("            }(document, 'script', 'facebook-jssdk'));\n");
      out.write("\n");
      out.write("\n");
      out.write("            // This is called with the results from from FB.getLoginStatus().\n");
      out.write("\n");
      out.write("            function statusChangeCallback(response) {\n");
      out.write("                console.log('statusChangeCallback');\n");
      out.write("                console.log(response);\n");
      out.write("                // The response object is returned with a status field that lets the\n");
      out.write("                // app know the current login status of the person.\n");
      out.write("                // Full docs on the response object can be found in the documentation\n");
      out.write("                // for FB.getLoginStatus().\n");
      out.write("                if (response.status === 'connected') {\n");
      out.write("                    // Logged into your app and Facebook.\n");
      out.write("                    testAPI();\n");
      out.write("                } else if (response.status === 'not_authorized') {\n");
      out.write("                    // The person is logged into Facebook, but not your app.\n");
      out.write("\n");
      out.write("                } else {\n");
      out.write("                    // The person is not logged into Facebook, so we're not sure if\n");
      out.write("                    // they are logged into this app or not.\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // This function is called when someone finishes with the Login\n");
      out.write("            // Button.  See the onlogin handler attached to it in the sample\n");
      out.write("            // code below.\n");
      out.write("            function checkLoginState() {\n");
      out.write("                FB.getLoginStatus(function(response) {\n");
      out.write("                    statusChangeCallback(response);\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            window.fbAsyncInit = function() {\n");
      out.write("                FB.init({\n");
      out.write("                    appId: '1420837504825545',\n");
      out.write("                    cookie: true, // enable cookies to allow the server to access \n");
      out.write("                    // the session\n");
      out.write("                    xfbml: true, // parse social plugins on this page\n");
      out.write("                    version: 'v2.0' // use version 2.0\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                // Now that we've initialized the JavaScript SDK, we call \n");
      out.write("                // FB.getLoginStatus().  This function gets the state of the\n");
      out.write("                // person visiting this page and can return one of three states to\n");
      out.write("                // the callback you provide.  They can be:\n");
      out.write("                //\n");
      out.write("                // 1. Logged into your app ('connected')\n");
      out.write("                // 2. Logged into Facebook, but not your app ('not_authorized')\n");
      out.write("                // 3. Not logged into Facebook and can't tell if they are logged into\n");
      out.write("                //    your app or not.\n");
      out.write("                //\n");
      out.write("                // These three cases are handled in the callback function.\n");
      out.write("\n");
      out.write("                FB.getLoginStatus(function(response) {\n");
      out.write("                    statusChangeCallback(response);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            // Here we run a very simple test of the Graph API after login is\n");
      out.write("            // successful.  See statusChangeCallback() for when this call is made.\n");
      out.write("            function testAPI() {\n");
      out.write("                console.log('Welcome!  Fetching your information.... ');\n");
      out.write("                FB.api('/me', function(response) {\n");
      out.write("                   // console.log('Good to see you, ' + response.name + '.');\n");
      out.write("\n");
      out.write("                    console.log(response);\n");
      out.write("                    var gender;\n");
      out.write("                    var city;\n");
      out.write("                        \n");
      out.write("                    var email = response.email;\n");
      out.write("                    var name = response.name;\n");
      out.write("                    \n");
      out.write("                    if(response.gender)\n");
      out.write("                    gender = response.gender;\n");
      out.write("                \n");
      out.write("                    else\n");
      out.write("                    gender=\"\";\n");
      out.write("        \n");
      out.write("                    if(response.location.name)\n");
      out.write("                    city = response.location.name;\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                    else\n");
      out.write("                    city=\"\";\n");
      out.write("                \n");
      out.write("                   // window.location.href=\"http://localhost:8084/Features/middle?email=\" + email + \"&name=\" + name + \"&gender=\" + gender+ \"&city=\" + city;    \n");
      out.write("\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    ");
      out.write("\n");
      out.write("        <img src=\"blood_donation.jpg\" style=\"position:absolute;left:15%;height: 40%;width:70%;\">\n");
      out.write("        \n");
      out.write("        <div style=\"position:absolute;top:35%;left:15%;border: groove 7px #fa684c;height:60%;width:70%;border-radius: 20px;background-color: #fbfff1;\">\n");
      out.write("            <div style=\"border-right: 5px double #cc0000;height:100%;float:left;width:60%;\">\n");
      out.write("                <form action=\"Check\" method=\"post\" id=\"form\" onsubmit=\"return valid()\">\n");
      out.write("            \n");
      out.write("            ");

                String response_error=request.getParameter("t");
                String msg="";
               
                if(response_error==null)
                {
                    msg="";
                }
             
                else if(response_error.equals("1"))
                {
                   msg="Some internal error occured";     
                }    
                else if(response_error.equals("8"))
                {
                    msg="Please sign up to continue";
                }
                else if(response_error.equals("10"))
                {
                    msg="Sign Out Successful";
                }
                else if(response_error.equals("15"))
                {
                    msg="Sign in with new password to Continue";
                }
                else if(response_error.equals("7"))
                {
                    msg="Incorrect Password";
                }
                else if(response_error.equals("5"))
                {
                    msg="Email Id already taken up";
                }
                else if(response_error.equals("6"))
                {
                    msg="Sign up successful";
                }
                else if(response_error.equals("11"))
                {
                    msg="Email id or Password is incorrect";
                }
                else if(response_error.equals("17"))
                {
                    msg="Please login to continue";
                }
               
                
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            <center style=\"font-family: Myriad Pro;margin-top: 10px;font-size:30px;\"><span id=\"para_error\">");
      out.print(msg);
      out.write("</span></center>\n");
      out.write("            \n");
      out.write("            <center class=\"center1\">Email Id&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class=\"input1\" type=\"text\" id=\"field1\" name=\"email\"></center>\n");
      out.write("            <center class=\"center1\">Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class=\"input1\" type=\"password\" id=\"field2\" name=\"password\"></center>\n");
      out.write("            \n");
      out.write("            <center class=\"center1\"><input class=\"input2\" type=\"submit\" name=\"page\" value=\"Login\" id=\"b1\"></center>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("            <form action=\"sign_up.jsp\">\n");
      out.write("                <center class=\"center1\" style=\"margin-top: 6%;\"><input class=\"input2\" type=\"submit\" name=\"su\" value=\"Sign Up\"></center>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"sign_up.jsp\">\n");
      out.write("                <center class=\"center1\" style=\"margin-top: 6%;\"><div class=\"fb-login-button\"><fb:login-button data-size=\"xlarge\"  scope=\"user_location,public_profile,email\" onlogin=\"checkLoginState();\">\n");
      out.write("            </fb:login-button></div></center>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"sign_up.jsp\">\n");
      out.write("                <center class=\"center1\" style=\"margin-top: 6%;\"><div class=\"fb-login-button\" id=\"gConnect\">\n");
      out.write("                <button class=\"g-signin\"\n");
      out.write("                        data-scope=\"https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/plus.profile.emails.read\"\n");
      out.write("                        data-requestvisibleactions=\"http://schemas.google.com/AddActivity\"\n");
      out.write("                        data-clientId=\"461012271441-3t0atrrbmv3akmg9u0gqu8q4d6vim44c.apps.googleusercontent.com\"\n");
      out.write("                        data-accesstype=\"offline\"\n");
      out.write("                        data-approvalprompt=\"force\"\n");
      out.write("                        data-callback=\"onSignInCallback\"\n");
      out.write("                        data-theme=\"dark\"\n");
      out.write("                        data-cookiepolicy=\"single_host_origin\">\n");
      out.write("                </button>\n");
      out.write("            </div></center>\n");
      out.write("            </form>    \n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        ");
  
            
            response.setHeader("Cache-Control","no-cache");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            response.setDateHeader("Expires", -1);
   
            
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
