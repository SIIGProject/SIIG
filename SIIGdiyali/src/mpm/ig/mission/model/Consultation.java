package mpm.ig.mission.model;

// Generated 25 ao�t 2016 12:36:11 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Consultation generated by hbm2java
 */
@Entity
@Table(name = "consultation", catalog = "siig")
public class Consultation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idConsultation;
	private User user;
	private Document document;
	private Date dateConsultation;

	public Consultation() {
	}

	public Consultation(User user, Document document) {
		this.user = user;
		this.document = document;
	}

	public Consultation(User user, Document document, Date dateConsultation) {
		this.user = user;
		this.document = document;
		this.dateConsultation = dateConsultation;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idConsultation", unique = true, nullable = false)
	public Integer getIdConsultation() {
		return this.idConsultation;
	}

	public void setIdConsultation(Integer idConsultation) {
		this.idConsultation = idConsultation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDoc", nullable = false)
	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateConsultation", length = 10)
	public Date getDateConsultation() {
		return this.dateConsultation;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

}
