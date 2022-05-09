package com.login.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.login.demo.entity.User;
import com.login.demo.entity.UserRegistration;


public interface UserService extends UserDetailsService{
	User save(UserRegistration registration);
}
