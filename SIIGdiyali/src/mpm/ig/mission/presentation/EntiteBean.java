package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import mpm.ig.mission.model.Entite;
import mpm.ig.mission.service.Interface.EntiteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("entiteBean")
@Scope("session")
public class EntiteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// Service Auto-injected
	@Autowired
	EntiteService entiteService;

	int idEntite;
	private String intitule;
	private List<SelectItem> mesEntites = new ArrayList<SelectItem>();
	private List<Entite> entiteListe;
	private VilleBean villebean;

	// Constructor
	public EntiteBean() {
		super();
	}

	@PostConstruct
	public void init() {
		getListIemsEntites();
	}

	public String ajouterEntite() {

		Entite entite = new Entite();
		entite.setIdEntite(idEntite);
		entite.setIntitule(this.intitule);

		if (entiteService != null) {
			entiteService.addEntite(entite);
			return "LoginOK_Client";
		} else {
			return "LoginNO";
		}

	}

	public List<Entite> getMaList() {	
		List<Entite> liste = entiteService.listeEntite();
		return liste;
	}

	public void getListIemsEntites() {

//		String first = "--- Entite ---";
//		this.mesEntites.add(new SelectItem(first));
		for (Entite val : getMaList()) {
			this.mesEntites.add(new SelectItem(val.getIdEntite(), val.getIntitule()));
		}
	}

	public int getIdEntite() {
		return idEntite;
	}

	public void setIdEntite(int idEntite) {
		this.idEntite = idEntite;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public EntiteService getEntiteService() {
		return entiteService;
	}

	public void setEntiteService(EntiteService entiteService) {
		this.entiteService = entiteService;
	}

	public List<SelectItem> getMesEntites() {
		return mesEntites;
	}

	public void setMesEntites(List<SelectItem> mesEntites) {
		this.mesEntites = mesEntites;
	}

	public List<Entite> getEntiteListe() {
		return entiteListe;
	}

	public void setEntiteListe(List<Entite> entiteListe) {
		this.entiteListe = entiteListe;
	}

	public VilleBean getVillebean() {
		return villebean;
	}

	public void setVillebean(VilleBean villebean) {
		this.villebean = villebean;
	}

}
