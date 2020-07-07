package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.tech.blog.entities.Post;
import com.tech.blog.dao.PostDao;
import com.tech.blog.helper.ConnectionProvider;

public final class load_005fposts_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
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
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");

    
PostDao d=new PostDao(ConnectionProvider.getConnection());
int cid=Integer.parseInt(request.getParameter("cid"));
List<Post> posts = null;
if(cid==0)
{
    posts=d.getAllPosts();
}
else{
posts=d.getPostByCatId(cid);
}
if(posts.size()==0)
{
out.println("<h3 class='display-3 text-center'> No posts in this category  </h3>");
return;
}

//for traversing all the posts
for(Post p:posts)
{

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-md-6 mt-2\">\n");
      out.write("    <!--this column will repeat because of loop-->\n");
      out.write("<div class=\"card\">\n");
      out.write("    \n");
      out.write("    <img class=\"card-img-top my-2\" src=\"blog_pics/");
      out.print(p.getpPic());
      out.write("\" alt=\"Card image cap\">\n");
      out.write("    \n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <b>");
      out.print(p.getpTitle());
      out.write(" </b>\n");
      out.write("        <p>");
      out.print(p.getpContent());
      out.write("</p>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-footer bg-dark text-center\">\n");
      out.write("            <a href=\"show_blog_page.jsp?post_id=");
      out.print(p.getPid());
      out.write("\" class=\"btn btn-outline-light btn-sm\">Read more.. </a>\n");
      out.write("            <a href=\"#!\" class=\"btn btn-outline-light btn-small\"><i class=\"fa fa-thumbs-o-up\"><span>10</span></i> </a>\n");
      out.write("            <a href=\"#!\" class=\"btn btn-outline-light btn-small\"><i class=\"fa fa-commenting-o\"><span>5</span></i> </a>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("\n");

}

      out.write("\n");
      out.write("\n");
      out.write("</div>");
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
