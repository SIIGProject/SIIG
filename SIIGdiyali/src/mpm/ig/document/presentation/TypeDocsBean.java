package mpm.ig.document.presentation;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import mpm.ig.document.service.Interface.TypeDocService;
import mpm.ig.mission.model.Typedoc;
import mpm.ig.mission.model.Typemission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("typeDocsBean")
@Scope("session")
public class TypeDocsBean implements Serializable {

	private static final long serialVersionUID = 1L;

	int idType;
	private String libelle;
	private String description;
	private List<Typemission> typeListe;
	
	// Service Auto-injected
	@Autowired
	TypeDocService typeService;
	
	// Constructor
		public TypeDocsBean() {
			super();
		}
		
	/////////////////////////////////////// INIT ///////////////////////////////////////
	@PostConstruct
	public void init(){}
	
	
	public String ajouterType() {

		Typedoc type = new Typedoc();
		type.setIdType(idType);
		type.setLibelle(this.libelle);
		type.setDescription(this.description);

		if (typeService != null) {
			typeService.addType(type);
			return "LoginOK_Client";
		} else {
			return "LoginNO";
		}

	}

	// -------------------------------------getters &
	// setters---------------------------------------

	public TypeDocService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeDocService typeService) {
		this.typeService = typeService;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public List<Typemission> getTypeListe() {
		return typeListe;
	}

	public void setTypeListe(List<Typemission> typeListe) {
		this.typeListe = typeListe;
	}

}
