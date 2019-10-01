package it.dstech.learning.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import it.dstech.learning.library.model.Book;
import it.dstech.learning.library.model.User;
import it.dstech.learning.library.service.interfaces.BookService;
import it.dstech.learning.library.service.interfaces.UserService;

@RequestMapping
@RestController
public class UsersController {
	@Autowired
	private UserService userService;

	

	@Autowired
	private BookService bookService;

	@ApiOperation(value = "Questo metodo di accesso libero mi da la lista di tutti i libri")
	@GetMapping(value = "/book")
	public List<Book> gettAllBooks() {
		return bookService.getLibri();
	}

	@ApiOperation(value = "Questo metodo serve per creare un utente di tipo GUEST")
	@PostMapping(value = "/user/createGuest")
	public User createGuest(@RequestBody User user) {

		return userService.createGuestUser(user);
	}

	@ApiOperation(value = "Questo metodo serve per creare un utente di tipo ADMIN")
	@PostMapping(value = "/user/createAdmin")
	public User metodoAccessoLibero(@RequestBody User user) {
		return userService.createUser(user);
	}

}
