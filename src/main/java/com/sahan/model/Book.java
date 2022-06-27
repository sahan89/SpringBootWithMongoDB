package com.sahan.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document(collection = "book")
public class Book {
    @Id
    private int id;
    private String bookName;
    private String isbn;
    private String authorName;

    public Book(int id, String bookName, String isbn, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.isbn = isbn;
        this.authorName = authorName;
    }
}
