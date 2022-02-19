<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add classroom</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurCreateClassroom'>
			<label for='txtNom'>Nom : </label>
			<input id='txtNom' name='txtNom' type='text' autofocus /><br/>
			<label for='txtProf'>Prof : </label>
			<input id='txtProf' name='txtProf' type='text' autofocus /><br/>
			<label for='txtEleves'>Eleves : </label>
			<input name='txtEleves' type='text'/><br/>
			<label for='txtMatiere'>Matiere : </label>
			<input id='txtMatiere' name='txtMatiere' type='text' autofocus /><br/>
			<label for='txtDevoir'>Devoir : </label>
			<input id='txtDevoir' name='txtDevoir' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Creer' /><br/>
	    </form>
	</body>
</html>