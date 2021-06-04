package com.example.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}