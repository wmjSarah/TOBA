<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.jsp"/>
        <main>
            <h3>Account Login</h3>
            <p>Please Login Below or Choose "New Customer Sign Up" to be taken to an Account Registration Page</p>
            
            <form action="login" method="post">
                <label>Username:</label><br>
                <input type="text" name="userName" required><br>
                <label>Password:</label><br>
                <input type="password" name="passWord" required><br>
                <input type="submit" value="Login">
            </form>
            
            <p><a href="New_customer.jsp">New Customer Sign Up</a></p>
            <p><a href="password_reset.jsp">Reset Password</a></p>
        </main>
<c:import url="includes/footer.jsp"/>