package dao;

import model.*;

import java.util.List;

public interface ExamdetailDAO {
	public Examdetail findByEtid(java.lang.String etid);
	public List<Examdetail> findByEid(java.lang.String eid);
	public List<Examdetail> findAll();
	public void delete(java.lang.String eid);
	public void add(Examdetail et);
}
