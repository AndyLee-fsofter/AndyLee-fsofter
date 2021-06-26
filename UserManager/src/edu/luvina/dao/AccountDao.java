package edu.luvina.dao;

public interface AccountDao {
	/**
	 * phương thức dùng để đăng nhập vào 1 acc có sẵn
	 * @return
	 */
	public boolean logIn();
	
	/**
	 * phương thức dùng để đăng kí 1 acc mới
	 * @return
	 */
	public boolean register();
}
