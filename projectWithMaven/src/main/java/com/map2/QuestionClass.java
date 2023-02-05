package com.map2;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="OneToMany_Question")
public class QuestionClass {
	@Id
	private int question_Id;

	private String question;

	@OneToMany(mappedBy="question")
	List<AnswerClass> answers;

	public List<AnswerClass> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerClass> answers) {
		this.answers = answers;
	}

	public QuestionClass(int question_Id, String question) {
		super();
		this.question_Id = question_Id;
		this.question = question;
	}

	public QuestionClass() {
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
