package tool;

import java.util.ArrayList;
import java.util.List;

import banji.Banji;
import exam.Exam;
import examdetail.Examdetail;
import teacher.Teacher;

public class teacherTool {
	private Teacher t;
	private int tidenty;
	private Banji currenbj;//当前班级
	private List<Banji> bj;//教师创建的所有班级
	private boolean haveBanji;
	private List<Exam> exam = new ArrayList<Exam>();//教师所有的考卷
	private List<Exam> bjexam;//当前选中班级的考试
	private Exam currene;//当前选中的考卷
	private List<Examdetail> allet;//题库
	private List<Examdetail> currenet;//当前选中考卷的内容
	public Teacher getT() {
		return t;
	}
	public void setT(Teacher t) {
		this.t = t;
	}
	public int getTidenty() {
		return tidenty;
	}
	public void setTidenty(int tidenty) {
		this.tidenty = tidenty;
	}
	public List<Banji> getBj() {
		return bj;
	}
	public void setBj(List<Banji> bj) {
		this.bj = bj;
	}
	public boolean isHaveBanji() {
		return haveBanji;
	}
	public void setHaveBanji(boolean haveBanji) {
		this.haveBanji = haveBanji;
	}
	public List<Exam> getExam() {
		return exam;
	}
	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	public Exam getCurrene() {
		return currene;
	}
	public void setCurrene(Exam currene) {
		this.currene = currene;
	}
	public List<Examdetail> getAllet() {
		return allet;
	}
	public void setAllet(List<Examdetail> allet) {
		this.allet = allet;
	}
	public List<Examdetail> getCurrenet() {
		return currenet;
	}
	public void setCurrenet(List<Examdetail> currenet) {
		this.currenet = currenet;
	}
	public Banji getCurrenbj() {
		return currenbj;
	}
	public void setCurrenbj(Banji currenbj) {
		this.currenbj = currenbj;
	}
	public List<Exam> getBjexam() {
		return bjexam;
	}
	public void setBjexam(List<Exam> bjexam) {
		this.bjexam = bjexam;
	}
	
}
