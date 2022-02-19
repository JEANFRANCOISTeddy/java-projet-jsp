<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Update matiere</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurUpdateMatiere'>
			<label for='txtId'>Id du compte que vous voulez modifier : </label>
			<input id='txtId' name='txtId' type='text' autofocus /><br/>
			<label for='txtNom'>Nom : </label>
			<input id='txtNom' name='txtNom' type='text' autofocus /><br/>
			<label for='txtNbHeures'>Nombre d'heures : </label>
			<input id='txtNbHeures' name='txtNbHeures' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Modifier' /><br/>
	    </form>
	</body>
</html>