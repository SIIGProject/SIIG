package mpm.ig.document.service.Interface;


import java.util.List;

import mpm.ig.mission.model.Document;
import mpm.ig.mission.model.Soustypedoc;
import mpm.ig.mission.model.Typedoc;

public interface DocumentService {
	
	// Ajouter un nouveau document à la base de donnée
	public void enregistrerDoc(Document document);

	public List<Typedoc> uploadTypes();
	
	public List<Soustypedoc> uploadSousTypes();
	
	public List<Document> chercherDocument(Document document);
	
	public List<Document> chercherToutDocument();

}
