<%@ page language="java" import="java.util.*" import="java.text.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Sexamdetail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%
  tool.studentTool st=(tool.studentTool)session.getAttribute("student");

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
   
   %>
    <div id="div_slogin_top" style="position:absolute;width:1920px;height:245px;left:0px;top:0px;border:1px solid;
    background-image:url(images/4.jpg)"></div>
    <%//左部菜单 %>
    <div id="div_slogin_left" style="position:absolute;width:180px;height:735px;left:0px;top:245px;border-right:1px solid;
    background-image:url(images/5.jpg)">
         <div id="div_slogin_left_menu0" style="position:absolute;width:180px;height:50px;left:0px;top:0px;
         border-bottom:1px solid; text-align:center;font-size:30px"><b>菜单</b></div>
          <div id="div_slogin_left_menu1" style="position:absolute;width:100px;height:30px;left:40px;top:65px;
          text-align:center;font-size:16px;"><a href="" onclick="myclassclick();return false;">我的班级</a></div>        
           <div id="div_slogin_left_menu2" style="position:absolute;width:100px;height:30px;left:40px;top:120px;
          text-align:center;font-size:16px"><a href="" onclick="mypratiseclick();return false;">练习</a></div>
           <div id="div_slogin_left_menu3" style="position:absolute;width:180px;height:60px;left:0px;top:180px;
          text-align:center;font-size:16px"><a href="">错题本</a></div>
           <div id="div_slogin_left_menu4" style="position:absolute;width:180px;height:60px;left:0px;top:240px;
          text-align:center;font-size:16px"><a href="">我的学豆</a></div>
    </div>
    <%//状态栏 %>
    <div id="div_slogin_state" style="position:absolute;width:1740px;height:50px;left:180px;top:245px;
    border-bottom:1px solid">
          <div id="div_slogin_state0" style="position:absolute;width:170px;height:50px;left:0px;top:15px;
          text-align:center;font-size:16px"><b>欢迎，学生，<%=st.getS().getSname() %></b></div>
           <div id="div_slogin_state1" style="position:absolute;width:270px;height:50px;left:570px;top:15px;
          text-align:center;font-size:16px">今天是 <%=date+","+week%></div>
           <div id="div_slogin_state2" style="position:absolute;width:120px;height:50px;left:1540px;top:15px;
          text-align:center;font-size:16px"><a href="loginout.jsp">注销</a></div>       
    </div>
          <%//主要内容 %>
     <div id="div_content" style="position:absolute;width:1740px;height:685px;left:180px;top:295px;">   
       
     <%//班级导航连接 %>
         <div id="div_content_sclass_link" style="posiont:absolute;width:1740px;height:50px;left:0px;top:0px;border-bottom:1px 
         solid #aaaaaa">
             <div id="div_content_sclass_link0" style="position:absolute;width:100px;height:50px;left:15px;top:15px;
             font-size:14px;display:block;"><a href="Slogin.jsp">我加入的班级</a></div>
             <div id="div_content_sclass_link1" style="position:absolute;width:200px;height:50px;left:100px;top:15px;
             font-size:14px;display:block;">><a href="Sbandetail.jsp"><%=st.getCurrentbj().getBname() %>-作业</a></div>
             <div id="div_content_sclass_link2" style="position:absolute;width:100px;height:50px;left:200px;top:15px;
             font-size:14px;display:block;">><a href="Sexamdetail.jsp">作业详情</a></div>
           </div>
        
             <div id="div_content_sclass_hwdetail" style="position:absolute;width:1740px;height:635px;left:0px;top:50px;display:block;">
              <div id="div_content_sclass_hwname" style="position:absolute;width:400px;height:30px;left:700px;top:0px;font-size:20px"><b>作业标题</b></div> 
               <div id="div_content_class_question" style="position:absolute;width:1740px;height:605px;left:0px;top:30px">
        <form action="">
        <table border="0" style="position:abusolute;left:650px;font-size:18px">
        <%
         for(int i=0;i<st.getEd().size();i++)
         {     
         %>
         <%if(i%2==1)
         {
          %>
           <tr bgcolor="#cccccc"><td width="15%" style="padding-left:450px;padding-top:15px"><%=i+1 +". "+st.getEd().get(i).getContext()%></td>
              <td width="30%"style="padding-top:15px">=<input name="que<%=i %>"></td>
          <%}else{ %>
        
         <tr><td width="15%" style="padding-left:450px;padding-top:15px"><%=i+1 +". "+st.getEd().get(i).getContext() %></td>
             <td width="30%"style="padding-top:15px">=<input name="que<%=i %>"></td>
             <%} %>
             
         <% } %>
         </table>
               <div id="div_content_pratise_submit" style="position:absolute;width:30px;height=:20px;left:750px;top:500px">
               <input type="submit" value="提交">
               </div>
           </form>
        </div>
             </div>
      </div>
  </body>
</html>
