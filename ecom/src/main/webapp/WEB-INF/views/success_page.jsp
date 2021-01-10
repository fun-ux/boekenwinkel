
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="chrome=1">
	    <title>Bookstore</title>
	    <meta name="robots" content="noindex, nofollow">
	    <meta name="viewport" content="width=device-width, minimum-scale=1, maximum-scale=1">
	    
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
 
    	 <link href="<c:url value="/resources/css/opmak-1.css" />" rel="stylesheet">
   	 	<link href="<c:url value="/resources/css/menus.css" />" rel="stylesheet">   	 	
   	 	
   		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
   	 	
	 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
   	 	<link href="<c:url value="/resources/fakeLoader/fakeLoader.css" />" rel="stylesheet">
		   
	    <style>
	    	img.wp-smiley,img.emoji{display:inline!important;border:none!important;box-shadow:none!important;height:1em!important;width:1em!important;margin:0 .07em!important;vertical-align:-0.1em!important;background:none!important;padding:0!important}
	    	
	    	.fusion-mobile-menu-icons {
	    		display: none;
	    		position: relative;
				top: 0;
				right: 0;
				vertical-align: middle;
				text-align: right;
	    	}
	    	
	    	.fusion-mobile-menu-icons a {
			    float: right;
			    font-size: 21px;
			    margin-left: 20px;
			}
	    	 
	    	@media screen and (max-width: 767px) {
	    		.fusion-mobile-menu-icons {
	    			display: block;
				    margin-top: 6%;
				    margin-right: 6%;
				}
				.d-none {
				    display: none !important;
				}
	    	}
	    	#menu-topbar-left-v1 {
			    display: none;
			}
	    	.dropdown-toggle::after {
	    		content: none;
	    	}
	    	.cell1{
 	    		height: 300px;
				background-position: center; 
	    	}
	    	footer{
				background-color: #60844330;
			}
			@media screen and (min-width: 992px) {
				.lg-footer {
				    max-width: 30%;
				    position: relative;
					width: 100%;
					padding-right: 15px;
					padding-left: 15px;
				}
			}
			@media screen and (min-width: 768px) and (max-width: 992px){
				.mb-6 {
				    width: 235px;
				}
			}
			@media screen and (max-width: 768px){
				.sm-dev{
					width: 100%;
					text-align: center;
				}
				.sm-info{
					max-width: 50%;
					width: 100%;
					text-align: center;
				}
				
			}
			
			 .spinner6 div{
				background-color: #5eb74b;
			}
			
			
			
	    </style>

		<style type="text/css">
			a, a:hover, a:visited {
			    color: #333;
			}
			
			
			@media screen and (max-width: 457px) {
				.table th, .widget_calendar table th, .woocommerce-MyAccount-content .shop_table:not(.order_details) th, table.wishlist_table th, table th, .table td, .widget_calendar table td, .woocommerce-MyAccount-content .shop_table:not(.order_details) td, table.wishlist_table td, table td{
				font-size: x-small;
				}
				.p-22 {
				    font-size: x-small;
				    padding: 0px;
				}
				.ml-3, .mx-3, .m444{
				    margin-left: 0px;
				    font-size: smaller;
				    margin-left: 0px;
				}
				h5, .h5 {
				    font-size: small;
				}
			}
			@media screen and (min-width: 768px) {
				form{
					margin-left: 100px;
					margin-right: 100px;
				}
			}
		</style>
		
		<style type="text/css">

    main {
    background: #f2f2f2;
    border-top: 1px solid #c8c5c5;
    border-bottom: 1px solid #c8c5c5;
}

    .payment
	{
		border:1px solid #f2f2f2;
		height:280px;
        border-radius:20px;
        background:#fff;
	}
   .payment_header
   {
	   background:rgb(0, 255, 112);
	   padding:20px;
       border-radius:20px 20px 0px 0px;
	   
   }
   
   .check
   {
	   margin:0px auto;
	   width:50px;
	   height:50px;
	   border-radius:100%;
	   background:#fff;
	   text-align:center;
   }
   
   .check i
   {
	   vertical-align:middle;
	   line-height:50px;
	   font-size:30px;
   }

    .content 
    {
        text-align:center;
    }

    .content  h1
    {
        font-size:25px;
        padding-top:25px;
    }

    .content a
    {
        width:200px;
        height:35px;
        color:#fff;
        border-radius:30px;
        padding:5px 10px;
        background:rgba(255,102,0,1);
        transition:all ease-in-out 0.3s;
    }

    .content a:hover
    {
        text-decoration:none;
        background:#000;
    }
   
</style>
</head>
<body>
		<script src="<c:url value="/resources/fakeLoader/insertLoader.js" />"></script>
 		<script src="<c:url value="/resources/fakeLoader/fakeLoader.js" />"></script>
 		<script> 
                $.fakeLoader ({
                    timeToHide:600,
                    bgColor: 'white',
                    spinner: 'spinner6'
                }); 
        </script>
        
         <!-- header -->
 		<jsp:include page="template/header.jsp" />     
 		
 		<main style="margin-top:50px;margin-bottom: 50px;">
 			 <div class="container">
			   <div class="row">
			      <div class="col-md-6 mx-auto mt-5">
			         <div class="payment">
			            <div class="payment_header">
			               <div class="check"><i class="fa fa-check" aria-hidden="true"></i></div>
			            </div>
			            <div class="content">
			               <h1>Betaling Succes !</h1>
			               <p>We zullen uw verder contacteren via mail of telefoon</p>
			               <a href="./">Ga naar Home</a>
			            </div>
			            
			         </div>
			      </div>
			   </div>
			</div>
 		</main>
 		
 		<!-- footer -->
			<jsp:include page="template/footer.jsp" />    
       
       
       <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
 		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 		 <script>
 		 $("#menuToggle").click(function(){

			  if ($("#myLinks").css('display') === 'block') {
				  $("#myLinks").slideUp();
				  
			  } else {
				  $("#myLinks").slideDown();				  
			  }
			  
		}); 
 		 </script>
 		 
</body>
</html>