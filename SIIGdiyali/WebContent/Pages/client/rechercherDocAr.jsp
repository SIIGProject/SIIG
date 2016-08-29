<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="javax.faces.context.FacesContext"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.ajax4jsf.org/rich"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />

<script type="text/javascript" src="../../js/calendrier.js"></script>
<title>Chercher des Missions</title>
</head>
<body style="background: #D8CEF6;">

	<f:view>
		<div id="accueil">
			<img src="../../images/imageBanner.jpg" style="width: 1000px;">
			<jsp:include page="menuSiteH.jsp"></jsp:include>
		</div>
 		<%-- <div style="margin: auto; width: 1000px;">
 			<jsp:include page="menuH.jsp"></jsp:include>
  			<%-- <jsp:include page="menuSiteH.jsp"></jsp:include>
		</div>  --%>
		<div id="idprincipal2"
			style="margin-top: -40px; padding-top: 20px; background: white;">
		<div style="margin: auto; width: 1000px;">
		
		</div>
			<div id="idconteneur">
				<div id="idcontenu">
					<jsp:include page="menuV.jsp"></jsp:include>
					<div id="idcontenudroite1">
						<div id="idcontenudroite2">

							<fieldset style="margin-left: 40px;">
								<LEGEND align=top>Chercher un archif</LEGEND>
								<h:form id="Form1">
									<fieldset>
										<LEGEND align=top>Archif :</LEGEND>
										<table>
											<tr>
												<td><label>Titre :</label></td>
												<td><h:inputText id="id1" value="#{docsBean.titre}" style="width: 258px; "/></td>
											</tr>
											<tr>
												<td><label>Date d'ajout :</label></td>
												<td><a4j:outputPanel id="calendar1" layout="block">
														<rich:calendar value="#{docsBean.debut}"
															locale="fr/FR" popup="true" datePattern="yyyy-MM-dd"
															showApplyButton="false" cellWidth="20px"
															cellHeight="20px" style="width:200px">
														</rich:calendar>
													</a4j:outputPanel></td>
											</tr>
											<tr>
												<td><label>Description :</label></td>
												<td><h:inputText id="id2" value="#{docsBean.description}" style="width: 258px; "/></td>
											</tr>
											<tr>
												<td><label>Sous type :</label></td> <!-- Les sous types de documents -->
												<td><%-- <h:panelGrid>
														<h:selectOneMenu id="id3" value="#{docsBean.idTypeDoc}" style="width: 258px;">
															<f:selectItem value="#{docsBean.mesTypes}"/>
														</h:selectOneMenu>
													</h:panelGrid> --%></td>
											</tr>
										</table>
									</fieldset>
									
									<div style="width: 550px; margin: auto; margin-top: 10px;">
										
										<h:commandButton styleClass="classbouton" action="#{docsBean.chercherAr}" value="Chercher" />
										<h:commandButton styleClass="classbouton" action="return" value="Annuler" style="margin-left:200px;" />
									</div>
								</h:form>
							</fieldset>
							
							<br/>	<br/>
							<%--
							<h:panelGrid rendered="#{docsBean.isStarsearch}">
								<label id="t1">Resultat</label>
								
								<form action="ajouterDocAr.jsp">
									<h:commandButton style="float:right;" title="Ajouter" image="/img/add2.png"/>
								</form>
								
								<h:panelGrid rendered="#{docsBean.isEmpty}">
									<h:outputText style="color:red;font-size: 20px" value="#{docsBean.documentVide}">
									</h:outputText>
								</h:panelGrid>
								
								<h:panelGrid rendered="#{!docsBean.isEmpty}">
									<h:dataTable style="width:1000px" value="#{docsBean.documentList}"
												 var="document" styleClass="" headerClass="" rowClasses=""
												 binding="#{docsBean.documentTable}">
										
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Titre"/>
											</f:facet>
											<h:outputText value="#{document.titre}"/>
										</rich:column>
										
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Titre"/>
											</f:facet>
											<h:outputText value="#{document.debut}"/>
										</rich:column>
										
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Titre"/>
											</f:facet>
											<h:outputText value="#{document.description}"/>
										</rich:column>
										
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Titre"/>
											</f:facet>
											<h:outputText value="#{document.xxxxxxx}"/> <%-- Hna ma3reftch achnou ghadi ndir :'( 
										</rich:column>
										
									</h:dataTable>
								</h:panelGrid>
							</h:panelGrid>
							--%>
							
						</div>
					</div>
				</div>
			</div>
		</div>
			<div id="idfooter2">
			<p>Ministère de la pêche maritime, Avenue Essaouira, Rabat, Maroc
				Tél : +212 5377-60102</p>
		</div>
	</f:view>
</body>
</html>