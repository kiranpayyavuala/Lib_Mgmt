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

			Book book = new Book("devops isbn", "devops name", "devops serial name", "devops description");
			Author author = new Author("devops author name", "devops description");
			Category category = new Category("devops category name");
			Publisher publisher = new Publisher("devops publisher name");

			book.addAuthors(author);
			book.addCategories(category);
			book.addPublishers(publisher);

			bookService.createBook(book);

			Book book1 = new Book("devops isbn1", "devops name1", "devops serial name1", "devops description1");
			Author author1 = new Author("devops author name1", "devops description1");
			Category category1 = new Category("devops category name1");
			Publisher publisher1 = new Publisher("devops publisher name1");

			book1.addAuthors(author1);
			book1.addCategories(category1);
			book1.addPublishers(publisher1);

			bookService.createBook(book1);

			Book book2 = new Book("devops isbn2", "devops name2", "devops serial name2", "devops description2");
			Author author2 = new Author("devops author name2", "devops description2");
			Category category2 = new Category("devops category name2");
			Publisher publisher2 = new Publisher("devops publisher name2");

			book2.addAuthors(author2);
			book2.addCategories(category2);
			book2.addPublishers(publisher2);

			bookService.createBook(book2);

		};
	}
}
