package com.mycompany;

import java.util.Scanner;

import org.hibernate.*;
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
   
    	
//    	 int n;
         int id;
         String name;
         double sal;
        
         
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session sess=sf.openSession();
    	 Employee emp1=(Employee)sess.get(Employee.class,121);    
    	    System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());    
    	    sess.close();    
    	        
    	    Session sess2=sf.openSession();    
    	    Employee emp2=(Employee)sess2.get(Employee.class,121);    
    	    System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());    
    	    sess2.close(); 
    	    
//    	 Scanner sc=new Scanner(System.in);
//    	 System.out.println("Enter Your Emloyee id :");
//     	id=sc.nextInt();
//     	System.out.println("Enter Your Name:");
//     	name=sc.next();
//     	System.out.println("Enter Your Salary:");
//     	sal=sc.nextDouble();
//     	 e1=new Employee(); 
//     	e1.setId(id);
//     	e1.setName(name);
//     	e1.setSalary(sal);
//     	
//     	Transaction tx=sess.beginTransaction();
//     	sess.save(e1);
//     	tx.commit();
//     	System.out.println("Successfully inserted data");
    	}    
    
}
