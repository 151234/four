package testmvc;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestMapping;

import exam.Exam;
import exam.ExamDAO;
import examdetail.Examdetail;
import examdetail.ExamdetailDAO;

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
			List<Banji> bj = new ArrayList<Banji>();
			st.setS(s);
			st.setSidenty(a.getIdentify());
			if(sb==null){
				st.setHaveBanji(false);
				st.setBj(null);
			}
			else{
				for(int i=0;i<sb.size();i++){
					Banji b = bjdao.findByBid(sb.get(i).getBid());
					bj.add(b);
				}
				st.setHaveBanji(true);
				st.setBj(bj);
			}	
			st.setExam(null);
			st.setCurrentbj(null);
			st.setEd(null);
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
			tt.setExam(null);
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
	@RequestMapping("/joinclass.action")
	public String joinclass(HttpServletRequest request,ModelMap map)
	{
		//String bid = request.getParameter("bid");
		String bid = "B002";
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
				List<Banji> b2 = st.getBj();
				b2.add(bj2);
				st.setBj(b2);
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
		request.getSession().setAttribute("student", st);
		return "";
	}
	public studentTool intoclass(HttpServletRequest request,String bid)
	{
		studentTool st = (studentTool)request.getSession().getAttribute("student");
		System.out.println(bid);
		return st;
	}
	@RequestMapping("/test.action")//学生进入班级
	public String test(HttpServletRequest request,ModelMap map)
	{
		studentTool st = intoclass(request,"B001");
		return "";
	}
}
