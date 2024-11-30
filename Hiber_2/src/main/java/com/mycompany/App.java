package com.mycompany;

import java.io.FileInputStream;
import java.util.Date;
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
    	
    	try {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session sess=sf.openSession();
    	Student_1 s=new Student_1();
//    	Student s1=new Student();
    	FileInputStream fis=new FileInputStream("src/main/java/python.png");
    	byte b[]=new byte[fis.available()];
    	fis.read(b);
    	s.setEmp_image(b);
    	s.setEmp_id(2);
    	s.setEmp_name("Dedd");
    	s.setEmp_salary(10);
    	s.setDate(new Date());
    	
    	
    
    	Transaction tx=sess.beginTransaction();
    	sess.save(s);
//    	Object save = sess.save(s1);
    	tx.commit();
    	sess.close();
    	System.out.println("Success");
    	} catch(Exception e)
    	{
    		System.out.print("Its updated"+e.getMessage());
    		
    	}
    }
}
