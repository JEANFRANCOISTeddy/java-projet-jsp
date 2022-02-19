<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add note</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurCreateNote'>
			<label for='txtNote'>Note : </label>
			<input id='txtNote' name='txtNote' type='text' autofocus /><br/>
			<label for='txtCoefficient'>Coefficient : </label>
			<input id='txtCoefficient' name='txtCoefficient' type='text' autofocus /><br/>
			<label for='txtIdEleve'>Id de l'eleve qui va recevoir la note : </label>
			<input id='txtIdEleve' name='txtIdEleve' type='text' autofocus /><br/>
			<label for='txtIdDevoir'>Id du devoir : </label>
			<input id='txtIdDevoir' name='txtIdDevoir' type='text' autofocus /><br/>
			<label for='txtIdMatiere'>Id de la matiere : </label>
			<input id='txtIdMatiere' name='txtIdMatiere' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Creer' /><br/>
	    </form>
	</body>
</html>