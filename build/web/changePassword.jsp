<%-- 
    Document   : changePassword
    Created on : 19 Apr, 2014, 10:00:00 PM
    Author     : Sanyam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
        
        <script>
            
            function validate()
            {
                 var a=document.forms["f1"]["c"].value;
                 var b=document.forms["f1"]["p1"].value;
                 var c=document.forms["f1"]["p2"].value;
                 
                 if(b==null || b=="")
                     {
                        document.getElementById("print").innerHTML="Password field can't be empty";
                        window.scrollTo(0,0);
                        return false; 
                     }
                 
                 if(b!=c)
                     {
                        document.getElementById("print").innerHTML="New Password does not match";
                        window.scrollTo(0,0);
                        return false; 
                     }
            }
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
                
                width: 30%;
                margin-bottom:1%;
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
        <div style="background-color: #fbfff1;position:absolute;top:5%;left:15%;height:90%;width:70%;border: double 5px #ccccff;border-radius: 5px;">
        <%
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
            
         %>
         
                     
         <div style="font-family: myriad pro;margin: 15px;font-weight: bolder;text-align: right;"><a style="float:right;" href="Logout" >Logout</a> <p style="float:right;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p> <a style="float: right;" href="Information">View Profile</a>  <p style="float:right;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p> <a style="float: none;" href="Home.jsp">Home</a></div> 
          
         <div style="position: relative;top:1%;left:9%;height:80%;width:80%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;">
             
             <div style="margin-bottom: 10%;margin-top: 10%;position:relative;width:70%;left:15%;border:solid 2px #cef8f6;box-shadow: 10px 10px 5px cadetblue;">
        
        
        <form  method="post" action="Change" name="f1" onsubmit="return validate();">
            <%
                String wrong=request.getParameter("w");
                String msg="";
                if(wrong==null)
                {
                    msg="";
                }
                else if(wrong.equals("1"))
                {
                     msg+="Wrong Current Password";
                }
                %>
            
            <pre style="color: red;" id="print"><%=msg%></pre>
            <pre>  Current Password    -    <input class="input1" type="password" id="c" name="c"></pre>
            <pre>  New Password          -     <input class="input1" type="password" id="p1" name="p1"></pre>
            <pre>  Re Type Password    -    <input class="input1" type="password" id="p2" name="p2"></pre>
            <input class="input2" type="submit" style="margin-top: 5%;" value="Change Password" >                       
        </form>
             </div>
           </div>
           </div>
    </body>
</html>
