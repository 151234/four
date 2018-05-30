<%@ page language="java" import="java.util.*,java.awt.*,java.awt.image.*,javax.imageio.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'yanzheng.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%!
   private Random rand=new Random();
   public  String yanzhengma="";
   
   %>
  <%
     
  	BufferedImage bm=new BufferedImage (100,30,BufferedImage.TYPE_INT_RGB);
			Graphics g=bm.getGraphics();
			g.setColor(Color.white);
			g.fillRect(0, 0, 100, 30);
			g.setFont(new Font("Tines Nev Roman",Font.PLAIN,18));
			for(int i=0;i<4;i++)
			{
				String temp=String.valueOf(rand.nextInt(10));
				yanzhengma+=temp;
				g.setColor(new Color(30+rand.nextInt(120),30+rand.nextInt(120),30+rand.nextInt(120)));;
				g.drawString(temp, 17*i+6, 20);
			}
			session.putValue("code",yanzhengma);
			yanzhengma="";
			g.dispose();
			ImageIO.write(bm, "jpg", response.getOutputStream());
			out.clear();
			out=pageContext.pushBody();
	    
   %>
  <body>
    This is my JSP page. <br>
  </body>
</html>

