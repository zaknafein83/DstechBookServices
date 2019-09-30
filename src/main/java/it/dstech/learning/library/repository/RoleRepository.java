package it.dstech.learning.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.learning.library.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	 Optional<Role> findByRole(String role);
}
