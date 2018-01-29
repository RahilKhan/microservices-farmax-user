package com.bpm.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bpm.service.UserServiceInf;
import com.google.gson.Gson;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceInf userService; 	
	
	/**
	 * This service returns User details
	 * @return String
	 */
	@RequestMapping(value = "/getUserDetails", method = RequestMethod.GET)
	public @ResponseBody
	String getUserDetails(HttpServletRequest request) {
		System.out.println("UserController : getUserDetails");
		String response = null;

    	List dashboardBeanList = userService.getUserDetails();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}

	/**
	 * This service creates an order  
	 * @return String
	 */
	@RequestMapping(value = "/createUser", method = RequestMethod.POST, headers = "Accept=application/json")
	public @ResponseBody
	String createUser(@RequestBody String request) {
		System.out.println("UserController : createUser");
		System.out.println("\t request.toString() : " + request.toString());
		
		String response = null;
		String userDetails = request.toString();

    	HashMap userDetailsMap = userService.createUser(userDetails);
    	response = new Gson().toJson(userDetailsMap);
    	
    	return response;
	}	
	
	/**
	 * This service edit an order  
	 * @return String
	 */
	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	public @ResponseBody
	String editUser(HttpServletRequest request) {
		System.out.println("UserController : editUser");
		String response = null;

    	List dashboardBeanList = userService.editUser();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	
	
	/**
	 * This service edit an order  
	 * @return String
	 */
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public @ResponseBody
	String deleteUser(HttpServletRequest request) {
		System.out.println("UserController : deleteUser");
		String response = null;

    	List dashboardBeanList = userService.deleteUser();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	

	/**
	 * This service edit an order  
	 * @return String
	 */
	@RequestMapping(value = "/findUser", method = RequestMethod.GET)
	public @ResponseBody
	String findUser(HttpServletRequest request) {
		System.out.println("UserController : findUser");
		String response = null;

    	List dashboardBeanList = userService.findUser();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	

	/**
	 * This service edit an order  
	 * @return String
	 */
	@RequestMapping(value = "/findAllUser", method = RequestMethod.GET)
	public @ResponseBody
	String findAllUser(HttpServletRequest request) {
		System.out.println("UserController : findAllUser");
		String response = null;

    	List dashboardBeanList = userService.findAllUsers();
    	response = new Gson().toJson(dashboardBeanList);
    	
    	return response;
	}	

}
