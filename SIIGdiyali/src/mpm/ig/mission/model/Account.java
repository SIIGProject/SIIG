package mpm.ig.mission.model;

// Generated 25 ao�t 2016 12:36:11 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account", catalog = "siig")
public class Account implements java.io.Serializable {

	private Integer idAccount;
	private Profil profil;
	private User user;
	private String login;
	private String pw;

	public Account() {
	}

	public Account(Profil profil, User user) {
		this.profil = profil;
		this.user = user;
	}

	public Account(Profil profil, User user, String login, String pw) {
		this.profil = profil;
		this.user = user;
		this.login = login;
		this.pw = pw;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idAccount", unique = true, nullable = false)
	public Integer getIdAccount() {
		return this.idAccount;
	}

	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idP", nullable = false)
	public Profil getProfil() {
		return this.profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "login", length = 254)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "pw", length = 254)
	public String getPw() {
		return this.pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
