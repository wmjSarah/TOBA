<%-- 
    Document   : New_customer
    Created on : Aug 27, 2018, 7:55:28 PM
    Author     : BetaRay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="TOBAstyle.css">
        <title>Titan Online Banking</title>
    </head>
    <body>
        <header>
             <h1>Titan Online Banking Application</h1>
        </header>
        <nav>
            <ul>
                <li><a href="index.html">Home</a></li>
                <li><a href="Login.html">Login/Register</a></li>
                <li><a href="Account_activity.html">My Account</a></li>
            </ul>
        </nav>
        
        <main>
            <h3>Account Login</h3>
            <p>Please Login Below or Choose "New Customer Sign Up" to be taken to an Account Registration Page</p>
            
            <form>
                <label>First Name:</label>
                <input type="text" name="firstName" required><br>
                <label>Last Name:</label>
                <input type="text" name="lastName" required><br>
                <label>Phone:</label>
                <input type="text" name="phone" required><br>
                <label>Address:</label>
                <input type="text" name="address" required><br>
                <label>City:</label>
                <input type="text" name="city" required><br>
                <label>State:</label>
                <input type="text" name="state" required><br>
                <label>Zipcode:</label>
                <input type="text" name="zipcode" required><br>
                <label>E-Mail:</label>
                <input type="email" name="passWord" required><br>
                <input type="submit" value="Submit">
            </form>
        </main>
        
        <footer>
            <p><a href="index.html">Home</a></p>
        </footer>
    </body>
</html>
