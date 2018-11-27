package com.telusko.HQLDemo1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;


import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import net.sf.ehcache.search.expression.Criteria;

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
    	ServiceRegistry registry= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    	SessionFactory factory=configuration.buildSessionFactory(registry);
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	//SQL query=native queries
    	SQLQuery sqlQuery=session.createSQLQuery("select sName,marks from student5  where marks>20");
    	sqlQuery.setResultTransformer(org.hibernate.Criteria.ALIAS_TO_ENTITY_MAP);
    	List list=sqlQuery.list();
    	for (Object object : list)
    	{
    		Map map=(Map) object;
    		System.out.println(map.get("sName")+":"+map.get("marks"));
			
		}
    	
    	/*
    	SQLQuery sqlQuery=session.createSQLQuery("select * from student5 s where s.marks>20");
    	sqlQuery.addEntity(Student.class);
    	List<Student> students=sqlQuery.list();
    	
    	for (Student student : students) 
    	{
			System.out.println(student);
		}
    	
    	transaction.commit();
    	session.close();
    	
    	/*
    	
    	
    	
    	
    	
    	//hql query
    	
    	/*
    	
    	int m=20;
    	
    	Query query= session.createQuery("select sum(marks) from Student s where s.marks>?");
    	query.setParameter(0, m);
    	
    	Long list=(Long)query.uniqueResult();
    	System.out.println(list);
    	
    	transaction.commit();
    	session.close();
    	*/
    	
    	
    	
    	/*
    	Query query= session.createQuery("select sum(marks) from Student s where s.marks>:m");
    	query.setParameter("m", m);
    	
    	Long list=(Long)query.uniqueResult();
    	System.out.println(list);
    	
    	transaction.commit();
    	session.close();
    	*/
    	
    	
    	/*
    	Query query= session.createQuery("select sum(marks) from Student s where s.marks>"+num);
    	Long list=(Long)query.uniqueResult();
    	System.out.println(list);
    	
    	transaction.commit();
    	session.close();
    	*/
    	
    	/*
    	
    	Query query= session.createQuery("select sum(marks) from Student s where s.marks>20");
    	Long list=(Long)query.uniqueResult();
    	System.out.println(list);
    	
    	transaction.commit();
    	session.close();
    	
    	*/
    	
    	/*
    	Query query= session.createQuery("select sum(marks) from Student s where s.marks>20");
    	Object list=(Object)query.uniqueResult();
    	System.out.println(list);
    	
    	transaction.commit();
    	session.close();
    	*/
    	
    	/*
    	Query query= session.createQuery("select sum(marks) from Student s where s.marks>20");
    	List<Long>list=query.list();
    	for (Object object : list) {
			System.out.println(object);
		}
    	
    	
    	transaction.commit();
    	session.close();
    	
    	*/
    	/*
    	Query query= session.createQuery("select sId,sName,marks from Student s where s.marks>20");
    	List<Object[]> student=(List<Object[]>) query.list();
    	
    	for (Object[] objects : student) {
			System.out.println(objects[0]+":"+objects[1]+":"+objects[2]);
		}
    	
    	
    	
    	transaction.commit();
    	session.close();
    	*/
    
    	/*
    	Query query= session.createQuery("select sId,sName,marks from Student where marks>20");
    	List<Object[]> student=(List<Object[]>) query.list();
    	
    	for (Object[] objects : student) {
			System.out.println(objects[0]+":"+objects[1]+":"+objects[2]);
		}
    	
    	
    	
    	transaction.commit();
    	session.close();
    	
    	
    	*/
    	
    	/*
    	Query query= session.createQuery("select sId,sName,marks from Student");
    	List<Object[]> student=(List<Object[]>) query.list();
    	
    	for (Object[] objects : student) {
			System.out.println(objects[0]+":"+objects[1]+":"+objects[2]);
		}
    	
    	
    	
    	transaction.commit();
    	session.close();
    	*/
    	
    	
    	/*
    	Query query= session.createQuery("select sId,sName,marks from Student where sId=3");
    	Object[] student=(Object[]) query.uniqueResult();
    	
    	
    	System.out.println(student[0]+":"+student[1]+":"+student[2]);
    	
    	
    	
    	transaction.commit();
    	session.close();
    	*/
    	
    	
    	
    	
    	
    	/*
    	Query query= session.createQuery("select sId,sName,marks from Student where sId=3");
    	Student student=(Student) query.uniqueResult();
    	
    	System.out.println(student);
    	transaction.commit();
    	session.close();
    	*/
    	
    	
    	
    	
    	//Query query= session.createQuery("from Student");
    	//Query query= session.createQuery("from Student where marks>20");
    	
    	//List<Student>students=query.list();
    	//for (Student student : students) {
		//	System.out.println(student);
		//}
    
    	
    	//Query query= session.createQuery("from Student where sId=3");
    	//Student student=(Student) query.uniqueResult();
    	
    	//System.out.println(student);
    	
    	
    	
    	
    	
    	//insert operation
    	/*
    	Random random=new Random();
    	for(int i=1;i<=5;i++)
    	{
    		Student student=new Student();
    		student.setsId(i);
    		student.setsName("name "+i);
    		student.setMarks(random.nextInt(100));
    		session.save(student);
    	}
    	
    	transaction.commit();
    	session.close();
    	*/
    }
}
