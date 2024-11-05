package com.One_to_manyy;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try {
            Configuration cfg = new Configuration();
            cfg.configure();
          SessionFactory sf= cfg.buildSessionFactory();
           Session sess = sf.openSession();

            Question q1 = new Question();
            q1.setQid(102);
            q1.setQuestion("What is Java?");

            Answer a1 = new Answer();
            a1.setAid(1001);
            a1.setAnswer("Java is a programming language");

            Answer a2 = new Answer();
            a2.setAid(1002);
            a2.setAnswer("JMango");

            List<Answer> l = new ArrayList();
           l.add(a1);
            l.add(a2);

            q1.setAns(l);

            for (Answer a : l) {
                a.setQue(q1);
            }

            Transaction tx = sess.beginTransaction();
            sess.save(q1); // Save the Question, which will also save answers due to cascade
            tx.commit();
            System.out.println("Complete");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
           
        }
    }
}
