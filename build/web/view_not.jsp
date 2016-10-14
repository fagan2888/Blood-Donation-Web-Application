<%
    HttpSession ses = request.getSession();
    String val = (String) ses.getAttribute("email");
    if (!(val != null)) {
        response.sendRedirect("login.jsp?t=17");
    }
%>

<%@page import="java.util.Date"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <style>
            
            .p1{
                color: #333333;
                font-weight: bold;
                font-family: myriad pro;
                font-size: 18px;
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
            
             table
            {
                
                border-collapse:collapse;
                width:100%;
                font-size: 18px;
                margin-top: 1%;
                
                    
            }
            table, td, th
            {
                border:1px solid dodgerblue;
                padding:1.5%;
                font-family: Myriad Pro;
            }
            
           
            #div1
            {
                background-color: #22BE6B;
                text-align: center;
                padding:30px;
                border-radius:10px;
                font-size:50px;
                font-weight: normal;
                width:50%;
                position:relative;
                left:23%;
                box-shadow: 15px 15px 5px gainsboro;
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
             
            out.println("<p class=\"p1\" style=\"float:left;\">  Credits : " + rs.getInt("credits") +"</p>");
            
            }catch(Exception e)
            {System.out.println(e);}
            
         %>
         
                     
         <div style="font-family: myriad pro;margin: 15px;font-weight: bolder;text-align: right;"><a style="float:right;" href="Logout" >Logout</a> <p style="float:right;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p> <a style="float: none;" href="Home.jsp">Home</a></div> 
        
         <div style="position: relative;top:1%;left:4%;height:80%;width:90%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;">
        
             <center><h2 style="font-family: Myriad Pro;color: #003366;"> Notifications </h2></center>
             <table>
            
            
            <tr>
                
                <th>Name</th>
                <th>Blood Group Requested</th>
                <th>Date</th>
                <th>Email ID</th>
                <th>Phone Number</th>
            </tr>
        
        <%
    try {

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
        
        PreparedStatement ps;
        ps = con.prepareStatement("select * from blood_request where donor_email is null and user_email<>? and  bloodgp=? and rownum<6 order by request_date desc");
        ps.setString(1, email);
        ps.setString(2, blood_gp);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            
            Timestamp p=rs.getTimestamp("request_date");
            Date d=new Date(p.getTime());
            
    %>
    
    <tr>
        
        <td><%=rs.getString("name")%></td>
        <td><%=rs.getString("bloodgp")%></td>
        <td><%=d%></td>
        <td><%=rs.getString("user_email")%></td>
        <td><%=rs.getLong("mobile")%></td>
    </tr>
    
            
    
    <%
            
        }
    } catch (Exception e) {
        System.out.println(e);
    }

%>
        
        
        </table>
        </div>
        </div>
        </div>
    </body>
</html>
