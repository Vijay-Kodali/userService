package com.kodali.user.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.kodali.user.logger.UserLogger;
import com.kodali.user.service.model.User;
import com.kodali.user.service.model.UserDataResponse;
import com.kodali.user.service.model.UserProfileResponse;
/**
 * 
 * @author kodali
 *
 */

public class UserDAOImpl implements IUserDAO {
   
    @Autowired
    private SessionFactory sessionFactory;
     

    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
    @Transactional
	public UserProfileResponse createOrUpdateUser(User user) {
		 sessionFactory.getCurrentSession().saveOrUpdate(user);
    	 UserProfileResponse response =new UserProfileResponse();
    	 response.setStatus(1);
    	 response.setStatusMessage("SUCCESS");
    	 UserLogger.info(response+"Reponse");
		return response;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public UserDataResponse getUsers() {
		
		UserDataResponse response=new UserDataResponse();
		Query query = sessionFactory.getCurrentSession().createQuery("from User");
		List<User> users = query.list(); 
		response.setUsers(users);
		response.setStatus(1);
		UserLogger.info("UserDataResponse:"+response);
		
		return response;
	}

	/*@Override
	public UserProfileResponse updateUser(User user) {
	 sessionFactory.getCurrentSession().update(user);
   	 UserProfileResponse response =new UserProfileResponse();
   	 response.setStatus(1);
   	 response.setStatusMessage("SUCCESS");
   	 UserLogger.info(response+"Reponse");
		return response;
	}
*/

   
}
