<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!-- for Bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3">
		<div class="d-flex justify-content-between">
			<h1>All Cars</h1>
			<div>
				<a href="/cars/new" class="btn btn-info">Create Car</a>
				<a href="/logout" class="btn btn-danger">Logout!</a>
			</div>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th>Model</th>
					<th>Color</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allCars}" var="car">
					<tr>
						<td><a href="/cars/show/${car.id}">${car.model}</a></td>
						<td>${car.color}</td>
						<td>${car.price}</td>
						<td>
							<div class="d-flex">
								<div>
									<a class="btn btn-info" href="/cars/edit/${car.id}">edit</a>
								</div>
								<form action="/cars/${car.id}" method="post">
								<input type="hidden" name="_method" value="delete">
								<input type="submit" value="Delete" class="btn btn-danger">
								</form>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>