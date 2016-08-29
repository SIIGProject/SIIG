package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.component.html.HtmlDataTable;

import mpm.ig.mission.model.Membreequipe;
import mpm.ig.mission.model.Mission;
import mpm.ig.mission.model.Typemission;
import mpm.ig.mission.model.User;
import mpm.ig.mission.service.Interface.MembreEquipeService;
import mpm.ig.mission.service.Interface.MissionService;
import mpm.ig.mission.service.Interface.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("missionBean")
@Scope("session")
public class MissionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	int idMission;
	int idType;
	private String titre;
	private Date debut;
	private Date fin;
	private String objet;
	private String detail;
	private String etat;
	private HtmlDataTable missionTable;
	private List<Mission> missionList;
	boolean afficheTable = false;
	private String missionVide;
	private Boolean isStarsearch = false;
	private Boolean isEmpty = false;
	private Boolean isSave = true;

	DestinationBean destination = new DestinationBean();
	MembreEquipeBean membre = new MembreEquipeBean();
	TypeMissionBean type = new TypeMissionBean();
	UserBean user = new UserBean();

	@Autowired
	MissionService missionService;
	@Autowired
	MembreEquipeService membreequipeService;
	@Autowired
	UserService userService;

	public MissionBean() {
		super();
	}
	
	public String creer() {
		return "AjoutM";
	}
	
	public String chercher() {
		return "RechercheM";
	}

	public void affiche() {
		missionList = missionService.listMission();
	}

	public User chercherUser() {
		User u = new User();
		u.setIdUser(membre.userbean.idUser);
		User result = userService.listUserByCin(u);
		return result;
	}

	public String ajoutMembre() {
		User us = this.chercherUser();
		Membreequipe mbr = new Membreequipe();
		mbr.setIdMe(membre.idMembre);
		mbr.setFonction(membre.getFonction());
		mbr.setUser(us);
		if (membreequipeService != null) {
			membreequipeService.addMembre(mbr);
			return "LoginOK_Client";
		} else {
			return "LoginNO";
		}
	}

	public String ajouterMission()
	{
		Mission mission = new Mission();
		Typemission typemission = new Typemission(idType);
		
		mission.setIdMission(idMission);
		mission.setTitre(this.titre);
		mission.setDebut(this.debut);
		mission.setFin(this.fin);
		mission.setObjet(this.objet);
		mission.setDetail(this.detail);
		mission.setTypemission(typemission);
		mission.setEtat("Cree");
		
		if (missionService != null)
		{
			missionService.addMission(mission);
			return "OK";
		}else
		{
			return "Non";
		}
	}

	public String chercherMission() {
		Mission mission = new Mission();
		Typemission typemission = new Typemission(idType);
		mission.setTitre(titre);
		mission.setDebut(debut);
		mission.setFin(fin);
		mission.setTypemission(typemission);
//		mission.setDestinations(destination);
		List<Mission> ListResult;
		isStarsearch = false;
		isEmpty = false;	
		if ((titre != null && !"".equals(titre))|| debut != null || fin != null||  typemission.getIdType()!= 0 ||destination.getVillebean().getIdVille() != 0 || destination.getEntitebean().getIdEntite() != 0 ) {
			ListResult = missionService.listMissionByDebut(mission);
				if (ListResult != null && ListResult.size() != 0) {
					isStarsearch = true;
					isEmpty = false;
					this.missionList = ListResult;
				} else {
					isEmpty = true;
					isStarsearch = true;
					this.missionVide = "pas de resultat";
				}
		}
		else{
			isStarsearch = true;
			isEmpty = false;
			ListResult =  missionService.listMission();
			this.missionList = ListResult;
		}
		return "Recherche";

	}

	public void supprimerMission() {
		Mission m = (Mission) missionTable.getRowData();// <forme> , binding
		missionService.deleteMission(m);
		chercherMission();
	}

	
	
	public String	chargerMission(){
		isSave = false;
		Mission m = (Mission) missionTable.getRowData();
		this.idMission = m.getIdMission();
		this.titre = m.getTitre();
		this.debut = m.getDebut();
		this.fin =  m.getFin();
		this.objet = m.getObjet();
		this.etat = m.getEtat();
		this.detail = m.getDetail();
		
		return "EditView";
		
	}
	
	public String editerMission(){
		Mission mission = new Mission();
		mission.setIdMission(idMission);
		mission.setTitre(this.titre);
		mission.setDebut(this.debut);
		mission.setFin(this.fin);
		mission.setObjet(this.objet);
		mission.setEtat(this.etat);
		mission.setDetail(this.detail);

		missionService.updateMission(mission);
		return "LoginOK_Client";
	}
	
	public String consulterMission(){
		Mission m = (Mission) missionTable.getRowData();

		this.titre = m.getTitre();
		this.debut = m.getDebut();
		this.fin =  m.getFin();
		this.objet = m.getObjet();
		this.etat = m.getEtat();
		this.detail = m.getDetail();
		return "ConsulterView";
	}
	
	

	
	
	// -------------------------------------getters &
	// setters---------------------------------------
	
	
	public boolean isAfficheTable() {
		return afficheTable;
	}

	public void setAfficheTable(boolean afficheTable) {
		this.afficheTable = afficheTable;
	}

	public int getIdMission() {
		return idMission;
	}

	public void setIdMission(int idMission) {
		this.idMission = idMission;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public MissionService getMissionService() {
		return missionService;
	}

	public void setMissionService(MissionService missionService) {
		this.missionService = missionService;
	}

	public DestinationBean getDestination() {
		return destination;
	}

	public void setDestination(DestinationBean destination) {
		this.destination = destination;
	}

	public MembreEquipeBean getMembre() {
		return membre;
	}

	public void setMembre(MembreEquipeBean membre) {
		this.membre = membre;
	}

	public TypeMissionBean getType() {
		return type;
	}

	public void setType(TypeMissionBean type) {
		this.type = type;
	}

	public List<Mission> getMissionList() {
		return missionList;
	}

	public void setMissionList(List<Mission> missionList) {
		this.missionList = missionList;
	}

	public HtmlDataTable getMissionTable() {
		return missionTable;
	}

	public void setMissionTable(HtmlDataTable missionTable) {
		this.missionTable = missionTable;
	}

	public String getMissionVide() {
		return missionVide;
	}

	public void setMissionVide(String missionVide) {
		this.missionVide = missionVide;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Boolean getIsStarsearch() {
		return isStarsearch;
	}

	public void setIsStarsearch(Boolean isStarsearch) {
		this.isStarsearch = isStarsearch;
	}

	public Boolean getIsEmpty() {
		return isEmpty;
	}

	public void setIsEmpty(Boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public Boolean getIsSave() {
		return isSave;
	}

	public void setIsSave(Boolean isSave) {
		this.isSave = isSave;
	}

}
