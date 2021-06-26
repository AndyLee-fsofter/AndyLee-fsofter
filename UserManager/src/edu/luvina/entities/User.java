package edu.luvina.entities;

import java.util.ArrayList;

public class User {
	private int userId;
	private String name;
	private ArrayList<Double> score;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public User() {
		score = new ArrayList<Double>();
	}
	public ArrayList<Double> getScore() {
		return score;
	}
	public void setScore(ArrayList<Double> score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + "]";
	}
	
	
}
