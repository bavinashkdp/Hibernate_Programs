package com.telusko.DemoHib1;

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
        SessionFactory factory=configuration.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        StudentName studentName=new StudentName();
        studentName.setfName("sirisha");
      
        studentName.setmName("siri");
        studentName.setlName("bathala");
        
        
        Student student=new Student();
        student.setsId(30);
        student.setStudentName(studentName);
        student.setsBranch("cse");
        
        session.save(student);
        
        transaction.commit();
        System.out.println(student);
    }
}
