<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.jsp"/>
        <main>
            <h3>Success!</h3>
            <p>Thank you, ${user.firstName}!</p>
            <p>You have successfully created an account!</p>
            <p>You have been assigned the username <strong>${user.userName}</strong>.</br>
                Your temporary password is: <strong>${user.password}</strong> </br>
                Please remember to change it!</p>
            
            <p>Here is the data you entered:</p>
             <label>Email:</label>
            <span>${user.email}</span><br>
            <label>First Name:</label>
            <span>${user.firstName}</span><br>
            <label>Last Name:</label>
            <span>${user.lastName}</span><br>
            <label>Phone:</label>
            <span>${user.phone}</span><br>
            <label>Address:</label>
            <span>${user.address}</span><br>
            <label>City:</label>
            <span>${user.city}</span><br>
            <label>State:</label>
            <span>${user.state}</span><br>
            <label>Zip Code:</label>
            <span>${user.zipcode}</span><br>
        </main>
<c:import url="includes/footer.jsp"/>
