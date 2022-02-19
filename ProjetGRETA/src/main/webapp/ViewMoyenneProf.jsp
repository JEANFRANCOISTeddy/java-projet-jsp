<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>View moyenne</title>
	</head>
	<body>
		<form method='POST' action='/ProjetGRETA/ControlleurViewMoyenneProf'>
			<label for='txtIdMatiere'>Id de la matiere dont vous souhaitez voir la moyenne : </label>
			<input id='txtIdMatiere' name='txtIdMatiere' type='text' autofocus /><br/>
			<br/>
			<input name='btnConnect' type='submit' value='Visualiser' /><br/>
	    </form>
	</body>
</html>