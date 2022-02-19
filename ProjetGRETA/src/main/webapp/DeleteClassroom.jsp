<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Delete classroom</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurDeleteClassroom'>
			<label for='txtId'>Id de la classe que vous voulez supprimer : </label>
			<input id='txtId' name='txtId' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Supprimer' /><br/>
	    </form>
	</body>
</html>