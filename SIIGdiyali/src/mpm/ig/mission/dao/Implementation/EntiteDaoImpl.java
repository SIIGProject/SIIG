package mpm.ig.mission.dao.Implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.EntiteDao;
import mpm.ig.mission.model.Entite;
import mpm.ig.mission.model.Ville;

@Repository("EntiteDaoRepository")
@Transactional
public class EntiteDaoImpl implements EntiteDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Entite findEntite(Entite entite) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from entite e where e.idEntite = "+entite.getIdEntite());
		if(query.list().size() == 0)
			return null;
		else
			return (Entite) query.list().get(0);
	}

	@Override
	public void saveEntite(Entite entite) {
		sessionFactory.getCurrentSession().saveOrUpdate(entite);
	}

	@Override
	public void deleteEntite(Entite entite) {
		sessionFactory.getCurrentSession().delete(entite);
	}

	@Override
	public void updateEntite(Entite entite) {
		sessionFactory.getCurrentSession().saveOrUpdate(entite);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Entite> findAllVille(Ville ville) {
		return sessionFactory.getCurrentSession().createQuery("From Entite E where E.ville = "+ville).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Entite> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Entite").list();
	}

}
