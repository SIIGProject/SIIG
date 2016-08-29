package mpm.ig.mission.service.Implementation;

import java.util.List;

import mpm.ig.mission.dao.Interface.AccountDao;
import mpm.ig.mission.dao.Interface.UserDao;
import mpm.ig.mission.model.Account;
import mpm.ig.mission.model.User;
import mpm.ig.mission.service.Interface.AuthentificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authentificationService")

public class AuthentificationServiceImpl implements AuthentificationService {
	
	@Autowired
	AccountDao accountDao;
	UserDao userDao;

	@Override
	public Account authenticateUser(Account account) {
		return accountDao.findAccount(account);
	}

	@Override
	public void addUser(User user) {
		userDao.saveUser(user);
	}
	
	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}


	@Override
	public List<User> listUser() {
		return userDao.findAll();
	}

	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

}
