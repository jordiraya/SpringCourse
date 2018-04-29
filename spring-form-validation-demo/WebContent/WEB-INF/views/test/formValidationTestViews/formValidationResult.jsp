<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<spring:url value="/resources/test-main.css" var="testMainCSS"/>
	<link href="${testMainCSS}" rel="stylesheet"/>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Form validation test results</title>
</head>

<body>
	<h1 class="ch1">Congratulations. You are now a registered representative of your organization</h1>
	<h2 class="ch2">Details are below:</h2>
	<hr/>
	<div style="margin-left: 600px; width: auto">
		<h3>Name: <b class="cb">${orgrep.firstName}</b></h3>
	</div>
	<hr/>
	<div align="center">
		<c:set var="contextPath" value="${pageContext.request.contextPath}" />
		<c:if test="${formerrors ne null}">
			<a href="${contextPath}/formValidationDemo/home" style="font-size: 17px">Click here to go back to the home page</a>
		</c:if>
	</div>
</body>
</html>