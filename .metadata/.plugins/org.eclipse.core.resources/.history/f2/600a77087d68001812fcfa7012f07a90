package testmvc;

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

import account.Account;
import account.AccountDAO;





@Controller
public class HelloController {
	
	@Resource
	AccountDAO adao;

	@RequestMapping("/home")
	public String Homepage(HttpServletRequest request,ModelMap map)
	{
		Account a = adao.findByid("S001");
		request.getSession().setAttribute("user", a);
		return "test";
	}
}
