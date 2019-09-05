package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.AdminModel;
import com.cognizant.service.interf.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping("/adminRegister")
	public ResponseEntity<Void> register(@RequestBody AdminModel AdminModel) {
		ResponseEntity<Void> response = null;

		adminService.registerAdminService(AdminModel);
		response = new ResponseEntity<Void>(HttpStatus.CREATED);

		return response;

	}
	
	@GetMapping("/hello")
	public String hellor() {
		return "hello";
	}

}
