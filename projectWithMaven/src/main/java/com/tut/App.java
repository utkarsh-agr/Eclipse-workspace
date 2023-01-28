package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class App
{
	public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
      //SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        System.out.println(factory);
        
        //Creating Student
        Student st1=new Student(161,"Maurya","Barabanki");
        //System.out.println(st1);
        
        Address ad=new Address();
        
        ad.setStreet("vidya nagar");
        ad.setCity("Ranchi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.123);
        
        FileInputStream fis=new FileInputStream("src/main/java/kolkata.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        fis.close();
        
        
        Session session=factory.openSession();
        Transaction tx= session.beginTransaction();
        session.persist(st1);
        //session.persist(ad);
        tx.commit();
        session.close();
    }
}
