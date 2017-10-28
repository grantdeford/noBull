
<%@   taglib   prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<%@   page   language="java"   contentType="text/html;   charset=UTF-8" pageEncoding="UTF-8"%>
<%@    taglib prefix ="form" uri ="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Login and Registration Form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico">
        <link rel="stylesheet" type="text/css" href="stylesLogin/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="stylesLogin/css/style.css" />
		<link rel="stylesheet" type="text/css" href="stylesLogin/css/animate-custom.css" />
    </head>
    <body>
        <div class="container">
            <!-- Codrops top bar -->
            <div class="codrops-top">
                <a href="/">
                    <strong>&laquo; Back to Home</strong>
                </a>
                <span class="right">
                    <a href="/">
                        <strong>Back to home</strong>
                    </a>
                </span>
                <div class="clr"></div>
            </div><!--/ Codrops top bar -->
            <header>
                <h1>Login and Registration Form <span>Good Vibes</span></h1>

            </header>
            <section>
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                        <form:form  class="form-signin" modelAttribute="user" method="post" action="/login">
                           <!--  <form  action="mysuperscript.php" autocomplete="on"> -->
                                <h1>Log in</h1>
                                <p>
                                    <label for="username" class="uname" data-icon="u" > Your username </label>
                                    <form:input id="username" name="username" path ="email" required="required" type="text" placeholder="myusername"></form:input>
                                </p>
                                <p>
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <form:input id="password" name="password" path ="password" required="required" type="password" placeholder="eg. p0$!t!v3 "></form:input>
                                </p>
                                <p class="keeplogin">
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping"></input>
									<label for="loginkeeping">Keep me logged in</label>
								</p>
                                <p class="login button">
                                    <input type="submit" value="Login" />
								</p>
                                <p class="change_link">
									                         <a><strong><font color="023B2B">Not a member yet?--></font></strong></a>
									<a href="#toregister" class="to_register">Join us</a>
								</p>
                            </form:form>
                        </div>

                        <div id="register" class="animate form">
                        		<form:form  class="form-signin" modelAttribute="user" method="post" action="/signup">
                            		<%-- <form  action="mysuperscript.php" autocomplete="on"> --%>
                                <h1> Sign up </h1>
                                <p>
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <form:input id="usernamesignup" path ="username" name="usernamesignup" required="required" type="text" placeholder="goodvibes12"></form:input>
                                </p> 
                                <p>
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                    <form:input id="emailsignup" path ="email" name="emailsignup" required="required" type="email" placeholder="student@schoolmail.com"></form:input>
                                </p>
                                <p>
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <form:input id="passwordsignup" path ="password" passwordname="passwordsignup" required="required" type="password" placeholder="eg. p0$!t!v3"></form:input>
                                </p>
                                <p>
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <form:input id="passwordsignup_confirm" path ="password" name="passwordsignup_confirm" required="required" type="password" placeholder="eg. p0$!t!v3"></form:input>
                                </p>
                                <p class="signin button">
									<input type="submit" value="Sign up"/>
								</p>
                                <p class="change_link">
									                        <a><strong><font color="023B2B">Already a member ?--></font></strong></a>
									<a href="#tologin" class="to_register"> Go and log in </a>

								</p>
                            </form:form>
                        </div>

                    </div>
                </div>
            </section>
        </div>
    </body>
</html>
