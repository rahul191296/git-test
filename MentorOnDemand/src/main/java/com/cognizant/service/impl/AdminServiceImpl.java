package com.cognizant.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.convertor.AdminConvertor;
import com.cognizant.dao.interf.AdminDao;
import com.cognizant.entity.AdminEntity;
import com.cognizant.model.AdminModel;
import com.cognizant.service.interf.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	AdminConvertor adminConvertor = new AdminConvertor();

	@Override
	public boolean registerAdminService(AdminModel adminModel) {
		AdminEntity admin = adminConvertor.adminModelToEntity(adminModel);
		return adminDao.registerAdmin(admin);
	}

}
