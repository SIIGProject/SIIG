package mpm.ig.mission.service.Interface;

import java.util.List;

import mpm.ig.mission.model.User;

public interface UserService {

	public void addUser(User user);

	public void updateUser(User user);

	public List<User> listUser();
	
	public User listUserByCin(User user);

	public void deleteUser(User user);
	
	public List<User> listUserById(User user);

}
