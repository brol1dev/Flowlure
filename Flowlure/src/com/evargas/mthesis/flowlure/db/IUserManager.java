package com.evargas.mthesis.flowlure.db;

import com.evargas.mthesis.flowlure.entity.User;

public interface IUserManager {

	/**
	 * Creates the username in the database if it does not exist.
	 * 
	 * @param username
	 * @param password
	 * @return true if created, false if it already exists.
	 */
	public boolean createUser(String username, String password);
	
	/**
	 * Gets a user if it exists in the database.
	 * 
	 * @param username
	 * @param password
	 * @return User instance if exists, null otherwise.
	 */
	public User getUser(String username, String password);
}
