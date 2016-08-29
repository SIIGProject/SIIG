package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.html.HtmlDataTable;

import mpm.ig.mission.model.Membreequipe;
import mpm.ig.mission.model.Mission;
import mpm.ig.mission.model.User;
import mpm.ig.mission.service.Interface.MembreEquipeService;
import mpm.ig.mission.service.Interface.MissionService;
import mpm.ig.mission.service.Interface.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("membreequipeBean")
@Scope("session")
public class MembreEquipeBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// Service Auto-injected
	@Autowired
	MembreEquipeService membreequipeService;
	@Autowired
	UserService userservice;
	@Autowired
	MissionService missionService;

	int idMembre;
	int idUser;
	private String fonction;
	private boolean afficheTable = false;
	private HtmlDataTable userTable;
	private List<User> userList;
	UserBean userbean = new UserBean();

	// Constructor
	public MembreEquipeBean() {
		super();
	}

	@PostConstruct
	public void init() {

	}

	public String ajouterMembre() {
		Membreequipe membre = new Membreequipe();
		// User u = new User();
		// u.setIdUser(idUser);
		// membre.setUser(u);
		// userList = membreService.listMembreById(membre);
		Mission mission = missionService.list();
		User user = new User(idUser);
		membre.setIdMe(idMembre);
		membre.setFonction(this.getFonction());
		membre.setUser(user);
		membre.setMission(mission);
		if (membreequipeService != null) {
			// afficheTable = true;
			membreequipeService.addMembre(membre);
			return "OK";
		} else {
			return "Non";
		}

	}

	public int getIdMembre() {
		return idMembre;
	}

	public void setIdMembre(int idMembre) {
		this.idMembre = idMembre;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public MembreEquipeService getMembreequipeService() {
		return membreequipeService;
	}

	public void setMembreequipeService(MembreEquipeService membreequipeService) {
		this.membreequipeService = membreequipeService;
	}

	public UserBean getUser() {
		return userbean;
	}

	public void setUser(UserBean userbean) {
		this.userbean = userbean;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public boolean isAfficheTable() {
		return afficheTable;
	}

	public void setAfficheTable(boolean afficheTable) {
		this.afficheTable = afficheTable;
	}

	public HtmlDataTable getUserTable() {
		return userTable;
	}

	public void setUserTable(HtmlDataTable userTable) {
		this.userTable = userTable;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
