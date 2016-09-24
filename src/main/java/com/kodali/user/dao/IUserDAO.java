package com.kodali.user.dao;

import com.kodali.user.service.model.User;
import com.kodali.user.service.model.UserDataResponse;
import com.kodali.user.service.model.UserProfileResponse;

/**
 * 
 * @author kodali
 *
 */

public interface IUserDAO {
    public UserProfileResponse createOrUpdateUser(User user);
    public UserDataResponse getUsers();
	// public UserProfileResponse updateUser(User user);
    
}
