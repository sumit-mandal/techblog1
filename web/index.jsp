

<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--css-->
       
      
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 <style>
     .banner-background{
         



clip-path: polygon(30% 10%, 60% 4%, 100% 1%, 99% 98%, 70% 100%, 33% 96%, 0 100%, 0 1%);
     }
     </style>
     
    
    </head>
    <body>
        <!--navbar-->
        <%@include file="normal_navbar.jsp" %>
        
        <!--banner-->
        <div class="container-fluid p-0 m-0">
            <div class="jumbotron primary-Background text-white banner-background">
                <div class="container">
                <h3 class="display-3"> Welcome to technical blog</h3>
                <br>
                
                <h4><%@include file="Text_Design.jsp" %></h4>
                <br>
                <br>
                <br><p>Technical support (often shortened to tech support) refers to services that 
                    entities provide to users of technology products or services. 
                    In general, technical support provide help regarding specific problems with a
                    product or service, rather than providing training, provision or customization of product, or other support services.
                    Most companies offer technical support for the services or products they sell, either included in the cost or for an 
                    additional fee. Technical support may be delivered over by phone, e-mail, live support software on a website, or other tool where users can log an incident
                    </p>
                    
                    <a href="register_page.jsp" class="btn btn-outline-light btn-lg"> <span class="fa fa-university"></span>Hurry up!Register here</a>
                    <a href="login_page.jsp" class="btn btn-outline-light btn-lg"> <span class=" fa fa-user fa-spin"> </span>&nbsp;login </a>
                </div>
                </div>
                
              
                
                
                </div>
                    
                <!--cards-->
                <div class="container">
                    
                    
                    
                    <div class="row mb-2">
                    <div class="row mb-2">
                        
                        <div class="col-md-4">
                     <div class="card">
  
  <div class="card-body">
    <h5 class="card-title">Bsp services</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-Background text-white">Get more info</a>
  </div>
</div>
        
                            
                            
                            </div>
                        <div class="col-md-4">
                     <div class="card">
  
  <div class="card-body">
    <h5 class="card-title">Digital library service</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-Background text-white">Get more info</a>
  </div>
</div>
        
                            
                            
                            </div>
                        <div class="col-md-4">
                     <div class="card">
  
  <div class="card-body">
    <h5 class="card-title">Online Public Department</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-Background text-white">Get more info</a>
  </div>
</div>
        
                            
                            
                            </div>
                        
                            </div>
                    
                            </div>
                
                    
                    <!--2nd row-->
                    
                    <div class="row">
                    <div class="row">
                        
                        <div class="col-md-4">
                     <div class="card">
  
  <div class="card-body">
    <h5 class="card-title">Online consultancy</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-Background text-white">Get more info</a>
  </div>
</div>
        
                            
                            
                            </div>
                        <div class="col-md-4">
                     <div class="card">
  
  <div class="card-body">
    <h5 class="card-title">Officers Association</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-Background text-white">Get more info</a>
  </div>
</div>
        
                            
                            
                            </div>
                        <div class="col-md-4">
                     <div class="card">
  
  <div class="card-body">
    <h5 class="card-title">Complaints</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn primary-Background text-white">Get more info</a>
  </div>
</div>
        
                            
                            
                            </div>
                        
                            </div>
                                   

       <!--javascript-->
        <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>




    </body>
</html>
