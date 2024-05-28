package controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gold.bookapi.bookapi.models.Book;
import com.gold.bookapi.bookapi.services.BookService;

@RestController
public class BooksApi {
    private final services.BookService bookService;

    @Autowired
    public BooksApi(services.BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/api/books")
    public List<BooksApi> index() {
        return bookService.allBooks();
    }

    @PostMapping("/api/books")
    public BooksApi create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }

    @GetMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }

    @PutMapping("/api/books/{id}")
    public Book update(
            @PathVariable("id") Long id,
            @RequestParam(value="title") String title,
            @RequestParam(value="description") String desc,
            @RequestParam(value="language") String lang,
            @RequestParam(value="pages") Integer numOfPages) {
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }

    @DeleteMapping("api/books/{id}")
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
}
