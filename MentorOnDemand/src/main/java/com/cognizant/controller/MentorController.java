package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.MentorModel;
import com.cognizant.model.UserModel;
import com.cognizant.service.interf.MentorService;

@RestController
@RequestMapping("/mentor")
public class MentorController {

	@Autowired
	private MentorService mentorService;

	@PostMapping("/mentorRegister")
	public ResponseEntity<Void> register(@RequestBody MentorModel mentorModel) {
		ResponseEntity<Void> response = null;

		mentorService.registerMentor(mentorModel);
		response = new ResponseEntity<Void>(HttpStatus.CREATED);

		return response;

	}
	
	

}
