<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Update account</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurUpdateAccount'>
			<label for='txtId'>Id du compte que vous voulez modifier : </label>
			<input id='txtId' name='txtId' type='text' autofocus /><br/>
			<label for='txtPrenom'>Prenom : </label>
			<input id='txtPrenom' name='txtPrenom' type='text' autofocus /><br/>
			<label for='txtLogin'>Login : </label>
			<input id='txtLogin' name='txtLogin' type='text' autofocus /><br/>
			<label for='txtPassword'>Password : </label>
			<input name='txtPassword' type='text'/><br/>
			<label for='txtStatut'>Statut : </label>
			<input id='txtStatut' name='txtStatut' type='text' autofocus /><br/>
			<label for='txtAge'>Age : </label>
			<input id='txtAge' name='txtAge' type='number' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Modifier' /><br/>
	    </form>
	</body>
</html>