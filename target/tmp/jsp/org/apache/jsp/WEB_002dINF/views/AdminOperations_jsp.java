/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.12.v20180830
 * Generated at: 2018-10-31 16:06:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminOperations_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Dvd Store</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("        .btn {\n");
      out.write("             border: none;\n");
      out.write("             background-color: inherit;\n");
      out.write("             padding: 14px 28px;\n");
      out.write("             font-size: 16px;\n");
      out.write("             display: inline-block;\n");
      out.write("        }\n");
      out.write("        .btn:hover {\n");
      out.write("            background: #eee;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            margin-top : 8%;\n");
      out.write("        }\n");
      out.write("        table,th { \n");
      out.write("           width:50%;\n");
      out.write("           border: 3px solid black;\n");
      out.write("        }\n");
      out.write("        td, th {\n");
      out.write("           text-align : center;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("           font-weight:bold;\n");
      out.write("           color: blue;\n");
      out.write("           height: 40px;\n");
      out.write("        }\n");
      out.write("        #logout { \n");
      out.write("            text-align:right;\n");
      out.write("            margin : 10px 10px;        \n");
      out.write("        }\n");
      out.write("        #button {\n");
      out.write("            width:100%;\n");
      out.write("            border:none;\n");
      out.write("            margin-top : 0%;\n");
      out.write("        } \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"adminPage()\">\n");
      out.write("        <table id=\"button\">\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <form id=\"logout\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\" name=\"login\" value=\"logout\"\n");
      out.write("                            formaction=\"/signOut\" formmethod=\"Post\">logout&nbsp;<i class=\"fa fa-sign-out\"></i> \n");
      out.write("                        </button>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <form>\n");
      out.write("            <table align=\"center\" >\n");
      out.write("                <tr>\n");
      out.write("                    <th> ADMIN MENU </th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                         <button class=\"btn\" name=\"dvd\" value=\"dvd\" formmethod=\"Post\" formaction=\"DvdMenu\">\n");
      out.write("                             Dvd Menu</button>\n");
      out.write("                     </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> \n");
      out.write("                        <button class=\"btn\" name=\"category\" value=\"category\" formmethod=\"Post\"\n");
      out.write("                            formaction=\"/CategoryMenu\">Category Menu</button> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> \n");
      out.write("                        <button class=\"btn\" name=\"customer\" formaction=\"SearchCustomer\" formmethod=\"Post\"\n");
      out.write("                            value=\"/searchCustomer\" >Search Customer</button> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> \n");
      out.write("                        <button class=\"btn\" name=\"customer\" value=\"displayAllCustomers\" formmethod=\"Post\"          \n");
      out.write("                            formaction=\"/displayAllCustomers\" >Show Customers</button> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> \n");
      out.write("                        <button class=\"btn\" name=\"customer\" value=\"displayOrders\" formmethod=\"Post\"          \n");
      out.write("                            formaction=\"/displayAllOrders\">Show Orders</button> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function adminPage() {\n");
      out.write("            var message = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("            var status = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("            var isEmpty = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isEmpty}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("            if (status == 'fail' || status=='success') {\n");
      out.write("               alert(message);\n");
      out.write("            }\n");
      out.write("            if (isEmpty == 'empty') {\n");
      out.write("                alert(message);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</html>\n");
      out.write("\n");
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