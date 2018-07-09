package tool;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class teacherTool {
	private Teacher t;
	private int tidenty;
	private Banji currenbj;//��ǰ�༶
	private List<Banji> bj;//��ʦ���������а༶
	private boolean haveBanji;
	private List<Exam> exam = new ArrayList<Exam>();//��ʦ���еĿ���
	private List<Exam> bjexam;//��ǰѡ�а༶�Ŀ���
	private Exam currene;//��ǰѡ�еĿ���
	private List<Examdetail> allet;//���
	private List<Examdetail> currenet;//��ǰѡ�п��������
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
