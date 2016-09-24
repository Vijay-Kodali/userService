package com.kodali.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kodali.user.logger.UserLogger;
import com.kodali.user.service.IUserService;
import com.kodali.user.service.model.User;
import com.kodali.user.service.model.UserDataResponse;
import com.kodali.user.service.model.UserProfileResponse;
/**
 * 
 * @author kodali
 *
 */

@Controller
public class UserController {
    @Autowired
    IUserService userService;
    
    public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	@RequestMapping(value={"/getUsers"}, method={RequestMethod.POST})
    @ResponseBody
    public UserDataResponse getUsers(){
		
        return userService.getUsers();
    }
	
    @RequestMapping(value={"/createOrUpdateUser"}, method={RequestMethod.POST})
    @ResponseBody
    public UserProfileResponse createOrUpdateUser(@RequestBody User user){
		UserLogger.debug("UserController createOrUpdateUser() Request:"+user);
        return userService.createOrUpdateUser(user);
    }
    
    /*@RequestMapping(value={"/updateUser"}, method={RequestMethod.POST})
    @ResponseBody
    public UserProfileResponse updateUser(@RequestBody User user){
		UserLogger.debug("UserController updateUser Request:"+user);
        return userService.createUser(user);
    }*/

}
