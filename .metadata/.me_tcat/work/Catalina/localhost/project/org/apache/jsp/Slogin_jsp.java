package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import account.*;

public final class Slogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>My JSP 'Slogin.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  ");
Account a = (Account)session.getAttribute("user"); 
      out.write("\r\n");
      out.write("    <div id=\"div_slogin_top\" style=\"position:absolute;width:1920px;height:245px;left:0px;top:0px;border:1px solid;\r\n");
      out.write("    background-image:url(images/4.jpg)\"></div>\r\n");
      out.write("    ");
//左部菜单 
      out.write("\r\n");
      out.write("    <div id=\"div_slogin_left\" style=\"position:absolute;width:180px;height:735px;left:0px;top:245px;border-right:1px solid;\r\n");
      out.write("    background-image:url(images/5.jpg)\">\r\n");
      out.write("         <div id=\"div_slogin_left_menu0\" style=\"position:absolute;width:180px;height:50px;left:0px;top:0px;\r\n");
      out.write("         border-bottom:1px solid; text-align:center;font-size:30px\"><b>菜单</b></div>\r\n");
      out.write("          <div id=\"div_slogin_left_menu1\" style=\"position:absolute;width:180px;height:60px;left:0px;top:65px;\r\n");
      out.write("          text-align:center;font-size:16px\"><a href=\"\">我的班级</a></div>\r\n");
      out.write("           <div id=\"div_slogin_left_menu2\" style=\"position:absolute;width:180px;height:60px;left:0px;top:120px;\r\n");
      out.write("          text-align:center;font-size:16px\"><a href=\"\">练习</a></div>\r\n");
      out.write("           <div id=\"div_slogin_left_menu3\" style=\"position:absolute;width:180px;height:60px;left:0px;top:180px;\r\n");
      out.write("          text-align:center;font-size:16px\"><a href=\"\">错题本</a></div>\r\n");
      out.write("           <div id=\"div_slogin_left_menu4\" style=\"position:absolute;width:180px;height:60px;left:0px;top:240px;\r\n");
      out.write("          text-align:center;font-size:16px\"><a href=\"\">我的学豆</a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
//状态栏 
      out.write("\r\n");
      out.write("    <div id=\"div_slogin_state\" style=\"position:absolute;width:1740px;height:50px;left:180px;top:245px;\r\n");
      out.write("    border-bottom:1px solid\">\r\n");
      out.write("          <div id=\"div_slogin_state0\" style=\"position:absolute;width:170px;height:50px;left:0px;top:15px;\r\n");
      out.write("          text-align:center;font-size:16px\"><b>欢迎，身份，姓名</b></div>\r\n");
      out.write("           <div id=\"div_slogin_state1\" style=\"position:absolute;width:270px;height:50px;left:570px;top:15px;\r\n");
      out.write("          text-align:center;font-size:16px\">今天是x年x月x日周x</div>\r\n");
      out.write("           <div id=\"div_slogin_state2\" style=\"position:absolute;width:120px;height:50px;left:1540px;top:15px;\r\n");
      out.write("          text-align:center;font-size:16px\"><a href=\"\">注销</a></div>       \r\n");
      out.write("    </div>\r\n");
      out.write("          ");
//主要内容 
      out.write("\r\n");
      out.write("     <div id=\"div_content\" style=\"position:absolute;width:1740px;height:685px;left:180px;top:295px;\">     \r\n");
      out.write("       <div id=\"div_content_sclass\" style=\"position:absolute;width:1740px;height:685px;left:0px;top:0px;display:none;z-index:0;\">\r\n");
      out.write("     ");
//班级导航连接 
      out.write("\r\n");
      out.write("         <div id=\"div_content_sclass_link\" style=\"posiont:absolute;width:1740px;height:50px;left:0px;top:0px;border-bottom:1px \r\n");
      out.write("         solid #aaaaaa\">\r\n");
      out.write("             <div id=\"div_content_sclass_link0\" style=\"position:absolute;width:100px;height:50px;left:15px;top:15px;\r\n");
      out.write("             font-size:14px;\"><a href=\"\">我加入的班级</a></div>\r\n");
      out.write("             <div id=\"div_content_sclass_link1\" style=\"position:absolute;width:100px;height:50px;left:100px;top:15px;\r\n");
      out.write("             font-size:14px;\">><a href=\"\">班级名称</a></div>\r\n");
      out.write("             <div id=\"div_content_sclass_link2\" style=\"position:absolute;width:100px;height:50px;left:170px;top:15px;\r\n");
      out.write("             font-size:14px;\">><a href=\"\">班级作业</a></div>\r\n");
      out.write("             <div id=\"div_content_sclass_link3\" style=\"position:absolute;width:100px;height:50px;left:240px;top:15px;\r\n");
      out.write("             font-size:14px;\">><a href=\"\">作业详情</a></div>\r\n");
      out.write("         </div>\r\n");
      out.write("         ");
//显示已加入的班级 
      out.write("\r\n");
      out.write("         <div id=\"div_content_sclass_cstate\" style=\"position:absolute;width:1740px;height:635px;left:0px;top:50px;\">\r\n");
      out.write("         ");
int class_count=0;
          /* Arraylist<> stu_mess=reqeust.getparament();
             class_count=stu_mess.get[];
             int height=15;
             for(int i=0;i<class_count;i++)
             {
          */
          
      out.write("\r\n");
      out.write("          ");
/*
          if(i%4==0&&i!=0)
          {
             height+120
          }
            <div id="div_content_sclass_cstate_p" style="position:absolute;width:230px;height:120px;left:<3=i*180+i*20+203>px;top:
            <3=height 3>px;background-image:url(/iamges/class/<3=i3>.jpg)" border:1px solid #666666>
                <div id="div_content_sclass_cstate_t1" style="position:absolute;width:120px;height:30px;left:10px;top:10px;
                 font-size:10px"><b>班级名称</b>
                </div>
                <div id="div_content_sclass_cstate_t2" style="position:absolute;width:100px;height:30px;left:10px;top:80px;
                 font-size:10px"><b>教师名称</b></div>
                <div id="div_content_sclass_cstate_in" style="position:absolute;width:40px;height:20px;left:180px;top:80px;
                 font-size:10px"><a href="xx?bid=">进入</div>
            </div>
          */ 
      out.write("\r\n");
      out.write("          <div id=\"div_content_sclass_cstate_p\" style=\"position:absolute;width:230px;height:120px;left:20px;top:15px;\r\n");
      out.write("                 border:1px solid #666666;visibility:\" >\r\n");
      out.write("                <div id=\"div_content_sclass_cstate_t1\" style=\"position:absolute;width:120px;height:30px;left:10px;top:10px;\r\n");
      out.write("                 font-size:10px\"><b>班级名称</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"div_content_sclass_cstate_t2\" style=\"position:absolute;width:100px;height:30px;left:10px;top:80px;\r\n");
      out.write("                 font-size:10px\"><b>教师名称</b></div>\r\n");
      out.write("                <div id=\"div_content_sclass_cstate_in\" style=\"position:absolute;width:40px;height:20px;left:180px;top:80px;\r\n");
      out.write("                 font-size:10px\"><a href=\"xx?bid=\">进入</a></div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("     <div id=\"div_content_pratise\" style=\"position:absolute;width:1740px;height:685px;left:0px;top:0px;\">\r\n");
      out.write("        <div id=\"div_content_pratise_control\" style=\"posiont:absolute;width:1740px;height:30px;left:0px;top:0px;border-bottom:1px \r\n");
      out.write("         solid #aaaaaa\">\r\n");
      out.write("           <div id=\"div_content_pratise_control0\" style=\"posiont:absolute;width:800px;height:30px;left:800px;top:10px;font-size:14px;\r\n");
      out.write("           \"><form action=\"\" method=\"post\">\r\n");
      out.write("            <table>\r\n");
      out.write("           <tr><td>请输入难度系数:<input type=\"text\" name=\"pratise_hard\">  请输入题目数量:<input type=\"text\" name=\"pratise_num\"><input type=\"submit\" \r\n");
      out.write("           value=\"生成\">\r\n");
      out.write("           </td>\r\n");
      out.write("           </tr>\r\n");
      out.write("           </table>\r\n");
      out.write("          </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"div_content_pratise_question\" style=\"position:absolute;width:1740px;height:655px;left:0px;top:30px\">\r\n");
      out.write("        <table border=\"0\" style=\"position:abusolute;left:450px\">\r\n");
      out.write("        ");
//int hard=0;
        
          int num=0;
         /*Arraylist<> ques=request.getParameter(arg0)
         for(int i=1;i<=ques.lenth;i++)
         {
         
         
         */
         
      out.write("\r\n");
      out.write("         <tr><td width=\"15%\" style=\"padding-left:250px;padding-top:15px\">1. 1+1=</td>\r\n");
      out.write("             <td width=\"30%\"style=\"padding-top:15px\"><input name=\"que1\"></td>\r\n");
      out.write("             <td width=\"15%\" style=\"padding-left:100px;padding-top:15px\">2. 2+2=</td>\r\n");
      out.write("             <td width=\"30%\"style=\"padding-top:15px\"><input name=\"que2\"></td></tr>\r\n");
      out.write("              <tr bgcolor=\"#cccccc\"><td width=\"15%\" style=\"padding-left:250px;padding-top:15px\">1. 1+1=</td>\r\n");
      out.write("              <td width=\"30%\"style=\"padding-top:15px\"><input name=\"que1\"></td>\r\n");
      out.write("             <td width=\"15%\" style=\"padding-left:100px;padding-top:15px\">2. 2+2=</td>\r\n");
      out.write("             <td width=\"30%\"style=\"padding-top:15px\"><input name=\"que2\"></td></tr>\r\n");
      out.write("         ");
/*}*/ 
      out.write("\r\n");
      out.write("         </table>\r\n");
      out.write("         <div id=\"div_content_pratise_submit\" style=\"position:absolute;width:30px;height=:20px;left:750px;top:500px\">\r\n");
      out.write("           <input type=\"button\" value=\"提交\">\r\n");
      out.write("           </div>\r\n");
      out.write("        </div>\r\n");
      out.write("     </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}