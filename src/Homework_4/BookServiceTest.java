package Homework_4;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Test
    public void testBookService(){
        InMemoryBookRepository bookRepository = mock(InMemoryBookRepository.class);
        BookService bookService = new BookService(bookRepository);
        List<Book> bookList = new ArrayList<>(Arrays.asList(new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")));
        when(bookRepository.findById("1")).thenReturn(new Book("1", "Book1", "Author1"));
        when(bookService.findAllBooks()).thenReturn(bookList);
        assertEquals(bookService.findBookById("1"), bookRepository.findById("1"));
        assertEquals(bookService.findAllBooks(), bookRepository.findAll());
    }
}