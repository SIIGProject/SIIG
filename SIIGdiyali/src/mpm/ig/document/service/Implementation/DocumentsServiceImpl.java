package mpm.ig.document.service.Implementation;

import java.util.List;

import mpm.ig.document.dao.Interface.DocumentDao;
import mpm.ig.document.service.Interface.DocumentService;
import mpm.ig.mission.model.Document;
import mpm.ig.mission.model.Soustypedoc;
import mpm.ig.mission.model.Typedoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("documentsService")
public class DocumentsServiceImpl implements DocumentService {

	@Autowired
	DocumentDao documentDao;

	@Override
	public void enregistrerDoc(Document document) {
		
		documentDao.saveDocument(document);
	}
	
	public List<Typedoc> uploadTypes(){
		return documentDao.uploadType();
	}
	
	@Override
	public List<Soustypedoc> uploadSousTypes()
	{
		return documentDao.uploadSousTypes();
	}
	
	@Override
	public List<Document> chercherDocument(Document document){
		return documentDao.findDocument(document);
	}
	
	@Override
	public List<Document> chercherToutDocument(){
		return documentDao.FindAllDocument();

	}

}
