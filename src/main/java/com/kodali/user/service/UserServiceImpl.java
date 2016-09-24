package com.kodali.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.kodali.user.dao.IUserDAO;
import com.kodali.user.service.model.User;
import com.kodali.user.service.model.UserDataResponse;
import com.kodali.user.service.model.UserProfileResponse;

/**
 * 
 * @author kodali
 *
 */

public class UserServiceImpl implements IUserService{
    @Autowired
    IUserDAO userDAO;
    
    public IUserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public UserProfileResponse createOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.createOrUpdateUser(user);
	}

	@Override
	public UserDataResponse getUsers() {
		// TODO Auto-generated method stub
		return userDAO.getUsers();
	}

	/*@Override
	public UserProfileResponse updateUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.updateUser(user);
	}
*/
	



	

}
