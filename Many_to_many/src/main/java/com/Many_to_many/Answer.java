package com.Many_to_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToMany;
@Entity
public class Answer {
	@Id
	int aid;
	String Answer;
	@ManyToMany
	List<Question>que;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	public List<Question> getQue() {
		return que;
	}
	public void setQue(List<Question> que) {
		this.que = que;
	}

}
