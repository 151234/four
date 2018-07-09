package dao;

import model.*;


public interface StudentDAO {
	public Student findBySid(java.lang.String sid);
	public int add(Student student);
}
