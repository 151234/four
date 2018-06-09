package gradedetail;


public interface GradedetailDAO {
	public Gradedetail findByid(java.lang.String sid,java.lang.String etid);
	public void add(Gradedetail gd);
}
