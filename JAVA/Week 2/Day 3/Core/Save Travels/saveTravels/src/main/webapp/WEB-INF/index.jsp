
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
	<h1>Save Travels</h1>
	<table>
		<thead>
		<tr>
			<th>Expense</th>
			<th>Vendor</th>
			<th>Amount</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneItem" items="${allTravels}">
				<tr>
					<td><a href="/travel/${oneItem.id}">${oneItem.name}</a>
					</td>
					<td>${oneItem.vendor}</td>
					<td>${oneItem.amount}</td>
					<td>${oneItem.description}</td>
					<td><form action="/travels/edit/${oneItem.id}" method="GET">
							<input type="submit" value="Update">
						</form></td>
					<td><form action="/travels/delete/${oneItem.id}" method="post">
							<input type="hidden" name="_method" value="delete"> <input
								type="submit" value="Delete">
						</form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h1>Add A Travel</h1>
	<form:form action="/travel/new" method="post" modelAttribute="travel">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors path="description" />
			<form:textarea path="description" />
		</p>
		<p>
			<form:label path="vendor">vendor</form:label>
			<form:errors path="vendor" />
			<form:input path="vendor" />
		</p>
		<p>
			<form:label path="amount">amount</form:label>
			<form:errors path="amount" />
			<form:input path="amount" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>