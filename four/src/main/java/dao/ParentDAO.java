package dao;

import model.*;


public interface ParentDAO {
	public Parent findByPid(java.lang.String pid);
	public int add(Parent parent);
	
}
