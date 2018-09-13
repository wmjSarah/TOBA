<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.jsp"/>
        <main>
            <h3>Account Login</h3>
            <p>Please Login Below or Choose "New Customer Sign Up" to be taken to an Account Registration Page</p>
            
            <p><em><span style="color: red">${message}</span></em></p>
            
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
<c:import url="includes/footer.jsp"/>
