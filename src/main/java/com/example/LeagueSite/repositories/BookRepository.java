package com.example.LeagueSite.repositories;

import com.example.LeagueSite.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
