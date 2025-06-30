package com.example.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserService.UserService;
import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		User newUser = userRepository.save(user);
		return newUser;
	}

	@Override
	public User updatePassword(Long id, String newPassword) {
		User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

		user.setPassword(newPassword);
		return userRepository.save(user);

	}

}
