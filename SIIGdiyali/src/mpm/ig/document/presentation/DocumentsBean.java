package mpm.ig.document.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.model.SelectItem;

import mpm.ig.document.service.Interface.DocumentService;
import mpm.ig.mission.model.Document;
import mpm.ig.mission.model.Soustypedoc;
import mpm.ig.mission.model.Typedoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("docsBean")
@Scope("session")
public class DocumentsBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idDoc;
	private String titre;
	private Date debut = new Date();
	private String description;
	private int idSousType;
	private Typedoc typedoc;
	
	

	public Typedoc getTypedoc() {
		return typedoc;
	}

	public void setTypedoc(Typedoc typedoc) {
		this.typedoc = typedoc;
	}

	private byte[] doc;
	List<SelectItem> mesTypes = new ArrayList<SelectItem>();
	List<SelectItem> mesSousTypes = new ArrayList<SelectItem>();
	
	private HtmlDataTable documentTable;
	private String documentVide;
	List<Document> documentList ;
	SoustypedocBean childSoustypedocBean = new SoustypedocBean();
	boolean afficheTable = false;
	private Boolean isStartsearch = false;
	private Boolean isEmpty = false;
	//private Boolean isSave = true;
	
	@Autowired
	DocumentService documentService;

	public DocumentsBean() {
		super();
	}
	
	////////////////////////////Ajouter Documment
	
	public String ajouterArchives()
	{
		//childSoustypedocBean.getListItemsSousTypes();
		return "AjouterArchives";
	}
	
	public String ajouterRessources()
	{
		return "AjouterRessources";
	}
	
	public String ajouterModeles()
	{
		return "AjouterModeles";
	}
	
	////////////////////////////Consulter Documment
	
	public String chercherAr()
	{
		Document document = new Document();
		Soustypedoc Soustypedoc = new Soustypedoc();
		document.setTitre(titre);
		document.setDateAjout(debut);
		document.setDescription(description);
		document.setSoustypedoc(Soustypedoc);
		//List<Document> ListResult;
		isStartsearch = false;
		isEmpty = false;
		/*
		if((titre != null && !"".equals(titre)) || debut != null || description != null || typedoc.getIdType() != 0)
		{
			ListResult = documentService;
		}*/
		
		return "RechercheDocAr";
	}
	
	public String chercherRes() {
		return "RechercheDocRes";
	}
	
	public String chercherMod() {
		return "RechercheDocMod";
	}
	
	@PostConstruct
	public void init() {
		//MesTypes();
		//MesSousTypes();
		//childSoustypedocBean.getListItemsSousTypes();
	}

	public String enregistrerDoc()
	{
		Document document = new Document();
		Soustypedoc Soustypedoc = new Soustypedoc(idSousType);
		
	//	document.setIdDoc(idDoc);
		document.setTitre(this.titre);
		document.setDateAjout(this.debut);
		document.setDescription(this.description);
		document.setDoc(this.doc);
		document.setSoustypedoc(Soustypedoc);

		if (documentService != null)
		{
			documentService.enregistrerDoc(document);
			return "LoginOK_Client";
		}else
		{
			return "LoginNO";
		}
	}
	
	/////////////////////// TYPEs DOCs ///////////////////////
	/*
	public List<Typedoc> chargerTypes()
	{
		List<Typedoc> types = documentService.uploadTypes();
		return types;
	}
	
	public List<SelectItem> MesTypes()
	{
		//String first = "--- Type ---";
		//mesTypes.add(new SelectItem(first));
		List<Typedoc> l = chargerTypes();
		for (Typedoc type : l) {
			mesTypes.add(new SelectItem(type.getIdType(), type.getLibelle()));
		}
		return mesTypes;
	}
	*/
	/////////////////////// SOUS TYPEs DOCs ///////////////////////
	
	public List<Soustypedoc> chargerSousTypes()
	{
		List<Soustypedoc> soustypes = documentService.uploadSousTypes();
		return soustypes;
	}
	
	public List<SelectItem> MesSousTypes()
	{
		//String first = "--- Type ---";
		//mesTypes.add(new SelectItem(first));
		List<Soustypedoc> l = chargerSousTypes();
		for (Soustypedoc soustype : l) {
			mesSousTypes.add(new SelectItem(soustype.getIdSousType(), soustype.getLibelle()));
		}
		return mesSousTypes;
	}
	
	public String chercherDocument(){
		Document document = new Document();
		Soustypedoc Soustypedoc = new Soustypedoc(idSousType, typedoc);
		List<Document> ListResult;

		document.setTitre(titre);
		document.setDateAjout(debut);
		document.setSoustypedoc(Soustypedoc);
		if((titre != null && titre != "") || debut != null || idSousType != 0){
			ListResult=documentService.chercherDocument(document);
			if (ListResult != null && ListResult.size() != 0) {
				isStartsearch = true;
				isEmpty = false;
				this.documentList = ListResult;
			}
			else {
				isEmpty = true;
				isStartsearch = true;
				this.setDocumentVide("pas de resultat");
			}
		}
		else{
			isStartsearch = true;
			isEmpty = false;		
		this.documentList=documentService.chercherToutDocument();
		}
		return "RechercheDoc";
	}
	
	
	
	
	
	// -------------------------------------getters &
	// setters---------------------------------------

	public int getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getDoc() {
		return doc;
	}

	public void setDoc(byte[] doc) {
		this.doc = doc;
	}

	public List<SelectItem> getMesTypes() {
		return mesTypes;
	}

	public void setMesTypes(List<SelectItem> mesTypes) {
		this.mesTypes = mesTypes;
	}

	public String getDocumentVide() {
		return documentVide;
	}

	public void setDocumentVide(String documentVide) {
		this.documentVide = documentVide;
	}

	public HtmlDataTable getDocumentTable() {
		return documentTable;
	}

	public void setDocumentTable(HtmlDataTable documentTable) {
		this.documentTable = documentTable;
	}

	public boolean isStartSearch() {
		return isStartsearch;
	}

	public void setStartSearch(boolean starSearch) {
		this.isStartsearch = starSearch;
	}

	public boolean isEmpTy() {
		return isEmpty;
	}

	public void setEmpTy(boolean empty) {
		this.isEmpty = empty;
	}

	public List<Document> getDocumentList() {
		return documentList;
	}

	public void setDocumentList(List<Document> documentList) {
		this.documentList = documentList;
	}
	
	public int getIdSousType() {
		return idSousType;
	}

	public void setIdSousType(int idSousType) {
		this.idSousType = idSousType;
	}








}
