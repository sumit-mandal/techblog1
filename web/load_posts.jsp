<%@page import="java.util.List"%>
<%@page import="com.tech.blog.entities.Post"%>
<%@page import="com.tech.blog.dao.PostDao"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page errorPage="error_page.jsp"   %>

<div class="row">
<%
    
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
%>

<div class="col-md-6 mt-2">
    <!--this column will repeat because of loop-->
<div class="card">
    
    <img class="card-img-top my-2" src="blog_pics/<%=p.getpPic()%>" alt="Card image cap">
    
    <div class="card-body">
        <b><%=p.getpTitle()%> </b>
        <p><%=p.getpContent()%></p>
        
        
        
        </div>
        <div class="card-footer bg-dark text-center">
            <a href="show_blog_page.jsp?post_id=<%=p.getPid()%>" class="btn btn-outline-light btn-sm">Read more.. </a>
            <a href="#!" class="btn btn-outline-light btn-small"><i class="fa fa-thumbs-o-up"><span>10</span></i> </a>
            <a href="#!" class="btn btn-outline-light btn-small"><i class="fa fa-commenting-o"><span>5</span></i> </a>
            
            </div>
    
    
</div>
    </div>

<%
}
%>

</div>