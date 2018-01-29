package com.bpm.dao.inf;

import java.util.HashMap;
import java.util.List ;

import com.bpm.model.User;

public interface UserDao {

	/*
	public List<OrderItem> getOrderDetails();

	public List<OrderItem> editOrder();

	public List<OrderItem> deleteOrder();

	public List<OrderItem> findOrder();

	public List<OrderItem> findAllOrder();

	public List<OrderItem> createOrder();
	*/
	
	
	public List getUserDetails();

	public List editUser();

	public List deleteUser();

	public List findUser();

	public List findAllUser();

	public HashMap createUser(HashMap userDetailsMap);


	
}
