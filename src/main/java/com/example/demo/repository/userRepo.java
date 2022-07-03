package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.users;

public interface userRepo extends JpaRepository<users, Integer> {

	public users findByUsername(String username);
}
