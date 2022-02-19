<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Accueil</title>
	</head>
	<body>
		<h1>CONNECTED</h1>
		<%= (session != null && session.getAttribute("statut") != null) ? session.getAttribute("statut").toString() + " : " : ""%>
		<%= (session != null && session.getAttribute("prenom") != null) ? session.getAttribute("prenom").toString() : ""%>
		<a href="/ProjetGRETA/Index.jsp"><button>Deconnexion</button></a>
		
		<% if(session.getAttribute("statut").toString().equals("admin")) { %> 
			<ul>
			  <li><a href="/ProjetGRETA/CreateAccount.jsp">Creer des comptes</a></li>
			  <li><a href="/ProjetGRETA/UpdateAccount.jsp">Modifier des comptes</a></li>
			  <li><a href="/ProjetGRETA/SupprimerAccount.jsp">Supprimer des comptes</a></li>
			  
			  <li><a href="/ProjetGRETA/CreateMatiere.jsp">Creer des matieres</a></li>
			  <li><a href="/ProjetGRETA/UpdateMatiere.jsp">Modifier des matieres</a></li>
			  <li><a href="/ProjetGRETA/DeleteMatiere.jsp">Supprimer des matieres</a></li>
			  
	   		  <li><a href="/ProjetGRETA/CreateClassroom.jsp">Creer des classes</a></li>
			  <li><a href="/ProjetGRETA/UpdateClassroom.jsp">Modifier des classes</a></li>
			  <li><a href="/ProjetGRETA/DeleteClassroom.jsp">Supprimer des classes</a></li>
			  
			  <li><a href="/ProjetGRETA/ChangePassword.jsp">Modifier votre mot de passe</a></li>
			</ul>
		<% } %>
			
		<% if(session.getAttribute("statut").toString().equals("prof")) { %> 
			<ul>
			  <li><a href="/ProjetGRETA/CreateDevoir.jsp">Creer des devoirs</a></li>
			  <li><a href="/ProjetGRETA/CreateNote.jsp">Ajouter une note pour un devoir</a></li>
			  <li><a href="/ProjetGRETA/ViewMoyenneProf.jsp">Visualiser les moyennes</a></li>
			  
			  <li><a href="/ProjetGRETA/ChangePassword.jsp">Modifier votre mot de passe</a></li>
			</ul>
		<% } %>
			
		<% if(session.getAttribute("statut").toString().equals("étudiant")) { %> 
			<ul>
			  <li><a href="/ProjetGRETA/ViewNotes.jsp">Visualiser vos notes</a></li>
			  <li><a href="/ProjetGRETA/ViewMoyenne.jsp">Visualiser votre moyenne</a></li>
			  <li><a href="/ProjetGRETA/ChangePassword.jsp">Modifier votre mot de passe</a></li>
			</ul>
		<% } %>
		
	</body>
</html>