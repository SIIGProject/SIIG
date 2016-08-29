<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="javax.faces.context.FacesContext"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.ajax4jsf.org/rich"%>
<%@ taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<h:form id="menugauche">
	<h:panelGrid columns="2" columnClasses="cols,cols" width="400">
		<rich:panelMenu style="width:200px" mode="ajax"
			iconExpandedGroup="disc" iconCollapsedGroup="disc"
			iconExpandedTopGroup="chevronUp" iconGroupTopPosition="right"
			iconCollapsedTopGroup="chevronDown">
			
			<rich:panelMenuGroup label="Missions">
			
				<rich:panelMenuItem label="Créer une mission"
					action="#{missionBean.creer}">
				</rich:panelMenuItem>
			
				<rich:panelMenuItem label="Consulter une mission"
					action="#{missionBean.chercher}">
				</rich:panelMenuItem>

			</rich:panelMenuGroup>

			<rich:panelMenuGroup label="Documents">
				
				<rich:panelMenuGroup label="Archvies">
				
					<rich:panelMenuItem label="Créer un archif" action="#{docsBean.ajouterArchives}">
					</rich:panelMenuItem>
					
					<rich:panelMenuItem label="Consulter un archif" action="#{docsBean.chercherAr}">
					</rich:panelMenuItem>
				
				</rich:panelMenuGroup>
				
				<rich:panelMenuGroup label="Ressources">
				
					<rich:panelMenuItem label="Créer une ressource" action="#{docsBean.ajouterRessources}">
					</rich:panelMenuItem>
					
					<rich:panelMenuItem label="Consulter une ressource" action="#{docsBean.chercherRes}">
					</rich:panelMenuItem>
				
				</rich:panelMenuGroup>
				
				<rich:panelMenuGroup label="Modèles documents">
				
					<rich:panelMenuItem label="Créer un modèle" action="#{docsBean.ajouterModeles}">
					</rich:panelMenuItem>
					
					<rich:panelMenuItem label="Consulter un modèle" action="#{docsBean.chercherMod}">
					</rich:panelMenuItem>
				
				</rich:panelMenuGroup>
				
			</rich:panelMenuGroup>
			
			<rich:panelMenuGroup label="Administration">
			</rich:panelMenuGroup>

			<rich:panelMenuGroup label="Personnel">
			</rich:panelMenuGroup>

			<rich:panelMenuGroup label="Réunion">
			</rich:panelMenuGroup>

		</rich:panelMenu>

	</h:panelGrid>
</h:form>