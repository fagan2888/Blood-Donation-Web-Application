<%-- 
    Document   : donation
    Created on : 20 Apr, 2014, 12:02:52 AM
    Author     : Sanyam
--%>

<%
    HttpSession ses = request.getSession();
    String val = (String) ses.getAttribute("email");
    if (!(val != null)) {
        response.sendRedirect("login.jsp?t=17");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Post Blood Requirement</title>
        
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
                
                font-size: 17px;
                width: 50%;
                background: #fff1fa;
                border-radius: 3px;
                
            }
            
            .input2 {
                
                width: 17%;
                margin-top: 40px;
                margin-bottom: 20px;
                font-size: 15px;
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
         
                     
         <div style="font-family: myriad pro;margin: 15px;font-weight: bolder;text-align: right;"><a style="float:right;" href="Logout" >Logout</a> <p style="float:right;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p> <a style="float: none;" href="Home.jsp">Home</a></div> 
          
         <div style="position: relative;top:1%;left:9%;height:80%;width:80%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;">
          
             
             <div style="padding-bottom: 20px;position:relative;left:4%;top:30%;">
           <form action="Donation" >
               <pre>Blood Group Required    -     <select  class="input1" name="blood_group" id="i7">
                
                            <option>B+</option>
                            <option>B-</option>
                            <option>A+</option>
                            <option>A-</option>
                            <option>AB+</option>
                            <option>AB-</option>
                            <option>O+</option>
                            <option>O-</option>
                            <option>A1+</option>
                            <option>A1-</option>
                            <option>A2+</option>
                            <option>A2-</option>
                            <option>A1B+</option>
                            <option>A1B-</option>
                            <option>A2B+</option>
                            <option>A2B-</option>
                            <option>Bombay Blood Group</option>
                            
                </select></pre>
            
            <input class="input2" type="submit" value="Submit">            
          </form>             
            </div>     
         </div>
        </div>
        
    </body>
</html>
