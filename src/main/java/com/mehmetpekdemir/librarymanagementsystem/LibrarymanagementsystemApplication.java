package com.mehmetpekdemir.librarymanagementsystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.mehmetpekdemir.librarymanagementsystem.entity.Author;
import com.mehmetpekdemir.librarymanagementsystem.entity.Book;
import com.mehmetpekdemir.librarymanagementsystem.entity.Category;
import com.mehmetpekdemir.librarymanagementsystem.entity.Publisher;
import com.mehmetpekdemir.librarymanagementsystem.service.BookService;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LibrarymanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagementsystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService) {
		return (args) -> {

			Book book = new Book("msc class isbn", "msc class name", "msc class serial name", "msc class description");
			Author author = new Author("msc class author name", "msc class description");
			Category category = new Category("msc class category name");
			Publisher publisher = new Publisher("msc class publisher name");

			book.addAuthors(author);
			book.addCategories(category);
			book.addPublishers(publisher);

			bookService.createBook(book);

			Book book1 = new Book("msc class isbn1", "msc class name1", "msc class serial name1", "msc class description1");
			Author author1 = new Author("msc class author name1", "msc class description1");
			Category category1 = new Category("msc class category name1");
			Publisher publisher1 = new Publisher("msc class publisher name1");

			book1.addAuthors(author1);
			book1.addCategories(category1);
			book1.addPublishers(publisher1);

			bookService.createBook(book1);

			Book book2 = new Book("msc class isbn2", "msc class name2", "msc class serial name2", "msc class description2");
			Author author2 = new Author("msc class author name2", "msc class description2");
			Category category2 = new Category("msc class category name2");
			Publisher publisher2 = new Publisher("msc class publisher name2");

			book2.addAuthors(author2);
			book2.addCategories(category2);
			book2.addPublishers(publisher2);

			bookService.createBook(book2);

		};
	}
}
