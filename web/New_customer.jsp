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
        <link rel="stylesheet" type = "text/css" href="TOBAStyles.css">
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
            </ul>
        </nav>
        
        <main>
            <h3>Account Login</h3>
            <p>Please Login Below or Choose "New Customer Sign Up" to be taken to an Account Registration Page</p>
            
            <p><em>${message}</em></p>
            
            <form action="newCustomer" method="post">
                <input type="hidden" name="toggle" value="yes">
                <label>First Name:</label><br>
                <input type="text" name="firstName"><br>
                <label>Last Name:</label><br>
                <input type="text" name="lastName" ><br>
                <label>Phone:</label><br>
                <input type="text" name="phone"><br>
                <label>Address:</label><br>
                <input type="text" name="address"><br>
                <label>City:</label><br>
                <input type="text" name="city"><br>
                <label>State:</label><br>
                <input type="text" name="state"><br>
                <label>Zipcode:</label><br>
                <input type="text" name="zipcode"><br>
                <label>E-Mail:</label><br>
                <input type="email" name="email"><br>
                <input type="submit" value="Submit">
            </form>
        </main>
        
        <footer>
            <p><a href="index.html">Home</a></p>
        </footer>
    </body>
</html>
