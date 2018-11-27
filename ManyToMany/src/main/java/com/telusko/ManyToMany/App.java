package com.telusko.ManyToMany;

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
    	SessionFactory factory=configuration.buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	LapTop lapTop=new LapTop();
    	lapTop.setlId(132);
    	lapTop.setlName("lenevo");
    	
    	Student student=new Student();
    	student.setsId(444);
    	student.setsName("ashok");
    	student.setMarks(78);
    	student.getLapTops().add(lapTop);
    	
    	lapTop.getStudents().add(student);
    	
    	
    	session.save(student);
    	session.save(lapTop);
    	transaction.commit();
    	session.close();
    }
}
