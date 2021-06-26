package edu.luvina.dao;

import edu.luvina.entities.User;

public interface UserDao {
	public void addUserToList(User user);
	public void addScore(User user);
	public void displayAllScore(User user);
	public void displayUser(User user);
	public User findUserById(int userId);
}
