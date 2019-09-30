package it.dstech.learning.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.learning.library.model.Book;
import it.dstech.learning.library.repository.BookRepository;
import it.dstech.learning.library.service.interfaces.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getLibri() {
		return bookRepository.findAll();
	}

	@Override
	public Book aggiungiLibro(Book book) {
		return bookRepository.save(book);
	}

}
