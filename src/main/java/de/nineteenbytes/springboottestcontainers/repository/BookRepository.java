package de.nineteenbytes.springboottestcontainers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.nineteenbytes.springboottestcontainers.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
