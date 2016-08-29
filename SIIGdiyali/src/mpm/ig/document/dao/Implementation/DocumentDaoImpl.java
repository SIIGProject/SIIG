package mpm.ig.document.dao.Implementation;

import java.util.List;
import mpm.ig.document.dao.Interface.DocumentDao;
import mpm.ig.mission.model.Document;
import mpm.ig.mission.model.Soustypedoc;
import mpm.ig.mission.model.Typedoc;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository("DocumentDaoRepository1")
@Transactional
public class DocumentDaoImpl implements DocumentDao {

	@Autowired
	private SessionFactory sessionFactory;

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Typedoc> uploadType (){
		return sessionFactory.getCurrentSession().createQuery("From Typedoc ").list();

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Soustypedoc> uploadSousTypes()
	{
		return sessionFactory.getCurrentSession().createQuery("From Soustypedoc").list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void saveDocument(Document document) {
		sessionFactory.getCurrentSession().saveOrUpdate(document);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Document> findDocument(Document document){
		boolean premiereClause = true;
		StringBuffer requete = new StringBuffer("from Document D where ");
		List result;
		
		if (document.getTitre() != null && document.getTitre() != "") {
			requete.append("D.titre = '" + document.getTitre() + "'");
			requete.append(premiereClause ? " " : " and ");
			 premiereClause = false;
		}
		/*
		if (document.getTypedoc().getIdType() != 0) {
			requete.append(premiereClause ? " " : " and ");
			requete.append("D.typedoc.idType = '" + document.getTypedoc().getIdType() + "'");
			 premiereClause = false;
		}
		*/
		if (document.getDateAjout() != null) {
			requete.append(premiereClause ? " " : " and ");
			requete.append("D.dateAjout = ?");
			 premiereClause = false;
		}
		
		String requeteHql = requete.toString();
		if(requeteHql.contains("D.dateAjout")){
			result = sessionFactory.getCurrentSession().createQuery(requeteHql).setParameter(0, document.getDateAjout()).list();
		}
		else{
			result = sessionFactory.getCurrentSession().createQuery(requeteHql).list();
		}
	
		return result ;	
	}
		

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Document> FindAllDocument(){
		return sessionFactory.getCurrentSession().createQuery("From Document").list();

	}

	@Override
	public void updateDocument(Document document) {
		sessionFactory.getCurrentSession().saveOrUpdate(document);		
	}

	@Override
	public void deleteDocument(Document document) {
		sessionFactory.getCurrentSession().delete(document);		
	}
	
}
