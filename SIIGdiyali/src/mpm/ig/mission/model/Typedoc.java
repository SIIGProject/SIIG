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
 * Typedoc generated by hbm2java
 */
@Entity
@Table(name = "typedoc", catalog = "siig")
public class Typedoc implements java.io.Serializable {

	private Integer idType;
	private String libelle;
	private String description;
	private Set<Soustypedoc> soustypedocs = new HashSet<Soustypedoc>(0);

	public Typedoc() {
	}

	public Typedoc(String libelle, String description,
			Set<Soustypedoc> soustypedocs) {
		this.libelle = libelle;
		this.description = description;
		this.soustypedocs = soustypedocs;
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

	@Column(name = "libelle", length = 254)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Column(name = "description", length = 254)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typedoc")
	public Set<Soustypedoc> getSoustypedocs() {
		return this.soustypedocs;
	}

	public void setSoustypedocs(Set<Soustypedoc> soustypedocs) {
		this.soustypedocs = soustypedocs;
	}

}