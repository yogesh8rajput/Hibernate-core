package com.mycompany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
   @Id	
   private Integer roll;
   public Integer getRoll() {
	return roll;
}
public void setRoll(Integer roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPercent() {
	return percent;
}
public void setPercent(Double percent) {
	this.percent = percent;
}
private String name;
   private Double percent;
}
