<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
<h2>Hello restouraun!</h2>
<table border="0.2" style="align-items: center" class="table table-striped">
    <thead style = "color:white;background-color:dimgrey">
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Должность</th>
    </tr>
    </thead>

    <c:forEach items="${employees}" var="employee">
        <tr>
            <td><a href="/admin/employees/show/${employee.name}">${employee.name}</a></td>
            <td>${employee.surname}</td>
            <td>${employee.position}</td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
