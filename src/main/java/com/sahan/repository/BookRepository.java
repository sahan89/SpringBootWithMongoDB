package com.sahan.repository;

import com.sahan.model.Book;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BookRepository extends MongoRepository<Book, Id> {

    Book findById(int id);
    Book deleteById(int id);
}
