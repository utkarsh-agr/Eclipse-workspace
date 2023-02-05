package com.map3;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class Project {
	
	@Id
	private int p_id;
	
	private String project_name;
	
	@ManyToMany(mappedBy="project")
	private List<Employee> emp;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	

}
