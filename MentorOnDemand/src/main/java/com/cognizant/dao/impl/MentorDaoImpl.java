package com.cognizant.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cognizant.dao.interf.MentorDao;
import com.cognizant.entity.MentorEntity;

@Repository
public class MentorDaoImpl implements MentorDao {

	@PersistenceContext
	private EntityManager manager;

	@Transactional
	@Override
	public boolean persistMentor(MentorEntity mentor) {

		manager.persist(mentor);
		return true;
	}
}
