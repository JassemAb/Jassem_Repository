<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Demo JSP</title>
    <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="/resources/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/resources/css/main.css" />
    <script src="/resources/webjars/bootstrap/js/bootstrap.min.js"></script>
    <title>Title</title>
</head>
<body>
    <h1>
        Expense Details
    </h1>
    <h2><a href="/">Go back</a></h2>
        <p>Expense Name: ${travel.name}</p>
        <p>Vendor: ${travel.vendor}</p>
        <p>Amount: ${travel.amount}</p>
        <p>Description: ${travel.description}</p>
</body>
</html>