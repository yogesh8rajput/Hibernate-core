package com.mycompany;

import java.util.List;
import java.util.Scanner;

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
    	
    	int n;
         int r;
         String nam;
         double p;
         Student1 s1;
         
         
         
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session sess=sf.openSession();
    	Query q=sess.createQuery("from Student1");
    	
        Scanner sc=new Scanner(System.in);
        System.out.println("Select 1 to insert your data:");
        System.out.println("Select 2 to Update your data:");
        System.out.println("Select 3 to delete your data:");
        System.out.println("Select 4 to show your data:");
        System.out.println("Select 5 to Show all data:");
        n=sc.nextInt();
        
        if(n==1)
        {
        	System.out.println("Enter Your Rollno:");
        	r=sc.nextInt();
        	System.out.println("Enter Your Name:");
        	nam=sc.next();
        	System.out.println("Enter Your Percenteage:");
        	p=sc.nextDouble();
        	 s1=new Student1(); 
        	s1.setRollno(r);
        	s1.setName(nam);
        	s1.setPer(p);
        	
        	Transaction tx=sess.beginTransaction();
        	sess.save(s1);
        	tx.commit();
        	System.out.println("Successfully inserted data");
        }
        
        else if(n==2)
        {   String unam;
              int ur;
              Double up;
        	System.out.println("Enter Your  Rollno:");
        	ur=sc.nextInt();
        	
        	s1 = (Student1)sess.get(Student1.class, ur);
        	System.out.println("Enter 1 and 2 ");
        	int n1 =sc.nextInt();
        	if(n1==1)
        	{  
        		System.out.println("Update You Name:");
        		sc.nextLine();
        		unam=sc.nextLine(); 
            	
            	s1.setName(unam);
            	Transaction tx=sess.beginTransaction();
            	sess.update(s1);
            	tx.commit();
            	System.out.println("Update succcefully !!!");
        	}
        	else if(n1==2)
        	{
        		System.out.println("Update You Percenteage:");
            	up=sc.nextDouble(); 
            	s1.setPer(up);
            	Transaction tx=sess.beginTransaction();
            	sess.save(s1);
            	tx.commit();
            	System.out.println("Update succcefully !!!");
        	}
        	
        	
        	
        }
        
        else if(n==3)
        {   int dr;
        	System.out.println("Enter Your  Rollno:");
        	dr=sc.nextInt();
        	s1=new Student1();
        	s1.setRollno(dr);
        	Transaction tx=sess.beginTransaction();
        	sess.delete(s1);
        	tx.commit();
        	System.out.println("Deleted");
        	
        	
        }
        else if(n==4)
        {    int sr;
        	System.out.println("Enter Your  Rollno:");
        	sr=sc.nextInt();
        	
        	s1 = (Student1)sess.get(Student1.class, sr);
        	System.out.println("Rollno:"+s1.getRollno());
        	System.out.println("Name:"+s1.getName());
        	System.out.println("Percentage:"+s1.getPer());
        	

        	
        	
        }
        
        else if(n==5)
        {
        	
        	List<Student1> l=q.list();

        	for (Student1 e:l)
        	{
        	      //System.out.println(e);
        	         System.out.println(e.getRollno()+":"+e.getName()+":"+e.getPer());

        	}



        	
        }
        else {
        	System.out.println("Please Enter Valed code..... ");
        }
        
        
    }
}
