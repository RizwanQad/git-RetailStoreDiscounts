package com.retail_discount.api.core;

import java.time.LocalDateTime;

/*
 * User Class to store information about user that buy 
 */
public class User {

	private final UserType type;
	private final String userName;
	private final LocalDateTime joiningDate;

	/*
	 * Could add more fields like name, address etc etc.
	 */

	public User(UserType type, String userName) {
		this.type = type;
		this.userName = userName;
		joiningDate = LocalDateTime.now();
	}

	/**
	 * 
	 * @param type
	 * @param userName
	 * @param joiningDate
	 */
	public User(UserType type, String userName, LocalDateTime joiningDate) {
		this.type = type;
		this.userName = userName;
		this.joiningDate = joiningDate;
	}

	/**
	 * 
	 * @return
	 */
	public UserType getType() {
		return type;
	}

	/**
	 * 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 
	 * @return joiningDate
	 */
	public LocalDateTime getJoiningDate() {
		return joiningDate;
	}

}
