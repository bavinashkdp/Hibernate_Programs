package com.telusko.OneToManyEagerLazy;

import java.util.List;

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
    	configuration.addAnnotatedClass(Company.class);
    	configuration.addAnnotatedClass(Employee.class);
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	Company company=session.get(Company.class, 98009);
    	//fetching techniques r 2 types LAZY and EAGER
    	//by default it is LAZY we can make it EAGER by using fecth=fechtype.EAGER inside annotation
    	
    	/*
    	List<Employee>employees=company.getEmployees();
    	for (Employee employee : employees) 
    	{
    		System.out.println(employee);
			
		}
		
		*/
    	
    	
    	
    	/*
    	Employee employee=new Employee();
    	employee.setEmpId(32);
    	employee.setEmpName("harish");
    	employee.setSal(30000);
    	
    	Employee employee1=new Employee();
    	employee1.setEmpId(88);
    	employee1.setEmpName("suresh");
    	employee1.setSal(70000);
    	
    	
    	Company company=new Company();
    	company.setcId(98009);
    	company.setcName("capgemini");
    	company.getEmployees().add(employee);
    	company.getEmployees().add(employee1);
    	
    	session.save(company);
    	session.save(employee);
    	session.save(employee1);
    	*/
    	
    	
    	
    	
    	transaction.commit();
    	session.close();
    	System.out.println(company);
    }
}
