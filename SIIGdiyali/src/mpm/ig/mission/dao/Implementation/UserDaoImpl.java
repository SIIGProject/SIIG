package mpm.ig.mission.dao.Implementation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.UserDao;
import mpm.ig.mission.model.User;

@Repository("UserDao")
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public User findUser(User user) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from user u where u.idUser = "+user.getIdUser());
		if(query.list().size() == 0)
			return null;
		else
			return (User) query.list().get(0);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findById(User user){
		Query query =  sessionFactory.getCurrentSession().createQuery("from User u where u.idUser = "+user.getIdUser());
		if(query.list().size() == 0)
			return null;
		else
			return query.list();
	}

	@Override
	public void saveUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public void deleteUser(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	public void updateUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From User").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public User findByCin(User user) {
		User us = new User();
		Query query = sessionFactory.getCurrentSession().createQuery("from User u where u.cin ='"+user.getCin()+"'");
		Iterator<Query> res = query.iterate();
		while(res.hasNext()){
			 us = (User) res.next();
		}
		return us;			 
	}

}
