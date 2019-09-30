package it.dstech.learning.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.learning.security.model.User;

public interface BookRepository extends JpaRepository<User, Integer>{
	
	 Optional<User> findByName(String username);
}
