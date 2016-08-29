package mpm.ig.mission.presentation;

import java.io.Serializable;

import mpm.ig.mission.model.Destination;
import mpm.ig.mission.model.Entite;
import mpm.ig.mission.model.Mission;
import mpm.ig.mission.model.Ville;
import mpm.ig.mission.service.Interface.DestinationService;
import mpm.ig.mission.service.Interface.MissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("destinationBean")
@Scope("session")
public class DestinationBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// Service Auto-injected
	@Autowired
	DestinationService destinationService;
	@Autowired
	MissionService missionService;

	int idDestination;
	int identite;
	int idville;
	private String description;
	VilleBean villebean = new VilleBean();
	EntiteBean entitebean = new EntiteBean();

	// Constructor
	public DestinationBean() {
		super();
	}

	public String ajouterDestination() {
		
		Ville ville = new Ville(idville);
		Entite entite = new Entite(identite);
		Mission mission = missionService.list();
		Destination destination = new Destination();
		destination.setIdDestination(idDestination);
		destination.setDescription(this.description);
		destination.setVille(ville);
		destination.setEntite(entite);
		destination.setMission(mission);
		if (destinationService != null) {
			destinationService.addDestination(destination);
			return "OK";
		} else {
			return "Non";
		}

	}

	public int getIdDestination() {
		return idDestination;
	}

	public void setIdDestination(int idDestination) {
		this.idDestination = idDestination;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public VilleBean getVillebean() {
		return villebean;
	}

	public void setVillebean(VilleBean villebean) {
		this.villebean = villebean;
	}

	public EntiteBean getEntitebean() {
		return entitebean;
	}

	public void setEntitebean(EntiteBean entitebean) {
		this.entitebean = entitebean;
	}

	public int getIdentite() {
		return identite;
	}

	public void setIdentite(int identite) {
		this.identite = identite;
	}

	public int getIdville() {
		return idville;
	}

	public void setIdville(int idville) {
		this.idville = idville;
	}


}