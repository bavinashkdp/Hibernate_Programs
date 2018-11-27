package com.telusko.CachingLevel1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration=new Configuration();
    	configuration.configure();
    	configuration.addAnnotatedClass(Book.class);
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	
    	
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	Book book=session.get(Book.class, 999);
    	System.out.println(book);
    	transaction.commit();
    	session.close();
    	
    	
    	Session session2=sessionFactory.openSession();
    	Transaction transaction2=session2.beginTransaction();
    	Book book1=session2.get(Book.class, 999);
    	System.out.println(book1);
    	transaction2.commit();
    	session.close();
    	/*
    	
    	Book book=session.get(Book.class, 999);
    	System.out.println(book);
    	Book book1=session.get(Book.class, 999);
    	
    	System.out.println(book1);
    	
    	*/
    	/*
    	Book book=session.get(Book.class, 999);
    	Book book1=session.get(Book.class, 888);
    	*/
    	
    	/*
    	Book book=new Book();
    	book.setBookPages(999);
    	book.setBookName("java");
    	book.setPrice(500);
    	
    	
      	Book book1=new Book();
    	book1.setBookPages(888);
    	book1.setBookName("python");
    	book1.setPrice(700);
    	
    	
      	Book book2=new Book();
    	book2.setBookPages(333);
    	book2.setBookName("scala");
    	book2.setPrice(900);
    	
    	 session.save(book);
    	 session.save(book1);
    	 session.save(book2);
    	*/
    
    	
    	
    }
}
