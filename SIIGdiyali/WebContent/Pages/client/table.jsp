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
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h:form>
			<h:panelGrid>
				<h:selectOneMenu id="id6" value="#{villeBean.idVille}"
					style="width:200px">
					<f:selectItems value="#{villeBean.mesVilles}" />
				</h:selectOneMenu>
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>