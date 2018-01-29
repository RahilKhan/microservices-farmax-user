package com.bpm.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bpm.dao.inf.CurrencyDao;
import com.bpm.dao.inf.UserDao;
import com.bpm.model.User;
import com.google.gson.Gson;
import com.bpm.model.Currency;



@Service("userService")
@Transactional
public class UserServiceImpl implements UserServiceInf{

	@Autowired
	CurrencyDao currencyDao;

	@Autowired
	UserDao userDao;

	
	@Override
	public List getUserDetails() {
		System.out.println("UserServiceImpl.getDashBoardDetails()");
		List userList = userDao.getUserDetails();
		System.out.println("\t userList.size() : " + userList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return userList;
	}

	@Override
	public HashMap createUser(String userDetails){
		System.out.println("UserServiceImpl.createUser()");

        Gson gsonObj = new Gson();
        HashMap userDetailsMap = gsonObj.fromJson(userDetails, HashMap.class);
		System.out.println("\t cartMap : " + userDetailsMap.toString()); 

		HashMap userDetailsMapResponse = userDao.createUser(userDetailsMap);
		
		System.out.println("\t userDetailsMapResponse.size() : " + userDetailsMapResponse.size());
		
		return userDetailsMapResponse;
	}

	@Override
	public List editUser() {
		System.out.println("UserServiceImpl.editUser()");
		List userList = userDao.editUser();
		System.out.println("\t userList.size() : " + userList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return userList;
	}

	@Override
	public List deleteUser() {
		System.out.println("UserServiceImpl.deleteUser()");
		List userList = userDao.deleteUser();
		System.out.println("\t userList.size() : " + userList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return userList;
	}

	@Override
	public List findUser() {
		System.out.println("UserServiceImpl.findUser()");
		List userList = userDao.findUser();
		System.out.println("\t userList.size() : " + userList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return userList;
	}

	@Override
	public List findAllUsers() {
		System.out.println("UserServiceImpl.findAllUser()");
		List userList = userDao.findAllUser();
		System.out.println("\t userList.size() : " + userList.size());
		
		List<Currency> currencyList = currencyDao.getAllCurrency();
		System.out.println("\t currencyList.size() : " + currencyList.size());
		
		return userList;
	}

	
}
