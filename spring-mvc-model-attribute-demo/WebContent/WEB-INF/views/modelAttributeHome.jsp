<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>@ModelAttribue Test Bed</title>
	<style>
		input[type=text] {
			padding: 10px;
			margin: 10px;
			font-size: 20px
		}
		
		input[type=submit] {
			border: none;
			background-color: #4CAF50;
			color: white;
			padding: 16px;
			cursor: pointer;
			font-size: 20px			
		}
		
		h1, h2 {
			color: #08298A;
			text-align: center
		}
	</style>
</head>

<body>
	<div align="left">
		<h1>${testdata1A}</h1>
		<hr/>
		
		${testdata1B}
		<hr/>
	</div>
</body>
</html>