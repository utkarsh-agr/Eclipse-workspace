package com.map2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ManyToOne_Answer")
public class AnswerClass {
	@Id
	private int ans_id;
	
	private String answer;
	
	@ManyToOne
	private QuestionClass question;

	public QuestionClass getQuestion() {
		return question;
	}

	public void setQuestion(QuestionClass question) {
		this.question = question;
	}

	public int getAns_id() {
		return ans_id;
	}

	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public AnswerClass(int ans_id, String answer) {
		super();
		this.ans_id = ans_id;
		this.answer = answer;
	}

	public AnswerClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
