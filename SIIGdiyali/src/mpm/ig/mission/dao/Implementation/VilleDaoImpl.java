package mpm.ig.mission.dao.Implementation;

import java.util.List;

import mpm.ig.mission.dao.Interface.VilleDao;
import mpm.ig.mission.model.Ville;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("VilleDaoRepository")
@Transactional
public class VilleDaoImpl implements VilleDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public Ville findVille(Ville ville) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from Ville v where v.idVille = "+ville.getIdVille());
		if(query.list().size() == 0)
			return null;
		else
			return (Ville) query.list().get(0);
	}

	@Override
	public void saveVille(Ville ville) {
		sessionFactory.getCurrentSession().saveOrUpdate(ville);
	}

	@Override
	public void deleteVille(Ville ville) {
		sessionFactory.getCurrentSession().delete(ville);
	}

	@Override
	public void updateVille(Ville ville) {
		sessionFactory.getCurrentSession().saveOrUpdate(ville);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ville> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Ville").list();
	}

}
