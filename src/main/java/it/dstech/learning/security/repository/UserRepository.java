package it.dstech.learning.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.learning.security.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	 Optional<User> findByName(String username);
}
