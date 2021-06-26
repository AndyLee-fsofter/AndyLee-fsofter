package edu.luvina.dao;

import java.util.ArrayList;

import edu.luvina.entities.User;
import edu.luvina.utils.ScannerUtil;

public class UserDaoImpl implements UserDao {

	ArrayList<User> users;

	public UserDaoImpl() {
		users = new ArrayList<User>();
	}

	@Override
	public void addScore(User user) {
		System.out.println("nhập vào điểm");
		double score = Double.parseDouble(ScannerUtil.getScanner().nextLine());
		user.getScore().add(score);

	}

	@Override
	public void displayAllScore(User user) {
		System.out.println("tất cả điểm của học sinh này là");
		System.out.println(user.getScore());
		
	}

	@Override
	public void displayUser(User user) {
		System.out.println("hiển thị thông tin người dùng");
		System.out.println(user.toString());

	}

	@Override
	public void addUserToList(User user) {
		if(users.add(user)) {
			System.out.println("thêm người dùng thành công");
		} else {
			System.out.println("thêm người dùng thất bại");
		}
		
	}

	@Override
	public User findUserById(int userId) {
		User user = new User();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserId() == userId) {
				user = users.get(i);
			}
		}
		return user;
	}

}
