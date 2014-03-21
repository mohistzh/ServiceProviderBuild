package me.jonathan.sp;

import java.util.List;

import me.jonathan.sp.bean.Account;
/**
 * Account Management interface
 *
 * @author 	Jonathan Zhang<br>
 *			mohistzh@gmail.com
 * @since   Mar 21, 2014
 * @version
 */
public interface AccountManagement {
	/**
	 * Retrieve all accounts
	 * @return  all accounts
	 */
	public List<Account> getAccounts();
	/**
	 * Retrieve an account by account id
	 * @param id
	 * @return an account entity
	 */
	public Account getAccountById(Integer id);
}
