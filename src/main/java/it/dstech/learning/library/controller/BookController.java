package it.dstech.learning.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RequestMapping("/book")
@RestController
public class BookController {

//	@Autowired
	@ApiOperation(value = "Questo metodo di accesso libero mi da la lista di tutti i libri")
	@GetMapping
	public String metodoAccessoLibero() {
		return "Qui è facile arrivare....";
	}

	@ApiOperation(value = "Questo metodo forse ci riuscirete dopo mezz'ora",notes = "Questa è una nota ad un metodo")
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/sicuro")
	public String metodoPrevioLogin() {
		return "Ecco... già qui è più difficile";
	}

}
