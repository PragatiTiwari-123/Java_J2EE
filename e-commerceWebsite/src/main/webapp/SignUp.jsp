<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SignUp Page</title>
    <link rel="stylesheet" type="text/css" href="styleSignUp.css">
</head>
<body>
    <div class="signUp-form">
        <h2>New Registration</h2>
        <form action="SignUp" method="post">
            <div class="user-box">
                <input type="text" name="name" required>
                <label>Name</label>
            </div>
            <div class="user-box">
                <input type="text" name="mobile" required>
                <label>Mobile</label>
            </div>            
            <div class="user-box">            
                <input type="text" name="email" required>
                <label>Email</label>
            </div>           
            <div class="user-box">           
                <input type="password" name="password" required>
                <label>Password</label>
            </div>
            <a href="#">
                <span></span>
                <span></span>
                <span></span>            
                <button type="submit">Submit</button>            
            </a>            
        </form>
    </div>
</body>
</html>
