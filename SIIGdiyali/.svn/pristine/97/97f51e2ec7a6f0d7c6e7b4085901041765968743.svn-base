package mpm.ig.mission.dao.Implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.MissionpjDao;
import mpm.ig.mission.model.Missionpj;

@Repository("MissionpjDaoRepository")
@Transactional
public class MissionpjDaoImpl implements MissionpjDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Missionpj findMissionpj(Missionpj missionpj) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from missionpj pj where pj.idPj = "+missionpj.getIdPj());
		if(query.list().size() == 0)
			return null;
		else
			return (Missionpj) query.list().get(0);
	}

	@Override
	public void saveMissionpj(Missionpj missionpj) {
		sessionFactory.getCurrentSession().saveOrUpdate(missionpj);
	}

	@Override
	public void deleteMissionpj(Missionpj missionpj) {
		sessionFactory.getCurrentSession().delete(missionpj);
	}

	@Override
	public void updateMissionpj(Missionpj missionpj) {
		sessionFactory.getCurrentSession().saveOrUpdate(missionpj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Missionpj> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Missionpj").list();
	}

}
