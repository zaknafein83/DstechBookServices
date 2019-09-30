package it.dstech.learning.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.learning.library.model.Role;
import it.dstech.learning.library.repository.RoleRepository;
import it.dstech.learning.library.service.interfaces.RoleService;

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
