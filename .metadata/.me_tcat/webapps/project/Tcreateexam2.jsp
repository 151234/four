<%@ page language="java" import="java.util.*" import="java.text.*,exam.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Tbandetail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
function confirmDel()
 {  
 
  if(confirm("确定删除作业吗？"))
  {
    document.forms.deletekaoshi.submit();
  }
 }
 function showde()
 {  
 

   document.getElementById("div_createexam2").style.display="block";
 }
  function hidede()
 {  
 

   document.getElementById("div_createexam2").style.display="none";
 }
</script>
  </head>
  
  <body>
   <body>
  <% 
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
   
   %>
    <div id="div_slogin_top" style="position:absolute;width:1920px;height:245px;left:0px;top:0px;border:1px solid;
    background-image:url(images/4.jpg)"></div>
    <%//左部菜单 %>
    <div id="div_slogin_left" style="position:absolute;width:180px;height:735px;left:0px;top:245px;border-right:1px solid;
    background-image:url(images/5.jpg)">
         <div id="div_slogin_left_menu0" style="position:absolute;width:180px;height:50px;left:0px;top:0px;
         border-bottom:1px solid; text-align:center;font-size:30px"><b>菜单</b></div>
          <div id="div_slogin_left_menu1" style="position:absolute;width:100px;height:30px;left:40px;top:65px;
          text-align:center;font-size:16px;"><a href="" onclick="myclassclick();">我的班级</a></div>        
           <div id="div_slogin_left_menu2" style="position:absolute;width:100px;height:30px;left:40px;top:120px;
          text-align:center;font-size:16px"><a href="" onclick="mypratiseclick();">题库</a></div>
           <div id="div_slogin_left_menu4" style="position:absolute;width:180px;height:60px;left:0px;top:180px;
          text-align:center;font-size:16px"><a href="">我的学豆</a></div>
    </div>
    <%//状态栏 %>
    <div id="div_slogin_state" style="position:absolute;width:1740px;height:50px;left:180px;top:245px;
    border-bottom:1px solid">
          <div id="div_slogin_state0" style="position:absolute;width:170px;height:50px;left:0px;top:15px;
          text-align:center;font-size:16px"><b>欢迎，老师，<%=tt.getT().getTname() %></b></div>
           <div id="div_slogin_state1" style="position:absolute;width:270px;height:50px;left:570px;top:15px;
          text-align:center;font-size:16px">今天是 <%=date+","+week%></div>
           <div id="div_slogin_state2" style="position:absolute;width:120px;height:50px;left:1540px;top:15px;
          text-align:center;font-size:16px"><a href="loginout.jsp">注销</a></div>       
    </div>
          <%//主要内容 %>
   
     <div id="div_content" style="position:absolute;width:1740px;height:685px;left:180px;top:295px;">
      <div id="div_content_sclass_link" style="posiont:absolute;width:1740px;height:50px;left:0px;top:0px;border-bottom:1px 
         solid #aaaaaa">
             <div id="div_content_sclass_link0" style="position:absolute;width:100px;height:50px;left:15px;top:15px;
             font-size:14px;display:block;"><a href="Tlogin.jsp">我创建的班级</a></div>
             <div id="div_content_sclass_link1" style="position:absolute;width:200px;height:50px;left:100px;top:15px;
             font-size:14px;display:block;">><a href="Tbandetail.jsp"><%=tt.getCurrenbj().getBname() %>-作业</a></div>
             <div id="div_content_sclass_link2" style="position:absolute;width:100px;height:50px;left:200px;top:15px;
             font-size:14px;display:block;">>题库详情</a></div>
           </div>
        
        <form action="chooseExam.action" method="post">
                <% int hw_count=0;
            hw_count=e.size();
             int height=65;
             for(int i=0;i<hw_count;i++)
             {
          
          %>
          
          <%
          if(i%4==0&&i!=0)
          {
             height+=120;
          }
          %>
          <div id="div_content_sclass_ch<%=i %>" style="position:absolute;width:230px;height:135px;left:<%=i*180+i*20+30%>px;top:
            <%=height %>px;">
            <div id="div_content_sclass_chomework<%=i %>" style="position:absolute;width:230px;height:120px;left:0px;top:0px;background:url(images/work/<%=i %>.jpg);border:1px solid #666666;" >
                <div id="div_content_sclass_chomework<%=i%>_t1" style="position:absolute;width:50px;height:30px;left:100px;top:10px;
                 font-size:10px"><b><%=e.get(i).getEid() %></b>
                </div>
                <div id="div_content_sclass_cstate_p<%=i %>_t2" style="position:absolute;width:100px;height:30px;left:10px;top:80px;
                 font-size:10px"><b>教师：<%=t.get(i).getTname() %></b></div>
                <div id="div_content_sclass_chomework<%=i%>_t2" style="position:absolute;width:40px;height:20px;left:180px;top:90px;
                 font-size:10px"><a href="intoexam.action?eid=<%=e.get(i).getEid() %>">进入</a></div>        
                 <div id="div_content_sclass_c<%=i%>"style="position:absolute;width:30px;height:14px;left:115px;top:121px;">
                 <input type="radio" name="choseexam" value="<%=e.get(i).getEid() %>">
                 </div>
        </div> <% } %>  
            
            <div id="div_content_pratise_submit" style="position:absolute;width:300px;height=:200px;left:750px;top:500px">
                                       截至时间 <input type="text" name="examdeadline"><br>
               <input type="submit" value="发布">
               </div>
                </div>
       </form>
        </div>
  </body>
</html>
