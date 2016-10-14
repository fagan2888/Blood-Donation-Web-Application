<%  
    String email = request.getParameter("email");
    String gender = request.getParameter("gender");
    String name = request.getParameter("name");
    String city= request.getParameter("city");
%>


<!DOCTYPE html>
<html>

    <head>

        <link rel="stylesheet" type="text/css" href="sign_up.css">

        <script>
            function validateForm()
            {

                var a = document.forms["myForm"]["name"].value;

                var b = document.forms["myForm"]["state"].value;

                var z = document.forms["myForm"]["city"].value;

                var c = document.forms["myForm"]["pass"].value;

                var d = document.forms["myForm"]["confirm"].value;

                var e = document.forms["myForm"]["mobile"].value;

                var f = document.forms["myForm"]["blood_group"].value;

                var g = document.forms["myForm"]["email"].value;


                var i = document.getElementById("i8").checked;

                var j = document.getElementById("i9").checked;

                var x = document.forms["myForm"]["cap"].value;

                var y = document.forms["myForm"]["capt"].value;

                if (a == null || a == "")
                {

                    document.getElementById("para").innerHTML = "*Please fill in the Name";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (b == null || b == "")
                {
                    document.getElementById("para").innerHTML = "*Please fill in the State";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (z == null || z == "")
                {
                    document.getElementById("para").innerHTML = "*Please fill in the City";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (c == null || c == "")
                {
                    document.getElementById("para").innerHTML = "*Please fill in the Password";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (d == null || d == "")
                {
                    document.getElementById("para").innerHTML = "*Please fill in the Confirm Password";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (e == null || e == "")
                {
                    document.getElementById("para").innerHTML = "*Please fill in the Mobile Number";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (f == null || f == "")
                {
                    document.getElementById("para").innerHTML = "*Please fill in the Blood Group";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (g == null || g == "")
                {
                    document.getElementById("para").innerHTML = "*Please fill in the Email_ID";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (i == false && j == false)
                {
                    document.getElementById("para").innerHTML = "*Please fill in the Gender";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (c != d)
                {
                    document.getElementById("para").innerHTML = "*The passwords don't match";
                    window.scrollTo(0, 0);
                    return false;
                }
                else if (x != y)
                {
                    document.getElementById("para").innerHTML = "*Captcha does not match";
                    window.scrollTo(0, 0);
                    return false;
                }
                return true;
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

            .p3{
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

        <%
    String msg="",val;
    
    val=request.getParameter("t");
    
    if(val!=null)
    {
        msg="*Captcha did not match";
    }

        %>


        <div style="background-color: #fbfff1;margin-bottom: 5px;position:absolute;top:5%;left:15%;width:70%;border: double 5px #ccccff;border-radius: 5px;">

            <center ><h1 style="font-family: Myriad Pro;color: #990099;"> Sign Up </h1></center>  

            <div style="position:absolute;top:5px;right:5px;font-family: myriad pro;float:none;margin: 15px;font-weight: bolder;text-align: right;"><a style="float:right;" href="login.jsp" >Back to Login</a> <p style="float:right;"></div>     
            <div style="margin-bottom: 100px;float:none;margin-top: 20px;position: relative;top:2%;left:9%;height:70%;width:80%;border: solid 2px #ccccff;padding:5px;border-radius: 10px;box-shadow: 10px 10px 5px #888888;">   

                <form action="CheckCaptcha" method="post" name="myForm" onsubmit="return validateForm()">

                    <p id="para" style="color: red;font-family: Myriad Pro;"></p>


                    <pre> Name                   -->         <input class="input1" type="text" value="<%=name%>"  name="name" id="i1"></pre>

                    <pre> City                       -->         <input class="input1" type="text" value="<%=city%>" name="city" id="i2" ></pre>

                    <pre> State                    -->         <input class="input1" type="text" name="state" id="i17" ></pre>

                    <pre> E-Mail Id             -->         <input class="input1" type="text" value="<%=email%>" name="email" id="i10"></pre>

                    <pre> Mobile No.         -->          <input type="text" class="input1" name="mobile" id="i6"></pre>

                    <div>
                        <p class="p3"> Last Donation Date         -->  

                            <select  class="input1" style="width:10%;float: right;margin-right: 30%;" name="year" id="i7">

                                <option>00</option>
                                <option>01</option>
                                <option>02</option>
                                <option>03</option>
                                <option>04</option>
                                <option>05</option>
                                <option>06</option>
                                <option>07</option>
                                <option>08</option>
                                <option>09</option>
                                <option>10</option>
                                <option>11</option>
                                <option>12</option>
                                <option>13</option>
                                <option>14</option>
                                <option>15</option>
                                <option>16</option>
                                <option>17</option>
                                <option>18</option>
                                <option>19</option>
                                <option>20</option>
                                <option>21</option>
                                <option>22</option>
                                <option>23</option>
                                <option>24</option>
                                <option>25</option>
                                <option>26</option>
                                <option>27</option>
                                <option>28</option>
                                <option>29</option>
                                <option>30</option>
                                <option>31</option>
                                <option>32</option>
                                <option>33</option>
                                <option>34</option>
                                <option>35</option>
                                <option>36</option>
                                <option>37</option>
                                <option>38</option>
                                <option>39</option>
                                <option>40</option>
                                <option>41</option>
                                <option>42</option>
                                <option>43</option>
                                <option>44</option>
                                <option>45</option>
                                <option>46</option>
                                <option>47</option>
                                <option>48</option>
                                <option>49</option>
                                <option>50</option>
                            </select>

                            <select  class="input1" style="width:10%;float: right;" name="month" id="i7">

                                <option>Jan</option>
                                <option>Feb</option>
                                <option>Mar</option>
                                <option>Apr</option>
                                <option>May</option>
                                <option>Jun</option>
                                <option>Jul</option>
                                <option>Aug</option>
                                <option>Sep</option>
                                <option>Oct</option>
                                <option>Nov</option>
                                <option>Dec</option>

                            </select>



                            <select  class="input1" style="width:10%;float:right;" name="day" id="i7">

                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                                <option>11</option>
                                <option>12</option>
                                <option>13</option>
                                <option>14</option>
                                <option>15</option>
                                <option>16</option>
                                <option>17</option>
                                <option>18</option>
                                <option>19</option>
                                <option>20</option>
                                <option>21</option>
                                <option>22</option>
                                <option>23</option>
                                <option>24</option>
                                <option>25</option>
                                <option>26</option>
                                <option>27</option>
                                <option>28</option>
                                <option>29</option>
                                <option>30</option>
                                <option>31</option>
                            </select>



                        </p>
                    </div>

                    <pre> Blood Group      -->          <select  class="input1" name="blood_group" id="i7">
                
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

                   
                    <pre> Gender                -->         Male  <input type="radio" name="gender" value="male" id="i8"></pre>
                    <pre>                                   Female <input type="radio" name="gender" value="female" id="i9"></pre>


                    <br>
                    <pre>Enter                   -->         <input class="input1" type="text" name="capt" id="i12"></pre>

                    <input class="input2" type="submit" id="b1" value="Sign Up" name="lol"> 
                </form>
            </div>
        </div>
    </body>
</html>
