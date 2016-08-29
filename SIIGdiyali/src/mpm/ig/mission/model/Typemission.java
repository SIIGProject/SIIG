package mpm.ig.mission.model;

// Generated 25 ao�t 2016 12:36:11 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Typemission generated by hbm2java
 */
@Entity
@Table(name = "typemission", catalog = "siig")
public class Typemission implements java.io.Serializable {

	private Integer idType;
	private String type;
	private String description;
	private Set<Mission> missions = new HashSet<Mission>(0);

	public Typemission() {
	}
	
	public Typemission(int idType)
	{
		this.idType = idType;
	}

	public Typemission(String type, String description, Set<Mission> missions) {
		this.type = type;
		this.description = description;
		this.missions = missions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idType", unique = true, nullable = false)
	public Integer getIdType() {
		return this.idType;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	@Column(name = "type", length = 254)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typemission")
	public Set<Mission> getMissions() {
		return this.missions;
	}

	public void setMissions(Set<Mission> missions) {
		this.missions = missions;
	}

}
