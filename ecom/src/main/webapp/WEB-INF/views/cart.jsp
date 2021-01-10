<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>


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
			
		</style>
</head>
<body>
			 <!-- <table>
				<tr>
				 
				    <c:forEach var="itmQuantity"   items="${CartItems}" >
		               <td style="color:green;">${itmQuantity}</td>      
		               
		            </c:forEach> 
			    </tr> 
            </table>-->
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
            
            
 <div class="px-4 px-lg-0">
  

  <div class="pb-5" style="margin-top: 50px;">
    <div class="container">
      <div class="row">
        <div class="col-lg-12  bg-white rounded shadow-sm mb-5">

          <!-- Shopping cart table -->
          <div class="table-responsive">
            <table class="table">
              <thead>
                <tr>
                  <th scope="col" class="border-0 bg-light">
                    <div class="p-2 px-3 text-uppercase">Product</div>
                  </th>
                  <th scope="col" class="border-0 bg-light">
                    <div class="py-2 text-uppercase">Price</div>
                  </th>
                  <th scope="col" class="border-0 bg-light">
                    <div class="py-2 text-uppercase">Quantity</div>
                  </th>
                  <th scope="col" class="border-0 bg-light">
                    <div class="py-2 text-uppercase">Remove</div>
                  </th>
                </tr>
              </thead>
              <tbody>
                
                 <c:forEach var="itmQuantity"   items="${CartItems}" >
		             
	                <tr class="blok-${itmQuantity.getId()}">
	                  <th scope="row">
	                    <div class="p-22">
	                      <img src="${itmQuantity.getAfbeelding()}" alt="" width="70" class="img-fluid rounded shadow-sm">
	                      <div class="m444 d-inline-block align-middle">
	                        <h5 class="mb-0"> 
	                        	<a href="#" class="text-dark d-inline-block">${itmQuantity.getTitel()}</a>
                             </h5> 
                             <span class="text-muted font-weight-normal font-italic">Category: ${itmQuantity.getCategorie()}</span>
	                      </div>
	                    </div>
	                    </th>
	                    <td class="align-middle"><strong>&euro;${itmQuantity.getPrijs()}</strong></td>
	                    <td class="align-middle"><strong>${itmQuantity.getQuantity()}</strong></td>
	                    <td class="align-middle"> 
 			                    
			                    <a class="btn btn-danger btn-sm rounded-0 deleteItm" style="color:white;"   href="#" >
			                    	<span class="item_id" hidden>${itmQuantity.getId()}</span>
			                    	<i class="fa fa-trash"></i> 
			                    </a>
 	                    </td>
	                </tr>
	                
                </c:forEach> 
                
                
              </tbody>
            </table>
          </div>
          <!-- End -->
        </div>
      </div>

      <div class="row py-5 p-4 bg-white rounded shadow-sm">
       
        <div class="col-lg-6">
          <div class="bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold">Order summary </div>
          <div class="p-4">
            <p class="font-italic mb-4">Shipping and additional costs are calculated based on values you have entered.</p>
            <ul class="list-unstyled mb-4">
              
              <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Total</strong>
                <h5 class="font-weight-bold sums">&euro;${Sum.getSum()}</h5>
              </li>
            </ul><a href="./checkout" class="btn btn-dark rounded-pill py-2 btn-block" id="checkout" style="color: white;">Procceed to checkout</a>
          </div>
        </div>
      </div>

    </div>
  </div>
</div>
       
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
 		 
 		
 		 function checkEmpty(){
			if ($('.table > tbody').children().length == 0){
				var newItem = '<div class="alert alert-info alert-dismissible fade show" role="alert"> <strong>Uw winkelwagen is leeg...</strong> <a style="margin-left: 10px;" href="./"><u>Bekijk onze catalogus!</u></a><button type="button" class="close" data-dismiss="alert" aria-label="Close" style="font-size: 20px;"> <span aria-hidden="true">×</span></button> </div>';
             	$(".table-responsive").prepend(newItem); 
             	
             	$("#checkout").addClass("disabled");
 			}
 		 }
 		checkEmpty();
 		
 		 function updateSum(val){
 			$.ajax({
		            type: 'GET',
		            url:  '../ecom/cartSum/',
		           	success : function(result){
		        	  
		        	 var myRemoveSpaceAll = result.replace('\r\n        \r\n\r\n\r\n\r\n','');
		        	 
		        	 // console.log("fail: ", myRemoveSpaceAll);
					  $(".sums").text(myRemoveSpaceAll);
					  
		           }
		           
		        })
		        .done(function(data) {  
		        	checkEmpty();
		        })
		        .fail(function(data) {
		         //  console.log("error: ", data);
		        });
 		 }
 		 
 		$(".deleteItm").click(function(event) {
 	 	    // Prevent the form from submitting via the browser.
 	 	    event.preventDefault();
 	 	    //ajaxPost();
 	 	    
 	 	    var item_id = $(this).children("span").text();
 	 	  	var dataPost = { "item_id": item_id };
 	 	  	 //alert(itm_id);
 	 	  	 
 		 	 $.ajax({
 		            type: 'GET',
 		            url:  '../ecom/removeItem/'+item_id,
 		           	success : function(result){
 		        	  //console.log("fail: ", result);
 		        	  
 		        	 var myRemoveSpaceAll = result.replace('\r\n        \r\n\r\n\r\n\r\n','');
 		        	 
 		        	 if(myRemoveSpaceAll == "verwijderd" ){
 	                	var newItem = '<div class="alert alert-success alert-dismissible fade show" role="alert"> <strong>verwijderen van Product(en) is gelukt!</strong> <button type="button" class="close" data-dismiss="alert" aria-label="Close" style="font-size: 20px;"> <span aria-hidden="true">×</span></button> </div>';
  	                	$(".table-responsive").prepend(newItem); 
  	                	
  	                	$(".blok-"+item_id).fadeOut('xslow');
  	                	$(".blok-"+item_id).remove();
  	                	
  	                	 setTimeout(function(){  
  	                		$(".alert").fadeOut('xslow');
  	                	 }, 8000);
  	                	 
 	                }
 		           }
 		           
 		        })
 		        .done(function(data) {  
 		        	updateSum();
 		        })
 		        .fail(function(data) {
 		         //  console.log("error: ", data);
 		        });
 		 	  
 	 	  });
 		 </script>
</body>
</html>