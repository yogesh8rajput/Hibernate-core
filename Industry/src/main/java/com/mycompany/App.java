package com.mycompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.archive.scan.spi.Scanner;
import org.hibernate.cfg.Configuration;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Your name:");
//        String name=sc.nextLine();
//      
//        System.out.println("Enter Your Id:");
//        int  id=sc.nextInt();
//        System.out.println("Enter Your Salary:");
//        double salary=sc.nextDouble();
//       
//        Employe e=new Employe();
        Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session sess=sf.openSession();
    	Employe e1=new Employe();
//    	e1.setId(id);
//    	e1.setName(name);
//    	e1.setSalary(salary);
//    	
//    	e1.setId(null);
    	e1.setName("Rangaa ");
    	e1.setSalary(100.0);
    	
    	
    	Transaction tx=sess.beginTransaction();
    	sess.save(e1);
//    	Object save = sess.save(s1);
    	tx.commit();
    	sess.close();
    	System.out.println("Success");
    	
    }
}
