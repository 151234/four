<%@ page language="java" contentType="text/html" import="java.util.*,account.*" pageEncoding="utf-8"%>

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

  </head>
  
  <body>
  <%Account a = (Account)session.getAttribute("user"); %>
    <div id="div_slogin_top" style="position:absolute;width:1920px;height:245px;left:0px;top:0px;border:1px solid;
    background-image:url(images/4.jpg)"></div>
    <%//左部菜单 %>
    <div id="div_slogin_left" style="position:absolute;width:180px;height:735px;left:0px;top:245px;border-right:1px solid;
    background-image:url(images/5.jpg)">
         <div id="div_slogin_left_menu0" style="position:absolute;width:180px;height:50px;left:0px;top:0px;
         border-bottom:1px solid; text-align:center;font-size:30px"><b>菜单</b></div>
          <div id="div_slogin_left_menu1" style="position:absolute;width:180px;height:60px;left:0px;top:65px;
          text-align:center;font-size:16px"><a href="">我的班级</a></div>
           <div id="div_slogin_left_menu2" style="position:absolute;width:180px;height:60px;left:0px;top:120px;
          text-align:center;font-size:16px"><a href="">练习</a></div>
           <div id="div_slogin_left_menu3" style="position:absolute;width:180px;height:60px;left:0px;top:180px;
          text-align:center;font-size:16px"><a href="">错题本</a></div>
           <div id="div_slogin_left_menu4" style="position:absolute;width:180px;height:60px;left:0px;top:240px;
          text-align:center;font-size:16px"><a href="">我的学豆</a></div>
    </div>
    <%//状态栏 %>
    <div id="div_slogin_state" style="position:absolute;width:1740px;height:50px;left:180px;top:245px;
    border-bottom:1px solid">
          <div id="div_slogin_state0" style="position:absolute;width:170px;height:50px;left:0px;top:15px;
          text-align:center;font-size:16px"><b>欢迎，身份，姓名</b></div>
           <div id="div_slogin_state1" style="position:absolute;width:270px;height:50px;left:570px;top:15px;
          text-align:center;font-size:16px">今天是x年x月x日周x</div>
           <div id="div_slogin_state2" style="position:absolute;width:120px;height:50px;left:1540px;top:15px;
          text-align:center;font-size:16px"><a href="">注销</a></div>       
    </div>
          <%//主要内容 %>
     <div id="div_content" style="position:absolute;width:1740px;height:685px;left:180px;top:295px;">     
       <div id="div_content_sclass" style="position:absolute;width:1740px;height:685px;left:0px;top:0px;display:none;z-index:0;">
     <%//班级导航连接 %>
         <div id="div_content_sclass_link" style="posiont:absolute;width:1740px;height:50px;left:0px;top:0px;border-bottom:1px 
         solid #aaaaaa">
             <div id="div_content_sclass_link0" style="position:absolute;width:100px;height:50px;left:15px;top:15px;
             font-size:14px;"><a href="">我加入的班级</a></div>
             <div id="div_content_sclass_link1" style="position:absolute;width:100px;height:50px;left:100px;top:15px;
             font-size:14px;">><a href="">班级名称</a></div>
             <div id="div_content_sclass_link2" style="position:absolute;width:100px;height:50px;left:170px;top:15px;
             font-size:14px;">><a href="">班级作业</a></div>
             <div id="div_content_sclass_link3" style="position:absolute;width:100px;height:50px;left:240px;top:15px;
             font-size:14px;">><a href="">作业详情</a></div>
         </div>
         <%//显示已加入的班级 %>
         <div id="div_content_sclass_cstate" style="position:absolute;width:1740px;height:635px;left:0px;top:50px;">
         <%int class_count=0;
          /* Arraylist<> stu_mess=reqeust.getparament();
             class_count=stu_mess.get[];
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
          */ %>
          <div id="div_content_sclass_cstate_p" style="position:absolute;width:230px;height:120px;left:20px;top:15px;
                 border:1px solid #666666;visibility:" >
                <div id="div_content_sclass_cstate_t1" style="position:absolute;width:120px;height:30px;left:10px;top:10px;
                 font-size:10px"><b>班级名称</b>
                </div>
                <div id="div_content_sclass_cstate_t2" style="position:absolute;width:100px;height:30px;left:10px;top:80px;
                 font-size:10px"><b>教师名称</b></div>
                <div id="div_content_sclass_cstate_in" style="position:absolute;width:40px;height:20px;left:180px;top:80px;
                 font-size:10px"><a href="xx?bid=">进入</a></div>
            </div>
          </div>
        </div>
     <div id="div_content_pratise" style="position:absolute;width:1740px;height:685px;left:0px;top:0px;">
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
  </body>
</html>
