package com.curriculum.app.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculum.app.application.services.UserService;
import com.curriculum.app.application.viewModels.UserViewModel;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserViewModel> getUser(@PathVariable("userId") long userId) {
			UserViewModel user = userService.getUser(userId);
			return ResponseEntity.ok(user);
	}
}
