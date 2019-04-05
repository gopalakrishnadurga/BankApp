package com.capg.bankapp.dao;

import com.capg.bankapp.model.Account;

public interface IAccountDao {

	public boolean saveAccount(Account account);

	public Account findAccount(int accountNo);
	public Account withdraw(Account account, double d);
}
