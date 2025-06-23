package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PutMapping("/{id}")
	public ResponseEntity<User> getUpdatedPassword(@PathVariable Integer id, @RequestBody User user) {
		User updatedPassword = userService.updatePassword(id, user);
		return ResponseEntity.ok(updatedPassword);
	}
}