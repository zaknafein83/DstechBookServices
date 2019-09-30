package it.dstech.learning.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import it.dstech.learning.security.interfaces.RoleService;
import it.dstech.learning.security.interfaces.UserService;
import it.dstech.learning.security.model.User;

@RequestMapping("/user")
@RestController
public class RestControllerUsers {
	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@ApiOperation(value = "Questo metodo serve per creare un utente di tipo GUEST")
	@PostMapping(value = "/createGuest")
	public User createGuest(User user) {

		return userService.createGuestUser(user);
	}

	@ApiOperation(value = "Questo metodo serve per creare un utente di tipo ADMIN")
	@PostMapping(value = "/createAdmin")
	public User metodoAccessoLibero(User user) {
		return userService.createUser(user);
	}

}
