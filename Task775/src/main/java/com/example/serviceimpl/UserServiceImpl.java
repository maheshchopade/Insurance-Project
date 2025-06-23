package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User updatePassword(int id, User user) {
		User updateUser = userRepository.findById(id);
		if (updateUser != null) {
			updateUser.setPassword(user.getPassword());
		}
		return userRepository.save(updateUser);
	}

}
