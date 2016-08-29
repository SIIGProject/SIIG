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
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<rich:page pageTitle="Authentification">
			<f:facet name="header">
				<rich:layout>
					<rich:layoutPanel position="left">
						<h:graphicImage url="/images/mpm.jpg"></h:graphicImage>
					</rich:layoutPanel>
				</rich:layout>
			</f:facet>

			<h:form style="width: 300px ; margin: auto;">
				<rich:panel header="Authentification"
					style="width: 400px ; height: 200px; text-align: center;">
					<h:panelGrid columns="2">
						<h:outputText value="Login :" />
						<h:inputText value="#{authentificationBean.login}" id="login" style="width:250;"/>
						<h:outputText value="Password:" />
						<h:inputSecret value="#{authentificationBean.password}" id="password" />
						<f:facet name="footer">
							<h:commandButton value="OK" action="#{authentificationBean.Authentifier}"></h:commandButton>
						</f:facet>
					</h:panelGrid>
				</rich:panel>
			</h:form>
			
			<f:facet name="footer">

			</f:facet>
		</rich:page>
	</f:view>
</body>
</html> 