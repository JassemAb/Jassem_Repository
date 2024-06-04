<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Demo JSP</title>
</head>
<body>
    <h1 style="color:blue;">Fruit Store</h1>
    <table style="border:30px solid pink">
        <thead>
            <th>Name</th>
            <th>Price</th>
        </thead>
        <tbody>
            <c:forEach var="oneFruit" items="${fruits}">
                <tr>
                    <td><c:out value="${oneFruit.getName()}"/></td>
                      <br/>
                    <td><c:out value="${oneFruit.getPrice()}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>