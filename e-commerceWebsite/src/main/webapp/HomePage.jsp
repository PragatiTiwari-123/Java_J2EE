<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    
    <title>E-commerce</title>
    <style>
        /* Reset some default styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
                /* CSS for the background image */
        body {
	        align-items: center;
	        background-color: var(--white);
	        background: url("https://res.cloudinary.com/dci1eujqw/image/upload/v1616769558/Codepen/waldemar-brandt-aThdSdgx0YM-unsplash_cnq4sb.jpg");
         	background-attachment: fixed;
	        background-position: center;
	        background-repeat: no-repeat;
	        background-size: cover;
	        display: grid;
	        height: 100vh;
         	place-items: center;
        }

        /* CSS for the header */
        header {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
            display: flex;
            justify-content: space-between;
            align-items: center;
            width:100%;
            
        }
        .hamburger {
            display: block;
            cursor: pointer;
            width: 30px;
            height: 20px;
            position: relative;
         }

        .line {
            width: 100%;
            height: 4px;
            background-color: var(--hamburger-color); /* Use the custom variable */
            margin: 4px 0;
         }
        

        /* CSS for the navigation links */
        nav {
            display: flex;
            list-style: none;
        }

        nav a {
            color: #fff;
            text-decoration: none;
            margin: 0 20px;
        }

        /* CSS for the search bar */
        .search-container {
            display: flex;
            align-items: center;
        }

        .search-box {
            padding: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .search-button {
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            padding: 5px 10px;
            margin-left: 5px;
            cursor: pointer;
        }

        .cart-icon {
            font-size: 24px;
            margin-right: 10px;
        }

        /* CSS for the side navbar */
        .sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}

        /* CSS for the content section */
        .content {
            margin-left: 250px;
            padding: 20px;
        }

        /* CSS for the footer */
        footer {
            background-color: #333;
            color: #fff;
            padding: 20px 0;
            margin-top: 100%;
                        width:100%;
            
        }

        .footer-content {
            display: flex;
            justify-content: space-between;
            align-items: center;
            flex-wrap: wrap;
        }

        .footer-logo img {
            max-width: 100px;
        }

        .footer-links ul {
            list-style: none;
            padding: 0;
        }

        .footer-links li {
            margin-bottom: 10px;
        }

        .footer-links a {
            color: #fff;
            text-decoration: none;
        }

        .footer-social a {
            color: #fff;
            text-decoration: none;
            margin-right: 10px;
            font-size: 20px;
        }

        .footer-bottom {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <header>
       <div class="hamburger">
       <a href = "hamburger.jsp"><i class="fas fa-bars"></i>
       </a>

      </div>
    
        <nav>
            <a href="#">Home</a>
            <a href="#">Contact Us</a>
            <a href="#">About</a>
            <a href="#">Sign Up</a>
            <a href="#">Login</a>
        </nav>

        <div class="search-container">
            <div class="cart-icon">cart
                <i class="fas fa-shopping-cart"></i>
            </div>
            <input type="text" class="search-box" placeholder="Search...">
            <button class="search-button">Search</button>
        </div>
    </header>

    <!-- Side Navbar -->
    <div class="sidenav">
        <a href="#">Today's Deals</a>
        <a href="#">Home & Kitchen</a>
        <a href="#">New Releases</a>
        <a href="#">Electronics</a>
        <a href="#">Mobiles</a>
    </div>
   <main> 
   </main>
    
        <!-- Content Section -->
    <div class="content">
        <h1>Welcome to My Website</h1>
        <p>This is the main content of the webpage. The sidebar contains navigation links to other sections of the website.</p>
    </div>

    <footer>
        <div class="footer-content">
            <div class="footer-logo">
                <img src="placeholder-logo.png" alt="Company Logo">
            </div>
            <div class="footer-links">
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Products</a></li>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Contact Us</a></li>
                </ul>
            </div>
            <div class="footer-social">
                <a href="#"><i class="fab fa-facebook"></i></a>
                <a href="#"><i class="fab fa-twitter"></i></a>
                <a href="#"><i class="fab fa-instagram"></i></a>
            </div>
        </div>
        <div class="footer-bottom">
            &copy; 2023 Your Company Name. All rights reserved.
        </div>
    </footer>
</body>
</html>
