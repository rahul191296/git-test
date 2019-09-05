package com.cognizant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.convertor.AdminConvertor;
import com.cognizant.convertor.MentorConvertor;
import com.cognizant.dao.interf.MentorDao;
import com.cognizant.entity.AdminEntity;
import com.cognizant.entity.MentorEntity;
import com.cognizant.model.AdminModel;
import com.cognizant.model.MentorModel;
import com.cognizant.service.interf.MentorService;

@Service
public class MentorServiceImpl implements MentorService {

	@Autowired
	private MentorDao mentorDao;
	
	MentorConvertor mentorConvertor = new MentorConvertor();

	@Override
	public boolean registerMentor(MentorModel mentorModel) {
		MentorEntity mentor = mentorConvertor.MentorModelToEntity(mentorModel);
		return mentorDao.persistMentor(mentor);
	}

}
