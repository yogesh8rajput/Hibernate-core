package com.One_to_one;

import org.hibernate.sql.ast.tree.from.MappedByTableGroup;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Answer {
	
	@Id
	int aid;
	String answer;
	@OneToOne(mappedBy = "ans")
	Question que;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQue() {
		return que;
	}
	public void setQue(Question que) {
		this.que = que;
	}


}
