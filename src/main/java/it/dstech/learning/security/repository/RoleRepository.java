package it.dstech.learning.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.learning.security.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	 Optional<Role> findByRole(String role);
}
