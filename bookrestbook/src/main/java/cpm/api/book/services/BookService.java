package cpm.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import cpm.api.book.dao.BookRepository;
import entities.Book;

@Component
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	  
	  private static List<Book> list= new ArrayList<>();
	  
	  static {
	  
	  list.add(new Book(12,"java complete reference","xyz")); list.add(new
	  Book(13,"java complete reference","abc")); list.add(new
	  Book(14,"java complete reference","lmn")); }
	 

	public List<Book> getAllBooks() {
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}

	public Book getBookById(int id) {
		Book book = null;
		book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;
	}

	public Book addBook(Book b) {
		list.add(b);
		return b;

	}

	public void deleteBook(int bid) {
		list = list.stream().filter(book -> book.getId() != bid).collect(Collectors.toList());
	}

	public void updateBook(Book book, int bookId) {

		list = list.stream().map(b -> {
			if (b.getId() == bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}

			return b;
		}).collect(Collectors.toList());
	}
}
