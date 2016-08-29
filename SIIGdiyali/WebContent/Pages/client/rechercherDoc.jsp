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
<title>Rechercher Un Document</title>
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
								<LEGEND align=top>Chercher un document</LEGEND>
								<h:form id="Form">
										<table>

											<tr>
												<td><label>Titre </label></td>
												<td><h:inputText id="id1" value="#{docsBean.titre}"
														style="width: 258px; "></h:inputText></td>
											</tr>
											<tr>
												<td><label>Date d'ajout:</label></td>
												<td><a4j:outputPanel id="calendar1" layout="block">
														<rich:calendar value="#{docsBean.debut }"
															locale="fr/FR" popup="true" datePattern="yyyy-MM-dd"
															showApplyButton="false" cellWidth="20px"
															cellHeight="20px" style="width:200px">
														</rich:calendar>
													</a4j:outputPanel></td>
											</tr>
											<tr>
												<td style="width: 160px"><label>Type du document : </label></td>
												<td><h:selectOneMenu 
														value="#{docsBean.idTypeDoc}"
														style="width:200px">
														<f:selectItems  value="#{docsBean.mesTypes}" />
													</h:selectOneMenu></td>
											</tr>										
										</table>
									<div style="width: 550px; margin: auto; margin-top: 10px;">

										<h:commandButton styleClass="classbouton"
											action="#{docsBean.chercherDocument}" value="Chercher">
										</h:commandButton>
										<h:commandButton styleClass="classbouton" value="Annuler"
											style="margin-left:200px;" action="return"></h:commandButton>
									</div>

								</h:form>
							</fieldset>
							
							
														<br /> <br />

							<h:panelGrid rendered="#{docsBean.starSearch}">

								<label id="t1">Resultat</label>
								<form action="ajouterDoc.jsp">
									<h:commandButton style="float:right;" title="Ajouter"
										image="/img/add2.png" />
								</form>
								<h:panelGrid rendered="#{docsBean.empTy}">
									<h:outputText style="color:red;font-size: 20px"
										value="#{docsBean.documentVide}" />
								</h:panelGrid>
								<h:panelGrid rendered="#{!docsBean.empTy}">
									<h:dataTable style="width:1000px"
										value="#{docsBean.documentList}" var="document" styleClass=""
										headerClass="" rowClasses=""
										binding="#{docsBean.documentTable}">
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Titre" />
											</f:facet>
											<h:outputText value="#{document.titre}" />
										</rich:column>
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Date d'Ajout" />
											</f:facet>
											<h:outputText value="#{document.dateAjout}" />
										</rich:column>
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Type Document" />
											</f:facet>
											<h:outputText value="#{document.typedoc}" />
										</rich:column>
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="Document" />
											</f:facet>
											<h:outputText value="#{document.doc}" />
										</rich:column>
										<rich:column width="100px">
											<f:facet name="header">
												<h:outputText value="action" />
											</f:facet>
											
											
											
<%-- 											<h:form id="Form2">
												<h:commandButton title="Editer" value="Editer"
													action="#{docsBean.chargerDocument}"
													image="/img/editer.png" />
												<h:commandButton title="Supprimer" value="Supprimer"
													action="#{docsBean.supprimerDocument}"
													image="/img/delete.png"
													onclick="if (!confirm('Confirmer la suppression ?')) return false" />
											</h:form> 
--%>
											
											
											
<%-- 											<a4j:keepAlive beanName="docsBean" />
 --%>										</rich:column>
									</h:dataTable>
								</h:panelGrid>
							</h:panelGrid>
							
							
							
							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="idfooter2">
			</div>
		</f:view>
	</body>
</html>
										
										
										
										