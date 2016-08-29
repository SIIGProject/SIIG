package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import mpm.ig.mission.model.User;
import mpm.ig.mission.service.Interface.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("userBean")
@Scope("session")
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;
	// Service Auto-injected
	@Autowired
	UserService userService;

	int idUser;
	private List<SelectItem> mesUsers = new ArrayList<SelectItem>();
	private List<User> userListe;
	boolean afficheTable = false;

	public UserBean() {
		super();
	}

	@PostConstruct
	public void init() {
		getListIemsUsers();
	}

	public String ajouterEntite() {

		afficheTable = true;
		User user = new User();
		user.setIdUser(this.idUser);

		if (userService != null) {
			userService.addUser(user);
			return "LoginOK_Client";
		} else {
			return "LoginNO";
		}

	}

	public List<User> getMaList() {
		List<User> liste = userService.listUser();
		return liste;
	}

	public void getListIemsUsers() {

		String first = "--- Users ---";
		this.mesUsers.add(new SelectItem(first));
		for (User val : getMaList()) {
			this.mesUsers.add(new SelectItem(val.getIdUser(), val.getNom()
					+ "\t" + val.getPrenom()));
		}
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public List<SelectItem> getMesUsers() {
		return mesUsers;
	}

	public void setMesUsers(List<SelectItem> mesUsers) {
		this.mesUsers = mesUsers;
	}

	public List<User> getUserListe() {
		return userListe;
	}

	public void setUserListe(List<User> userListe) {
		this.userListe = userListe;
	}

	public boolean isAfficheTable() {
		return afficheTable;
	}

	public void setAfficheTable(boolean afficheTable) {
		this.afficheTable = afficheTable;
	}

}
