<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.jsp"/>
        <main>
            <h3>Account Activity</h3>
            <c:if test="${user != null}">
                <p>Hello, ${user.firstName}!</p>
            </c:if>}
            <p>${user.firstName}</p>
        </main>
<c:import url="includes/footer.jsp"/>