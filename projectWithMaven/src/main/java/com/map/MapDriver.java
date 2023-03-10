package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDriver {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Question q1=new Question();
		q1.setQuestion_Id(1212);
		q1.setQuestion("What is Java?");
		
		Answer ans1=new Answer();
		ans1.setAns_id(343);
		ans1.setAnswer("JAVA is a programming language.");
		ans1.setQuestion(q1);
		q1.setAnswer(ans1);
		
		Question q2=new Question();
		q2.setQuestion_Id(242);
		q2.setQuestion("What is Collection Framework?");
		
		Answer ans2=new Answer();
		ans2.setAns_id(344);
		ans2.setAnswer("API to work with objects in JAVA.");
		ans2.setQuestion(q2);
		q2.setAnswer(ans2);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(q1);
		session.persist(q2);
		session.persist(ans1);
		session.persist(ans2);
		
		tx.commit();
		
		//fetching
		Question question1=(Question)session.get(Question.class,1212);
		System.out.println(question1.getQuestion());
		System.out.println(question1.getAnswer().getAnswer());
		
		Answer answer1=(Answer)session.get(Answer.class, 344);
		System.out.println(answer1.getQuestion().getQuestion());
		System.out.println(answer1.getAnswer());
		
		
		session.close();
		factory.close();
	}

}
