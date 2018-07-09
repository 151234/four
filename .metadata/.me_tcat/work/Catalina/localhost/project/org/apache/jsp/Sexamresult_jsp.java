package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;

public final class Sexamresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'Sexamdetail.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  ");

  tool.studentTool st=(tool.studentTool)session.getAttribute("student");
  ArrayList<tool.gradeTool> gt=(ArrayList<tool.gradeTool>)session.getAttribute("grademessage");
 int g=Integer.parseInt((session.getAttribute("grade").toString()));
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
      out.write("   \r\n");
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
      out.write("          text-align:center;font-size:16px\"><a href=\"\" onclick=\"mypratiseclick();\">练习</a></div>\r\n");
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
      out.write("          text-align:center;font-size:16px\"><b>欢迎，学生，");
      out.print(st.getS().getSname());
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
      out.write("     <div id=\"div_content\" style=\"position:absolute;width:1740px;height:685px;left:180px;top:295px;\">   \r\n");
      out.write("       \r\n");
      out.write("     ");
//班级导航连接 
      out.write("\r\n");
      out.write("         <div id=\"div_content_sclass_link\" style=\"posiont:absolute;width:1740px;height:50px;left:0px;top:0px;border-bottom:1px \r\n");
      out.write("         solid #aaaaaa\">\r\n");
      out.write("             <div id=\"div_content_sclass_link0\" style=\"position:absolute;width:100px;height:50px;left:15px;top:15px;\r\n");
      out.write("             font-size:14px;display:block;\"><a href=\"Slogin.jsp\">我加入的班级</a></div>\r\n");
      out.write("             <div id=\"div_content_sclass_link1\" style=\"position:absolute;width:200px;height:50px;left:100px;top:15px;\r\n");
      out.write("             font-size:14px;display:block;\">><a href=\"Sbandetail.jsp\">");
      out.print(st.getCurrentbj().getBname() );
      out.write("-作业</a></div>\r\n");
      out.write("             <div id=\"div_content_sclass_link2\" style=\"position:absolute;width:100px;height:50px;left:200px;top:15px;\r\n");
      out.write("             font-size:14px;display:block;\">><a href=\"Sexamdetail.jsp\">作业详情</a></div>\r\n");
      out.write("           </div>\r\n");
      out.write("        \r\n");
      out.write("             <div id=\"div_content_sclass_hwdetail\" style=\"position:absolute;width:1740px;height:635px;left:0px;top:50px;display:block;\">\r\n");
      out.write("              <div id=\"div_content_sclass_hwname\" style=\"position:absolute;width:400px;height:30px;left:700px;top:0px;font-size:20px\"><b>作业标题</b></div> \r\n");
      out.write("               <div id=\"div_content_class_question\" style=\"position:absolute;width:1740px;height:605px;left:0px;top:30px\">\r\n");
      out.write("        <form action=\"\">\r\n");
      out.write("        <table border=\"0\" style=\"position:abusolute;left:650px;font-size:18px\">\r\n");
      out.write("        ");

        int pagesize=5;
	int curp=1;
	int pagecount=1;
	int rowcount=1;
	if(request.getParameter("page")==null)
			  {
			  curp=1;
			  }else{
			  curp=Integer.parseInt(request.getParameter("page"));
			  }
	int thepage=(curp-1)*pagesize; 
	rowcount=st.getEd().size();
	 // System.out.println(rowcount);  
	pagecount=(rowcount+pagesize-1)/pagesize;
    int i=thepage;
        while(i<(pagesize+thepage)&&rowcount!=0&&i<st.getEd().size())
         {     
         
      out.write("\r\n");
      out.write("         ");
if(i%2==1)
         {
         if(gt.get(i).isIsright())
         {
          
      out.write("\r\n");
      out.write("           <tr bgcolor=\"#cccccc\"><td width=\"15%\" style=\"padding-left:450px;padding-top:15px\">");
      out.print(i+1 +". "+st.getEd().get(i).getContext());
      out.write("</td>\r\n");
      out.write("              <td width=\"10%\"style=\"padding-top:15px\">=<input name=\"que");
      out.print(i );
      out.write("\" value=\"");
      out.print(gt.get(i).getSanswer() );
      out.write(" \" style=\"disable:true;\"></td><td width=\"35%\"><div id=\"answer");
      out.print(i );
      out.write("\"style=\"font-size:14px\"><input  value=\"正确答案：");
      out.print(st.getEd().get(i).getAnswer() );
      out.write("\" style=\"disable:true;display:block;background:transparent;border:0px;\"></div></td>\r\n");
      out.write("          ");
i++;}else
          {
      out.write("\r\n");
      out.write("          <tr bgcolor=\"#cccccc\"><td width=\"15%\" style=\"padding-left:450px;padding-top:15px;color:#ff0000\">");
      out.print(i+1 +". "+st.getEd().get(i).getContext());
      out.write("</td>\r\n");
      out.write("              <td width=\"10%\"style=\"padding-top:15px\">=<input name=\"que");
      out.print(i );
      out.write("\" value=\"");
      out.print(gt.get(i).getSanswer() );
      out.write(" \" style=\"disable:true;\"></td><td width=\"35%\"><div id=\"answer");
      out.print(i );
      out.write("\"style=\"font-size:14px\"><input  value=\"正确答案：");
      out.print(st.getEd().get(i).getAnswer() );
      out.write("\" style=\"disable:true;display:block;background:transparent;border:0px;\"></div></td>\r\n");
      out.write("         ");
i++;} 
      out.write("\r\n");
      out.write("          ");
 }else{   
          if(gt.get(i).isIsright())
         {
      out.write("\r\n");
      out.write("              <tr><td width=\"15%\" style=\"padding-left:450px;padding-top:15px\">");
      out.print(i+1 +". "+st.getEd().get(i).getContext());
      out.write("</td>\r\n");
      out.write("              <td width=\"10%\"style=\"padding-top:15px\">=<input name=\"que");
      out.print(i );
      out.write("\" value=\"");
      out.print(gt.get(i).getSanswer() );
      out.write(" \" style=\"disable:true;\"></td><td width=\"35%\"><div id=\"answer");
      out.print(i );
      out.write("\"style=\"font-size:14px\"><input  value=\"正确答案：");
      out.print(st.getEd().get(i).getAnswer() );
      out.write("\" style=\"disable:true;display:block;background:transparent;border:0px;\"></div></td>\r\n");
      out.write("          ");
i++;}else
          {
      out.write("\r\n");
      out.write("          <tr ><td width=\"15%\" style=\"padding-left:450px;padding-top:15px;color:#ff0000\">");
      out.print(i+1 +". "+st.getEd().get(i).getContext());
      out.write("</td>\r\n");
      out.write("              <td width=\"10%\"style=\"padding-top:15px\">=<input name=\"que");
      out.print(i );
      out.write("\" value=\"");
      out.print(gt.get(i).getSanswer() );
      out.write(" \" style=\"disable:true;\"></td><td width=\"35%\"><div id=\"answer");
      out.print(i );
      out.write("\" style=\"font-size:14px\"><input  value=\"正确答案：");
      out.print(st.getEd().get(i).getAnswer() );
      out.write("\" style=\"disable:true;display:block;background:transparent;border:0px;\"></div></td>\r\n");
      out.write("         ");
i++;} 
      out.write("\r\n");
      out.write("             \r\n");
      out.write("         ");
 }} 
      out.write("\r\n");
      out.write("          <tr><td>当前第 ");
      out.print(curp );
      out.write("页    共");
      out.print(pagecount );
      out.write("页</td></tr>\r\n");
      out.write("   \r\n");
      out.write("    ");
if(curp>1)
    {
      out.write("\r\n");
      out.write("   <tr><th> <a href=\"Sexamresult.jsp?page=");
      out.print(curp-1);
      out.write("\">上一页</a></th></tr> ");

    }
      out.write("\r\n");
      out.write("    ");
if(curp<pagecount){ 
      out.write("\r\n");
      out.write("   <th>  <a href=\"Sexamresult.jsp?page=");
      out.print(curp+1);
      out.write("\">下一页</a></th> ");

    }
      out.write("\r\n");
      out.write("         </table>\r\n");
      out.write("               <div id=\"div_content_pratise_result\" style=\"position:absolute;width:80px;height=:20px;left:750px;top:500px\">\r\n");
      out.write("              正确率");
      out.print(g );
      out.write("\r\n");
      out.write("               </div>\r\n");
      out.write("           </form>\r\n");
      out.write("        </div>\r\n");
      out.write("             </div>\r\n");
      out.write("      </div>\r\n");
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
