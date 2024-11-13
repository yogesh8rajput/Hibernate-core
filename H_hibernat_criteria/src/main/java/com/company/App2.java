package com.company;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.criteria.Root;

public class App2 {
      
	
//	Configuration cfg=new Configuration();
//    
//    SessionFactory sf=cfg.buildSessionFactory();
//    Session sess=sf.openSession();
//    System.out.println( "Hello World!" );
  Scanner sc=new Scanner(System.in);
 // System.out.println("Enter Your Id");
 // int id=sc.nextInt();
      System.out.println("Enter Your Name");
      String name=sc.nextLine();
      System.out.println("Enter Your Subject");
      String sub=sc.nextLine();
       Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory sf=cfg.buildSessionFactory();
      Session sess=sf.openSession();
      Faculty f=new Faculty();
      f.setId(3);
  f.setName(name);
  f.setSub(sub);
  Transaction tx=sess.beginTransaction();
  sess.save(f);
  tx.commit();
  sess.close();
  System.out.println("Done!!!!!!!!");
}
