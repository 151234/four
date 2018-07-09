<%@ page language="java" contentType="text/html" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'regist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head> 
  <body style="background:url(images/3.jpg)" background-repeat:no-repeat ;background-size:100% ; background-attachment: fixed;">
     <div id="div_regist" style="position:absolute; width:500px; height:305px;z-index:1;left:780px;top:350px;">
   <form action="regist.action" method="post">
    <table  border="0" cellpadding="2" cellspacing="0">
     <caption align="center"><h2>注册帐号</h2></caption>
     <tr><th>用户名:</th><td><input type="text" name="username"></td></tr>
          <tr><th> 密码       :</th><td><input type="password" name="pass"></td></tr>   
          <tr><th>真实姓名  ：   </th><td><input type="text" name="rname"></td></tr> 
          <tr><th>身份  ：</th><td><input type="radio" name="identy" value="1">学生<input type="radio" name="identy" value="3">家长
          <input type="radio" name="identy" value="2">教师</td></tr>
      <tr><th><input type="submit" value="注册"></th>
    <th><input type="reset" value="重置"></th></tr>                 
    </form>
  </table>
  </div>
  </body>
</html>
