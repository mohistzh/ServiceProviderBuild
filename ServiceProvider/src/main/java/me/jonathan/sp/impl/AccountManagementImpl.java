package me.jonathan.sp.impl;

import java.util.List;

import me.jonathan.sp.AccountManagement;
import me.jonathan.sp.bean.Account;
/**
 * Account Management Implementation
 *
 * @author 	Jonathan Zhang<br>
 *			mohistzh@gmail.com
 * @since   Mar 21, 2014
 * @version 0.0.1-SNAPSHOT
 */
public class AccountManagementImpl implements AccountManagement {

	public List<Account> getAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Account getAccountById(Integer id) {
		Account account = new Account();
		account.setId(1);
		account.setName("Jonathan");
		account.setEmail("mohistzh@gmail.com");
		account.setAddress("Shanghai, China");
		return account;
	}

}
