package mpm.ig.mission.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import mpm.ig.mission.model.Typemission;
import mpm.ig.mission.model.Typepj;
import mpm.ig.mission.service.Interface.TypepjService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("typepjBean")
@Scope("session")
public class TypepjBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// Service Auto-injected
	@Autowired
	TypepjService typepjService;

	private int idType;
	private String type;
	private String description;
	private List<SelectItem> mesTypes = new ArrayList<SelectItem>();
	private List<Typemission> typeListe;

	public TypepjBean() {
		super();
	}

	@PostConstruct
	public void init() {
		getListIemsType();
	}

	public List<Typepj> getMaList() {
		List<Typepj> liste = typepjService.listTypepj();
		return liste;
	}

	public void getListIemsType() {

//		String first = "--- Type pièce jointe ---";
//		this.mesTypes.add(new SelectItem(first));
		for (Typepj val : getMaList()) {
			this.mesTypes.add(new SelectItem(val.getIdType(), val.getType()));
		}
	}

	// -------------------------------------getters &
	// setters---------------------------------------

	public TypepjService getTypepjservice() {
		return typepjService;
	}

	public void setTypepjservice(TypepjService typepjservice) {
		this.typepjService = typepjservice;
	}

	public int getIdType() {
		return idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SelectItem> getMesTypes() {
		return mesTypes;
	}

	public void setMesTypes(List<SelectItem> mesTypes) {
		this.mesTypes = mesTypes;
	}

	public List<Typemission> getTypeListe() {
		return typeListe;
	}

	public void setTypeListe(List<Typemission> typeListe) {
		this.typeListe = typeListe;
	}

}
