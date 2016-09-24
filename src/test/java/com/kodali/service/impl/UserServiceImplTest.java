package com.kodali.service.impl;

import org.junit.BeforeClass;
import org.junit.Test;

import com.kodali.setup.TestSetup;
import com.kodali.user.service.IUserService;
import com.kodali.user.service.model.User;
import com.kodali.user.service.model.UserDataResponse;
import com.kodali.user.service.model.UserProfileResponse;

/**
 * 
 * @author kodali
 *
 */
public class UserServiceImplTest {
	private static IUserService userService;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    	userService = (IUserService) TestSetup.getApplicationContext().getBean("userService");
    }
    
    @Test
    public void testGetUsers() {
    	  UserDataResponse users = userService.getUsers();
    	  System.out.println("Users Data"+users);
    	  
    }

    @Test
    public void testCreateOrUpdateUser() {
        User user=new User();
        user.setFirstName("Kodali");
        user.setLastName("Vijay");
        user.setGender("M");
        user.setAge(26);
        user.setPhone(new Long(1233344455));
        UserProfileResponse response = userService.createOrUpdateUser(user);
        System.out.println("createOrUpdateUser Satus:"+response.getStatusMessage());
    }
}
