package com.tut;

import jakarta.persistence.*;

@Embeddable
public class Certificate {
	
	@Column(name="course_name")
	private String course;
	
	@Column(name="course_duration")
	private String duration;
	
	

	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}
