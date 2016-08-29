<%@page import="javax.faces.context.FacesContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.ajax4jsf.org/rich"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />
<script type="text/javascript" src="../../js/js.js"></script>
<title>Création d'un nouveau compte</title>
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


							<fieldset>
								<LEGEND align=top>Formulaire pour créer un nouveau compte </LEGEND>
								<h:form id="Form">
									<div id="idcontenuformulaire3">
										<table style="width: 700px; border: 0px;">
											<tr>
												<td><label> Nom : </label>
												</td>
												<td><h:inputText value="#{utilisateurController.utilisateur.nom }"></h:inputText></td>
											</tr>
											<tr>
												<td><label> Prénom : </label>
												</td>
												<td><h:inputText value="#{utilisateurController.utilisateur.prenom }"></h:inputText></td>
											</tr>
											<tr>
												<td><label> Date de naissance : </label>
												</td>
												<td>
													<a4j:outputPanel id="calendar10" layout="block">
													<rich:calendar value="#{utilisateurController.utilisateur.dateNaissance }" locale="fr/FR"
														popup="true" datePattern="yyyy-MM-dd"
														showApplyButton="false" cellWidth="20px" cellHeight="20px"
														style="width:200px" />
													</a4j:outputPanel>
												</td>
											</tr>
											<tr>
												<td><label> Email : </label>
												</td>
												<td><h:inputText value="#{utilisateurController.utilisateur.email }"></h:inputText></td>
											</tr>
											<tr>
												<td><label> Login : </label>
												</td>
												<td><h:inputText value="#{utilisateurController.utilisateur.login }"></h:inputText></td>
											</tr>
											<tr>
												<td><label> Mot de passe : </label>
												</td>
												<td><h:inputSecret value="#{utilisateurController.utilisateur.password }"></h:inputSecret></td>
											</tr>
											<tr>
												<td><label> Retaper votre mot de passe : </label>
												</td>
												<td><h:inputSecret value="#{utilisateurController.confirmPassword }"></h:inputSecret></td>
											</tr>
											<tr>
												<td><h:inputHidden value="Client"></h:inputHidden>
												</td>
											</tr>
										</table>
									</div>


									<div style="width: 550px; margin: auto; margin-top: 10px;">
										<h:commandButton styleClass="classbouton" value="Créer un compte"
											style="margin-left:200px;" action="#{utilisateurController.ajouterUtilisateur }"></h:commandButton>
										<h:commandButton styleClass="classbouton" value="Annuler"
											style="margin-left:200px;" action="returnConnexion"></h:commandButton>

									</div>
								</h:form>
							</fieldset>
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