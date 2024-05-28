package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Models.Book;
import controllers.BooksApi;

@Repository
public interface BookRepository extends CrudRepository <BooksApi, Long>  {
	List<BooksApi> findAll();
	 List<BooksApi> findByDescriptionContaining(String search);
	 Long countByTitleContaining(String search);
	 Long deleteByTitleStartingWith(String search);
	Book saveAll(Book updatedBook);

}
