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

			Book book = new Book("kiran isbn", "kiran name", "kiran serial name", "kiran description");
			Author author = new Author("kiran author name", "kiran description");
			Category category = new Category("kiran category name");
			Publisher publisher = new Publisher("kiran publisher name");

			book.addAuthors(author);
			book.addCategories(category);
			book.addPublishers(publisher);

			bookService.createBook(book);

			Book book1 = new Book("kiran isbn1", "kiran name1", "kiran serial name1", "kiran description1");
			Author author1 = new Author("kiran author name1", "kiran description1");
			Category category1 = new Category("kiran category name1");
			Publisher publisher1 = new Publisher("kiran publisher name1");

			book1.addAuthors(author1);
			book1.addCategories(category1);
			book1.addPublishers(publisher1);

			bookService.createBook(book1);

			Book book2 = new Book("kiran isbn2", "kiran name2", "kiran serial name2", "kiran description2");
			Author author2 = new Author("kiran author name2", "kiran description2");
			Category category2 = new Category("kiran category name2");
			Publisher publisher2 = new Publisher("kiran publisher name2");

			book2.addAuthors(author2);
			book2.addCategories(category2);
			book2.addPublishers(publisher2);

			bookService.createBook(book2);

		};
	}
}
