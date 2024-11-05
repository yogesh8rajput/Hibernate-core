package com.Many_to_many;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Question {
    @Id
	int qid;
	String question;
	@ManyToMany(mappedBy = "que",cascade = CascadeType.ALL)
	List<Answer>ans;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
}
