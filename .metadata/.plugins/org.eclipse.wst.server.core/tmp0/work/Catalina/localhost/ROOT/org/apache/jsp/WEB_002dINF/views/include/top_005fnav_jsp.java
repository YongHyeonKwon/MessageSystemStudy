/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-09-13 07:44:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_005fnav_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \r\n");
      out.write("<div class=\"nav_menu\">\r\n");
      out.write("                <div class=\"nav toggle\">\r\n");
      out.write("                  <a id=\"menu_toggle\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <nav class=\"nav navbar-nav\">\r\n");
      out.write("                <ul class=\" navbar-right\">\r\n");
      out.write("                  <li class=\"nav-item dropdown open\" style=\"padding-left: 15px;\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"user-profile dropdown-toggle\" aria-haspopup=\"true\" id=\"navbarDropdown\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${profileImageUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-menu dropdown-usermenu pull-right\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                      <a class=\"dropdown-item\"  href=\"/Main.say?c=login\"> Profile</a>\r\n");
      out.write("                        <a class=\"dropdown-item\"  href=\"javascript:;\">\r\n");
      out.write("                          <span class=\"badge bg-red pull-right\">50%</span>\r\n");
      out.write("                          <span>Settings</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    <a class=\"dropdown-item\"  href=\"javascript:;\">Help</a>\r\n");
      out.write("                      <a class=\"dropdown-item\"  href=\"/Main.say?c=logout\"><i class=\"fa fa-sign-out pull-right\"></i> Log Out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </li>\r\n");
      out.write("  \r\n");
      out.write("                  <li role=\"presentation\" class=\"nav-item dropdown open\">\r\n");
      out.write("                    <a href=\"javascript:;\" class=\"dropdown-toggle info-number\" id=\"navbarDropdown1\" data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                      <i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("                      <span class=\"badge bg-green\">6</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu list-unstyled msg_list\" role=\"menu\" aria-labelledby=\"navbarDropdown1\">\r\n");
      out.write("                      <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"dropdown-item\">\r\n");
      out.write("                          <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\r\n");
      out.write("                          <span>\r\n");
      out.write("                            <span>John Smith</span>\r\n");
      out.write("                            <span class=\"time\">3 mins ago</span>\r\n");
      out.write("                          </span>\r\n");
      out.write("                          <span class=\"message\">\r\n");
      out.write("                            Film festivals used to be do-or-die moments for movie makers. They were where...\r\n");
      out.write("                          </span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"dropdown-item\">\r\n");
      out.write("                          <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\r\n");
      out.write("                          <span>\r\n");
      out.write("                            <span>John Smith</span>\r\n");
      out.write("                            <span class=\"time\">3 mins ago</span>\r\n");
      out.write("                          </span>\r\n");
      out.write("                          <span class=\"message\">\r\n");
      out.write("                            Film festivals used to be do-or-die moments for movie makers. They were where...\r\n");
      out.write("                          </span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"dropdown-item\">\r\n");
      out.write("                          <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\r\n");
      out.write("                          <span>\r\n");
      out.write("                            <span>John Smith</span>\r\n");
      out.write("                            <span class=\"time\">3 mins ago</span>\r\n");
      out.write("                          </span>\r\n");
      out.write("                          <span class=\"message\">\r\n");
      out.write("                            Film festivals used to be do-or-die moments for movie makers. They were where...\r\n");
      out.write("                          </span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"dropdown-item\">\r\n");
      out.write("                          <span class=\"image\"><img src=\"images/img.jpg\" alt=\"Profile Image\" /></span>\r\n");
      out.write("                          <span>\r\n");
      out.write("                            <span>John Smith</span>\r\n");
      out.write("                            <span class=\"time\">3 mins ago</span>\r\n");
      out.write("                          </span>\r\n");
      out.write("                          <span class=\"message\">\r\n");
      out.write("                            Film festivals used to be do-or-die moments for movie makers. They were where...\r\n");
      out.write("                          </span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                      </li>\r\n");
      out.write("                      <li class=\"nav-item\">\r\n");
      out.write("                        <div class=\"text-center\">\r\n");
      out.write("                          <a class=\"dropdown-item\">\r\n");
      out.write("                            <strong>See All Alerts</strong>\r\n");
      out.write("                            <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </nav>\r\n");
      out.write("            </div>");
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