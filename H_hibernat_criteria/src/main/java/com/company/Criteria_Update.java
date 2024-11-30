package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.criteria.Root;

public class Criteria_Update {
	public static void main(String args[]) {
		
		Configuration cfg =new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess=sf.openSession();
		
		CriteriaBuilder cb = sess.getCriteriaBuilder();
		CriteriaUpdate<Faculty> cu= cb.createCriteriaUpdate(Faculty.class);
		
		
		
	}
}
