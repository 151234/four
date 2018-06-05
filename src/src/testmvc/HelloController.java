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

import student.Student;
import student.StudentDAO;
import teacher.Teacher;
import teacher.TeacherDAO;
import tool.studentTool;

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
	
	@RequestMapping("/login.action")
	public String login(HttpServletRequest request,ModelMap map)
	{
		Account a = new Account();
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		String codein = request.getParameter("checkma");
		String code = (String)request.getSession().getAttribute("code");
		if(!codein.endsWith(code)){
			request.getSession().setAttribute("loginErr", "��֤���������");
			return "loginError";
		}	
		else{
			a = adao.findByid(username);
			if(a==null){
				request.getSession().setAttribute("loginErr", "�˺Ų�����");
				return "loginError";
			}
			else
				if(!a.getPassword().equals(pass)){
					request.getSession().setAttribute("loginErr", "�������");
					return "loginError";
				}
		}
		if(a.getIdentify()==1){
			studentTool st = new studentTool();
			Student s = sdao.findBySid(username);
			Banji bj = bjdao.findByBid(s.getBid());
			st.setS(s);
			st.setSidenty(a.getIdentify());
			if(bj==null){
				st.setHaveBanji(false);
				st.setBj(null);
				st.setExam(null);
			}
			else{
				st.setHaveBanji(true);
				st.setBj(bj);
				List<Exam> e = (List<Exam>)edao.findByBid(bj.getBid());
			}	
			request.getSession().setAttribute("student", st);
			return "Slogin";
		}
		else if(a.getIdentify()==1){
			Teacher t = tdao.findByTid(username);
			request.getSession().setAttribute("teacher", t);
			return "Tlogin";
		}
		else{
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
		if(identy==1){
			Student st=new Student();
			st.setSid(username);
			st.setBid(null);
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
}
