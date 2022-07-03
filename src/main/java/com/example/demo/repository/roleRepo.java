package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Roles;

public interface roleRepo extends JpaRepository<Roles, Integer> {

}
