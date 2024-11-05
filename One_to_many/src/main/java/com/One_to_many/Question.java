package com.One_to_many;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question {
    @Id
    private int qid; // Made private
    
    private String question; // Made private

    @OneToMany(mappedBy = "que",cascade = CascadeType.ALL)
    private List<Answer> ans; // Made private

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
