package tool;

import java.util.ArrayList;
import java.util.List;

import exam.Exam;
import banji.Banji;
import student.*;
import examdetail.*;

public class studentTool {
	private Student s;
	private int sidenty;
	private Banji bj;
	private boolean haveBanji;
	private List<Exam> exam = new ArrayList<Exam>();
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public int getSidenty() {
		return sidenty;
	}
	public void setSidenty(int sidenty) {
		this.sidenty = sidenty;
	}
	public Banji getBj() {
		return bj;
	}
	public void setBj(Banji bj) {
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
	
}
