<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>View moyenne</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurViewMoyenne'>
			<input id='txtIdEleve' name='txtIdEleve' type='hidden' value="<%= session.getAttribute("id") %>" autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Afficher votre moyenne' /><br/>
	    </form>
	</body>
</html>