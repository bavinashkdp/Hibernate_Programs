package com.telusko.OneToMany;

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
        lapTop.setlId(13);
        lapTop.setlName("lenevo");
        
        LapTop lapTop1=new LapTop();
        lapTop1.setlId(14);
        lapTop1.setlName("sony");
        
        Student student=new Student();
        student.setsId(32);
        student.setsName("raveesh");
        student.setMarks(78);
        student.getLapTops().add(lapTop);
        student.getLapTops().add(lapTop1);
        
        session.save(lapTop);
        session.save(lapTop1);
        session.save(student);
        
        transaction.commit();
        session.close();
    }
}
