<%@page import="tool.studentTool"%>
<%@ page language="java" contentType="text/html" import="java.util.*" import="java.text.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'Slogin.jsp' starting page</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
 function myclassclick(){
     document.getElementById("div_content_pratise").style.display="none"
    document.getElementById("div_content_sclass").style.display="block";  
    document.getElementById("div_slogin_left_menu1").style.backgroundColor="#dc143c";
    document.getElementById("div_slogin_left_menu2").style.backgroundColor="";
 }
 function mypratiseclick(){
     document.getElementById("div_content_sclass").style.display="none"
    document.getElementById("div_content_pratise").style.display="block";  
    document.getElementById("div_slogin_left_menu2").style.backgroundColor="#dc143c";
    document.getElementById("div_slogin_left_menu1").style.backgroundColor="";
 }
 function clas_link_click()
 {
     document.getElementById("div_content_sclass_hwdetail").style.display="none";
     document.getElementById("div_content_sclass_cstate_p").style.display="none";
     document.getElementById("div_content_sclass_chomework").style.display="block";
     document.getElementById("div_content_sclass_link0").style.display="block";
     document.getElementById("div_content_sclass_link1").style.display="block";
     document.getElementById("div_content_sclass_link2").style.display="none";  
     
 }
 function clas_showhw()
 {
     document.getElementById("div_content_sclass_hwdetail").style.display="block";
     document.getElementById("div_content_sclass_chomework").style.display="none";
      document.getElementById("div_content_sclass_link0").style.display="block";
     document.getElementById("div_content_sclass_link1").style.display="block";
     document.getElementById("div_content_sclass_link2").style.display="block";  
 }
 function clas_link1()
 {
     document.getElementById("div_content_sclass_hwdetail").style.display="none";
     document.getElementById("div_content_sclass_chomework").style.display="none";
    // document.getElementById("div_content_sclass_cstate").style.display="block";
     document.getElementById("div_content_sclass_cstate_p").style.display="blcok";
     document.getElementById("div_content_sclass_link0").style.display="block";
     document.getElementById("div_content_sclass_link1").style.display="none";
     document.getElementById("div_content_sclass_link2").style.display="none";  
 }
</script>
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
          text-align:center;font-size:16px;"><a href="" onclick="myclassclick();">我的班级</a></div>        
           <div id="div_slogin_left_menu2" style="position:absolute;width:100px;height:30px;left:40px;top:120px;
          text-align:center;font-size:16px"><a href="" onclick="mypratiseclick();">练习</a></div>
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
       <div id="div_content_sclass" style="position:absolute;width:1740px;height:685px;left:0px;top:0px;display:block;z-index:0;">
     <%//班级导航连接 %>
         <div id="div_content_sclass_link" style="posiont:absolute;width:1740px;height:50px;left:0px;top:0px;border-bottom:1px 
         solid #aaaaaa">
       
          <div id="div_join" style="position:absolute;width:300px;height:50px;left:1200px;top:15px">
                   <form action="joinclass.action" method="post">
                   <input type="text" name="bid">
                   <input type="submit" value="加入班级">
                   </form>
                  
                </div> 
             <div id="div_content_sclass_link0" style="position:absolute;width:100px;height:50px;left:15px;top:15px;
             font-size:14px;display:block;"><a href="Slogin.jsp">我加入的班级</a></div>
             <div id="div_content_sclass_link1" style="position:absolute;width:100px;height:50px;left:100px;top:15px;
             font-size:14px;display:none;">><a href="Sbandetail.jsp">班级作业</a></div>
             <div id="div_content_sclass_link2" style="position:absolute;width:100px;height:50px;left:170px;top:15px;
             font-size:14px;display:none;">><a href="">作业详情</a></div>
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
         if(st.getTbj()!=null)
         {
             class_count=st.getTbj().size();
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
            <div id="div_content_sclass_cstate_p<%=i %>" style="position:absolute;width:230px;height:120px;left:<%=i*255+20 %>px;top:
            <%=height %>px;background:url(images/class/<%=i %>.jpg);border:1px solid #666666;">
                <div id="div_content_sclass_cstate_p<%=i %>_t1" style="position:absolute;width:120px;height:30px;left:10px;top:10px;
                 font-size:10px"><b><%=st.getTbj().get(i).getBj().getBname() %></b>
                </div>
                <div id="div_content_sclass_cstate_p<%=i %>_t2" style="position:absolute;width:100px;height:30px;left:10px;top:80px;
                 font-size:10px"><b>教师：<%=st.getTbj().get(i).getT().getTname() %></b></div>
                <div id="div_content_sclass_cstate_in" style="position:absolute;width:40px;height:20px;left:180px;top:80px;
                 font-size:10px"><a href="selectclass.action?bid=<%=st.getTbj().get(i).getBj().getBid() %>">进入</a></div>
            </div>
          <%} %>
       
            <% int hw_count=0;
          /*  Arraylist<> stu_mess=reqeust.getparament();
            hw_count=stu_mess.get[];
             int height=15;
             for(int i=0;i<class_count;i++)
             {
          */
          %>
          <%/*
          if(i%4==0&&i!=0)
          {
             height+120
          }
            <div id="div_content_sclass_chomework<3=i3>" style="position:absolute;width:230px;height:120px;left:<3=i*180+i*20+203>px;top:
            <3=height 3>px;background-image:url(/iamges/class/<3=i3>.jpg)" border:1px solid #666666>
                <div id="div_content_sclass_chomework<3=i3>_t1" style="position:absolute;width:50px;height:30px;left:80px;top:10px;
                 font-size:10px"><b>作业名称</b>
                </div>
                <div id="div_content_sclass_chomework<3=i3>_t2" style="position:absolute;width:40px;height:20px;left:180px;top:80px;
                 font-size:10px"><a href="xx?bid=">进入</div>
            </div>
          */ %>
        <div id="div_content_sclass_chomework" style="position:absolute;width:230px;height:120px;left:20px;top:15px;
             border:1px solid #666666;display:none;">
             <div id="div_content_sclass_chomework_t1" style="position:absolute;width:50px;height:30px;left:80px;top:10px;
                 font-size:10px"><b>作业名称</b></div>
                   <div id="div_content_sclass_chomework_t2" style="position:absolute;width:40px;height:20px;left:180px;top:80px;
            font-size:10px"><a href="javascript:void(0)" onclick="clas_showhw();">进入</a></div>    
             </div>   
                 
            <div id="div_content_sclass_hwdetail" style="position:absolute;width:1740px;height:635px;left:0px;top:10px;display:none;">
              <div id="div_content_sclass_hwname" style="position:absolute;width:400px;height:30px;left:700px;top:0px;font-size:20px"><b>作业标题</b></div> 
               <div id="div_content_class_question" style="position:absolute;width:1740px;height:605px;left:0px;top:30px">
        <table border="0" style="position:abusolute;left:450px">
        <%//int hard=0;
        
          int num=0;
         /*Arraylist<> ques=request.getParameter(arg0)
         for(int i=1;i<=ques.lenth;i++)
         {
         
         
         */
         %>
         <tr><td width="15%" style="padding-left:250px;padding-top:15px">1. 1+1=</td>
             <td width="30%"style="padding-top:15px"><input name="que1"></td>
             <td width="15%" style="padding-left:100px;padding-top:15px">2. 2+2=</td>
             <td width="30%"style="padding-top:15px"><input name="que2"></td></tr>
              <tr bgcolor="#cccccc"><td width="15%" style="padding-left:250px;padding-top:15px">1. 1+1=</td>
              <td width="30%"style="padding-top:15px"><input name="que1"></td>
             <td width="15%" style="padding-left:100px;padding-top:15px">2. 2+2=</td>
             <td width="30%"style="padding-top:15px"><input name="que2"></td></tr>
         <%/*}*/ %>
         </table>
         <div id="div_content_pratise_submit" style="position:absolute;width:30px;height=:20px;left:750px;top:500px">
           <input type="button" value="提交">
           </div>
        </div>
            </div>
            
        </div>
        </div>
          <%//显示已加入的班级
           if(st.isHaveBanji()==false)
           {
           //System.out.println("1");
          %>
          <script type="text/javascript">
           document.getElementById("div_content_sclass_cstate").style.display="none";
           document.getElementById("div_noclass").style.display="block";
          </script>
          <%}  %>
     <div id="div_content_pratise" style="position:absolute;width:1740px;height:685px;left:0px;top:0px;display:none;">
        <div id="div_content_pratise_control" style="posiont:absolute;width:1740px;height:30px;left:0px;top:0px;border-bottom:1px 
         solid #aaaaaa">
           <div id="div_content_pratise_control0" style="posiont:absolute;width:800px;height:30px;left:800px;top:10px;font-size:14px;
           "><form action="" method="post">
            <table>
           <tr><td>请输入难度系数:<input type="text" name="pratise_hard">  请输入题目数量:<input type="text" name="pratise_num"><input type="submit" 
           value="生成">
           </td>
           </tr>
           </table>
          </form>
          </div>
        </div>
        <div id="div_content_pratise_question" style="position:absolute;width:1740px;height:655px;left:0px;top:30px">
        <table border="0" style="position:abusolute;left:450px">
        <%//int hard=0;
        
           int q_count=0;
         /*Arraylist<> ques=request.getParameter(arg0)
         for(int i=1;i<=ques.lenth;i++)
         {
         
         
         */
         %>
         <tr><td width="15%" style="padding-left:250px;padding-top:15px">1. 1+1=</td>
             <td width="30%"style="padding-top:15px"><input name="que1"></td>
             <td width="15%" style="padding-left:100px;padding-top:15px">2. 2+2=</td>
             <td width="30%"style="padding-top:15px"><input name="que2"></td></tr>
              <tr bgcolor="#cccccc"><td width="15%" style="padding-left:250px;padding-top:15px">1. 1+1=</td>
              <td width="30%"style="padding-top:15px"><input name="que1"></td>
             <td width="15%" style="padding-left:100px;padding-top:15px">2. 2+2=</td>
             <td width="30%"style="padding-top:15px"><input name="que2"></td></tr>
         <%/*}*/ %>
         </table>
         <div id="div_content_pratise_submit" style="position:absolute;width:30px;height=:20px;left:750px;top:500px">
           <input type="button" value="提交">
           </div>
        </div>
     </div>
  </div>
  </body>
</html>
