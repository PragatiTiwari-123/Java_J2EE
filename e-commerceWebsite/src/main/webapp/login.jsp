<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Login Page</title>
 <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
     <div class="login-box">
     <h2>Login</h2>
            <form action="login" method="post">
        <div class="user-box">
            <input type="text" name="email" required>
            <label>Username</label>
        </div>
        <div class="user-box">
            <input type="password" name="password" required>
            <label>Password</label>
        </div>
        <a href="#">
            <span></span>
            <span></span>
            <span></span>            
            <button type="submit">Submit</button> <!-- Changed the anchor tag to a button for form submission -->
        </a>
    </form> 
            <p><a href="forgot.jsp">Forgot Password?</a></p>   
            <a href="SignUp.jsp">New User? Register Here</a> 
</div>
                
    <%
    if(request.getAttribute("error")!=null){
        out.println(request.getAttribute("error"));
    }
    %>
      
</body>
</html>