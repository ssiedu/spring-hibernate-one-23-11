package com.ssi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookDAO bookDAO;
	
	public Book addNewBook(Book book) {
		//it will use DAO to save book
		bookDAO.saveBook(book);
		return book;
	}
	
	
}
