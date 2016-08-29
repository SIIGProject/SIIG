package mpm.ig.mission.dao.Implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.MembreequipeDao;
import mpm.ig.mission.model.Membreequipe;

@Repository("MembreequipeDaoRepository")
@Transactional

public class MembreequipeDaoImpl implements MembreequipeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Membreequipe findMembreequipe(Membreequipe membreequipe) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from membreequipe mbr where mbr.idMe = "+membreequipe.getIdMe());
		if(query.list().size() == 0)
			return null;
		else
			return (Membreequipe) query.list().get(0);
	}

	@Override
	public void saveMembreequipe(Membreequipe membreequipe) {
		sessionFactory.getCurrentSession().saveOrUpdate(membreequipe);
	}

	@Override
	public void deleteMembreequipe(Membreequipe membreequipe) {
		sessionFactory.getCurrentSession().delete(membreequipe);
	}

	@Override
	public void updateMembreequipe(Membreequipe membreequipe) {
		sessionFactory.getCurrentSession().saveOrUpdate(membreequipe);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Membreequipe> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Membreequipe").list();
	}

}
