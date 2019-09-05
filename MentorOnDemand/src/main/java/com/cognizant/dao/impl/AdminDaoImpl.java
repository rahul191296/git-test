package com.cognizant.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cognizant.dao.interf.AdminDao;
import com.cognizant.entity.AdminEntity;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	private EntityManager manager;

	@Transactional
	public boolean registerAdmin(AdminEntity admin) {
		manager.persist(admin);
		return true;
	}

}
