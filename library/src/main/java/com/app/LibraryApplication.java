package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.models.Book;
import com.app.models.Publisher;
import com.app.repos.BookRepository;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner{
	
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    bookRepository.save(new Book("Book 1", new Publisher("Publisher A"), new Publisher("Publisher B")));
	}

}

