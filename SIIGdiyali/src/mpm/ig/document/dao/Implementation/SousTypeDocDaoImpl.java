package mpm.ig.document.dao.Implementation;

import java.util.Iterator;
import java.util.List;

import mpm.ig.document.dao.Interface.SousTypeDocDao;
import mpm.ig.mission.model.Soustypedoc;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("SousTypedocDaoRepository")
@Transactional

public class SousTypeDocDaoImpl implements SousTypeDocDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Soustypedoc findSousTypedoc(Soustypedoc soustypedoc) {
		Soustypedoc soustype = new Soustypedoc();
		Query query = sessionFactory.getCurrentSession().createQuery("FROM Soustypedoc s WHERE s.idSoustype = "+soustype.getIdSousType());
		
		Iterator<Query> res = query.iterate();
		while(res.hasNext()){
			soustype = (Soustypedoc) res.next();
		}
		 return soustype;
	}

	@Override
	public void saveSousTypeDoc(Soustypedoc soustypedoc) {
		sessionFactory.getCurrentSession().saveOrUpdate(soustypedoc);		
	}

	@Override
	public void deleteSousTypeDoc(Soustypedoc soustypedoc) {
		sessionFactory.getCurrentSession().delete(soustypedoc);		
	}

	@Override
	public void updateSousTypeDoc(Soustypedoc soustypedoc) {
		sessionFactory.getCurrentSession().saveOrUpdate(soustypedoc);		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Soustypedoc> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Soustypedoc").list();
	}

}
