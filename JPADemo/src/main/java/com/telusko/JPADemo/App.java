package com.telusko.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee employee=new Employee();
    	employee.setEmpId(65);
    	employee.setEmpName("girish");
    	employee.setSal(56000);
       EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pu");
       EntityManager entityManager=entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       entityManager.persist(employee);
       entityManager.getTransaction().commit();
       // Employee employee=entityManager.find(Employee.class, 32);
       System.out.println(employee);
    }
}
