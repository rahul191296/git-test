package com.cognizant.dao.interf;

import com.cognizant.entity.UserEntity;

public interface UserDao {

	boolean persistUser(UserEntity user);

}
