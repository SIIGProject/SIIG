package mpm.ig.mission.dao.Implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.TypePJDao;
import mpm.ig.mission.model.Typepj;

@Repository("TypePJDaoRepository")
@Transactional
public class TypepjDaoImpl implements TypePJDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Typepj> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Typepj").list();
	}

}