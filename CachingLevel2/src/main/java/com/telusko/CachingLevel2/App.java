package com.telusko.CachingLevel2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration=new Configuration();
    	configuration.configure();
    	configuration.addAnnotatedClass(University.class);
    	SessionFactory factory=configuration.buildSessionFactory();
    	//session object 1
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	University university=session.get(University.class, 1211);
    	transaction.commit();
    	session.close();
    	System.out.println(university);
    	
    	//session object 2
    	Session session2=factory.openSession();
    	Transaction transaction2=session2.beginTransaction();
    	University university2=session2.get(University.class, 1211);
    	transaction2.commit();
    	session2.close();
    	System.out.println(university2);
    	/*
    	
    	University university=new University();
    	university.setuId(1211);
    	university.setuName("ksrm");
    	university.setLocation("kadapa");
    	
    	University university1=new University();
    	university1.setuId(1311);
    	university1.setuName("korm");
    	university1.setLocation("karnool");
    	
    	
    	University university2=new University();
    	university2.setuId(1411);
    	university2.setuName("svist");
    	university2.setLocation("anathapoor");
    	
    	session.save(university);
    	session.save(university1);
    	session.save(university2);
    	
    	transaction.commit();
    	session.close();
    	*/
    }
}
