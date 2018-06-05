package examdetail;

import java.util.List;

public interface ExamdetailDAO {
	public Examdetail findByEtid(java.lang.String etid);
	public List<Examdetail> findByEid(java.lang.String eid);
}
