package dao;

import model.*;


public interface AccountDAO {
	public Account findByid(java.lang.String id);
	public int add(Account account);
}
