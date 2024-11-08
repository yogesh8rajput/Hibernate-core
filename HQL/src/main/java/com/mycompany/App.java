package com.mycompany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session sess =sf.openSession();
        Member m1=new Member();
//        insert data
//        m1.setId(101);
//        m1.setName("Ayushi");
//        m1.setPosition("Student");
        
        
//        HQL Query 
        
//        Query<Member> q=sess.createQuery("from Member where Name=  :m");
//        q.setParameter("m","Ayushi");
//        
//        List<Member>l1=q.list();
//        for (Member member : l1) {
//			System.out.println( " Member id:"+ member.getId()+"  Member Name:  " +member.getName()+"  Member Position: "+member.getPosition());
//		}

          
        
        
//        insert part
//        Transaction tx=sess.beginTransaction();
//        sess.save(m1);
//        tx.commit();
        
        
//        Minimum to maximum

//      Query<Member> q=sess.createQuery("from Member where Id >= 101 and Id <= 102");
//      
//      List<Member>l1=q.list();
//    for (Member member : l1) {
//		System.out.println( " Member id:"+ member.getId()+"  Member Name:  " +member.getName()+"  Member Position: "+member.getPosition());
//	}
        
//        
        
        Query<Member> q=sess.createQuery("from Member");
        
        q.setFirstResult(0);   //Starting point 
        q.setMaxResults(1);     // number of results 
        
        List<Member>l1=q.list();
      for (Member member : l1) {
  		System.out.println( " Member id:"+ member.getId()+"  Member Name:  " +member.getName()+"  Member Position: "+member.getPosition());
  	}
        sess.close();
        System.out.println("Success");
        
        
        
        
        
        
        
        
    }
}
