package mpm.ig.mission.dao.Implementation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mpm.ig.mission.dao.Interface.AccountDao;
import mpm.ig.mission.model.Account;

@Repository("AccountDaoRepository")
@Transactional
public class AccountDaoImpl implements AccountDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Account findAccount(Account account) {
		Query query =  sessionFactory.getCurrentSession().createQuery("from Account a where a.login = '"+account.getLogin()+"'and a.pw = '"+account.getPw()+"'");
		if(query.list().size() == 0)
			return null;
		else
			return (Account) query.list().get(0);
	}

	@Override
	public void saveAccount(Account account) {
		sessionFactory.getCurrentSession().saveOrUpdate(account);
	}

	@Override
	public void deleteAccount(Account account) {
		sessionFactory.getCurrentSession().delete(account);
	}

	@Override
	public void updateAccount(Account account) {
		sessionFactory.getCurrentSession().saveOrUpdate(account);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> findAll() {
		return sessionFactory.getCurrentSession().createQuery("From Account").list();
	}

}
