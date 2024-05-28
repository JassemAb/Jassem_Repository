<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Burger Tracker</title>
</head>
<body style="margin:10vw;">
<h2>Edit Burger</h2>
<form:form action="/edit/${burger.id}" mode="put" modelAttribute="burger">
	<div>
		<form:label path="name">Burger Name:</form:label><br>
		<form:errors path="name" class="text-danger"/>
		<form:input path="name" style="width:250px;"/>
	</div>
	<div>
		<form:label path="restaurant">Restaurant Name:</form:label><br>
		<form:errors path="restaurant" class="text-danger"/>
		<form:input path="restaurant" style="width:250px;"/>
	</div>
	<div>
		<form:label path="rating">Rating:</form:label><br>
		<form:errors path="rating" class="text-danger"/>
		<form:input path="rating" style="width:250px;"/>
	</div>
	<div>
		<form:label path="notes">Notes:</form:label><br>
		<form:errors path="notes" class="text-danger"/>
		<form:textarea path="notes" rows="3" style="width:250px;"/>
	</div>
	<div>
		<input type="submit" value="Submit"/>
	</div>
</form:form>
</body>
</html>