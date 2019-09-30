package it.dstech.learning.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.learning.library.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	 Optional<User> findByName(String username);
}
