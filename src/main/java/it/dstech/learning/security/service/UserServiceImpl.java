package it.dstech.learning.security.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.learning.security.interfaces.RoleService;
import it.dstech.learning.security.interfaces.UserService;
import it.dstech.learning.security.model.Role;
import it.dstech.learning.security.model.User;
import it.dstech.learning.security.repository.UserRepository;
import it.dstech.learning.utility.Constants;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repos;

	@Autowired
	private RoleService roleService;

	@Override
	public User createUser(User user) {
		Set<Role> roles = new HashSet<Role>();
		Role roleGuest = roleService.getRole(Constants.ROLE_ADMIN);
		roles.add(roleGuest);
		user.setRoles(roles);
		return repos.save(user);
	}

	@Override
	public User createGuestUser(User user) {
		Set<Role> roles = new HashSet<Role>();
		Role roleGuest = roleService.getRole(Constants.ROLE_GUEST);
		roles.add(roleGuest);
		user.setRoles(roles);
		return repos.save(user);
	}

}
