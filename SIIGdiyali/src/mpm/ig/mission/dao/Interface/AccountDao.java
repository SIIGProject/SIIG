package mpm.ig.mission.dao.Interface;

import java.util.List;

import mpm.ig.mission.model.Account;

public interface AccountDao {
	public Account findAccount(Account account);
	public void saveAccount(Account account);
	public void deleteAccount(Account account);
	public void updateAccount(Account account);
	public List<Account> findAll();

}
