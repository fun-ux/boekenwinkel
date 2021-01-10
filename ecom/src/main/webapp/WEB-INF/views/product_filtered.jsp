
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<ol class="products list items product-items filtered">
					
					 
					<c:forEach var="book" items="${returned_books}">
					
					<li class="item product product-item ${book.categorie}"  >
						<div class="product-item-info" data-container="product-grid">
							 
							<div class="label-container">
								<a
									href="#"
									class="product photo product-item-photo" tabindex="-1"> <span
									class="product-image-container" style="width: 270px;"><span
										class="product-image-wrapper"
										style="padding-bottom: 125.92592592593%;"><img
											class="product-image-photo"
											srcset="${book.afbeelding}"
											src="${book.afbeelding}"
											max-width="270" max-height="340"
											alt="Basisboek bedrijfseconomie opgaven"></span></span></a>
								<div class="product-secondary">
									<div class="product-labels"></div>
								</div>
							</div>
							<div class="product details product-item-details">
								<strong class="product name product-item-name"><a
									class="product-item-link"
									href="#">${book.titel}</a></strong> ${book.auteur}
								<div class="price-box price-final_price" data-role="priceBox"
									data-product-id="373785" data-price-box="product-id-373785">
									<span class="price-container price-final_price tax weee">
										<span id="product-price-373785" 
										data-price-type="finalPrice" class="price-wrapper ">
										<span class="price">
											<span class="currency-sign">&euro; </span>
											${book.prijs}
										</span></span>
									</span>
								</div>
								<form method="POST" class="addtocart_form" name="addmycart" action="./AddToCart" >
									<input type="hidden" name="item_id" class="item_id" value="${book.id}" />
									<input type="hidden" name="item_prijs" class="item_prijs" value="${book.prijs}" />
									<input type="hidden" name="item_quantity" class="item_quantity" value="1" />
									<input type="submit" style="color: white;" value="ADD TO CART" class="btn cart px-auto" />
								</form>
							</div>
						</div>
					</li>
					
					</c:forEach>
					
					 
				</ol>
				
				<script>
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
			 		
				</script>