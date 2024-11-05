package com.mycompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create configuration instance
        Configuration cfg = new Configuration();
        cfg.configure(); // loads hibernate.cfg.xml

        // Create session factory
        SessionFactory sf = cfg.buildSessionFactory();

        // Load employee by ID
        try (Session sess = sf.openSession()) {
            Employee emp1 = (Employee) sess.get(Employee.class, 121);
            if (emp1 != null) {
                System.out.println(emp1.getId() + " " + emp1.getName() + " " + emp1.getSalary());
            } else {
                System.out.println("Employee not found.");
            }
        }

        // Fetching again to demonstrate session reuse
        try (Session sess2 = sf.openSession()) {
            Employee emp2 = (Employee) sess2.get(Employee.class, 121);
            if (emp2 != null) {
                System.out.println(emp2.getId() + " " + emp2.getName() + " " + emp2.getSalary());
            } else {
                System.out.println("Employee not found.");
            }
        }

        // Close the session factory
        sf.close();
    }
}
