package com.telusko.OneToOne;

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
    	configuration.addAnnotatedClass(Student.class);
    	configuration.addAnnotatedClass(LapTop.class);
    //	configuration.addAnnotatedClass(VoterCard.class);
    	//configuration.addAnnotatedClass(Person.class);
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	LapTop lapTop=new LapTop();
    	lapTop.setlId(1411);
    	lapTop.setlName("dell");
    	
    	Student student=new Student();
    	student.setsId(12);
    	student.setsName("avid");
    	student.setMarks(65);
    	student.setLapTop(lapTop);
    	
    	session.save(lapTop);
    	session.save(student);
    	transaction.commit();
    	System.out.println(lapTop);
    	System.out.println(student);
    	
    	
    	
    	
    	
    	/*
    	VoterCard voterCard=new VoterCard();
    	voterCard.setvId(12);
    	voterCard.setvName("avinash_avid");
    	voterCard.setvPlace("bangalore");
    	
    	
    	
    	Person person=new Person();
    	person.setPhNum(765);
    	person.setpName("avinash");
    	
    	
    	
    	session.save(person);
    	session.save(voterCard);
    	transaction.commit();
    	System.out.println(person);
    	System.out.println(voterCard);
    	
    	
    	*/
    }
}
