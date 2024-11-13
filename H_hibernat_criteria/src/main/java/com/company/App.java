package com.company;

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
        
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session sess=sf.openSession();
        Faculty f=new Faculty();
        f.setId(3);
        f.setName("Bindu");
        f.setSub("Biology");
        Transaction tx=sess.beginTransaction();
        sess.save(f);
        tx.commit();
        sess.close();
        System.out.println("Done!!!!!!!!");
        
    }
}
