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
<title>Gestion des domaines</title>
</head>
<body style="background: #D8CEF6;">

	<f:view>

		<div id="accueil">
			<img src="../../images/imageBanner.jpg" style="width: 1000px;">
		</div>

		<div style="margin: auto; width: 1000px;">
			<jsp:include page="menuSiteH.jsp"></jsp:include>
		</div>


		<div id="idprincipal2"
			style="margin-top: -25px; padding-top: 20px; background: white;">




			<div id="idconteneur">
				<div id="idcontenu">

					<jsp:include page="menuSiteV.jsp"></jsp:include>




					<div id="idcontenudroite1">
						<div id="idcontenudroite2">


							<fieldset>
								<LEGEND align=top>Résumé de votre séjour</LEGEND>



								<h:dataTable value="#{sejourController.listPlanificationFinale }" border="1" var="planification"
									rules="all" styleClass="tab" rowClasses="row1,row2">



									<h:column>
										<f:facet name="header">
											<h:outputText>Activité</h:outputText>
										</f:facet>
										<h:outputText value="#{planification.activite.libelle }"></h:outputText>
									</h:column>
									<h:column>
										<f:facet name="header">
											<h:outputText>Domaine</h:outputText>
										</f:facet>
										<h:outputText value="#{planification.activite.domaine.libelle }"></h:outputText>
									</h:column>
									<h:column>
										<f:facet name="header">
											<h:outputText>Date de début</h:outputText>
										</f:facet>
										<h:outputText value="#{planification.id.dateDebutActivite }"></h:outputText>
									</h:column>
									<h:column>
										<f:facet name="header">
											<h:outputText>Coût Activité</h:outputText>
										</f:facet>
										<h:outputText value="#{planification.activite.coutActivite }"></h:outputText>
									</h:column>
								</h:dataTable>
								<h:form>
								<table>
									<tr>
										<th>
											Cout Global Final (en Dhs): <h:outputText value="#{sejourController.coutGlobalFinal }"></h:outputText>
										</th>
										<td>
											<h:commandButton styleClass="classbouton" value="Retour Accueil" 
													action="return">
											</h:commandButton>
											
										</td>
									</tr>
									
								</table>
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