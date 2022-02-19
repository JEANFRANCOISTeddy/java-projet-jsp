<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add matiere</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurCreateMatiere'>
			<label for='txtNom'>Nom : </label>
			<input id='txtNom' name='txtNom' type='text' autofocus /><br/>
			<label for='txtNbHeures'>Nombre d'heures : </label>
			<input id='txtNbHeures' name='txtNbHeures' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Creer' /><br/>
	    </form>
	</body>
</html>