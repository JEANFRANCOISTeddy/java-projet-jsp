<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Update your password</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurChangePassword'>
			<label for='txtPassword'>New password : </label>
			<input id='txtPassword' name='txtPassword' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Modifier' /><br/>
	    </form>
	</body>
</html>