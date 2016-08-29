<%@page import="javax.faces.context.FacesContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%-- <%@page import="com.sqli.echallenge.carnetvoyage.model.Utilisateur"%> --%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />
<script type="text/javascript" src="../../js/js.js"></script>
<title>Un compte a été crée</title>
</head>
<body style="background: #D8CEF6;">

	<f:view>

		<div id="accueil">
			<img src="../../images/imageBanner.jpg" style="width: 1000px;">
		</div>

		<div style="margin: auto; width: 1000px;">
			<jsp:include page="menuInitialH.jsp"></jsp:include>
		</div>


		<div id="idprincipal2"
			style="margin-top: -25px; padding-top: 20px; background: white;">




			<div id="idconteneur">
				<div id="idcontenu">

					<%-- 					<jsp:include page="menuInitialV.jsp"></jsp:include> --%>


					<div id="idcontenudroite1">
						<div id="idcontenudroite2">
						Bienvenu&nbsp;
							<h:outputText value="#{utilisateurController.utilisateur.nom }"/>&nbsp;
							<h:outputText value="#{utilisateurController.utilisateur.prenom }"/>,<br />
							<label class="remember"> 
									<strong class="remember-label">Votre compte a été bien crée, vous pouvez accéder à la page d'accueil en cliquant <a href="./accueilClient.jsf" >ici</a></strong>
							</label>

						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="idfooter2">
			<p>
				MGVC club 16, Avenue Necola, N°5, Paris France <br>Tél. :(212)5
				37 67 57 36 , Fax :(212)5 37 67 57 36 .
			</p>
		</div>
	</f:view>
</body>
</html>