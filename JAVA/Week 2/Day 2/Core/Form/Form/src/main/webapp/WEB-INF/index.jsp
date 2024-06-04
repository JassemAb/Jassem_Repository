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
<h1>Send an Omikuji </h1>
<fieldset>
    <form action="http://localhost:8080/omikuji/show" method="post" style="display: flex ; flex-direction: row">
        <label>
            Pick Any Number From 5 to 25 :
        </label>
        <input type="number"  name="number" >
        <label>
            Enter The Name Of any City :
        </label>
        <input type="text"  name="nameCity" >
        <label>
            Enter The Name Of Any Real Person :
        </label>
        <input type="text"  name="namereal" >
        <label>
            Enter Professional Endeavor Or Hobby :
        </label>
        <input type="text"  name="hobby" >
        <label>
            Enter Any Type Of Living Thing :
        </label>
        <input type="text"  name="type" >
        <label>
            Say Something nice to someone :
        </label>
        <textarea name="something" rows="10" cols="50" ></textarea>
        <button type="submit" >Submit</button>
    </form>
</fieldset>
</body>
