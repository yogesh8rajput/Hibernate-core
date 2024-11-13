package com.mycompany;

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
//        System.out.println( "Hello World!" );
    	
    	
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session sess=sf.openSession();
    	Student s=new Student();
    	Student s1=new Student();
    	s.setRoll(10);
    	s.setName("Ayush");
    	s.setPercent(60.0);
    	s1.setRoll(109);
    	s1.setName("Ayushi");
    	s1.setPercent(60.0);
    	Transaction tx=sess.beginTransaction();
    	sess.save(s);
    	Object save = sess.save(s1);
    	tx.commit();
    	sess.close();
    	System.out.println("Success");
    	
    }
}
