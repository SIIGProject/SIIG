package mpm.ig.mission.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mpm.ig.mission.dao.Interface.UserDao;
import mpm.ig.mission.model.User;
import mpm.ig.mission.service.Interface.UserService;

@Service("userService")

public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

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
	public List<User> listUserById(User user) {
		return userDao.findById(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	@Override
	public User listUserByCin(User user) {		
		return userDao.findByCin(user);
	}

}
