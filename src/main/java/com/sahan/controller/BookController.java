package com.sahan.controller;

import com.sahan.model.Book;
import com.sahan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookapi/")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/saveBook")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/deleteBookById/{id}")
    public String deleteBookById(@PathVariable int id) {
        return bookService.deleteBookById(id);
    }

}
