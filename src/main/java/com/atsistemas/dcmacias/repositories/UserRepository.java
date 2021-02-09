package com.atsistemas.dcmacias.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atsistemas.dcmacias.domain.User;

@Transactional
public interface UserRepository extends JpaRepository<User, Long>{
		
	
}