package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Student st1=(Student)session.get(Student.class, 179);
        
        System.out.println(st1);
        
        
        session.close();
        //factory.close();
	}

}
