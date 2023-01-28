package com.map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int question_Id;
	
	private String question;
	
	@OneToOne
	@JoinColumn(name="a_Id")
	Answer answer;

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int question_Id, String question) {
		super();
		this.question_Id = question_Id;
		this.question = question;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestion_Id() {
		return question_Id;
	}

	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
	

}
