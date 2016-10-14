<%-- 
    Document   : Home
    Created on : 13 Apr, 2014, 11:12:41 PM
    Author     : Sanyam
--%>

<%
    HttpSession ses = request.getSession();
    String val = (String) ses.getAttribute("email");
    if (!(val != null)) {
        response.sendRedirect("login.jsp?t=17");
    }
%>

<%  
            
           response.setHeader("Cache-Control","no-cache");
           response.setHeader("Pragma", "no-cache");
           response.setHeader("Expires", "0");
           response.setDateHeader("Expires", -1);
           
           String not="";
           
           
        String blood_gp="";
        String email = session.getAttribute("email").toString();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sachin123");
        String str="select bloodgp from information where email=?";
        PreparedStatement st=con.prepareStatement(str);
        st.setString(1,email);
        ResultSet r1=st.executeQuery();
        
        if(r1.next())
        {
            blood_gp=r1.getString("bloodgp");
        }
        
        PreparedStatement ps1;
        ps1 = con.prepareStatement("select * from blood_request where donor_email is null and user_email<>? and  bloodgp=? and rownum<6 order by request_date desc");
        ps1.setString(1, email);
        ps1.setString(2, blood_gp);
        
        ResultSet rs2 = ps1.executeQuery();
        
        while (rs2.next()) {
            
            not+=rs2.getString("name") ;
            not+="   " + rs2.getString("bloodgp") + "<br>" ;
            not+="   " + rs2.getString("user_email") + "<br><br><br>";;
        }
            
    %>
    
 
<%@page import="java.util.Date"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>

        <script>
            window.history.forward();
        </script>

        <style>
            .p1{
                color: #333333;
                font-weight: bold;
                font-family: myriad pro;
                font-size: 18px;
            }

            pre{
                color: #333333;
                font-weight: bold;
                font-family: myriad pro;
                font-size: 18px;
                text-align: left;
                margin-left: 10%;
                margin-bottom: 30px;
            }

            .p2{
                color: #660066;
                margin-left: 5px;
                margin-right: 5px;
                font-weight: bolder;
                font-family: myriad pro;
            }

            a {
                color: #003366;
                font-size: 18px;
            }
            a:hover{
                color: #006633;
            }
            a:active{
                color: #fa684c;
            }

            a.a1 {
                color: #003366;
                font-size: 18px;
            }
            a.a1:hover{
                color: #006633;
            }
            a.a1:active{
                color: #fa684c;
            }
            .input1 {

                font-size: 20px;
                width: 50%;
                background: #fff1fa;
                border-radius: 3px;

            }

            .input2 {

                width: 15%;
                margin-bottom: 1%;
                font-size: 13px;
                border-radius: 7px;
                border: double;
                padding-top: 4px;
                padding-bottom: 4px;
                font-weight: bold;
                background: #cef8f6;
                position: absolute;
                left: 40%;
            }

        </style>


    </head>
    <body>
        <%--<center><h1>Blood Donation</h1></center>--%>


        <div style="background-color: #fbfff1;position:absolute;top:5%;left:15%;height:90%;width:70%;border: double 5px #ccccff;border-radius: 5px;">
            <%
                out.println(" <p class=\"p1\" style=\"float:left;margin-left:10px;\"> Hello &nbsp;&nbsp;</p>");
                try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
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
            
            %>


            <div style="font-family: myriad pro;margin: 15px;font-weight: bolder;text-align: right;"><a style="float:right;" href="Logout" >Logout</a> <p style="float:right;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p> <a style="float: none;" href="Information">View Profile</a></div> 

            <div style="position: relative;top:1%;left:9%;height:80%;width:80%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;">

                <div style="padding-bottom: 20px;position:relative;left:25%;">
                    <p style="float:left;margin-bottom: 10px;"><a href="CreditsCheck" style="text-align: left;font-weight: bold;">Request Blood</a> &nbsp;&nbsp;&nbsp;||&nbsp;&nbsp;&nbsp;</p>
                    <p style="float:left;margin-bottom: 10px;"><a href="requestcredits.jsp" style="text-align: left; float: left;font-weight: bold;">Request Credits</a> &nbsp;&nbsp;&nbsp;||&nbsp;&nbsp;&nbsp;</p>
                    <p style="float: left;margin-bottom: 10px;"><a href="view_not.jsp" style="text-align: left; float: left;font-weight: bold;">Notification</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
                </div>

                <img src="bd.jpg" style="float:right;position:absolute;top:15%;left:52%;height:75%;width:45%;border: solid 2px black;">
                <div style="text-align: center;font-size: 20px; border: solid 2px #cef8f6;height:75%;width:50%;position: absolute;top:15%; border-radius: 5px;">
                     
                        <marquee style="height:100%" direction="up"><%=not%></marquee>
                </div>

            </div>

        </div>
    </body>
</html>
