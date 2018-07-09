package tool;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class studentTool {
	private Student s;
	private int sidenty;
//	private List<Banji> bj;//���м���İ༶
	private boolean haveBanji;//�Ƿ����༶
	private List<Exam> exam = new ArrayList<Exam>();//ѡ�а༶�Ŀ���
	private Banji currentbj;//��ǰѡ�еİ༶
	private List<Examdetail> ed;//ѡ�еĿ��������
	private Teacher currentt ;
	private List<TofBj> tbj;//��������а༶���༶��Ӧ����ʦ
	private Exam currene;
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
//	public List<Banji> getBj() {
//		return bj;
//	}
//	public void setBj(List<Banji> bj) {
//		this.bj = bj;
//	}
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
	public Banji getCurrentbj() {
		return currentbj;
	}
	public void setCurrentbj(Banji currentbj) {
		this.currentbj = currentbj;
	}
	public List<Examdetail> getEd() {
		return ed;
	}
	public void setEd(List<Examdetail> ed) {
		this.ed = ed;
	}
	public Teacher getCurrentt() {
		return currentt;
	}
	public void setCurrentt(Teacher currentt) {
		this.currentt = currentt;
	}
	public List<TofBj> getTbj() {
		return tbj;
	}
	public void setTbj(List<TofBj> tbj) {
		this.tbj = tbj;
	}
	public Exam getCurrene() {
		return currene;
	}
	public void setCurrene(Exam currene) {
		this.currene = currene;
	}
	
	
}
