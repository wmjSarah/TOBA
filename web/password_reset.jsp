<%-- 
    Document   : password_reset
    Created on : Sep 12, 2018, 11:15:47 AM
    Author     : BetaRay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.jsp"/>
    <main>
        <h3>Password Recovery/Reset</h3>
        <p>Hello, ${user.userName}. Please enter a new password.</p>
            <form action="passwordReset" method="post">
                <input type="hidden" name="oldPass" value="${user.password}"><br>
                <label>New Password:</label><br>
                <input type="text" name="newPass" required><br>
                <input type="submit" value="Change Password">
            </form>

    </main>
<c:import url="includes/footer.jsp"/>

