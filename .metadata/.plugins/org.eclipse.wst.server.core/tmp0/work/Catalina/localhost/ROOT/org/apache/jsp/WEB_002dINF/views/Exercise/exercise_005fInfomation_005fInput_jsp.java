/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-13 08:06:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.Exercise;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exercise_005fInfomation_005fInput_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/smhrd/Desktop/MessageSystem/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/healthcare_project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1694582273180L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/include/LoginSessionCheck.jsp", out, false);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("\r\n");
      out.write("<title>HealthCare | SAYPROJECT</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/include/header_css.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- Custom Theme Style -->\r\n");
      out.write("<link href=\"assets/Exercise/css/custom.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"nav-md\">\r\n");
      out.write("	<div class=\"container body\">\r\n");
      out.write("		<div class=\"main_container\">\r\n");
      out.write("			<!-- left side menu -->\r\n");
      out.write("			<div class=\"col-md-3 left_col\">\r\n");
      out.write("				");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/include/side_left.jsp", out, false);
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /left side menu -->\r\n");
      out.write("			<!-- top navigation -->\r\n");
      out.write("			<div class=\"top_nav\">\r\n");
      out.write("				");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/include/top_nav.jsp", out, false);
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /top navigation -->\r\n");
      out.write("\r\n");
      out.write("			<!-- page content -->\r\n");
      out.write("			<div class=\"right_col\" role=\"main\">\r\n");
      out.write("				<div class=\"\">\r\n");
      out.write("					<div class=\"page-title\">\r\n");
      out.write("						<div class=\"title_left\">\r\n");
      out.write("							<h3></h3>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"title_right\">\r\n");
      out.write("							<div class=\"col-md-5 col-sm-5 form-group pull-right top_search\">\r\n");
      out.write("								<div class=\"input-group\">\r\n");
      out.write("									<input type=\"text\" class=\"form-control\"\r\n");
      out.write("										placeholder=\"Search for...\" /> <span class=\"input-group-btn\">\r\n");
      out.write("										<button class=\"btn btn-default\" type=\"button\">Go!</button>\r\n");
      out.write("									</span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col-md-12 col-sm-12\">\r\n");
      out.write("							<!-- main content -->\r\n");
      out.write("							");

							// 기본적으로 메인 컨텐츠는 이 곳에 입력합니다.   
							out.print("diet main contents");
							
      out.write("\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							<div class=\"x_panel\">\r\n");
      out.write("								<div class=\"x_title\">\r\n");
      out.write("									<h2>\r\n");
      out.write("										Form Basic Elements <small>different form elements</small>\r\n");
      out.write("									</h2>\r\n");
      out.write("									<ul class=\"nav navbar-right panel_toolbox\">\r\n");
      out.write("										<li><a class=\"collapse-link\"><i\r\n");
      out.write("												class=\"fa fa-chevron-up\"></i></a></li>\r\n");
      out.write("										<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("											data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\"><i\r\n");
      out.write("												class=\"fa fa-wrench\"></i></a>\r\n");
      out.write("											<div class=\"dropdown-menu\"\r\n");
      out.write("												aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("												<a class=\"dropdown-item\" href=\"#\">Settings 1</a> <a\r\n");
      out.write("													class=\"dropdown-item\" href=\"#\">Settings 2</a>\r\n");
      out.write("											</div></li>\r\n");
      out.write("										<li><a class=\"close-link\"><i class=\"fa fa-close\"></i></a>\r\n");
      out.write("										</li>\r\n");
      out.write("									</ul>\r\n");
      out.write("									<div class=\"clearfix\"></div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"x_content\">\r\n");
      out.write("									<br />\r\n");
      out.write("									<form class=\"form-horizontal form-label-left\" action=\"Members.say?c=inputProcess\" method=\"post\">\r\n");
      out.write("										<!-- include member info -->\r\n");
      out.write("										");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/include/diet_and_exercise_member_info_include.jsp", out, false);
      out.write("\r\n");
      out.write("										");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/Exercise/include/exercise_Information_Input_Main_Content.jsp", out, false);
      out.write("\r\n");
      out.write("										<div class=\"row\"></div>\r\n");
      out.write("										<div class=\"ln_solid\"></div>\r\n");
      out.write("										<div class=\"form-group\">\r\n");
      out.write("											<div class=\"col-md-9 col-sm-9  offset-md-3\">\r\n");
      out.write("												<button type=\"button\" class=\"btn btn-primary\">Cancel</button>\r\n");
      out.write("												<button type=\"reset\" class=\"btn btn-primary\">Reset</button>\r\n");
      out.write("												<button type=\"submit\" class=\"btn btn-success\">Submit</button>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</form>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- /main content -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /page content -->\r\n");
      out.write("\r\n");
      out.write("			<!-- footer content -->\r\n");
      out.write("			<footer>\r\n");
      out.write("				<div class=\"pull-right\">S A Y P R O J E C T</div>\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("			</footer>\r\n");
      out.write("			<!-- /footer content -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/include/footer_script.jsp", out, false);
      out.write("\r\n");
      out.write("<!-- Custom Theme Scripts -->\r\n");
      out.write("<script src=\"assets/Exercise/js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}