package com.example.LeagueSite.repositories;

import com.example.LeagueSite.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
