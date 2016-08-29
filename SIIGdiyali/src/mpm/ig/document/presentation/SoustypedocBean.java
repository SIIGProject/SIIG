package mpm.ig.document.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import mpm.ig.document.service.Interface.SoustypedocService;
import mpm.ig.mission.model.Soustypedoc;
import mpm.ig.mission.model.Typedoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("SoustypedocBean")
@Scope("session")
public class SoustypedocBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int idSousType;
	private Typedoc typedoc;
	private String libelle;
	
	public SoustypedocBean() {
		super();
	}

	private List<SelectItem> mesSousTypes = new ArrayList<SelectItem>();
	
		// Service Auto-injected
		@Autowired
		SoustypedocService soustypeService;
		
		
		/////////////////////////////////////// INIT ///////////////////////////////////////
		@PostConstruct
		public void init() {
			getListItemsSousTypes();
		}	
		
	public List<Soustypedoc> getMaList()   ///////Hadi mafhemtch 3lach ?!!
	{
		List<Soustypedoc> liste = soustypeService.listSousType();
		return liste;
	}
	
	public void getListItemsSousTypes()
	{
		//String first = "--- SousType ---";
		//this.mesEntites.add(new SelectItem(first));
		for (Soustypedoc val : getMaList())
		{
			this.mesSousTypes.add(new SelectItem(val.getIdSousType(), val.getLibelle()));
		}
	}
	
	
	/////////////////////// GETTERS & SETTERS ///////////////////////
	
	public List<SelectItem> getMesSousTypes()
	{
		return mesSousTypes;
	}

	public void setMesSousTypes(List<SelectItem> mesSousTypes) {
		this.mesSousTypes = mesSousTypes;
	}

	public int getIdSousType() {
		return idSousType;
	}

	public void setIdSousType(int idSousType) {
		this.idSousType = idSousType;
	}

	public Typedoc getTypedoc() {
		return typedoc;
	}

	public void setTypedoc(Typedoc typedoc) {
		this.typedoc = typedoc;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Soustypedoc> chargerSousTypes()
	{
		return null;
		
	}
}
