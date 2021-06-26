package edu.luvina.main;

import edu.luvina.dao.AccountDao;
import edu.luvina.dao.AccountDaoImpl;
import edu.luvina.utils.ScannerUtil;

public class Main {
	public static void main(String[] args) {
		boolean exit = true;
		AccountDao accountDao = new AccountDaoImpl();
		do {
			showMenu();
			int choose = Integer.parseInt(ScannerUtil.getScanner().nextLine());
			switch (choose) {
			case 1:
				accountDao.logIn();
			case 2:
				accountDao.register();
				
				break;
			case 3:
				System.out.println("kết thúc chương trình");
				exit = false;
				break;
			default:
				System.out.println("nhập sai");
				break;
			}

		} while (exit);
	}

	public static void showMenu() {

		System.out.println("nhập vào lựa chọn của bạn");
		System.out.println("1. đăng nhập");
		System.out.println("2.đăng kí");
		System.out.println("3.thoát chương trình");

	}

	public static void showUserMenu() {
		System.out.println("nhập vào lựa chọn của bạn");
		System.out.println("1.nhập điểm");
		System.out.println("2.hiển thị tất cả các điểm");
		System.out.println("3.hiển thị thông tin người dùng");
		System.out.println("4.thoát chương trình");
	}
}
