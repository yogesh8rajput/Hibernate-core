package com.One_to_many;
import jakarta.persistence.CascadeType;
//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Answer {
	
	@Id
	int aid;
//	@OneToMany(cascade = CascadeType.ALL)
	String answer;
	@ManyToOne
	
	
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
