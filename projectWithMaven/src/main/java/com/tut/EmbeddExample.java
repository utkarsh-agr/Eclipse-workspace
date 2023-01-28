package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddExample {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Student st1=new Student(179,"UTkarsh","Ranchi");
        Student st2=new Student(180,"Vishul","Patna");
        
        Certificate certi1=new Certificate("Spring","3 months");
        Certificate certi2=new Certificate("javascript","4 months");
        
        st1.setCerti(certi1);
        st2.setCerti(certi2);
        
        Session s=factory.openSession();
        
        Transaction tx=s.beginTransaction();
        s.persist(st1);
        s.persist(st2);
        tx.commit();
        
        s.close();
	}

}
