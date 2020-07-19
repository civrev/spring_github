package com.cwatts.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faq implements PKLongEntity {
	@Id
	public Long id;
	public Long position;
	public String question;
	public String answer;

	public Long getPosition() {
		return position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public Long getId() {
		return id;
	}
	@Override
	public void setId(Long id) {
		this.id = id;
	}
}
