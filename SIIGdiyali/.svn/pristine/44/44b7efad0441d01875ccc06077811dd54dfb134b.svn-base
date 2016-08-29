package mpm.ig.mission.dao.Implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.TypemissionDao;
import mpm.ig.mission.model.Typemission;

@Repository("TypemissionDaoRepository")
@Transactional
public class TypemissionDaoImpl implements TypemissionDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public Typemission findTypemission(Typemission typemission) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from typemission t where t.idType = "+typemission.getIdType());
		if(query.list().size() == 0)
			return null;
		else
			return (Typemission) query.list().get(0);
	}

	@Override
	public void saveTypemission(Typemission typemission) {
		sessionFactory.getCurrentSession().saveOrUpdate(typemission);
	}

	@Override
	public void deleteTypemission(Typemission typemission) {
		sessionFactory.getCurrentSession().delete(typemission);
	}

	@Override
	public void updateTypemission(Typemission typemission) {
		sessionFactory.getCurrentSession().saveOrUpdate(typemission);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Typemission> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Typemission").list();
	}

}
