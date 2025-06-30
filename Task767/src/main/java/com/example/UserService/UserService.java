package com.example.UserService;

import com.example.entity.User;

public interface UserService {

	public User createUser(User user);

	public User updatePassword(Long id, String newPassword);

}
