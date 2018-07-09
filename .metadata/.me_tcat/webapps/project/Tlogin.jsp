<%@ page language="java" import="java.util.*" import="java.text.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Tlogin.jsp' starting page</title>
    
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
    tool.teacherTool tt=(tool.teacherTool)session.getAttribute("teacher");

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
          text-align:center;font-size:16px;"><a href="Tlogin.jsp" >我的班级</a></div>        
           <div id="div_slogin_left_menu2" style="position:absolute;width:100px;height:30px;left:40px;top:120px;
          text-align:center;font-size:16px"><a href="" >题库</a></div>
           <div id="div_slogin_left_menu3" style="position:absolute;width:180px;height:60px;left:0px;top:180px;
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
       <div id="div_content_sclass" style="position:absolute;width:1740px;height:685px;left:0px;top:0px;display:block;z-index:0;">
     <%//班级导航连接 %>
         <div id="div_content_sclass_link" style="posiont:absolute;width:1740px;height:50px;left:0px;top:0px;border-bottom:1px 
         solid #aaaaaa">
       
          <div id="div_join" style="position:absolute;width:600px;height:50px;left:1200px;top:15px">
                   <form action="createclass.action" method="post">
                  输入班级名称 <input type="text" name="bname">
                   <input type="submit" value="创建新班级">
                   </form>
                  
                </div> 
             <div id="div_content_sclass_link0" style="position:absolute;width:100px;height:50px;left:15px;top:15px;
             font-size:14px;display:block;"><a href="Tlogin.jsp">我的班级</a></div>
             <div id="div_content_sclass_link1" style="position:absolute;width:100px;height:50px;left:100px;top:15px;
             font-size:14px;display:none;">><a href="Sbandetail.jsp">班级作业</a></div>
             <div id="div_content_sclass_link2" style="position:absolute;width:100px;height:50px;left:170px;top:15px;
             font-size:14px;display:none;">><a href="">作业详情</a></div>
             <div id="div_refresh" style="position:absolute;width:100px;height:50px;left:800px;top:15px"><a href="Tlogin.jsp">刷新</a></div>
         </div>
       
           <div id="div_noclass" style="position:absolute;width:1740px;height:635px;left:0px;top:50px;display:none">
            <div id="div_noclass_picture" style="position:absolute;width:600px;height:400px;background:url(images/6.jpg)"></div>
            <div id="div_noclass_content" style="position:absolute;width:400px;height:600px;left:600px;top:200px;font-size:20px">
           
                <b>您还没有加入任何班级哦！在下方输入邀请码加入班级</b>      
                  <div id="div_noclass_content1" style="postion:absolute;width:300px;height:200px;left:0px;top:200px">
                   <form action="joinclass.action" method="post">
                   <input type="text" name="bid"><br>
                   <input type="submit" value="加入班级">
                   </form>
                  </div>    
            </div>
          </div>
         <div id="div_content_sclass_cstate" style="position:absolute;width:1740px;height:635px;left:0px;top:50px;">
         <%int class_count=0;
         if(tt.getBj()!=null)
         {
             class_count=tt.getBj().size();
             }
             int height=15;
             for(int i=0;i<class_count;i++)
             {
          
          %>
          <%
          if(i%4==0&&i!=0)
          {
             height+=120;
          }
           %>
<script type="text/javascript">
function confirmDel()
 {  
 
  if(confirm("确定删除班级吗？"))
  {
    
  }
 }
</script>
            <div id="div_content_tclass_cstate_p<%=i %>" style="position:absolute;width:230px;height:120px;left:<%=i*255+20 %>px;top:
            <%=height %>px;background:url(images/class/<%=i %>.jpg);border:1px solid #666666;">
                <div id="div_content_tclass_cstate_p<%=i %>_t1" style="position:absolute;width:120px;height:30px;left:10px;top:10px;
                 font-size:10px"><b><%=tt.getBj().get(i).getBname() %></b>
                </div>
                <div id="div_content_tclass_cstate_p<%=i %>_t2" style="position:absolute;width:100px;height:30px;left:10px;top:80px;
                 font-size:10px"><b>邀请码:<%=tt.getBj().get(i).getInvite() %></b></div>
                <div id="div_content_tclass_cstate_in" style="position:absolute;width:40px;height:20px;left:180px;top:80px;
                 font-size:10px"><a href="intoclass.action?bid=<%=tt.getBj().get(i).getBid() %>">进入</a></div>
                 <div id="div_content_tclass_cstate_delete" style="position:absolute;width:50px;height:20px;left:180px;top:10px;">
                <a href="deleteclass.action?deletebid=<%=tt.getBj().get(i).getBid() %>" onclick="confirmDel()">删除</a>
            	</div>
            </div>
          <%} %>
          </div>
          </div>
          </div>
  </body>
</html>
