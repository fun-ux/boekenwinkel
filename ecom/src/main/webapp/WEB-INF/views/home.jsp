
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  

<html lang="en">
	 <head>
			
	    <meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="chrome=1">
	    <title>Bookstore</title>
	    <meta name="robots" content="noindex, nofollow">
	    <meta name="viewport" content="width=device-width, minimum-scale=1, maximum-scale=1">
	    
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	    
	
	    <link href="<c:url value="/resources/css/9de894ce02be4c1c.css" />" rel="stylesheet">
	    <link href="<c:url value="/resources/css/fe91fd9f390813761d2fc.css" />" rel="stylesheet">
	 	<link href="<c:url value="/resources/css/opmak-1.css" />" rel="stylesheet">
   	 	<link href="<c:url value="/resources/css/menus.css" />" rel="stylesheet">
   	 	
   	 	<!-- additional css (products) -->
   	 	<link href="<c:url value="/resources/css/addit/1cvc.css" />" rel="stylesheet">
 	 	<link href="<c:url value="/resources/css/prod_styl.css" />" rel="stylesheet">
   	 	
	    
    	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    	<link href="<c:url value="/resources/flickity-docs/flickity.min.css" />" rel="stylesheet">
    	<link href="<c:url value="/resources/fakeLoader/fakeLoader.css" />" rel="stylesheet">
	    
	    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	    
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
			
			
			.font-size-3, ul.products li.product span.price, #wpsl-wrap.bookworm-wpsl-custom-template #wpsl-result-list .wpsl-store-location > p > strong {
			    font-size: 2.0rem;
			}
			.topbar__nav {
			    margin-top: 10px;
			}
	    </style>
   
     </head>

 	<body class="home page-template-default  page-id-123 theme-bookworm woocommerce-js bookworm-page-template woocommerce-active">
 		
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
 		
 		<main id="main" class="site-main">
 			<div class=" article__page post-123  type-page status-publish hentry">
 				<div class="article__content article__content--page">
 						<!-- slider -->
	 					<jsp:include page="template/slider.jsp" />
	 					
 				</div>
 			</div>

	 		<!-- products -->
			<jsp:include page="template/products.jsp" />
			
 		</main>
 		
 		
		<!-- footer -->
			<jsp:include page="template/footer.jsp" />
 		
 		
 		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
 		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 		<script src="<c:url value="/resources/flickity-docs/flickity.pkgd.js" />"></script>
 		<script src="<c:url value="/resources/isotope-docs/isotope.pkgd.js" />"></script>
 		
 		<script>
 		 $("#menuToggle").click(function(){

			  if ($("#myLinks").css('display') === 'block') {
				  $("#myLinks").slideUp();
				  
			  } else {
				  $("#myLinks").slideDown();				  
			  }
			  
		}); 
 		 
 		$(document).ready(function(){

            
            $('.main-carousel').flickity({
            // options
            cellAlign: 'left',
            autoPlay: false,
            prevNextButtons: false,
            pageDots: false,
            contain: true
            });

            
        });
 		 
 		
 		
 	// SUBMIT FORM
 	 $(".addtocart_form").submit(function(event) {
 	    // Prevent the form from submitting via the browser.
 	    event.preventDefault();
 	    //ajaxPost();
 	    
 	    //var values = $(this).children("input");
 	    //alert(values);
 	   //var developerData = {};
 	    
 	   var itm_id = $(this).children(".item_id").attr("value");
 	   //var itm_prijs = $(this).children(".item_prijs").attr("value");
 	   var dataPost = { "item_id": itm_id };
 	  	//developerData["id"] =itm_id;
 	  	//developerData["prijs"] =itm_prijs;
 	  	
 	  	
	 	  
	 	 $.ajax({
	            dataType : "json",
	            type: 'POST',
	            url: window.location + 'AddToCart/',
	            data: dataPost,
	            complete: function(r){
	               
	                var response = r.responseText
	                //response.replace(/\s/g, '');
	                var myRemoveSpaceAll = response.replace('\r\n        \r\n\r\n\r\n\r\n','');
	                //console.log(myRemoveSpaceAll);
	                if(myRemoveSpaceAll == "toegevoegd" || myRemoveSpaceAll == "nieuw"){
	                	var newItem = '<div class="alert alert-success alert-dismissible fade show" role="alert"> <strong>Product is toegevoegd!</strong> <a style="margin-left: 10px;" href="./cart"><u>Winkelmand bekijken</u></a><button type="button" class="close" data-dismiss="alert" aria-label="Close" style="font-size: 20px;"> <span aria-hidden="true">×</span></button> </div>';
 	                	$(".products-grid").prepend(newItem); 
 	                	
 	                	 setTimeout(function(){  
 	                		$(".alert").fadeOut('xslow');
 	                	 }, 8000);
 	                	 
	                }
	                if(myRemoveSpaceAll == "max"){
	                	var newItem = '<div class="alert alert-danger alert-dismissible fade show" role="alert"> <strong>U heeft de maximale hoeveelheid in de winkelwagen!</strong> <a style="margin-left: 10px;" href="./cart"><u>Winkelmand bekijken</u></a><button type="button" class="close" data-dismiss="alert" aria-label="Close" style="font-size: 20px;"> <span aria-hidden="true">×</span></button> </div>';
 	                	$(".products-grid").prepend(newItem); 
 	                	
 	                	 setTimeout(function(){  
 	                		$(".alert").fadeOut('xslow');
 	                	 }, 8000);
 	                	 
	                }
	             }
	        })
	        .done(function(data) {  
	           // console.log("suc: ", data);
	        })
	        .fail(function(data) {
	          //  console.log("error: ", data);
	        });
	 	  
 	  });
 		
 		
 		function getData(filter){
 			$.ajax({
				  type: "GET",
				  url: window.location + "myBooks/" + filter,
				  success : function(result){
					 //if(result.status == "success"){
						$(".local").remove();
						$(".filtered").remove();
						
						
						$(".products-grid").append(result).hide().fadeIn();
						
						 
						if ($(".filtered").children().length == 0){
			            	 
			            	 $("#geenBoeken").fadeOut();
			            	 $("#geenBoeken").remove(); 
			            	 $(".products-grid").append('<h3 id="geenBoeken" style="text-align: center;">Er zijn geen boeken gevonden</h3>').hide().fadeIn();; 
		            	}
						else{
			            	 $("#geenBoeken").fadeOut(); 
			            	 $("#geenBoeken").remove(); 
			             }
					 /*}
					 else{
						 alert("oops dit ging fout");
						 console.log("fail: ", result);
					 }*/
					 
				  },
				  error : function(e){
					 alert("oops er ging iets fout");
					console.log("error: ", result);
				  }
			  });
 		}
 		
 		$(".taal_select").click(function(event){
		 	  event.preventDefault();
		 	  var filter = $(this).text();
		 	  
		 	 $("#filt_value a").text(filter);
		 	 
		 	 //laat zien welke filter actief is
		 	 $("#act2 span").text(filter);
	 		 $("#act2").fadeIn();
	 		$("#act1").fadeOut();
		 	  //alert(filter);
 			  
 			  getData(filter);
 			  
 			 
 			  
 		}); 
 		
 		
 		 $('.products-grid > .product-items').isotope({
             filter: '*'
         });
 		 
         $(".level > a").click(function(event){
        	 event.preventDefault();
        	 
        	 
        	 //var filt_checker = $("#filt_value a").text();
        	 
        	
        	 
        	 var filterValue = $(this).attr('data-filter');
        	 
        	//laat zien welke filter actief is
        	 var activeFilterVal = filterValue.replace('.', '');
		 	 $("#act1 span").text(activeFilterVal);
	 		 $("#act1").fadeIn();
        	 
        	 /*if(filt_checker){
        		 console.log(filt_checker);
        		 
        		 getData(filt_checker);
        		 
        		 
        		 //console.log(filterValue);
	             $('.products-grid > .local').isotope({ filter: filterValue });
	             $('.products-grid > .filtered').isotope({ filter: filterValue });
        		 
        	 }
        	 else{*/
        		 
	             $('.products-grid > .local').isotope({ filter: filterValue });
	             $('.products-grid > .filtered').isotope({ filter: filterValue });
	             
	              
	             if(!$(filterValue).is(':visible')) {
	            	 
	            	 $("#geenBoeken").fadeOut();
	            	 $("#geenBoeken").remove(); 
	            	 $(".products-grid").append('<h3 id="geenBoeken" style="text-align: center;">Er zijn geen boeken gevonden</h3>').hide().fadeIn();; 
	            	}
	             if($(filterValue).is(':visible')) {
	            	 $("#geenBoeken").fadeOut(); 
	            	 $("#geenBoeken").remove(); 
	             }
        	 //}
        	 	
        	 
            

         });
         
 		
		</script>
 	</body>
 	
</html>
 

 

   


 