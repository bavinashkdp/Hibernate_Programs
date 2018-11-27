package com.telusko.DemoHib;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration=new Configuration();
        System.out.println("prepare configuration object");
        configuration.configure();
        System.out.println("validate the information present in hibernate cfg.xml file");
        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        System.out.println("build session factory");
        Session session=sessionFactory.openSession();
        System.out.println("open session");
        Transaction transaction=session.beginTransaction();
        System.out.println("begin transaction");
        System.out.println("option 1 insert data");
        System.out.println("option 2 read data");
        System.out.println("option 3 update data");
        System.out.println("option 4 delete data");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter choice??????");
        int n=scanner.nextInt();
        Student student=null;
        switch(n)
        {
        case 1:
        student=new Student();
        student.setsId(16);
        student.setsName("hari");
        student.setBranch("eee");
        session.save(student);
        transaction.commit();
        System.out.println("object is saved in db");
        System.out.println(student);
        break;
        case 2:
        	 student=session.get(Student.class, 15);
             transaction.commit();
             System.out.println("object is fetched from db");
             System.out.println(student); 	
       	break;
       	case 3:

            student=session.get(Student.class, 14);
            student.setsName("sunil");
            student.setBranch("civil");
            session.update(student);
            transaction.commit();
            System.out.println(student);
       	break;
       	case 4:
       		
            Student student4=session.get(Student.class, 15);
            session.delete(student4);
            transaction.commit();
            System.out.println(student4);
            
       		break;
       	default:
       		System.out.println("invalid option");
       		break;
       	
        }
    }
}
