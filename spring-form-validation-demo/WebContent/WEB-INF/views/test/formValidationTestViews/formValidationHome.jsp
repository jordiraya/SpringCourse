<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<spring:url value="/resources/test-main.css" var="testMainCSS"/>
	<link href="${testMainCSS}" rel="stylesheet"/>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Test bed</title>
</head>

<body>
	<div align="center">
		<h1 class="ch1">Welcome to the Form Validation Test Bed</h1>
		<hr/>
		<h3>Please register yourself as your Organization ReEpresentative</h3>
		<form:form action="registerOrgRep" modelAttribute="orgrep">
			<table>
				<tr>
					<td><form:label path="firstName" cssClass="clabel">First Name</form:label></td>
					<td><form:input path="firstName" placeholder="Enter First Name" cssClass="cinput" /></td>
					<td><form:errors path="firstName" cssClass="cb" /></td>
				</tr>
				<tr>
					<td/>
					<td align="center"><input type="Submit" class="csubmit" value="Submit" /></td>
				</tr>
			</table>
			<hr/>
			<c:set var="contextPath" value="${pageContext.request.contextPath}" />
			<c:if test="${formerrors ne null}">
				<a href="${contextPath}/formValidationDemo/home" style="font-size: 17px">Click here to start a fresh form</a>
			</c:if>
		</form:form>
	</div>
</body>
</html>