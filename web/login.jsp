<%-- 
    Document   : login
    Created on : May 2, 2014, 9:11:40 PM
    Author     : Rishabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
    <head>
       
        <title>Blood Donation</title>
       
        <script>
            window.history.forward();
            
            function valid()
            {
                
                var x=document.getElementById("field1").value;
                var y=document.getElementById("field2").value;
                
                //alert(x + " " + y)
                
                if(x=="")
                {
                    document.getElementById("para_error").innerHTML="Please provide some Email Id";
                    window.scrollTo(0,0);
                    return false;
                }
                
                else if(y=="")
                {
                    document.getElementById("para_error").innerHTML="Please provide some Password";
                    window.scrollTo(0,0);
                    return false;
                }
            }
            
            
        </script>
        
        
        <style>
            
            .center1 {
              
              margin-top: 12%;
              font-family: calibri;
              color: purple;
              font-size: 25px;
            }
            
            .input1 {
                
                font-size: 20px;
                width: 50%;
                background: #fff1fa;
                border-radius: 3px;
                
            }
            
            .input2 {
                
                width: 20%;
                margin-bottom: 1%;
                font-size: 17px;
                border-radius: 7px;
                border: double;
                padding-top: 7px;
                padding-bottom: 7px;
                font-weight: bold;
                background: #cef8f6;
            }
            p{
                font-size: 50px;
                font-family: Myriad Pro;
                font-weight: bolder;
            }
           
        </style>
        
          <!-- BEGIN Google Pre-requisites -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js">
        </script>

        <script type="text/javascript">
            (function() {
                var po = document.createElement('script');
                po.type = 'text/javascript';
                po.async = true;
                po.src = 'https://plus.google.com/js/client:plusone.js?onload=start';
                var s = document.getElementsByTagName('script')[0];
                s.parentNode.insertBefore(po, s);
            })();
        </script>
        <!-- END Pre-requisites -->

    </head>
    
    <body style="background-color: #fbfffa">
        
                <!-- Last part of BODY element in file index.html -->
        <script type="text/javascript">


            var helper = (function() {
                var authResult = undefined;

                return {
                    /**
                     * Hides the sign-in button and connects the server-side app after
                     * the user successfully signs in.
                     *
                     * @param {Object} authResult An Object which contains the access token and
                     *   other authentication information.
                     */
                    onSignInCallback: function(authResult) {

                        if (authResult['access_token']) {
                            // The user is signed in
                            this.authResult = authResult;

                            var name = authResult['code']

                            //console.log(authResult);

                            //window.location.href="http://localhost:8084/Google_Plus/connect?name=" + name;
                            // After we load the Google+ API, render the profile data from Google+.

                            gapi.client.load('plus', 'v1', this.renderProfile);

                        } else if (authResult['error']) {
                            // There was an error, which means the user is not signed in.
                            // As an example, you can troubleshoot by writing to the console:
                            console.log('There was an error: ' + authResult['error']);
                          
                        }
                        //console.log('authResult', authResult);
                    },
                    /**
                     * Retrieves and renders the authenticated user's Google+ profile.
                     */
                    renderProfile: function() {

                        //$('#authOps').show('slow');
                        //$('#gConnect').hide();

                        var request = gapi.client.plus.people.get({'userId': 'me'});

                        request.execute(function(profile) {

                            console.log(profile);

                            var name = profile.displayName;

                            email = profile['emails'][0].value;

                            if(profile.gender)    
                            var gender = profile.gender;
                        
                            else
                            gender="";    

                            if(profile['placesLived'])
                            city = profile['placesLived'][0].value;
                        
                            else
                            city="";    

                     //       window.location.href = "http://localhost:8084/Features/middle?email=" + email + "&name=" + name + "&gender=" + gender + "&city=" + city;

                        });
                    },
                };
            })();


            function onSignInCallback(authResult) {
                helper.onSignInCallback(authResult);
            }


        </script>

        <div id = "fb-root" ></div>
        <script> //FB

            // Load the SDK asynchronously

            (function(d, s, id) {
                var js, fjs = d.getElementsByTagName(s)[0];
                if (d.getElementById(id))
                    return;
                js = d.createElement(s);
                js.id = id;
                js.src = "//connect.facebook.net/en_US/sdk.js";
                fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));


            // This is called with the results from from FB.getLoginStatus().

            function statusChangeCallback(response) {
                console.log('statusChangeCallback');
                console.log(response);
                // The response object is returned with a status field that lets the
                // app know the current login status of the person.
                // Full docs on the response object can be found in the documentation
                // for FB.getLoginStatus().
                if (response.status === 'connected') {
                    // Logged into your app and Facebook.
                    testAPI();
                } else if (response.status === 'not_authorized') {
                    // The person is logged into Facebook, but not your app.

                } else {
                    // The person is not logged into Facebook, so we're not sure if
                    // they are logged into this app or not.

                }
            }

            // This function is called when someone finishes with the Login
            // Button.  See the onlogin handler attached to it in the sample
            // code below.
            function checkLoginState() {
                FB.getLoginStatus(function(response) {
                    statusChangeCallback(response);
                });
            }

            window.fbAsyncInit = function() {
                FB.init({
                    appId: '1420837504825545',
                    cookie: true, // enable cookies to allow the server to access 
                    // the session
                    xfbml: true, // parse social plugins on this page
                    version: 'v2.0' // use version 2.0
                });

                // Now that we've initialized the JavaScript SDK, we call 
                // FB.getLoginStatus().  This function gets the state of the
                // person visiting this page and can return one of three states to
                // the callback you provide.  They can be:
                //
                // 1. Logged into your app ('connected')
                // 2. Logged into Facebook, but not your app ('not_authorized')
                // 3. Not logged into Facebook and can't tell if they are logged into
                //    your app or not.
                //
                // These three cases are handled in the callback function.

                FB.getLoginStatus(function(response) {
                    statusChangeCallback(response);
                });

            };

            // Here we run a very simple test of the Graph API after login is
            // successful.  See statusChangeCallback() for when this call is made.
            function testAPI() {
                console.log('Welcome!  Fetching your information.... ');
                FB.api('/me', function(response) {
                   // console.log('Good to see you, ' + response.name + '.');

                    console.log(response);
                    var gender;
                    var city;
                        
                    var email = response.email;
                    var name = response.name;
                    
                    if(response.gender)
                    gender = response.gender;
                
                    else
                    gender="";
        
                    if(response.location.name)
                    city = response.location.name;
                        

                    else
                    city="";
                
                   // window.location.href="http://localhost:8084/Features/middle?email=" + email + "&name=" + name + "&gender=" + gender+ "&city=" + city;    

                });
            }
        </script>

        
        
    <%--<center><p>
            Blood Donation
        <p></center>
        --%>
        <img src="blood_donation.jpg" style="position:absolute;left:15%;height: 40%;width:70%;">
        
        <div style="position:absolute;top:35%;left:15%;border: groove 7px #fa684c;height:60%;width:70%;border-radius: 20px;background-color: #fbfff1;">
            <div style="border-right: 5px double #cc0000;height:100%;float:left;width:60%;">
                <form action="Check" method="post" id="form" onsubmit="return valid()">
            
            <%
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
               
                %>
                
                
                
            <center style="font-family: Myriad Pro;margin-top: 10px;font-size:30px;"><span id="para_error"><%=msg%></span></center>
            
            <center class="center1">Email Id&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="input1" type="text" id="field1" name="email"></center>
            <center class="center1">Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="input1" type="password" id="field2" name="password"></center>
            
            <center class="center1"><input class="input2" type="submit" name="page" value="Login" id="b1"></center>
            
        </form>
            
            </div>
            <div>
            <form action="sign_up.jsp">
                <center class="center1" style="margin-top: 6%;"><input class="input2" type="submit" name="su" value="Sign Up"></center>
            </form>
            <form action="sign_up.jsp">
                <center class="center1" style="margin-top: 6%;"><div class="fb-login-button"><fb:login-button data-size="xlarge"  scope="user_location,public_profile,email" onlogin="checkLoginState();">
            </fb:login-button></div></center>
            </form>
            <form action="sign_up.jsp">
                <center class="center1" style="margin-top: 6%;"><div class="fb-login-button" id="gConnect">
                <button class="g-signin"
                        data-scope="https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/plus.profile.emails.read"
                        data-requestvisibleactions="http://schemas.google.com/AddActivity"
                        data-clientId="461012271441-3t0atrrbmv3akmg9u0gqu8q4d6vim44c.apps.googleusercontent.com"
                        data-accesstype="offline"
                        data-approvalprompt="force"
                        data-callback="onSignInCallback"
                        data-theme="dark"
                        data-cookiepolicy="single_host_origin">
                </button>
            </div></center>
            </form>    
             
            </div>
            
            
        <%  
            
            response.setHeader("Cache-Control","no-cache");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "0");
            response.setDateHeader("Expires", -1);
   
            %>
        
    </body>
</html>

