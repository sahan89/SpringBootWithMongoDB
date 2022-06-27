package com.sahan;

import com.sahan.model.Book;
import com.sahan.repository.BookRepository;
import com.sahan.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class SpringMongodbApplicationTests {

    @Autowired
    private BookService bookService;

    @MockBean
    private BookRepository bookRepository;

    @Test
    public void getBookTest() {
        when(bookRepository.findAll()).thenReturn(Stream.of(new Book(1, "Galiver", "ASD123", "Sahan Ekanayake"),
                new Book(2, "Java", "J123", "James")).collect(Collectors.toList()));
        assertEquals(2, bookService.getAllBooks().size());
    }

    /*@Test
    public void getUserByIdTest() {
        int id = 1;
        when(bookRepository.findById(id)).thenReturn(Stream.of(new Book(1, "Galiver", "ASD123", "Sahan Ekanayake")).<Book, Object>collect(Collectors.toList()));
        assertEquals(1, bookService.getBookById(id).getId());
    }*/

}
