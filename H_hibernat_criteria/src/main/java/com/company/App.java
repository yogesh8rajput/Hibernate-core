package com.company;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
    	

   	 Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session sess=sf.openSession();
        CriteriaBuilder cb=sess.getCriteriaBuilder();
        CriteriaQuery<Faculty> cq=cb.createQuery(Faculty.class);
        Root<Faculty> r=cq.from(Faculty.class);
        cq.select(r);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Subject Faculties");
        String su=sc.nextLine();
//        jakarta.persistence.criteria.Predicate namee= cb.equal(r.get("name"),"Bindu");
        jakarta.persistence.criteria.Predicate subb= cb.equal(r.get("sub"),su);
//        cq.select(r).where(cb.and(namee,subb));
        cq.select(r).where(subb);
        Query q=sess.createQuery(cq);
        List<Faculty> l=q.list();
        for (Faculty f : l) {
			System.out.println(f.getName()+":"+f.getSub()+":");
			
		}
        
        sess.clear();
		sf.close();
//    	
//        System.out.println( "Hello World!" );
//        Scanner sc=new Scanner(System.in);
//       // System.out.println("Enter Your Id");
//       // int id=sc.nextInt();
//        System.out.println("Enter Your Name");
//        String name=sc.nextLine();
//        System.out.println("Enter Your Subject");
//        String sub=sc.nextLine();
//        Configuration cfg=new Configuration();
//        cfg.configure();
//        SessionFactory sf=cfg.buildSessionFactory();
//        Session sess=sf.openSession();
//        Faculty f=new Faculty();
//        f.setId(3);
//        f.setName(name);
//        f.setSub(sub);
//        Transaction tx=sess.beginTransaction();
//        sess.save(f);
//        tx.commit();
//        sess.close();
//        System.out.println("Done!!!!!!!!");
        
    }
}
