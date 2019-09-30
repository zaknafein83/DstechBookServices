package it.dstech.learning.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dstech.learning.library.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	Optional<Book> findByAuthor(String author);
}
