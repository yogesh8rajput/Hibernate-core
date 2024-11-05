package com.mycompany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student1 {
    @Id
	private Integer rollno;
	private String name;
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPer() {
		return per;
	}
	public void setPer(Double per) {
		this.per = per;
	}
	private Double per;
}
