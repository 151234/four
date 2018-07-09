package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;
import exam.*;

public final class Tcreateexam2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'Tbandetail.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function confirmDel()\r\n");
      out.write(" {  \r\n");
      out.write(" \r\n");
      out.write("  if(confirm(\"确定删除作业吗？\"))\r\n");
      out.write("  {\r\n");
      out.write("    document.forms.deletekaoshi.submit();\r\n");
      out.write("  }\r\n");
      out.write(" }\r\n");
      out.write(" function showde()\r\n");
      out.write(" {  \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("   document.getElementById(\"div_createexam2\").style.display=\"block\";\r\n");
      out.write(" }\r\n");
      out.write("  function hidede()\r\n");
      out.write(" {  \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("   document.getElementById(\"div_createexam2\").style.display=\"none\";\r\n");
      out.write(" }\r\n");
      out.write("</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("   <body>\r\n");
      out.write("  ");
 
   tool.teacherTool tt=(tool.teacherTool)session.getAttribute("teacher");
   List<Exam> e = (List<Exam>)session.getAttribute("exam");
   List<teacher.Teacher> t = (List<teacher.Teacher>)session.getAttribute("otherT");
   SimpleDateFormat ft=new SimpleDateFormat("yyyy年MM月dd日");
   Date time= new Date();
   String date=ft.format(time);
   String week="";
   if(time.getDay()==0)
   {
     week="星期日";
   }else if(time.getDay()==1)
   {
     week="星期一";
   }else if(time.getDay()==2)
   {
     week="星期二";
   }else if(time.getDay()==3)
   {
     week="星期三";
   }else if(time.getDay()==4)
   {
     week="星期四";
   }else if(time.getDay()==5)
   {
     week="星期五";
   }else 
   {
     week="星期六";
   }
   
   
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
      out.write("          <div id=\"div_slogin_left_menu1\" style=\"position:absolute;width:100px;height:30px;left:40px;top:65px;\r\n");
      out.write("          text-align:center;font-size:16px;\"><a href=\"\" onclick=\"myclassclick();\">我的班级</a></div>        \r\n");
      out.write("           <div id=\"div_slogin_left_menu2\" style=\"position:absolute;width:100px;height:30px;left:40px;top:120px;\r\n");
      out.write("          text-align:center;font-size:16px\"><a href=\"\" onclick=\"mypratiseclick();\">题库</a></div>\r\n");
      out.write("           <div id=\"div_slogin_left_menu4\" style=\"position:absolute;width:180px;height:60px;left:0px;top:180px;\r\n");
      out.write("          text-align:center;font-size:16px\"><a href=\"\">我的学豆</a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
//状态栏 
      out.write("\r\n");
      out.write("    <div id=\"div_slogin_state\" style=\"position:absolute;width:1740px;height:50px;left:180px;top:245px;\r\n");
      out.write("    border-bottom:1px solid\">\r\n");
      out.write("          <div id=\"div_slogin_state0\" style=\"position:absolute;width:170px;height:50px;left:0px;top:15px;\r\n");
      out.write("          text-align:center;font-size:16px\"><b>欢迎，老师，");
      out.print(tt.getT().getTname() );
      out.write("</b></div>\r\n");
      out.write("           <div id=\"div_slogin_state1\" style=\"position:absolute;width:270px;height:50px;left:570px;top:15px;\r\n");
      out.write("          text-align:center;font-size:16px\">今天是 ");
      out.print(date+","+week);
      out.write("</div>\r\n");
      out.write("           <div id=\"div_slogin_state2\" style=\"position:absolute;width:120px;height:50px;left:1540px;top:15px;\r\n");
      out.write("          text-align:center;font-size:16px\"><a href=\"loginout.jsp\">注销</a></div>       \r\n");
      out.write("    </div>\r\n");
      out.write("          ");
//主要内容 
      out.write("\r\n");
      out.write("   \r\n");
      out.write("     <div id=\"div_content\" style=\"position:absolute;width:1740px;height:685px;left:180px;top:295px;\">\r\n");
      out.write("      <div id=\"div_content_sclass_link\" style=\"posiont:absolute;width:1740px;height:50px;left:0px;top:0px;border-bottom:1px \r\n");
      out.write("         solid #aaaaaa\">\r\n");
      out.write("             <div id=\"div_content_sclass_link0\" style=\"position:absolute;width:100px;height:50px;left:15px;top:15px;\r\n");
      out.write("             font-size:14px;display:block;\"><a href=\"Tlogin.jsp\">我创建的班级</a></div>\r\n");
      out.write("             <div id=\"div_content_sclass_link1\" style=\"position:absolute;width:200px;height:50px;left:100px;top:15px;\r\n");
      out.write("             font-size:14px;display:block;\">><a href=\"Tbandetail.jsp\">");
      out.print(tt.getCurrenbj().getBname() );
      out.write("-作业</a></div>\r\n");
      out.write("             <div id=\"div_content_sclass_link2\" style=\"position:absolute;width:100px;height:50px;left:200px;top:15px;\r\n");
      out.write("             font-size:14px;display:block;\">>题库详情</a></div>\r\n");
      out.write("           </div>\r\n");
      out.write("        \r\n");
      out.write("        <form action=\"chooseExam.action\" method=\"post\">\r\n");
      out.write("                ");
 int hw_count=0;
            hw_count=e.size();
             int height=65;
             for(int i=0;i<hw_count;i++)
             {
          
          
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          ");

          if(i%4==0&&i!=0)
          {
             height+=120;
          }
          
      out.write("\r\n");
      out.write("          <div id=\"div_content_sclass_ch");
      out.print(i );
      out.write("\" style=\"position:absolute;width:230px;height:135px;left:");
      out.print(i*180+i*20+30);
      out.write("px;top:\r\n");
      out.write("            ");
      out.print(height );
      out.write("px;\">\r\n");
      out.write("            <div id=\"div_content_sclass_chomework");
      out.print(i );
      out.write("\" style=\"position:absolute;width:230px;height:120px;left:0px;top:0px;background:url(images/work/");
      out.print(i );
      out.write(".jpg);border:1px solid #666666;\" >\r\n");
      out.write("                <div id=\"div_content_sclass_chomework");
      out.print(i);
      out.write("_t1\" style=\"position:absolute;width:50px;height:30px;left:100px;top:10px;\r\n");
      out.write("                 font-size:10px\"><b>");
      out.print(e.get(i).getEid() );
      out.write("</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"div_content_sclass_cstate_p");
      out.print(i );
      out.write("_t2\" style=\"position:absolute;width:100px;height:30px;left:10px;top:80px;\r\n");
      out.write("                 font-size:10px\"><b>教师：");
      out.print(t.get(i).getTname() );
      out.write("</b></div>\r\n");
      out.write("                <div id=\"div_content_sclass_chomework");
      out.print(i);
      out.write("_t2\" style=\"position:absolute;width:40px;height:20px;left:180px;top:90px;\r\n");
      out.write("                 font-size:10px\"><a href=\"intoexam.action?eid=");
      out.print(e.get(i).getEid() );
      out.write("\">进入</a></div>        \r\n");
      out.write("                 <div id=\"div_content_sclass_c");
      out.print(i);
      out.write("\"style=\"position:absolute;width:30px;height:14px;left:115px;top:121px;\">\r\n");
      out.write("                 <input type=\"radio\" name=\"choseexam\" value=\"");
      out.print(e.get(i).getEid() );
      out.write("\">\r\n");
      out.write("                 </div>\r\n");
      out.write("        </div> ");
 } 
      out.write("  \r\n");
      out.write("            \r\n");
      out.write("            <div id=\"div_content_pratise_submit\" style=\"position:absolute;width:300px;height=:200px;left:750px;top:500px\">\r\n");
      out.write("                                       截至时间 <input type=\"text\" name=\"examdeadline\"><br>\r\n");
      out.write("               <input type=\"submit\" value=\"发布\">\r\n");
      out.write("               </div>\r\n");
      out.write("                </div>\r\n");
      out.write("       </form>\r\n");
      out.write("        </div>\r\n");
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
