package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {
	
	private SessionFactory sessionFactory;
	
	public BookDAO() {
		Configuration configuration=new Configuration().configure().addAnnotatedClass(Book.class);
		sessionFactory=configuration.buildSessionFactory();
	}
	
	//to save book
	public Book saveBook(Book book) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
		return book;
	}
	
	//to update book
	
	//to delete book
	
	//to search book 
	
	//etc.
	
	
}
