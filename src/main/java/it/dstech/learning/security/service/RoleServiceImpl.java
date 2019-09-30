package it.dstech.learning.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.learning.security.interfaces.RoleService;
import it.dstech.learning.security.model.Role;
import it.dstech.learning.security.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepos;

	@Override
	public Role getRole(String role) {
		if (roleRepos.findByRole(role).isPresent())
			return roleRepos.findByRole(role).get();
		else
			return null;
	}

}
