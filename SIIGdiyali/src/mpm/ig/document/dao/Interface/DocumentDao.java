package mpm.ig.document.dao.Interface;
import java.util.List;

import mpm.ig.mission.model.Document;
import mpm.ig.mission.model.Soustypedoc;
import mpm.ig.mission.model.Typedoc;

public interface DocumentDao {
	
	public void saveDocument(Document document);
	
	public List<Document> findDocument(Document document);
		
	public List<Document> FindAllDocument();
	
	public List<Typedoc> uploadType();
	
	public List<Soustypedoc> uploadSousTypes();
	
	public void updateDocument(Document document);
	
	public void deleteDocument(Document document);
}
