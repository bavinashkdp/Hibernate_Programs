package com.telusko.CachingLevel2WithHQL;


import java.util.List;

import org.hibernate.Query;
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
    	configuration.addAnnotatedClass(Account.class);
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	Session session=sessionFactory.openSession();
    	Transaction  transaction= session.beginTransaction();
    	Query query=session.createQuery("from Account where acId=123");
    	query.setCacheable(true);
    	List<Account>accounts=query.list();
    	System.out.println(accounts);
    	
    	/*
    	Account account=new Account();
    	account.setAcId(123);
    	account.setAcName("avinash");
    	account.setBankName("sbi");
    	
    	
    	Account account2=new Account();
    	account2.setAcId(144);
    	account2.setAcName("siri");
    	account2.setBankName("icici");
    	
    	
    	Account account3=new Account();
    	account3.setAcId(155);
    	account3.setAcName("swetha");
    	account3.setBankName("indian");
    	
    	session.save(account);
    	session.save(account2);
    	session.save(account3);
    	*/
    	transaction.commit();
    	session.close();
    	
    	Session session2=sessionFactory.openSession();
    	Transaction  transaction2= session2.beginTransaction();
    	
    	Query query2=session2.createQuery("from Account where acId=123");
    	query2.setCacheable(true);
    	List<Account>accounts2=query2.list();
    	System.out.println(accounts2);
    	
    	
    	transaction2.commit();
    	session2.close();
    	
    	
    	
    }
}
