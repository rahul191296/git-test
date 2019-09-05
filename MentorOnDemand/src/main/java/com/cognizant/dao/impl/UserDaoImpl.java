package com.cognizant.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cognizant.dao.interf.UserDao;
import com.cognizant.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager manager;

	@Transactional
	public boolean persistUser(UserEntity user) {

		manager.persist(user);
		return true;
	}

}
