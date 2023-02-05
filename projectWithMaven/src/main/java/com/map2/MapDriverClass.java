package com.map2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDriverClass {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		QuestionClass q1=new QuestionClass();
		q1.setQuestion_Id(1212);
		q1.setQuestion("What is Java?");
		
		List<AnswerClass> answers=new ArrayList<AnswerClass>();
		
		AnswerClass ans1=new AnswerClass();
		ans1.setAns_id(343);
		ans1.setAnswer("JAVA is a programming language.");
		ans1.setQuestion(q1);
		answers.add(ans1);
		
		AnswerClass ans2=new AnswerClass();
		ans2.setAns_id(344);
		ans2.setAnswer("Java is used to build softwares");
		ans2.setQuestion(q1);
		answers.add(ans2);
		
		AnswerClass ans3=new AnswerClass();
		ans3.setAns_id(345);
		ans3.setAnswer("JAVA has multiple frameworks");
		ans3.setQuestion(q1);
		answers.add(ans3);
		
		q1.setAnswers(answers);
		
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(q1);
		session.persist(ans1);
		session.persist(ans2);
		session.persist(ans3);
		
		tx.commit();
		
		
		
		session.close();
		factory.close();
	}

}
