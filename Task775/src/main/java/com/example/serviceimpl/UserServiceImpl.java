package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		User createUser = userRepository.save(user);
		return createUser;
	}

}
