<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="javax.faces.context.FacesContext"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.ajax4jsf.org/rich"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<f:subview id="header">
	<rich:layout>
		<rich:layoutPanel position="top">
		</rich:layoutPanel>
		<rich:layoutPanel position="left">			
		</rich:layoutPanel>
		<rich:layoutPanel position="center">
		</rich:layoutPanel>
		<rich:layoutPanel position="right">
			<%-- <h:graphicImage url="/images/mpm.jpg"></h:graphicImage> --%>
			&nbsp;&nbsp;&nbsp;
			<br /> Bienvenue 
                        <h:outputText value="#{user.user.nom}" />
			
			<h:outputText value="#{user.user.prenom}" />
			<br />
			<h:form>
			<h:commandLink action="#{user.doSignOff}">
				<h:outputText value="Deconnexion" />
			</h:commandLink>
			</h:form>
			<br />
		</rich:layoutPanel>
		<rich:layoutPanel position="bottom">
		</rich:layoutPanel>
	</rich:layout>

</f:subview>