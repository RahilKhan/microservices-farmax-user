package com.bpm.service;

import java.util.HashMap;
import java.util.List;

public interface UserServiceInf {

	/**
	 * This service gets dashboard details based on user id
	 * @param userId
	 * @return
	 */
	public List getUserDetails();

	public HashMap createUser(String userDetails);

	public List editUser();

	public List deleteUser();

	public List findUser();

	public List findAllUsers();
}
