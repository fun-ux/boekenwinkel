
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<main id="maincontent" class="page-main">
	 
	<a id="contentarea" tabindex="-1"></a>
		<h1  >
			<span class="base" data-ui-id="page-title-wrapper">
				Boeken</span>
		</h1>
 
	<div class="columns">
		<div class="sidebar sidebar-main">
			<div class="block filter slide-hidden" id="layered-filter-block"
				data-collapsible="true">
				<div class="block-title filter-title" data-count="0" role="tablist">
					<strong data-role="title" role="tab" aria-selected="false"
						aria-expanded="false" tabindex="0">Filteren</strong>
				</div>
				<div class="block-content filter-content">
					<strong role="heading" aria-level="2"
						class="block-subtitle filter-subtitle">Selectie verfijnen</strong>
					<div class="filter-options category" data-role="content"
						role="tablist">
						<div data-role="collapsible"
							class="filter-options-item category-structure active"
							role="presentation" data-collapsible="true">
							<div data-role="title" class="filter-options-title" role="tab"
								aria-selected="false" aria-expanded="false" tabindex="0">Active filters</div>
								
								<div data-role="content" class="filter-options-content"
								role="tabpanel" aria-hidden="true">
									<ul class="category-structure">
										<li class="level0 active"> 
											<div class="content">
												<ul class="sub-childeren level2">
													<li class="level" id="act1" style="display:none;background-color: antiquewhite;border: 1px solid;border-radius: 3px;padding: 4px;">
														<span></span>
													</li>
													<li class="level" id="act2" style="display:none;background-color: antiquewhite;border: 1px solid;border-radius: 3px;padding: 4px;">
														<span></span>
													</li>
												</ul>
											</div>
										</li>
									 
									  
										  
									</ul>
								</div>
								
							<div data-role="title" class="filter-options-title" role="tab"
								aria-selected="false" aria-expanded="false" tabindex="0">Categorie</div>
							<div data-role="content" class="filter-options-content"
								role="tabpanel" aria-hidden="true">
								<ul class="category-structure">
									<li class="level0 active"> 
										<div class="content">
											<ul class="sub-childeren level2">
												<li class="level"><a
													href="#"
													title="Fictie" data-filter=".Fictie" class="">Fictie</a></li>
												<li class="level"><a
													href="#"
													title="Spanning" data-filter=".Spanning" class="">Spanning</a></li>
												<li class="level"><a
													href="#"
													title="Non-fictie" data-filter=".Non-fictie" class="">Non-fictie</a></li>
												<li class="level"><a
													href="#"
													title="Kinder &amp; Jeugdboeken" data-filter=".Jeugdboeken" class="">Kinder &amp;
														Jeugdboeken</a></li>
												<li class="level"><a
													href="#"
													title="Kookboeken" data-filter=".Kookboeken" class="">Kookboeken</a></li>
												<li class="level"><a
													href="#"
													title="Reisgidsen" data-filter=".Reisgidsen" class="">Reisgidsen</a></li>
												<li class="level"><a
													href="#"
													title="Nagslagwerken" data-filter=".Nagslagwerken" class="">Nagslagwerken</a></li>
												<li class="level"><a
													href="#"
													title="Cadeauboeken" data-filter=".Cadeauboeken" class="">Cadeauboeken</a></li>
												<li class="level"><a
													href="#"
													title="Plattegronden en wegenkaarten" data-filter=".wegenkaarten" class="">Plattegronden
														en wegenkaarten</a></li>
												<li class="level"><a
													href="#"
													title="Medisch" data-filter=".Medisch" class="">Medisch</a></li>
												<li class="level"><a
													href="#"
													title="Studieboeken" data-filter=".Studieboeken" class="">Studieboeken</a></li>
													
												<li class="level" id="filt_value" style="display: none;"><a
													href="#"
													title="hidden"   class=""></a></li>
											</ul>
										</div></li>
								 
								  
									  
								</ul>
							</div>
						</div>
					</div>
					<div class="filter-options" id="narrow-by-list" data-role="content"
						role="tablist">
						
						
						<div data-role="collapsible" class="filter-options-item active"
							role="presentation" data-collapsible="true">
							<div data-role="title" class="filter-options-title" role="tab"
								aria-selected="false" aria-expanded="false" tabindex="0">prijs</div>
							<div data-role="content" class="filter-options-content"
								role="tabpanel" aria-hidden="true">
								<ol class="items">
									
									<li class="item taal_select"><a href="#"
										>All
									</a></li>
								
									<li class="item taal_select"><a
										href="#"><span
											class="price">0,00</span> - <span class="price">15,00</span>
									</a></li>
									
									<li class="item taal_select"><a
										href="#"><span
											class="price">15,00</span> - <span class="price">30,00</span>
									</a></li>
									
									<li class="item taal_select"><a
										href="#"><span
											class="price">30,00</span> - <span class="price">50,00</span>
									</a></li>
									
									<li class="item taal_select"><a
										href="#"><span
											class="price">50,00</span> en hoger </a></li>
									
								</ol>
							</div>
						</div>
						<div data-role="collapsible" class="filter-options-item active"
							role="presentation" data-collapsible="true">
							<div data-role="title" class="filter-options-title" role="tab"
								aria-selected="false" aria-expanded="false" tabindex="0">Taal</div>
							<div data-role="content" class="filter-options-content"
								role="tabpanel" aria-hidden="true">
								<ol class="items">
									<li class="item taal_select"><a href="#"
										>All
									</a></li>
									<li class="item taal_select"><a href="#"
										>Engels
									</a></li>
									<li class="item taal_select"><a href="#"
										>Nederlands
									</a></li>
								</ol>
							</div>
						</div>
					

						
					</div>
				</div>
			</div>
		</div>
		<div class="column main">
			<input name="form_key" type="hidden" value="IkwlSClsJ78TdvBz">
			<div id="authenticationPopup" data-bind="scope:'authenticationPopup'"
				style="display: none;">
				<!-- ko template: getTemplate() -->


				<!-- /ko -->
			</div>
			<div class="toolbar toolbar-products">
				<a class="toggle-filter" href="#">Filteren </a>
				<div class="toolbar-sorter sorter">
					<label class="sorter-label" for="sorter">Sorteer op</label> <select
						id="sorter" data-role="sorter" class="sorter-options">
						<option value="position" selected="selected" data-direction="asc">
							Aanbevolen</option>
						<option value="name" data-direction="asc">Titel
							(oplopend)</option>
						<option value="name" data-direction="desc">Titel
							(aflopend)</option>
						<option value="price" data-direction="asc">Prijs
							(oplopend)</option>
						<option value="price" data-direction="desc">Prijs
							(aflopend)</option>
						<option value="visibility" data-direction="asc">
							Visibility Ascending</option>
						<option value="visibility" data-direction="desc">
							Visibility Descending</option>
						<option value="quantity_and_stock_status" data-direction="asc">
							Quantity Ascending</option>
						<option value="quantity_and_stock_status" data-direction="desc">
							Quantity Descending</option>
					</select>
				</div>
				 
				 
				 
			</div> 			
			
			<div class="products wrapper grid products-grid amscroll-page"
				amscroll-page="1">
				<ol class="products list items product-items local">
					
					<c:forEach var="book" items="${bookList}">
					
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
			</div>
			<div class="toolbar toolbar-products" style="display: none;">
				<a class="toggle-filter" href="#">Filteren </a>
				<div class="toolbar-sorter sorter">
					<label class="sorter-label" for="sorter">Sorteer op</label> <select
						id="sorter" data-role="sorter" class="sorter-options">
						<option value="position" selected="selected" data-direction="asc">
							Aanbevolen</option>
						<option value="name" data-direction="asc">Titel
							(oplopend)</option>
						<option value="name" data-direction="desc">Titel
							(aflopend)</option>
						<option value="price" data-direction="asc">Prijs
							(oplopend)</option>
						<option value="price" data-direction="desc">Prijs
							(aflopend)</option>
						<option value="visibility" data-direction="asc">
							Visibility Ascending</option>
						<option value="visibility" data-direction="desc">
							Visibility Descending</option>
						<option value="quantity_and_stock_status" data-direction="asc">
							Quantity Ascending</option>
						<option value="quantity_and_stock_status" data-direction="desc">
							Quantity Descending</option>
					</select>
				</div>  
				 
			</div>
			 
		</div>
		 
	</div>
</main>