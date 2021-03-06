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
 * Destination generated by hbm2java
 */
@Entity
@Table(name = "destination", catalog = "siig")
public class Destination implements java.io.Serializable {

	private Integer idDestination;
	private Entite entite;
	private Ville ville;
	private Mission mission;
	private String description;

	public Destination() {
	}

	public Destination(Mission mission) {
		this.mission = mission;
	}

	public Destination(Entite entite, Ville ville, Mission mission,
			String description) {
		this.entite = entite;
		this.ville = ville;
		this.mission = mission;
		this.description = description;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idDestination", unique = true, nullable = false)
	public Integer getIdDestination() {
		return this.idDestination;
	}

	public void setIdDestination(Integer idDestination) {
		this.idDestination = idDestination;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEntite")
	public Entite getEntite() {
		return this.entite;
	}

	public void setEntite(Entite entite) {
		this.entite = entite;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVille")
	public Ville getVille() {
		return this.ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMission", nullable = false)
	public Mission getMission() {
		return this.mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
