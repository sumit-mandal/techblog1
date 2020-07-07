package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.entities.Message;

public final class login_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/normal_navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login page</title>\n");
      out.write("          <!--css-->\n");
      out.write("       \n");
      out.write("      \n");
      out.write("       <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("     <link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write(" <style>\n");
      out.write("     .banner-background{\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("clip-path: polygon(50% 0%, 87% 0, 100% 0, 100% 100%, 80% 90%, 50% 100%, 20% 90%, 0 100%, 0 0, 18% 0);\n");
      out.write("     }\n");
      out.write("     </style>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--navbar-->\n");
      out.write("       \n");
      out.write("         ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark primary-Background\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-asterisk  \"></span>project on Tech Blog</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-area-chart\"></span> Services from this blog<span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-car\"></span> Contact us</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("         <span class=\"\tfa fa-camera\"></span> Categories\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Programming language</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">programming implementation</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\"> Data structure</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"login_page.jsp\"><span class=\"fa fa-user \"></span> &nbsp;Login</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <!--register-->\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"register_page.jsp\"><span class=\"fa fa-user-plus \"></span> &nbsp; Register here</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        \n");
      out.write("        <main class=\"d-flex align-items-center primary-Background banner-background\" style=\"height:70vh \">\n");
      out.write("            \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 offset-md-4\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header primary-Background text-white text-center\">\n");
      out.write("                                <span class =\"fa fa-user-plus fa-3x\"></span>\n");
      out.write("                                <p>Login here</p>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            ");
  
                            
                      Message m=(Message)session.getAttribute("msg");
                            if(m!=null)
                            
                            {
                            
      out.write("\n");
      out.write("                            <div class=\"alert alert-primary\" role=\"alert\">\n");
      out.write("                                      ");
      out.print(m.getContent());
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");

                            session.removeAttribute("msg");
                            }
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("   \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form action=\"LoginServlet\" method=\"POST\"> \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("    <input name=\"email\" required type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("    <small id=\"emailHelp\" class=\"form-text text-muted\">This site is encrypted</small>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("    <input name =\"password\" required type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("                                    \n");
      out.write("    <div class=\"container text-center\">                                \n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </main>\n");
      out.write("     \n");
      out.write("        \n");
      out.write("            <!--javascript-->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\" integrity=\"sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
