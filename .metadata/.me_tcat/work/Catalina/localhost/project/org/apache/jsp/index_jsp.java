package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
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
      out.write("   <body style=\"background:url(images/2.jpg)\" background-repeat:no-repeat ;\r\n");
      out.write("background-size:100% 100%; \r\n");
      out.write("background-attachment: fixed;\">\r\n");
      out.write("<div id=\"div_login\" style=\"position:absolute; width:500px; height:405px;z-index:1;left:780px;top:250px;\r\n");
      out.write("     \">\r\n");
      out.write("  <table  border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\r\n");
      out.write("  <caption align=\"center\"><h2>四则运算系统登陆</h2></caption>\r\n");
      out.write("   <form action=\"login.action\" method=\"post\">\r\n");
      out.write("     <tr><th>用户名:</th><td><input type=\"text\" name=\"username\"></td></tr>\r\n");
      out.write("          <tr><th> 密码       :</th><td><input type=\"password\" name=\"pass\"></td></tr>   \r\n");
      out.write("          <tr><th> 请输入验证码:   </th><td><input type=\"text\" name=\"checkma\"></td>       \r\n");
      out.write("          <td><img alt=\"\" src=\"yanzheng.jsp\"></td></tr> \r\n");
      out.write("      <tr><th><input type=\"submit\" value=\"登陆\"></th>\r\n");
      out.write("    <th><input type=\"reset\" value=\"重置\"></th></tr> \r\n");
      out.write("    <div id=\"div_login_link\" style=\"position:absolute;widteh:400px;height:50px;left:65px;top:195px\"><a style=\"display:block;text-align:center\" href=\"regist.jsp\">还没有帐号？点击这里</a></div>\r\n");
      out.write("                                      \r\n");
      out.write("    </form>\r\n");
      out.write("  </table>\r\n");
      out.write("  </div>\r\n");
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
