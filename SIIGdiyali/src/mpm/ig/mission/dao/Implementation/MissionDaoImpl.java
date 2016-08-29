package mpm.ig.mission.dao.Implementation;

import java.util.Iterator;
import java.util.List;

import mpm.ig.mission.dao.Interface.MissionDao;
import mpm.ig.mission.model.Mission;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("MissionDaoRepository")
@Transactional
public class MissionDaoImpl implements MissionDao {

	@Autowired
	private SessionFactory sessionFactory;


	@SuppressWarnings("unchecked")
	@Override
	public List<Mission> findMission(Mission mission) {
		
		boolean premiereClause = true;
		StringBuffer requete = new StringBuffer("from Mission m where ");
		List<Mission> result;
		
		if (mission.getTitre() != null && mission.getTitre() != "") {
			requete.append("m.titre = '" + mission.getTitre() + "'");
			requete.append(premiereClause ? " " : " and ");
			 premiereClause = false;
		}
		
		if (mission.getDebut() != null) {
			requete.append(premiereClause ? " " : " and ");
			requete.append("m.debut = ?");
			 premiereClause = false;
		}
		if (mission.getFin() != null) {
			requete.append(premiereClause ? " " : " and ");
			requete.append("m.fin = ?");
			 premiereClause = false;
		}
		
		String requeteHql = requete.toString();
		
		if(requeteHql.contains("m.debut")){
			if(requeteHql.contains("m.fin")){
				result= sessionFactory.getCurrentSession().createQuery(requeteHql).setParameter(1, mission.getFin()).setParameter(0, mission.getDebut()).list();
			}
			else{
				result= sessionFactory.getCurrentSession().createQuery(requeteHql).setParameter(0, mission.getDebut()).list();
			}
		}
		else{
			if(requeteHql.contains("m.fin")){
				result= sessionFactory.getCurrentSession().createQuery(requeteHql).setParameter(0, mission.getFin()).list();
			}
			else{
				result= sessionFactory.getCurrentSession().createQuery(requeteHql).list();	
			}
		}
		return result;		
	}



	@Override
	public void saveMission(Mission mission) {
		sessionFactory.getCurrentSession().saveOrUpdate(mission);
	}

	@Override
	public void deleteMission(Mission mission) {
		sessionFactory.getCurrentSession().delete(mission);
		System.out.println("après requete");
	}

	@Override
	public void updateMission(Mission mission) {
		sessionFactory.getCurrentSession().saveOrUpdate(mission);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mission> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Mission").list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Mission find() {
		Mission m = new Mission();
		Query query = sessionFactory.getCurrentSession().createQuery("FROM Mission m where m.idMission = (SELECT MAX(idMission) FROM Mission)");
		
		Iterator<Query> res = query.iterate();
		while(res.hasNext()){
			m = (Mission) res.next();
		}
		 return m;
	}

}














