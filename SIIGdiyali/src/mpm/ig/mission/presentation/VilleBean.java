package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import mpm.ig.mission.model.Ville;
import mpm.ig.mission.service.Interface.VilleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("villeBean")
@Scope("session")
public class VilleBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// Service Auto-injected
	@Autowired
	VilleService villeService;

	int idVille;
	private String intitule;
	private List<SelectItem> mesVilles = new ArrayList<SelectItem>();
	private List<Ville> villeListe;

	// Constructor
	public VilleBean() {
		super();
	}
	
	@PostConstruct
	public void init() {
		getListIemsVilles();
		}

	// public Ville find(String intil){
	// return villeService.findVille(intil);
	// }

	public String ajouterVille() {

		Ville ville = new Ville();
		ville.setIdVille(idVille);
		ville.setIntitule(this.intitule);

		if (villeService != null) {
			villeService.addVille(ville);
			return "LoginOK_Client";
		} else {
			return "LoginNO";
		}

	}

	public List<Ville> getMaList() {
		List<Ville> liste = villeService.listVille();
		return liste;
	}

	public void getListIemsVilles() {
			
//			String first = "--- Ville ---";
//			this.mesVilles.add(new SelectItem(first));
			for (Ville val : getMaList()) {				
				this.mesVilles.add(new SelectItem(val.getIdVille(),val.getIntitule()));
			}
	}

	// -------------------------------------getters &
	// setters---------------------------------------

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public VilleService getVilleService() {
		return villeService;
	}

	public void setVilleService(VilleService villeService) {
		this.villeService = villeService;
	}

	public List<Ville> getVilleListe() {
		return villeListe;
	}

	public void setVilleListe(List<Ville> villeListe) {
		this.villeListe = villeListe;
	}

	public List<SelectItem> getMesVilles() {
		return mesVilles;
	}

	public void setMesVilles(List<SelectItem> mesVilles) {
		this.mesVilles = mesVilles;
	}

}
