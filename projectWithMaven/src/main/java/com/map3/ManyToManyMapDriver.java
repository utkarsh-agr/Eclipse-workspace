package com.map3;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class ManyToManyMapDriver {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Employee 1
		Employee emp1 = new Employee();

		emp1.setEid(12);
		emp1.setEname("Ram");

		// Employee 2
		Employee emp2 = new Employee();

		emp2.setEid(13);
		emp2.setEname("Shyam");

		// Employee 3
		Employee emp3 = new Employee();

		emp3.setEid(123);
		emp3.setEname("Sundar");

		// Project1
		Project project1 = new Project();
		project1.setP_id(2);
		project1.setProject_name("Library_Management");

		// Project2
		Project project2 = new Project();
		project2.setP_id(3);
		project2.setProject_name("Chatbot");

		// Project3
		Project project3 = new Project();
		project3.setP_id(13);
		project3.setProject_name("Ecom_Website");

		// Project4
		Project project4 = new Project();
		project4.setP_id(42);
		project4.setProject_name("School Management");

		// Project5
		Project project5 = new Project();
		project5.setP_id(35);
		project5.setProject_name("Online booking");

		// Creating all the Many mapping ArrayList for Employee table
		List<Employee> empList1 = new ArrayList<Employee>();
		empList1.add(emp1);
		empList1.add(emp2);

		// Creating all the Many mapping ArrayList for Project table
		List<Project> projectList1 = new ArrayList<Project>();
		projectList1.add(project1);
		
		List<Project> projectList2 = new ArrayList<Project>();
		projectList2.add(project1);
		projectList2.add(project2);
		
		
		//mapping ManyToMany
		emp1.setProject(projectList1);
		emp2.setProject(projectList2);
		project1.setEmp(empList1);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(emp1);
		session.persist(emp2);
		session.persist(emp3);
		session.persist(project1);
		session.persist(project2);
		session.persist(project3);
		session.persist(project4);
		session.persist(project5);
		
		tx.commit();
		session.close();
		factory.close();

	}

}
