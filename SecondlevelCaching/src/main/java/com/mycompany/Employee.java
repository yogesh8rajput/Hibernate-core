package com.mycompany;

import javax.persistence.Cacheable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Id;
@Entity  
@Table(name="emp") 
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
     
public class Employee {
   @Id 
	private Integer Id;
	private String name;
	private double salary;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}