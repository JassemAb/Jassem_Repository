
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
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Title</title>
</head>
<body>
	<h1 style="margin-left:630px;">Edit Expense</h1>
	<form:form action="/travels/editt/{id}" method="get" modelAttribute="travel">
	<input type="hidden" name="_method" value="put">
		<p>
			<form:label class="form-label" path="name">Name</form:label>
			<form:errors path="name" />
			<form:input class="form-control" path="name" value="${travel.name}" />
		</p>

		<p>
			<form:label class="form-label" path="vendor">vendor</form:label>
			<form:errors path="vendor" />
			<form:input class="form-control" path="vendor" value="${travel.vendor}" />
		</p>
		<p>
			<form:label class="form-label" path="amount">amount</form:label>
			<form:errors path="amount" />
			<form:input class="form-control" path="amount" value="${travel.amount}"/>
		</p>
		<p>
			<form:label class="form-label" path="description">Description</form:label>
			<form:errors path="description" />
			<form:textarea class="form-control" path="description" value="${travel.description }"/>
		</p>
		<input style="margin-left: 710px;" class="btn btn-success" type="submit" value="Submit" />
	</form:form>
</body>
</html>