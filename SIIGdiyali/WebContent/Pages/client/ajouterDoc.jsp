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
<title>Ajouter Document</title>
</head>
<body style="background: #D8CEF6;">
	<f:view>
		<div id="accueil">
			<img src="../../images/imageBanner.jpg" style="width: 1000px;">
			<jsp:include page="menuSiteH.jsp"></jsp:include>
		</div>
		<%-- <div style="margin: auto; width: 1000px;">
			<jsp:include page="menuSiteH.jsp"></jsp:include>
		</div> --%>
		<div id="idprincipal2"
			style="margin-top: -40px; padding-top: 20px; background: white;">
			<div id="idconteneur">
				<div id="idcontenu">
					<jsp:include page="menuV.jsp"></jsp:include>
					<div id="idcontenudroite1">
						<div id="idcontenudroite2">


							<fieldset style="margin-left: 40px;">
								<LEGEND align=top>Ajouter un nouveau document</LEGEND>
								<h:form id="Form">
									<table>

										<tr>
											<td><label>Titre : </label></td>
											<td><h:inputText id="id1" value="#{docBean.titre}"
													style="width: 258px; "></h:inputText></td>
										</tr>
										<tr>
											<td><label>Date d'ajout :</label></td>
											<td><h:inputText id="id2" value="#{docBean.debut}"
													disabled="true" />
										</tr>
										<tr>
											<td><label>Description : </label></td>

											<td><h:inputText id="id3" value="#{docBean.description}"
													style="width: 258px; "></h:inputText></td>
										</tr>

										<tr>
											<td style="width: 160px"><label>type : </label></td>

											<td><h:selectOneMenu value="#{docBean.idTypeDoc}"
													style="width:200px">
													<f:selectItems value="#{docBean.mesTypes}" />

												</h:selectOneMenu>
												</td>
												
										</tr>
										<tr>
											<td><label>Document : </label></td>
											<td><rich:fileUpload uploadData="#{docBean.doc}"
													maxFilesQuantity="1" />
										</tr>

									</table>
									<div style="width: 550px; margin: auto; margin-top: 10px;">
										<h:commandButton styleClass="classbouton"
											action="#{docBean.enregistrerDoc}" value="Valider">
										</h:commandButton>
										<h:commandButton styleClass="classbouton" action="return"
											value="Annuler">
										</h:commandButton>
									</div>
								</h:form>

							</fieldset>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div id="idfooter2">
			<p>Minist�re de la p�che maritime, Avenue Essaouira, Rabat, Maroc
				T�l : +212 5377-60102</p>
		</div>
	</f:view>
</body>
</html>



