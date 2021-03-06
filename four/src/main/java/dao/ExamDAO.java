package dao;

import model.*;

import java.util.List;
public interface ExamDAO {
	public Exam findByEid(java.lang.String eid);
	public List<Exam> findByBid(java.lang.String bid);
	public List<Exam> findByTid(java.lang.String tid);
	public void delete(java.lang.String eid);
	public List<Exam> findall();
	public void add(Exam e);
	public List<Exam> findexTid(java.lang.String tid);
	public Exam findByEandT(java.lang.String eid,java.lang.String tid);
	public Exam findByEandB(java.lang.String eid,java.lang.String bid); 
}
