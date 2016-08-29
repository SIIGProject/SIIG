<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://myfaces.apache.org/tomahawk" prefix="t"%>
<%@page import="java.io.File" %>
<%@page import="java.util.List" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<h:form style="margin-bottom:7px;">
<ul class="menu">
<li class="top"><a href="#" target="_self" class="top_link"><span></span></a>
</li>
<li class="top"><a href="./accueilAdmin.jsf" target="_self" class="top_link"><span>ACCUEIL</span></a>
</li>
<li class="top"><a href="./gererActivite.jsf" target="_self" class="top_link"><span>ACTIVITES</span></a>
</li>
<li class="top"><a href="./gererDomaine.jsf" target="_self" class="top_link"><span>DOMAINES</span></a>
</li>
<li class="top"><span>
	                         			 				 <h:commandLink action="#{utilisateurController.Deconnexion }" styleClass="top_link" target="_self">
	                         			 				 		<h:outputText value="DECONNEXION"></h:outputText>
	                         			 				 </h:commandLink>
	                         			 		</span>
</li>
</ul>
</h:form>
<div >
<img  src="../../images/chap.PNG" style="width: 1000px;">
</div>