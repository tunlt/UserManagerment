package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Account Management</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link  rel=\"stylesheet\" href=\"css/home.css\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("            background: #1dbf73;\n");
      out.write("            }   \n");
      out.write("            .search{\n");
      out.write("                width: 50%;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("            #create{\n");
      out.write("                position: relative;\n");
      out.write("                left: 600px;\n");
      out.write("            }\n");
      out.write("            .table-titled{\n");
      out.write("                 background: #1dbf73;   \n");
      out.write("                }\n");
      out.write("             .table-wrapperd{\n");
      out.write("                    background: #1dbf73; \n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-xl\">\n");
      out.write("            <div class=\"col-sm-4\">admin </div>\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <div class=\"table-wrapperd\">\n");
      out.write("                    <div class=\"table-titled\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <form action=\"search\" method=\"post\">\n");
      out.write("                                    <input type=\"text\" name=\"txtSearchValue\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.txtSearchValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"search\"/>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-outline-secondary\">search</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"btn-group\" data-toggle=\"buttons\">                                  \n");
      out.write("                                    <label class=\"btn btn-success\">\n");
      out.write("                                        <a type=\"\" name=\"status\"\n");
      out.write("                                               ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("                                               >\n");
      out.write("                                        <a href=\"loadTag?tag=all\" class=\"tag\">All</a>                                       \n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"btn btn-success\">\n");
      out.write("                                        <a type=\"\" name=\"status\" \n");
      out.write("                                               ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                               >\n");
      out.write("                                        <a href=\"loadTag?tag=admin\" class=\"tag\">Admin</a>\n");
      out.write("                                    </label>\n");
      out.write("                                    <label class=\"btn btn-success\">\n");
      out.write("                                        <a type=\"\" name=\"status\" \n");
      out.write("                                               ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                               >\n");
      out.write("                                        <a href=\"loadTag?tag=user\" class=\"tag1\">User</a>\n");
      out.write("                                    </label>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#myModal\" class=\"trigger-btn\" data-toggle=\"modal\" id=\"create\">Click to Create User</a>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-striped table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>Email</th>\n");
      out.write("                                <th>Phone</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("                                <th>Rank</th>\n");
      out.write("                                <th>Status</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <form action=\"navigation\" method=\"POST\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-outline-primary\" name=\"btAction\" value=\"Promotion\">Promotion</button>\n");
      out.write("                    </form>\n");
      out.write("                    <form action=\"logOut\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-secondary\">LogOut</button>\n");
      out.write("                    </form>\n");
      out.write("                </div> \n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Modal HTML -->\n");
      out.write("        <div id=\"myModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog modal-login\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"create\" method=\"post\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Create</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Username</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtUserName\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"clearfix\">\n");
      out.write("                                    <label>Password</label>\t\t\t\t\t\t\t\n");
      out.write("                                </div>\t\t\t\t\t\t\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"txtPassword\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"clearfix\">\n");
      out.write("                                    <label>Email</label>\t\t\t\t\t\t\t\n");
      out.write("                                </div>\t\t\t\t\t\t\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtEmail\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"clearfix\">\n");
      out.write("                                    <label>Phone</label>\t\t\t\t\t\t\t\n");
      out.write("                                </div>\t\t\t\t\t\t\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtPhone\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"clearfix\">\n");
      out.write("                                    <label>Photo</label>\t\t\t\t\t\t\t\n");
      out.write("                                </div>\t\t\t\t\t\t\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtPhoto\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"clearfix\">\n");
      out.write("                                    <label>Rank</label>\t\t\t\t\t\t\t\n");
      out.write("                                </div>\t\t\t\t\t\t\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"txtRank\" required=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"clearfix\">\n");
      out.write("                                    <label>Role</label>\t\t\t\t\t\t\t\n");
      out.write("                                </div>\t\t\t\t\t\t\n");
      out.write("                                <select name=\"txtRole\" id=\"inputState5\" class=\"form-control\">                                   \n");
      out.write("                                    <option selected>Admin</option>\n");
      out.write("                                    <option>User</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer justify-content-between\">\t\t\t\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\" value=\"Create\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>                                \t\t\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.tag eq 'all'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                   checked=\"checked\"\n");
        out.write("                                               ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.tag eq 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                   checked=\"checked\"\n");
        out.write("                                               ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.tag eq 'user'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                   checked=\"checked\"\n");
        out.write("                                               ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("account");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ListAccount}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <form action=\"manage\" method=\"post\">\n");
          out.write("                                <tr>\n");
          out.write("                                    <td> \n");
          out.write("                                        <input type=\"hidden\" name=\"txtUserID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td >\n");
          out.write("                                        <input type=\"hidden\" name=\"txtUserName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <input type=\"hidden\"  name=\"txtEmail\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    <td>\n");
          out.write("                                        <input type=\"hidden\"  name=\"txtPhone\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                    ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    <td>\n");
          out.write("                                        <input type=\"hidden\" name=\"txtRank\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.rank}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.rank}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td>\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                    </td>\n");
          out.write("                                <input type=\"hidden\" name=\"txtProID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.proID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                <input type=\"hidden\" name=\"txtPhoto\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />                             \n");
          out.write("                                <input type=\"password\" name=\"txtPassword\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"display: none;\" />\n");
          out.write("                                <td>\n");
          out.write("                                    <input type=\"submit\" value=\"manage\" class=\"btn btn-sm manage\"/>\n");
          out.write("                                </td>\n");
          out.write("                                </tr>\n");
          out.write("                            </form>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setVar("role");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.ListRole}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.roleID == role.roleID && role.roleID == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <td>\n");
        out.write("                                                <input type=\"hidden\" name=\"txtRole\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.roleID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("                                                <span class=\"success\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.roleName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                            </td>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.roleID == role.roleID && role.roleID == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <td>\n");
        out.write("                                                <input type=\"hidden\"  name=\"txtRole\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.roleID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("                                                <span class=\"warning\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${role.roleName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                            </td>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.status}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <input type=\"hidden\" name=\"txtStatus\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("                                            Active\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!account.status}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <input type=\"hidden\" name=\"txtStatus\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("                                            Non-Active\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }
}
