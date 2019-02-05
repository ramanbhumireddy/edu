package com.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}