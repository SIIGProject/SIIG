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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Soustypedoc generated by hbm2java
 */
@Entity
@Table(name = "soustypedoc", catalog = "siig")
public class Soustypedoc implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idSousType;
	private Typedoc typedoc;
	private String libelle;
	
	private Set<Document> documents = new HashSet<Document>(0);

	public Soustypedoc() {
	}
	
	public Soustypedoc(int idSousType) {
		this.idSousType = idSousType;
	}
	public Soustypedoc(int idSousType ,Typedoc typedoc) {
		this.idSousType = idSousType;
		this.typedoc = typedoc;
	}

	public Soustypedoc(Typedoc typedoc, String libelle, Set<Document> documents) {
		this.typedoc = typedoc;
		this.libelle = libelle;
		this.documents = documents;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idSousType", unique = true, nullable = false)
	public Integer getIdSousType() {
		return this.idSousType;
	}

	public void setIdSousType(Integer idSousType) {
		this.idSousType = idSousType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idType", nullable = false)
	public Typedoc getTypedoc() {
		return this.typedoc;
	}

	public void setTypedoc(Typedoc typedoc) {
		this.typedoc = typedoc;
	}

	@Column(name = "libelle", length = 254)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "soustypedoc")
	public Set<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

}