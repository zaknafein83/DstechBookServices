package it.dstech.learning.library.service.interfaces;

import java.util.List;

import it.dstech.learning.library.model.Book;

public interface BookService {
	public List<Book> getLibri();

	public Book aggiungiLibro(Book book);
}
