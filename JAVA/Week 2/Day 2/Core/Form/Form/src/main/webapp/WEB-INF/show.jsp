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
    <h1>Here's Your Omikuji !  </h1>
    <p style="background: blue ; color:white ; ">In ${sessionScope.number} Years
        , You Will Live In ${sessionScope.namecity} With ${sessionScope.namereal}
        As Your Roomate , ${sessionScope.hobby} for a living .
        The Next Time You See A ${sessionScope.type} , you will have good luck.
        Also , ${sessionScope.something}.
    </p>
    <a href="http://localhost:8080/omikuji"><button >Go Back</button></a>
</body>
</html>