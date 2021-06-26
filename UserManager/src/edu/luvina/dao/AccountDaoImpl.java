package edu.luvina.dao;

import java.util.ArrayList;

import edu.luvina.entities.Account;
import edu.luvina.entities.User;
import edu.luvina.main.Main;
import edu.luvina.utils.ScannerUtil;

public class AccountDaoImpl implements AccountDao {

	private ArrayList<Account> accounts = new ArrayList<Account>();
	UserDao dao = new UserDaoImpl();

	public AccountDaoImpl() {
	}

	@Override
	public boolean logIn() {
		System.out.println("nhập vào user name");
		String userName = ScannerUtil.getScanner().nextLine();
		System.out.println("nhập vào password");
		String password = ScannerUtil.getScanner().nextLine();
		Account account = null;
//		account.setPassword(password);
//		account.setUserName(userName);
		boolean result = false;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getPassword().equals(password) && accounts.get(i).getUserName().equals(userName)) {
				result = true;
				account = accounts.get(i);
				break;
			}
		}
		if (result) {
			System.out.println("đăng nhập thành công");
			User user = dao.findUserById(account.getUserId());
			
			boolean exit = true;
			do {
				Main.showUserMenu();
				int key = Integer.parseInt(ScannerUtil.getScanner().nextLine());
				switch (key) {
				case 1:
					dao.addScore(user);
					break;
				case 2:
					dao.displayAllScore(user);
					break;
				case 3:
					dao.displayUser(user);
					break;
				case 4:
					exit = false;
					break;
				default:
					break;
				}
			} while (exit);
		} else {
			System.out.println("đăng nhập thất bại");
		}

		return result;
	}

	@Override
	public boolean register() {
		boolean isExist = false;
		boolean result = false;
		User user = new User();
		System.out.println("nhập vào user name");
		String userName = ScannerUtil.getScanner().nextLine();
		if (accounts == null) {
			System.out.println("nhập vào mật khẩu");
			String password = ScannerUtil.getScanner().nextLine();
			System.out.println("nhập vào id người dùng");
			int userId = Integer.parseInt(ScannerUtil.getScanner().nextLine());
			Account account = new Account();
			account.setPassword(password);
			account.setUserId(userId);
			account.setUserName(userName);
			accounts.add(account);
			user.setUserId(userId);
			System.out.println("nhập vào tên người dùng :");
			user.setName(ScannerUtil.getScanner().nextLine());
			dao.addUserToList(user);
			result = true;
		} else {
			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getUserName().equals(userName)) {
					isExist = true;
					break;
				}
			}
			if (isExist) {
				result = false;
				System.out.println("tên đã tồn tại");
			} else {
				System.out.println("nhập vào mật khẩu");
				String password = ScannerUtil.getScanner().nextLine();
				System.out.println("nhập vào id người dùng");
				int userId = Integer.parseInt(ScannerUtil.getScanner().nextLine());
				Account account = new Account();
				account.setPassword(password);
				account.setUserId(userId);
				account.setUserName(userName);
				accounts.add(account);
				user.setUserId(userId);
				System.out.println("nhập vào tên người dùng :");
				user.setName(ScannerUtil.getScanner().nextLine());
				dao.addUserToList(user);
				result = true;
			}
		}

		return result;
	}

}
