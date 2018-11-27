package com.telusko.ManyToOne;

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
    	configuration.addAnnotatedClass(LapTop.class);
    	configuration.addAnnotatedClass(Student.class);
    	SessionFactory factory=configuration.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	LapTop lapTop=new LapTop();
    	lapTop.setlId(87);
    	lapTop.setlName("hp");
    	
    	Student student=new Student();
    	student.setsId(90);
    	student.setsName("gautham");
    	student.setMarks(99);
    	student.getLapTops().add(lapTop);
    	lapTop.setStudent(student);
    	
    	
    	session.save(lapTop);
    	session.save(student);
    	
    	transaction.commit();
    	session.close();
    }
}
