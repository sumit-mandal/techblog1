

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry!! something went wrong</title>
        
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
        <div class="container text-center">
         
      <img src="img/240_F_193908219_ak4aB1PzlhizUVGLOVowzHICc3tl6WeX.jpg" class="img-fluid">
      <h3 class="display-3"> Sorry! Something went wrong</h3>
      <%= exception %>
      
      <a href="index.jsp" class="btn primary-Background btn-lg text-white mt-3">Home</a>
            
            
        </div>
        
        
        
    </body>
</html>
