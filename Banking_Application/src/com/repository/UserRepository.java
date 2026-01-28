package com.repository;

import java.util.HashMap;
import java.util.Map;

import com.model.User;

public class UserRepository {

	Map<Integer, User> accounts = new HashMap<>();

	public void saveUser(User user) {
		accounts.put(user.getAccount_No(), user);
	}

	public User findUser(int acc_No) {
		return accounts.get(acc_No);
	}

	public boolean userExist(User user) {
		return accounts.containsKey(user.getAccount_No());
	}
}
