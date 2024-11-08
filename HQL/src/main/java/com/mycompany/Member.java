package com.mycompany;

import jakarta.persistence.*;

@Entity
@Table(name="Member")

public class Member {
	@Id
	private Integer Id;
	private String Name;
	private String Position;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}

}
