package com.croma.user.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class User {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
