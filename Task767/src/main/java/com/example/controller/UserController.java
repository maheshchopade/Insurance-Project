package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UpdatePasswordDTO.UpdatePasswordRequest;
import com.example.UserService.UserService;
import com.example.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User User) {

		User user1 = userService.createUser(User);
		return ResponseEntity.ok(user1);
	}

	@PutMapping("/{id}/password")
	public ResponseEntity<User> updatePassword(@PathVariable Long id, @RequestBody UpdatePasswordRequest request) {
		User user2 = userService.updatePassword(id, request.getNewPassword());
		return ResponseEntity.ok(user2);
	}
}
