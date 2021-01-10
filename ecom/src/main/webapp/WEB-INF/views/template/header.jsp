
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header id="site-header" class="site-header site-header__v1">
	<div class="topbar border-bottom">
			<div class="container-fluid px-2 px-md-5 px-xl-8d75">
				<div class="topbar__nav d-md-flex justify-content-between align-items-center">
					<ul id="menu-topbar-left-v1" class="topbar__nav--left nav ml-md-n3 d-none d-md-flex">
						<li id="topbar-left-menu-item-338" class="glph-icon mr-2 menu-item menu-item-type-post_type menu-item-object-page menu-item-338 nav-item nav-item">
 						<a title="Can we help you?" href="./contact-us/" class=" nav-link link-black-100 h-100">
 							<i class="fa fa-info-circle" aria-hidden="true"></i> Kunnen we u helpen?
						</a>
					</li>
					<li id="topbar-left-menu-item-337" class="glph-icon mr-2 menu-item menu-item-type-custom menu-item-object-custom menu-item-337 nav-item nav-item">
						<a title="+1 246-345-0695" href="tel:+31 6 76907888" class=" nav-link link-black-100 h-100">
							<i class="fa fa-mobile" aria-hidden="true"></i> +31 6 76907888 
						</a>
					</li>
				</ul>
				<div class="topbar__nav--right nav mr-md-n3">
					<ul class="nav justify-content-end">
						

						<li class="nav-item"> 
							<a id="sidebarNavToggler-my_account" style="background-color: white;" href="./admin" role="button" class="nav-link link-black-100 font-size-3 px-3 target-of-invoker-has-unfolds"> 
								<i class="fa fa-user-o" aria-hidden="true"></i>
							</a>
						</li>
						<li class="nav-item"> 
							<a id="sidebarNavToggler-my_cart" style="background-color: white;" href="./cart" role="button" class="nav-link link-black-100 font-size-3 px-3 pr-0 position-relative target-of-invoker-has-unfolds"> 
								
							    <i class="fa fa-shopping-bag" aria-hidden="true"></i> 
							    <span style="right: 3px;top: 4px;font-size: x-large;" class="position-absolute width-16 height-16 rounded-circle d-flex align-items-center justify-content-center text-white bg-dark"> 
							    	<span class="cart-contents-count" style="font-size: xx-small;">
							            ${Cart.size()}        
							        </span> 
						        </span>
						  	</a>
						</li>
					 </ul>
				  </div>
				</div>
			</div>
		</div>
	
	<div class="masthead border-bottom position-relative" style="margin-bottom: -1px;">
		<div class="container-fluid px-3 px-md-5 px-xl-8d75 py-2 py-md-0">
			<div class="d-flex align-items-center position-relative flex-wrap">
				
				
				
				<div class="fusion-mobile-menu-icons">
					<a href="#" id="menuToggle" class="fusion-icon fusion-icon-bars" aria-label="Toggle mobile menu">
						<i class="fa fa-bars" style="color: #251ee0;" aria-hidden="true"></i>
					</a>
				</div>
				
				<div class="site-branding pr-md-4">
					<a href="./" class="header-logo-link d-block mb-1">
						<img style="width: 130px;height: 130px;" src="resources/img/booklogo.png"  />
					</a>
				</div>
				
				<div class="site-navigation mr-auto d-none d-xl-block">
					<ul id="menu-primary-menu" class="nav">
						<li class="menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor current-menu-parent menu-item-has-children dropdown has-children active menu-item-169 nav-item d-flex align-items-center">
							<a href="./" class="dropdown-toggle nav-link link-black-100 mx-4 px-0 py-5 font-weight-medium" title="Home">
								Home
							</a>
						</li>
						 
						
						
						
						<li class="menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor current-menu-parent menu-item-has-children dropdown has-children active menu-item-169 nav-item d-flex align-items-center">
							<a href="./cart" class="dropdown-toggle nav-link link-black-100 mx-4 px-0 py-5 font-weight-medium" title="About">
								Winkelmand
							</a>
						</li>
						
					</ul>
					
					
				</div>
				
				
			</div>
		</div>
	</div>
</header>

<!-- Top Navigation Menu -->
<div class="topnav">
  <div id="myLinks" style="display: none;">
    <a href="./">Home</a> 
     <a href="./cart">Winkelmand</a>
    
  </div>
</div>