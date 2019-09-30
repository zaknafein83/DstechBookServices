package it.dstech.learning.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import it.dstech.learning.library.model.User;
import it.dstech.learning.library.service.interfaces.UserService;

@RequestMapping("/user")
@RestController
public class UsersController {
	@Autowired
	private UserService userService;

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
