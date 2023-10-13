<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Forgot Password</title>
</head>
<body>
    <h2>Forgot Password</h2>
    <form action="reset_password" method="post">
        Enter your email: <input type="text" name="email"><br>
        <input type="submit" value="Reset Password">
    </form>
    <%
    if(request.getAttribute("error")!=null){
        out.println(request.getAttribute("error"));
    }
    %>
    
</body>
</html>
