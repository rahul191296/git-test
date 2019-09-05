package com.cognizant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.convertor.AdminConvertor;
import com.cognizant.convertor.UserConvertor;
import com.cognizant.dao.interf.UserDao;
import com.cognizant.entity.UserEntity;
import com.cognizant.model.UserModel;
import com.cognizant.service.interf.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	UserConvertor userConvertor = new UserConvertor();

	@Override
	public boolean registerUser(UserModel userModel) {
		UserEntity user = userConvertor.userModelToEntity(userModel);
		return userDao.persistUser(user);
	}

}
