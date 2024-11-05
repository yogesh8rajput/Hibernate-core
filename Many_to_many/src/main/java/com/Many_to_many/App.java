package com.Many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Many_to_many.*;
import com.Many_to_many.Question;

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
            Configuration cfg = new Configuration();
            cfg.configure();
          SessionFactory sf= cfg.buildSessionFactory();
           Session sess = sf.openSession();

            Question q1 = new Question();
            q1.setQid(102);
            q1.setQuestion("What is Java?");
            
            Question q2 = new Question(); 
            q1.setQid(103);
            q1.setQuestion("What is Python?");

            Answer a1 = new Answer();
            a1.setAid(1001);
            a1.setAnswer("Java is a programming language");

            Answer a2 = new Answer();
            a2.setAid(1002);
            a2.setAnswer("This devlope Software");

            List<Answer> l = new ArrayList();
           l.add(a1);
            l.add(a2);

//            q1.setAns(l);
            List<Question> l2 = new ArrayList();
            l2.add(q1);
             l2.add(q2);


            for (Answer a : l) {
                a.setQue(l2);
            }
            for (Question q : l2) {
               q.setAns(l);
            }
            Transaction tx = sess.beginTransaction();
//            sess.save(q1); // Save the Question, which will also save answers due to cascade
            sess.save(q1);
            sess.save(q2);
            tx.commit();
            System.out.println("Complete");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
           
        }
    }
}
