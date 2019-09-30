package it.dstech.learning.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import it.dstech.learning.library.model.Book;
import it.dstech.learning.library.service.interfaces.BookService;

@RequestMapping("/book")
@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@ApiOperation(value = "Questo metodo di accesso libero mi da la lista di tutti i libri")
	@GetMapping
	public List<Book> gettAllBooks() {
		return bookService.getLibri();
	}

	@ApiOperation(value = "Questo metodo permette ai soli admin di inserire libri")
	@PreAuthorize("hasAnyRole('ADMIN')")
	@PostMapping
	public Book saveBook(Book book) {
		return bookService.aggiungiLibro(book);
	}

	
	
//	@PreAuthorize("hasAnyRole('ADMIN', 'GUEST')")
//	@ApiOperation(value = "Questo metodo di accesso libero mi da la lista di tutti i libri")
//	@GetMapping
//	public List<Book> gettAllBooks() {
//		return bookService.getLibri();
//	}

}
