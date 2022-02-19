<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add devoir</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurCreateDevoir'>
			<label for='txtSujet'>Sujet : </label>
			<input id='txtSujet' name='txtSujet' type='text' autofocus /><br/>
			<label for='txtIdClassroom'>Id de la classe qui va recevoir le devoir : </label>
			<input id='txtIdClassroom' name='txtIdClassroom' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Creer' /><br/>
	    </form>
	</body>
</html>