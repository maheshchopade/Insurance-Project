package com.example.service;

import org.springframework.stereotype.Service;

import com.example.entity.User;

@Service
public interface UserService {

	User updatePassword(int id, User user);
}
