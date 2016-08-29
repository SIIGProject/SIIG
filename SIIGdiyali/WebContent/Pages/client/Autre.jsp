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
								<LEGEND align=top>AUTRE</LEGEND>
								<h:form id="Form">
										<table>

											<tr>
												<td><label>autre </label></td>
												<td><h:inputText id="id1" value="#"
														style="width: 258px; "></h:inputText></td>
											</tr>
											<tr>
												<td><label>Date d'autre:</label></td>
												<td><a4j:outputPanel id="calendar1" layout="block">
														<rich:calendar value="#"
															locale="fr/FR" popup="true" datePattern="yyyy-MM-dd"
															showApplyButton="false" cellWidth="20px"
															cellHeight="20px" style="width:200px">
														</rich:calendar>
													</a4j:outputPanel></td>
											</tr>
											<tr>
												<td style="width: 160px"><label>Type du autre : </label></td>
												<td><h:selectOneMenu 
														value="#{docBean.idTypeDoc}"
														style="width:200px">
														<f:selectItems  value="#" />
													</h:selectOneMenu></td>
											</tr>										
										</table>
									<div style="width: 550px; margin: auto; margin-top: 10px;">

										<h:commandButton styleClass="classbouton"
											action="#" value="autre">
										</h:commandButton>
										<h:commandButton styleClass="classbouton" value="autre"
											style="margin-left:200px;" action="return"></h:commandButton>
									</div>

								</h:form>
							</fieldset>
							
							
														<br /> <br />

							
							
							
							
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
										
										
										
										