package dao;

import model.*;
public interface TeacherDAO {
	public Teacher findByTid(java.lang.String tid);
	public int add(Teacher teacher);
}
