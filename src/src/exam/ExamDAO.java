package exam;

import java.util.List;


public interface ExamDAO {
	public Exam findByEid(java.lang.String eid);
	public List<Exam> findByBid(java.lang.String bid);
}
