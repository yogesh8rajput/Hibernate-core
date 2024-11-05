package com.One_to_one;

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
        System.out.println( "Hello World!" );
        
        try {
        	 Configuration cfg=new Configuration();
         	cfg.configure();
         	SessionFactory sf=cfg.buildSessionFactory();
         	
         	
         	Session sess=sf.openSession();
         	Question q1=new Question();
         	q1.setQid(101);
         	q1.setQuestion("What is java ");

         	Question q2=new Question();

         	q2.setQid(102);
         	q2.setQuestion("What is you faviroute fruite? ");

         	Answer a1=new Answer();
         	a1.setAid(1001);
         	a1.setAnswer("Java is programming language");

         	Answer a2=new Answer();
         	a2.setAid(1002);
         	a2.setAnswer("JMango");
         	q1.setAns(a1);
         	q2.setAns(a2);
         	
         	a1.setQue(q1);
         	a2.setQue(q2);
       Transaction tx= sess.beginTransaction();
        	sess.save(q1);
        	sess.save(q2);
//        	sess.save();
        	
        	sess.save(a1);
        	sess.save(a2);
//        	sess.save();
        	tx.commit();
        	sess.close();
        	System.out.println("Complete");
        }
        catch(Exception e)
        {
        	System.out.println("Hello"+e.getMessage());
        }
        
        
    }
}
