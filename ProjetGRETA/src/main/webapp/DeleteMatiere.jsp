<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Delete matiere</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurDeleteMatiere'>
			<label for='txtId'>Id de la matiere que vous voulez modifier : </label>
			<input id='txtId' name='txtId' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Supprimer' /><br/>
	    </form>
	</body>
</html>