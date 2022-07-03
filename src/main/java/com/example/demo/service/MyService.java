package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.users;
import com.example.demo.repository.userRepo;

@Service
public class MyService implements UserDetailsService {

	
	@Autowired
	private userRepo repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		users user=repo.findByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("User not found"); 
		}
		return Principal.build(user);
		
		
	}

}
