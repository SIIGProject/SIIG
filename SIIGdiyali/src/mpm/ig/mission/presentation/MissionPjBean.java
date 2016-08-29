package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.Date;

import mpm.ig.mission.model.Mission;
import mpm.ig.mission.model.Missionpj;
import mpm.ig.mission.model.Typepj;
import mpm.ig.mission.service.Interface.MissionPjService;
import mpm.ig.mission.service.Interface.MissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("missionpjBean")
@Scope("session")
public class MissionPjBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// Service Auto-injected
	@Autowired
	MissionPjService pjService;
	@Autowired
	MissionService missionService;

	int idPj;
	private int idType;
	public String titre;
	private String type;
	private String description;
	private Date dateAjout;
	private byte[] pj;
	private MissionBean missionbean = new MissionBean();
	

	// Constructor
	public MissionPjBean() {
		super();
	}

	public String ajouterPj() {
//		int idtypemission = missionbean.getIdMission();		
		Mission mission = missionService.list();		
		Typepj typepj = new Typepj(idType);
		Missionpj pj = new Missionpj();
		pj.setIdPj(idPj);
		pj.setMission(mission);
		pj.setTitre(this.titre);
		pj.setDescription(this.description);
		pj.setDateAjout(dateAjout);
		pj.setTypepj(typepj);		
		if (pjService != null) {
			pjService.addPj(pj);
			return "OK";
		} else {
			return "Non";
		}
	}

	public String chargerpj() {

		System.out.print(this.titre+this.description);

		return "AjoutDoc";
	}

	// -------------------------------------getters &
	// setters---------------------------------------

	public int getIdPj() {
		return idPj;
	}

	public void setIdPj(int idPj) {
		this.idPj = idPj;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPj() {
		return pj;
	}

	public void setPj(byte[] pj) {
		this.pj = pj;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public MissionBean getMissionbean() {
		return missionbean;
	}

	public void setMissionbean(MissionBean missionbean) {
		this.missionbean = missionbean;
	}

}