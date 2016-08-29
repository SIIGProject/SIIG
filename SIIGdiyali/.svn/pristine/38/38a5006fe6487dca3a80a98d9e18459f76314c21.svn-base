package mpm.ig.mission.dao.Implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.ProfilDao;
import mpm.ig.mission.model.Profil;

@Repository("ProfilDaoRepository")
@Transactional
public class ProfilDaoImpl implements ProfilDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Profil findProfil(Profil profil) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from profil p where p.idP = "+profil.getIdP());
		if(query.list().size() == 0)
			return null;
		else
			return (Profil) query.list().get(0);
	}

	@Override
	public void saveProfil(Profil profil) {
		sessionFactory.getCurrentSession().saveOrUpdate(profil);
	}

	@Override
	public void deleteProfil(Profil profil) {
		sessionFactory.getCurrentSession().delete(profil);
	}

	@Override
	public void updateProfil(Profil profil) {
		sessionFactory.getCurrentSession().saveOrUpdate(profil);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Profil> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Profil").list();
	}

}
