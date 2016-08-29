<%@page import="javax.faces.context.FacesContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.ajax4jsf.org/rich"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%-- <%@page import="com.sqli.echallenge.carnetvoyage.model.Utilisateur"%>
<%
	Utilisateur user = (Utilisateur) request.getSession(false)
			.getAttribute("user");

	try {
		if (user == null) {
			response.sendRedirect(response
					.encodeRedirectURL("./connexion.jsf"));
		}

	} catch (Exception e) {
	}
%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />
<script type="text/javascript" async="" src="../../js/ga.js"></script>
<title>Acceuil</title>
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
					<jsp:include page="/Pages/client/menuV.jsp"></jsp:include>
					<div id="idcontenudroite1">
						<div id="idcontenudroite2">

							<label style="text-align: center"><h2>Application de
									gestion de système interne d'inspection générale</h2> </label>
							<p style="text-align: center">
								<h:graphicImage url="/images/mpm.jpg"></h:graphicImage>
							</p>
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


 