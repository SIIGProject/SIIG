<%@page import="javax.faces.context.FacesContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%-- <%@page import="com.sqli.echallenge.carnetvoyage.model.Utilisateur"%>
<%
Utilisateur user = (Utilisateur)request.getSession(false).getAttribute("user");

try
{
	if ( user == null)
	{ 	
		response.sendRedirect(response.encodeRedirectURL("./connexion.jsf")); 
	}
	
}
catch(Exception e){ } 

%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />
<script type="text/javascript" src="../../js/js.js"></script>
<title>Gestion des administrateurs</title>
</head>
<body style="background: #D8CEF6;">

	<f:view>

		<div id="accueil">
			<img src="../../images/imageBanner.jpg" style="width: 1000px;">
		</div>

		<div style="margin: auto; width: 1000px;">
			<jsp:include page="menu1.jsp"></jsp:include>
		</div>


		<div id="idprincipal2"
			style="margin-top: -25px; padding-top: 20px; background: white;">




			<div id="idconteneur">
				<div id="idcontenu">

					<jsp:include page="./menu.jsp"></jsp:include>




					<div id="idcontenudroite1">
						<div id="idcontenudroite2">


							<fieldset>
								<LEGEND align=top>Les administrateurs de MGVC</LEGEND>



								<h:dataTable value="" border="1" var="p"
									rules="all" styleClass="tab" rowClasses="row1,row2">



									<h:column>
										<f:facet name="header">
											<h:outputText>Nom</h:outputText>
										</f:facet>
										<h:outputText value=""></h:outputText>
									</h:column>

									<h:column>
										<f:facet name="header">
											<h:outputText>Prénom</h:outputText>
										</f:facet>
										<h:outputText value=""></h:outputText>
									</h:column>
									<h:column>
										<f:facet name="header">
											<h:outputText>Date naissance</h:outputText>
										</f:facet>
										<h:outputText value=""></h:outputText>
									</h:column>
									<h:column>
										<f:facet name="header">
											<h:outputText>Login</h:outputText>
										</f:facet>
										<h:outputText value=""></h:outputText>
									</h:column>
									<h:column>
										<f:facet name="header">
											<h:outputText >Mot de passe</h:outputText>
										</f:facet>
										<h:outputText value=""></h:outputText>
									</h:column>
									


								
									<h:column>
										<f:facet name="header">
											<h:outputText value="Supprimer"></h:outputText>
										</f:facet>
										<h:form>
											<h:commandButton image="../../images/supprimer.png"
												action="#"
												onclick="return confirmDelete();">
												<f:setPropertyActionListener value=""
													target="#" />
											</h:commandButton>
										</h:form>
									</h:column>
								</h:dataTable>
								<div style="width: 550px; margin: auto; margin-top: 10px;">
									<h:form>
										<h:commandButton styleClass="classbouton"
											action="add"
											value="Ajouter Administrateur">

										</h:commandButton>

									</h:form>

								</div>
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