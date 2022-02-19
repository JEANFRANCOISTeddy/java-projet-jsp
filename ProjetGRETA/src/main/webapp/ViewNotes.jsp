<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>View notes</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurViewNote'>
			<label for='txtIdDevoir'>Id du devoir : </label>
			<input id='txtIdDevoir' name='txtIdDevoir' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Visualiser' /><br/>
	    </form>
	</body>
</html>