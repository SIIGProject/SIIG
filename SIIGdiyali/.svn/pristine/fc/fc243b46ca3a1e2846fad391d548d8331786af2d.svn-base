package mpm.ig.mission.dao.Implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.DestinationDao;
import mpm.ig.mission.model.Destination;
import mpm.ig.mission.model.Mission;

@Repository("DestinationDaoRepository")
@Transactional
public class DestinationDaoImpl implements DestinationDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Destination findDestination(Destination destination) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from destination dest where dest.idDestination = "+destination.getIdDestination());
		if(query.list().size() == 0)
			return null;
		else
			return (Destination) query.list().get(0);
	}

	@Override
	public void saveDestination(Destination destination) {
		sessionFactory.getCurrentSession().saveOrUpdate(destination);
	}

	@Override
	public void deleteDestination(Destination destination) {
		sessionFactory.getCurrentSession().delete(destination);
	}

	@Override
	public void updateDestination(Destination destination) {
		sessionFactory.getCurrentSession().saveOrUpdate(destination);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Destination> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Destination").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Destination> findAllMission(Mission mission) {
		return sessionFactory.getCurrentSession().createQuery("From Destination D where D.relaismission.idMission = "+mission.getIdMission()).list();
	}

}
