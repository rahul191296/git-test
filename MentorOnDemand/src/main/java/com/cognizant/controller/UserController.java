package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.AdminModel;
import com.cognizant.model.UserModel;
import com.cognizant.service.interf.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/userRegister")
	public ResponseEntity<Void> register(@RequestBody UserModel userModel) {
		ResponseEntity<Void> response = null;

		userService.registerUser(userModel);
		response = new ResponseEntity<Void>(HttpStatus.CREATED);

		return response;

	}

}
