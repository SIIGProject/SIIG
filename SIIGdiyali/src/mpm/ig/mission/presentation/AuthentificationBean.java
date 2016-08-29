package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import mpm.ig.mission.model.Account;
import mpm.ig.mission.model.User;
import mpm.ig.mission.service.Interface.AuthentificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("authentificationBean")
@Scope("session")
public class AuthentificationBean implements Serializable {
	
private static final long serialVersionUID = 1L;
String login ;
String password;
//	String login = null;
//	String password = null;
	static int idUtilistateur;
	// Service Auto-Injected
	@Autowired
	AuthentificationService authentificationService;
	
	List<User> listUtilisateur = new ArrayList<User>();
	
	
	public AuthentificationBean() {
		super();
		//utilisateur.setLogin("adilooo");
		//utilisateur.setPassword("azqswx");
	}
	
	@PostConstruct
	public void init(){
		clear();

		// listUtilisateur = authentificationService.listUser();
	}
	
	public void clear(){
		this.login = null;
		this.password = null;
		
	}
	
	
	// On v�rifie si admin ou client simple pour le rediriger vers l'espace convenable :
	public String Authentifier() {
		Account account = new Account();
		account.setLogin(this.login);
		account.setPw(this.password);
//		if(authentificationService.authenticateUser(account) != null){
//			account = authentificationService.authenticateUser(account);
//			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", user);
//			if(user.getStatut().equals("administrateur")){
//				return "LoginOK_Admin";
//			}else
			
			// statique just pour la pr�sentation
			if(this.login != null && this.password != null){
				return "oui" ;
//			}
//				return "LoginOK_Client";
		}
		else{
			return "non" ;
//			return "LoginNO";
			}
	}
//
//	public String Deconnexion() {
	//	utilisateur = new Utilisateur();
	//	((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true)).invalidate();
		
//		return "userDeconnect";
//		
//	}
//
//	public String ajouterUtilisateur(){
//		if(utilisateur.getPassword().equals(confirmPassword)){
//			utilisateur.setStatut("client");
//			utilisateur = authentificationService.inscrirUtilisateur(utilisateur);
//			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", utilisateur);
//			return "userAddedSuccess";
//		}
//		else
//			return "userAddedFailure";
//	}
//	public String modiferUtilisateur() {
//		administrationService.enregistrerAdministrateur(utilisateur); 
//		return "userModifiedSuccess";
//	}
//	public String ajouterAdministrateur(){
//		if(utilisateur.getPassword().equals(confirmPassword)){
//			utilisateur.setStatut("administrateur");
//			authentificationService.inscrirUtilisateur(utilisateur);
//			return "userAddedSuccess";
//		}
//		else
//			return "userAddedFailure";
//	}
//	// Getter & Setter
//	public Utilisateur getUtilisateur() {
//		return utilisateur;
//	}
//
//	public void setUtilisateur(Utilisateur utilisateur) {
//		this.utilisateur = utilisateur;
//	}
//
//	public String getConfirmPassword() {
//		return confirmPassword;
//	}
//
//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}
//
//	public List<Utilisateur> getListUtilisateur() {
//		return listUtilisateur;
//	}
//
//	public void setListUtilisateur(List<Utilisateur> listUtilisateur) {
//		this.listUtilisateur = listUtilisateur;
//	}
//
//	public static int getIdUtilistateur() {
//		return idUtilistateur;
//	}
//
//	public static void setIdUtilistateur(int idUtilistateur) {
//		UtilisateurController.idUtilistateur = idUtilistateur;
//	}
//	
//

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static int getIdUtilistateur() {
		return idUtilistateur;
	}

	public static void setIdUtilistateur(int idUtilistateur) {
		AuthentificationBean.idUtilistateur = idUtilistateur;
	}

	public AuthentificationService getAuthentificationService() {
		return authentificationService;
	}

	public void setAuthentificationService(
			AuthentificationService authentificationService) {
		this.authentificationService = authentificationService;
	}

	public List<User> getListUtilisateur() {
		return listUtilisateur;
	}

	public void setListUtilisateur(List<User> listUtilisateur) {
		this.listUtilisateur = listUtilisateur;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}













