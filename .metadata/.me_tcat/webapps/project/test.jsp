<%@ page language="java" import="java.util.*,account.*,tool.*,exam.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test.jsp' starting page</title>
    
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
  <%teacherTool tt = (teacherTool)session.getAttribute("teacher"); %>
    <%=tt.getT().getTname() %>
    <%for(int i=0;i<tt.getBj().size();i++){%>
    	<%=tt.getBj().get(i).getBname() %>
   <% } %>
    <%=tt.getTidenty() %>
    <%=tt.isHaveBanji() %>
    
     <br>
  </body>
</html>
