package com.tut;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class App 
{
	public static void main( String[] args )
    {
        System.out.println( "Project Started" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        System.out.println(factory);
        
        //Creating Student
        Student st1=new Student(180,"Vishul","Patna");
        System.out.println(st1);
        
        //SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx= session.beginTransaction();
        session.persist(st1);
        tx.commit();
        session.close();
    }
}