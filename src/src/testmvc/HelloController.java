package testmvc;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import exam.Exam;
import exam.ExamDAO;
import examdetail.Examdetail;
import examdetail.ExamdetailDAO;
import grade.Grade;
import grade.GradeDAO;
import gradedetail.Gradedetail;
import gradedetail.GradedetailDAO;

import banji.Banji;
import banji.BanjiDAO;

import parent.Parent;
import parent.ParentDAO;

import sb.Sb;
import sb.SbDAO;
import student.Student;
import student.StudentDAO;
import teacher.Teacher;
import teacher.TeacherDAO;
import tool.*;

import account.Account;
import account.AccountDAO;





@Controller
public class HelloController {
	
	@Resource
	AccountDAO adao;
	@Resource
	StudentDAO sdao;
	@Resource
	TeacherDAO tdao;
	@Resource
	ParentDAO pdao;
	@Resource
	BanjiDAO bjdao;
	@Resource
	ExamDAO edao;
	@Resource
	ExamdetailDAO etdao;
	@Resource
	SbDAO sbdao;
	@Resource
	GradeDAO gdao;
	@Resource
	GradedetailDAO gddao;
	
	@RequestMapping("/login.action")
	public String login(HttpServletRequest request,ModelMap map)
	{
		Account a = new Account();
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		String codein = request.getParameter("checkma");
		String code = (String)request.getSession().getAttribute("code");
		if(!codein.endsWith(code)){//验证码验证
			request.getSession().setAttribute("loginErr", "验证码输入错误");
			return "loginError";
		}	
		else{//账号密码验证
			a = adao.findByid(username);
			if(a==null){
				request.getSession().setAttribute("loginErr", "账号不存在");
				return "loginError";
			}
			else
				if(!a.getPassword().equals(pass)){
					request.getSession().setAttribute("loginErr", "密码错误");
					return "loginError";
				}
		}
		if(a.getIdentify()==1){//学生
			studentTool st = new studentTool();
			Student s = sdao.findBySid(username);
			List<Sb> sb = sbdao.findBySid(s.getSid());
			List<TofBj> tbj = new ArrayList<TofBj>();
			st.setS(s);
			st.setSidenty(a.getIdentify());
			if(sb==null){
				st.setHaveBanji(false);
				st.setTbj(null);
			}
			else{
				for(int i=0;i<sb.size();i++){
					Banji b = bjdao.findByBid(sb.get(i).getBid());
					Teacher t = tdao.findByTid(b.getTid());
					TofBj x = new TofBj();
					x.setBj(b);
					x.setT(t);
					tbj.add(x);
				}
				st.setHaveBanji(true);
				st.setTbj(tbj);
			}	
			st.setExam(null);
			st.setCurrentbj(null);
			st.setEd(null);
			st.setCurrentt(null);
			st.setCurrene(null);
			request.getSession().setAttribute("student", st);
			return "Slogin";
		}
		else if(a.getIdentify()==2){//教师
			teacherTool tt = new teacherTool();
			Teacher t = tdao.findByTid(username);
			List<Banji> bj = bjdao.findByTid(t.getTid());
			if(bj==null){
				tt.setBj(null);
				tt.setHaveBanji(false);
			}
			else{
				tt.setBj(bj);
				tt.setHaveBanji(true);
			}
			tt.setT(t);
			tt.setTidenty(a.getIdentify());
			List<Exam> exam = edao.findByTid(t.getTid());
			List<Examdetail> et = etdao.findAll();
			tt.setExam(exam);
			tt.setAllet(et);
			tt.setCurrene(null);
			tt.setCurrenet(null);
			tt.setCurrenbj(null);
			tt.setBjexam(null);
			request.getSession().setAttribute("teacher", tt);
			return "Tlogin";
		}
		else{//家长
			Parent p = pdao.findByPid(username);
			request.getSession().setAttribute("parent", p);
			return "Plogin";
		}
	}
	@RequestMapping("/regist.action")
	public String regist(HttpServletRequest request,ModelMap map)
	{
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String username=request.getParameter("username");
		String pass=request.getParameter("pass");
		
		String rname=request.getParameter("rname");
		
		System.out.println(rname);
		int identy= Integer.parseInt(request.getParameter("identy"));
		Account ac=new Account();
		ac.setIdentify(identy);
		ac.setPassword(pass);
		ac.setUid(username);
		adao.add(ac);
		if(adao.findByid(username)==null){
			request.getSession().setAttribute("loginErr", "用户名已存在");
			return "loginError";
		}
		if(identy==1){
			Student st=new Student();
			st.setSid(username);
			st.setPid(null);
			st.setSname(rname);
			sdao.add(st);
		}
		if(identy==3){
			Parent pt=new Parent();
			pt.setPid(username);
			pt.setPname(rname);
			pt.setSid(null);
			pdao.add(pt);
		}
		if(identy==2){
			Teacher tr=new Teacher();
			tr.setTid(username);
			tr.setTname(rname);
			tdao.add(tr);
		}
		return"index";
	}
	@RequestMapping("/joinclass.action")//加入班级
	public String joinclass(HttpServletRequest request,ModelMap map)
	{
		//String bid = request.getParameter("bid");
		String invite = request.getParameter("invite");
		Banji b = bjdao.findByinvite(invite);
		String bid = b.getBid();
		studentTool st = (studentTool)request.getSession().getAttribute("student");
		Student s = st.getS();
		if(sbdao.findBysb(s.getSid(), bid)==null){
			Banji bj = bjdao.findByBid(bid);
			if(bj==null){
				request.getSession().setAttribute("loginErr", "该班级不存在");
				return "loginError";
			}
			else{
				Sb sb = new Sb();
				sb.setBid(bid);
				sb.setSid(s.getSid());
				sbdao.joinclass(sb);				//加入班级，对sb表插入数据
				Banji bj2 = bjdao.findByBid(bid);	//更新studentTool的班级列表内容
				Teacher t2 = tdao.findByTid(bj2.getTid());
				TofBj tbj = new TofBj();
				tbj.setBj(bj2);
				tbj.setT(t2);				
				List<TofBj> b2 ;
				if(st.getTbj()==null){	//更新
					b2 = new ArrayList<TofBj>();
				}
				else{
					b2 = st.getTbj();
				}				
				b2.add(tbj);
				st.setTbj(b2);
				st.setHaveBanji(true);
				request.getSession().setAttribute("student", st);
			}
		}
		else{
			request.getSession().setAttribute("loginErr", "已加入过该班级");
			return "loginError";
		}
		return "Slogin";
	}
	@RequestMapping("/selectclass.action")//学生进入班级
	public String selectclass(HttpServletRequest request,ModelMap map)
	{
		String bid = request.getParameter("bid");
		Banji bj = bjdao.findByBid(bid);
		studentTool st = (studentTool)request.getSession().getAttribute("student");
		st.setCurrentbj(bj);
		List<Exam> e = edao.findByBid(bid);
		st.setExam(e);
		Teacher t = tdao.findByTid(bj.getTid());
		st.setCurrentt(t);
		request.getSession().setAttribute("student", st);
		return "Sbandetail";
	}
	@RequestMapping("/selectexam.action")//选择考卷
	public String selectexam(HttpServletRequest request,ModelMap map)
	{
		String eid = request.getParameter("eid");
		studentTool st = (studentTool)request.getSession().getAttribute("student");
		Exam e = edao.findByEid(eid);
		st.setCurrene(e);
		Grade iscommit = gdao.findByid(eid, st.getS().getSid());
		if(iscommit!=null){
			Grade g = gdao.findByid(eid, st.getS().getSid());
			List<Examdetail> ed = etdao.findByEid(eid);
			List<gradeTool> gts = new ArrayList<gradeTool>();
			for(int i =0;i<ed.size();i++){
				gradeTool gt = new gradeTool();
				Gradedetail gd = gddao.findByid(st.getS().getSid(), ed.get(i).getEtid());
				gt.setNumber(i+1);
				gt.setSanswer(gd.getSanswer());
				gt.setIsright(gd.isRight());
				gt.setAnswer(ed.get(i).getAnswer());
				gts.add(gt);
			}
			request.getSession().setAttribute("grademessage", gts);//做题情况
			request.getSession().setAttribute("grade", g.getGrade());//成绩
			return "Sexamresult";
		}
		else{
			List<Examdetail> et = etdao.findByEid(eid);			
			st.setEd(et);		
		}
		request.getSession().setAttribute("student", st);
		return "Sexamdetail";
	}
	@RequestMapping("/doexam.action")//提交考卷
	public String doexam(HttpServletRequest request,ModelMap map)
	{
		studentTool st = (studentTool)request.getSession().getAttribute("student");
		List<gradeTool> gt = new ArrayList<gradeTool>();
		int c = st.getEd().size();
		int right = 0;
		for(int i =0;i<c;i++){
			gradeTool gt1 = new gradeTool();
			Examdetail ed = st.getEd().get(i);
			Gradedetail gd = new Gradedetail();
			gd.setSid(st.getS().getSid());
			gd.setEtid(ed.getEtid());
			gd.setEid(ed.getEid());
			String a = "que" + i;
			String answer = request.getParameter(a);
			if(answer.equals(ed.getAnswer())){
				gd.setRight(true);
				right ++;
			}
			else{
				gd.setRight(false);
			}
			gd.setSanswer(answer);
			gddao.add(gd);
			gt1.setNumber(i+1);
			gt1.setSanswer(answer);
			gt1.setAnswer(ed.getAnswer());
			gt1.setIsright(gd.isRight());
			gt.add(gt1);
		}		
		float rightpercent = (float)right/(float)c*100;
		rightpercent = Float.parseFloat(String.format("%.1f",rightpercent));
		int grade = (int)rightpercent;
		Grade g = new Grade();
		g.setEid(st.getCurrene().getEid());
		g.setGrade(grade);
		g.setRightpercent(rightpercent);
		g.setSid(st.getS().getSid());
		gdao.add(g);
		request.getSession().setAttribute("grademessage", gt);//做题情况
		request.getSession().setAttribute("grade", grade);//成绩
		return "Sexamresult";
	}
	
	//以下是教师action
	
	@RequestMapping("/createclass.action")//创建班级
	public String createclass(HttpServletRequest request,ModelMap map)
	{
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Banji> allbj = bjdao.findall();
		String bid = "B0";
		if(allbj.size()<10){
			bid = bid + "0" + allbj.size()+1;
		}
		else{
			bid = bid + allbj.size()+1;
		}
		String bname = request.getParameter("bname");
		teacherTool tt= (teacherTool)request.getSession().getAttribute("teacher");
		Banji bj = new Banji();
		bj.setBid(bid);
		bj.setBname(bname);
		bj.setTid(tt.getT().getTid());
		bj.setInvite();
		while(bjdao.findByinvite(bj.getInvite())!=null){
			bj.setInvite();
		}
		bjdao.add(bj);
		List<Banji> bjs = tt.getBj();
		bjs.add(bj);
		tt.setBj(bjs);
		tt.setHaveBanji(true);
		request.getSession().setAttribute("teacher", tt);
		return "Tlogin";
	}
	@RequestMapping("/intoclass.action")//教师进入班级
	public String intoclass(HttpServletRequest request,ModelMap map)
	{
		String bid = request.getParameter("bid");
		Banji bj = bjdao.findByBid(bid);
		teacherTool tt = (teacherTool)request.getSession().getAttribute("teacher");
		tt.setCurrenbj(bj);
		List<Exam> e = edao.findByBid(bid);
		tt.setBjexam(e);				
		request.getSession().setAttribute("teacher", tt);
		return "Tbandetail";
	}
	@RequestMapping("/intoexam.action")//选择考卷
	public String intoexam(HttpServletRequest request,ModelMap map)
	{
		String eid = request.getParameter("eid");
		List<Examdetail> et = etdao.findByEid(eid);
		teacherTool tt = (teacherTool)request.getSession().getAttribute("teacher");
		tt.setCurrenet(et);
		Exam e = edao.findByEid(eid);
		tt.setCurrene(e);
		request.getSession().setAttribute("teacher", tt);
		return "Slogin";
	}
	@RequestMapping("/deleteclass.action")//删除班级
	public String deleteExam(HttpServletRequest request,ModelMap map)
	{
		String bid = request.getParameter("deletebid");
		List<Exam> e = edao.findByBid(bid);
		for(int i=0;i<e.size();i++){
			gddao.delete(e.get(i).getEid());
			gdao.delete(e.get(i).getEid());
			etdao.delete(e.get(i).getEid());
			edao.delete(e.get(i).getEid());
		}
		bjdao.delete(bid);
		teacherTool tt = (teacherTool)request.getSession().getAttribute("teacher");
		List<Examdetail> allet = etdao.findAll();
		tt.setAllet(allet);//更新题库
		List<Banji> allbj = bjdao.findall();
		if(allbj==null){
			tt.setHaveBanji(false);
		}
		tt.setBj(allbj);//更新班级
		List<Exam> alle = edao.findByTid(tt.getT().getTid());
		tt.setExam(alle);
		request.getSession().setAttribute("teacher", tt);
		return "Tlogin";
	}
	@RequestMapping("/deleteexam.action")//删除考卷
	public String deleteexam(HttpServletRequest request,ModelMap map)
	{
		String eid = request.getParameter("deleteeid");
		System.out.println(eid);
		Exam e = edao.findByEid(eid);
		gddao.delete(eid);
		gdao.delete(eid);
		etdao.delete(eid);
		edao.delete(eid);
		teacherTool tt = (teacherTool)request.getSession().getAttribute("teacher");
		List<Exam> bjexam = edao.findByBid(tt.getCurrenbj().getBid());
		tt.setBjexam(bjexam);
		List<Examdetail> allet = etdao.findAll();
		tt.setAllet(allet);//更新题库
		List<Exam> alle = edao.findByTid(tt.getT().getTid());
		tt.setExam(alle);
		request.getSession().setAttribute("teacher", tt);
		return "Tbandetail";
	}
	@RequestMapping("/createexam.action")//创造考卷
	public String createexam(HttpServletRequest request,ModelMap map)
	{
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String choose = request.getParameter("chose");
		if(choose.equals("1")){
			List<Exam> alle = edao.findall();
			int count = alle.size()+1;
			String eid = "E0";
			if(alle.size()<10){
				eid = eid + "0" + count;
			}
			else{
				eid = eid + count;
			}
			Exam e = new Exam();
			e.setEid(eid);
			teacherTool tt = (teacherTool)request.getSession().getAttribute("teacher");
			e.setTid(tt.getT().getTid());
			e.setBid(tt.getCurrenbj().getBid());
			String date = request.getParameter("examdeadline");
			String number = request.getParameter("number");
			e.setEtime(date);
			edao.add(e);
			tt.setExam(edao.findByTid(tt.getT().getTid()));
			tt.setBjexam(edao.findByBid(tt.getCurrenbj().getBid()));
			tt.setCurrene(e);
			request.getSession().setAttribute("teacher", tt);
			request.getSession().setAttribute("number",number);
			return "Tcreateexam1";
		}
		else{
			teacherTool tt = (teacherTool)request.getSession().getAttribute("teacher");
			List<Exam> e = edao.findexTid(tt.getT().getTid());
			request.getSession().setAttribute("exam", e);
			return "Tcreateexam2";
		}		
	}
	@RequestMapping("/chooseExam.action")//创造考卷
	public String chooseExam(HttpServletRequest request,ModelMap map)
	{
		String eid = request.getParameter("choseexam");
		String date = request.getParameter("examdeadline");
		Exam e = new Exam();
		e.setEid(eid);
		teacherTool tt = (teacherTool)request.getSession().getAttribute("teacher");
		e.setTid(tt.getT().getTid());
		e.setBid(tt.getCurrenbj().getBid());
		e.setEtime(date);
		edao.add(e);
		tt.setExam(edao.findByTid(tt.getT().getTid()));
		tt.setBjexam(edao.findByBid(tt.getCurrenbj().getBid()));
		tt.setCurrene(e);
		request.getSession().setAttribute("number", tt);
		return "Tbandetail";
	}
	@RequestMapping("/createed.action")//出题
	public String createed(HttpServletRequest request,ModelMap map)
	{
		int number = Integer.parseInt((String) request.getSession().getAttribute("number"));
		teacherTool tt = (teacherTool)request.getSession().getAttribute("teacher");
		for(int i=0;i<number;i++){
			List<Examdetail> allet = etdao.findAll();
			int count = allet.size()+1;
			String etid = "ET";
			if(allet.size()<10){
				etid = etid + "0" + count;
			}
			else{
				etid = etid + count;
			}
			String timu = "question" + i;
			String quea = "que" + i;
			String context = request.getParameter(timu);
			String answer = request.getParameter(quea);
			Examdetail et = new Examdetail();
			et.setEid(tt.getCurrene().getEid());
			et.setEtid(etid);
			et.setContext(context);
			et.setAnswer(answer);
			etdao.add(et);
		}
		return "Tbandetail";
	}
	@RequestMapping("/test.action")
	public String test(HttpServletRequest request,ModelMap map)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	Date dt=new Date();
    	String date = sdf.format(dt);
     	System.out.println(date);
     	Exam e = edao.findByEid("E001");
		return "index";
	}
}
