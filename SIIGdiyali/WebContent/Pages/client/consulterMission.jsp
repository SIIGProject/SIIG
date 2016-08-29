<%@page import="javax.faces.context.FacesContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.ajax4jsf.org/rich"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />
<title>Consulter</title>
</head>
<body>
<body style="background: #D8CEF6;">

	<f:view>

		<div id="accueil">

			<img src="../../images/imageBanner.jpg" style="width: 1000px;">
		</div>

 		<div style="margin: auto; width: 1000px;">
<%--  			<jsp:include page="menuH.jsp"></jsp:include>
 --%> 			<jsp:include page="menuSiteH.jsp"></jsp:include>
		</div> 


		<div id="idprincipal2"
			style="margin-top: -25px; padding-top: 20px; background: white;">

			<div id="idconteneur">
				<div id="idcontenu">

					<jsp:include page="menuV.jsp"></jsp:include>
					<div id="idcontenudroite1">
						<div id="idcontenudroite2">


							<fieldset style="margin-left: 40px;">
								<LEGEND align=top>Consulter une mission</LEGEND>
								<h:form id="Form">
									<table>

										<tr>
											<td><label>Intitulé mission : </label></td>
											<td><h:inputText id="id1" value="#{missionBean.titre}" disabled="true"	style="width: 258px; ">
											</h:inputText></td>
										</tr>
										<tr>
										<tr>
											<td><label>Date debut :</label></td>
											<td><h:inputText id="calendar1" value="#{missionBean.debut}" disabled="true" /><tr>
											
											
											<td><label>Date fin :</label></td>
											<td><h:inputText id="calendar2" value="#{missionBean.fin}" disabled="true" > 
											</h:inputText>
										
										</tr>
										<tr>
											<td><label>Objet : </label></td>
											<td><h:inputText id="id2" value="#{missionBean.objet}"
													disabled="true"></h:inputText>
											</td>
										</tr>
										<tr>
											<td><label>Etat : </label></td>
											<td><h:inputText id="id3" value="#{missionBean.etat}" disabled="true"></h:inputText>
											</td>
										</tr>
										<tr>
											<td><label>Detail : </label></td>
											<td><h:inputText id="id4" value="#{missionBean.detail}" disabled="true"></h:inputText>
											</td>
										</tr>

									</table>				
								</h:form>
							</fieldset>
								<div style="width: 550px; margin: auto; margin-top: 10px;">
							
									<form>
										<h:commandButton title="Précédant" style="float:right;" value="Précédant"
											action="rechercherMission.jsp" image="/img/Fleche.png">
										</h:commandButton>
									</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
		<div id="idfooter2">
			<p>
				
			</p>
		</div>
	</f:view>
</body>
</html>