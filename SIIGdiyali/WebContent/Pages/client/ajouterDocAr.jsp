<%@page import="javax.faces.context.FacesContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.ajax4jsf.org/rich"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@page import="java.io.File"%>
<%@page import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />
<script type="text/javascript" async="" src="../../js/ga.js"></script>
<title>Créer un archif</title>
</head>
<body style="background: #D8CEF6;">
	<f:view>
		<div id="accueil">
			<img src="../../images/imageBanner.jpg" style="width: 1000px;">
		</div>
		<div id="idprincipal2"
			style="margin-top: -69px; padding-top: 20px; background: white;">
			<div style="margin: auto; width: 1000px;">
				<%-- <jsp:include page="menuH.jsp"></jsp:include> --%>
			</div>
			<div id="idconteneur">
				<div id="idcontenu">
					<jsp:include page="menuV.jsp"></jsp:include>
					<%--
					<td><label>Type de documents : </label></td>
					<td>
						<h:panelGrid>
							<h:selectOneMenu id="id2" value="#{missionBean.idType}" style="width: 258px;">
								<f:selectItems value="#{typemissionBean.mesTypes}" />
							</h:selectOneMenu>
						</h:panelGrid>
					</td>
					--%>
					<div id="idcontenudroite1">
						<div id="idcontenudroite2">
								<h:form id="f">
									<center><h1>Archif</h1></center>
									<table>
										<tr>
											<td><label>Titre :</label></td>
											<td><h:inputText id="id1" value="#{docsBean.titre}" style="width: 258px;"/></td>
										</tr>
										<tr>
											<td><label>Date d'ajout :</label></td>
											<td><h:inputText id="id2" value="" style="width: 258px;" disabled="true"/></td>
										</tr>
										<tr>
											<td><label>Description :</label></td>
											<td><h:inputText id="id3" value="#{docsBean.description}" style="width: 258px;"/></td>
										</tr>
										<tr>
											<td><label>Type :</label></td>
											 <td><%-- <h:panelGrid>
													<h:selectOneMenu id="id4" value="#{typeDocsBean.idType}" style="width: 258px;">
														<f:selectItem itemValue="1" itemLabel="Archives" />
														<f:selectItem itemValue="2" itemLabel="Ressources" /> 
													</h:selectOneMenu>
												</h:panelGrid> --%></td>
										</tr>
										<tr>
											<td><label>Sous type :</label></td>
											<td> <h:panelGrid>
													<h:selectOneMenu id="id5" value="#{docsBean.idSousType}" style="width: 258px;">
														<f:selectItems value="#{SoustypedocBean.mesSousTypes}" />
													</h:selectOneMenu>
												</h:panelGrid>
											</td>	
										</tr>
										<tr>
											<td><label>Document :</label></td>
											<td><rich:fileUpload uploadData="#{docsBean.doc}" maxFilesQuantity="1"/></td>
										</tr>
									</table>
									<div style="width: 550px; margin: auto; margin-top: 10px;">
										<h:commandButton styleClass="classbouton" value="Valider" action="#{docsBean.enregistrerDoc}"/>
										<h:commandButton styleClass="classbouton" value="Annuler" action="return"/>
									</div>
								</h:form>
						</div>
					</div>

				</div>
			</div>
		</div>

		<div id="idfooter2">
			<p>Ministre de la pêche maritime, Avenue Essaouira, Rabat, Maroc
				Tél : +212 5377-60102</p>
		</div>

	</f:view>
</body>
</html>

