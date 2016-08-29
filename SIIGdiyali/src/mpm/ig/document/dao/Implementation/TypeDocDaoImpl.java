package mpm.ig.document.dao.Implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.document.dao.Interface.TypeDocDao;
import mpm.ig.mission.model.Typedoc;

@Repository("TypedocDaoRepository1")
@Transactional

@SuppressWarnings("unchecked")
public class TypeDocDaoImpl implements TypeDocDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Typedoc findTypedoc(Typedoc typedoc) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from TypeDoc t where t.idType = "+typedoc.getIdType());
		if(query.list().size() == 0)
			return null;
		else
			return (Typedoc) query.list().get(0);
		
	}

	@Override
	public void saveTypeDoc(Typedoc typedoc) {
		sessionFactory.getCurrentSession().saveOrUpdate(typedoc);
	}

	@Override
	public void deleteTypeDoc(Typedoc typedoc) {
		sessionFactory.getCurrentSession().delete(typedoc);
	}

	@Override
	public void updateTypeDoc(Typedoc typedoc) {
		sessionFactory.getCurrentSession().update(typedoc);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Typedoc> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From typedoc").list();
	}

}
