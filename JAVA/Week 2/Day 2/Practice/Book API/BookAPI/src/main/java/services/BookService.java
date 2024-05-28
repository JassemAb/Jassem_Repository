package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.Book;
import controllers.BooksApi;
import repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BooksApi> allBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
        Optional<BooksApi> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            BooksApi updatedBook = optionalBook.get();
            updatedBook.setTitle(title);
            updatedBook.setDescription(desc);
            updatedBook.setLanguage(lang);
            updatedBook.setNumberOfPages(numOfPages);
            return bookRepository.saveAll(updatedBook);
        } else {
            return null;
        }
    }

    public String deleteBook(Long id) {
        bookRepository.deleteById(id);
        return "deleted";
    }

    public java.awt.print.Book findBook(Long id) {
        Optional<BooksApi> optionalBook = bookRepository.findById(id);
        return optionalBook.orElse(null);
    }
	

}
