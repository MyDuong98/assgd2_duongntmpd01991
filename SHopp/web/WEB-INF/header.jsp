<%-- 
    Document   : header
    Created on : 01-Oct-2017, 12:49:08
    Author     : Mỹ Dương
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<title>Shop ban hang</title>
<link href="css1/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<script src="js/jquery.min.js"></script>
<link href="css1/style.css" rel="stylesheet" type="text/css" media="all" />	
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!--//fonts-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
				<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
				</script>
<!--slider-script-->
		<script src="js/responsiveslides.min.js"></script>
			<script>
				$(function () {
				  $("#slider1").responsiveSlides({
					auto: true,
					speed: 500,
					namespace: "callbacks",
					pager: true,
				  });
				});
			</script>
<!--//slider-script-->
<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close1').on('click', function(c){
		$('.message1').fadeOut('slow', function(c){
	  		$('.message1').remove();
		});
	});	  
});
</script>
</head>
<body>
        <div class="header">
		<div class="header-top">
			<div class="container">	
			<div class="header-top-in">			
				<div class="logo">
                                    <a href="index.jsp"><img src="images/logo.png" alt=" " ></a>
				</div>
				<div class="header-in">
					<ul class="icon1 sub-icon1">
							<li  ><a href="login">Login</a> </li>
						
						
	                              </div>
	                            </div>
	                            
	                            </div>
	                        </div>

	                        </div>
                          
					  
				
			</div>
			</div>
		</div>
		<div class="header-bottom">
		<div class="container">
			<div class="h_menu4">
				<a class="toggleMenu" href="#">Menu</a>
				<ul class="nav">
                                    <li class="active"><a href="index.jsp"><i> </i>Trang chủ</a></li>
					<li ><a href="#" >Clothes and Shoes</a>
						<ul class="drop">
                                                    <li><a href="products.jsp">Clothes</a></li>
                                                    <li><a href="products.jsp">Shoes</a></li>
                                                    <li><a href="products.jsp">Hat</a></li>
						</ul>
						</li> 						
                                                <li><a href="products.jsp" >  Clothes</a></li>            
                                                <li><a href="products.jsp" >Coat</a></li>	
                                                <li><a href="SanPham.jsp">SanPham</a></li>
						
					
				</ul>
				<script type="text/javascript" src="js/nav.js"></script>
			</div>
		</div>
		</div>
		<div class="header-bottom-in">
			<div class="container">
			<div class="header-bottom-on">
			<p class="wel"><a href="#">Welcome visitor you can login or create an account.</a></p>
			<div class="header-can">
				<ul class="social-in">
						<li><a href="#"><i> </i></a></li>
						<li><a href="#"><i class="facebook"> </i></a></li>
						<li><a href="#"><i class="twitter"> </i></a></li>					
						<li><a href="#"><i class="skype"> </i></a></li>
					</ul>	
					<div class="down-top">		
							<select class="in-drop">
							  <option value="Dollars" class="in-of">Dollars</option>
							  <option value="Euro" class="in-of">Euro</option>
							  <option value="Yen" class="in-of">Yen</option>
							</select>
					 </div>
					<div class="search">
						<form>
							<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" >
							<input type="submit" value="">
						</form>
					</div>

					<div class="clearfix"> </div>
			</div>
			<div class="clearfix"></div>
		</div>
		</div>
		</div>
	</div>
	<div class="banner-mat">
		<div class="container">
			<div class="banner">
	
				<!-- Slideshow 4 -->
			   <div class="slider">
			<ul class="rslides" id="slider1">
			  <li><img src="images/banner.jpg" alt="">
			  </li>
			  <li><img src="images/banner1.jpg" alt="">
			  </li>
			  <li><img src="images/banner.jpg" alt="">
			  </li>
			  <li><img src="images/banner2.jpg" alt="">
			  </li>
			</ul>
		</div>

				<div class="banner-bottom">
					<div class="banner-matter">
						<p>Childish Gambino - Camp Now Available for just $9.99</p> 
                                                <a href="single.jsp" class="hvr-shutter-in-vertical ">Purchase</a>
					</div>
					<div class="purchase">
                                            <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">Purchase</a>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>				
			<!-- //slider-->
		</div>
	</div>
		<!---->
		<div class="container">
			<div class="content">
				<div class="content-top">
					<h3 class="future">FEATURED</h3>
					<div class="content-top-in">
						<div class="col-md-3 md-col">
							<div class="col-md">
                                                            <a href="single.jsp"><img  src="images/pi.jpg" alt="" /></a>	
								<div class="top-content">
                                                                    <h5><a href="single.jsp">Mascot Kitty - White</a></h5>
									<div class="white">
                                                                            <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">ADD TO CART</a>
										<p class="dollar"><span class="in-dollar">$</span><span>2</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>

								</div>							
							</div>
						</div>
						<div class="col-md-3 md-col">
							<div class="col-md">
                                                            <a href="single.jsp"><img  src="images/pi1.jpg" alt="" />	</a>
								<div class="top-content">
                                                                    <h5><a href="single.jsp">Bite Me</a></h5>
									<div class="white">
                                                                            <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
										<p class="dollar"><span class="in-dollar">$</span><span>3</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div>
						</div>
						<div class="col-md-3 md-col">
							<div class="col-md">
                                                            <a href="single.jsp"><img  src="images/pi2.jpg" alt="" /></a>	
								<div class="top-content">
                                                                    <h5><a href="single.jsp">Little Fella</a></h5>
									<div class="white">
                                                                            <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
										<p class="dollar"><span class="in-dollar">$</span><span>5</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div>
						</div>
						<div class="col-md-3 md-col">
							<div class="col-md">
                                                            <a href="single.jsp"><img  src="images/pi3.jpg" alt="" /></a>	
								<div class="top-content">
                                                                    <h5><a href="single.jsp">Astral Cruise</a></h5>
									<div class="white">
                                                                            <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
										<p class="dollar"><span class="in-dollar">$</span><span>4</span><span>5</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div>
						</div>
					<div class="clearfix"></div>
					</div>
				</div>
				<!---->
				<div class="content-middle">
					<h3 class="future">BRANDS</h3>
					<div class="content-middle-in">
					<ul id="flexiselDemo1">			
						<li><img src="images/ap.png"/></li>
						<li><img src="images/ap1.png"/></li>
						<li><img src="images/ap2.png"/></li>
						<li><img src="images/ap3.png"/></li>
					
					</ul>
            		<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo1").flexisel({
				visibleItems: 4,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	</script>
	<script type="text/javascript" src="js/jquery.flexisel.js"></script>

					</div>
				</div>
				<!---->
				<div class="content-bottom">
					<h3 class="future">LATEST</h3>
					<div class="content-bottom-in">
					<ul id="flexiselDemo2">			
						<li><div class="col-md men">
                                                        <a href="single.jsp" class="compare-in "><img  src="images/pi4.jpg" alt="" />
								<div class="compare in-compare">
									<span>Add to Compare</span>
									<span>Add to Whislist</span>
								</div></a>
								<div class="top-content bag">
                                                                    <h5><a href="single.jsp">Symbolic Bag</a></h5>
									<div class="white">
                                                                            <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
										<p class="dollar"><span class="in-dollar">$</span><span>4</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div></li>
						<li><div class="col-md men">
                                                        <a href="single.jsp" class="compare-in "><img  src="images/pi5.jpg" alt="" />
								<div class="compare in-compare">
									<span>Add to Compare</span>
									<span>Add to Whislist</span>
								</div></a>	
								<div class="top-content bag">
                                                                    <h5><a href="single.jsp">Interesting Read</a></h5>
									<div class="white">
                                                                            <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
										<p class="dollar"><span class="in-dollar">$</span><span>2</span><span>5</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div></li>
						<li><div class="col-md men">
                                                        <a href="single.jsp" class="compare-in "><img  src="images/pi6.jpg" alt="" />
								<div class="compare in-compare">
									<span>Add to Compare</span>
									<span>Add to Whislist</span>
								</div></a>	
								<div class="top-content bag">
                                                                    <h5><a href="single.jsp">The Carter</a></h5>
									<div class="white">
                                                                            <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
										<p class="dollar"><span class="in-dollar">$</span><span>1</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div></li>
						<li><div class="col-md men">
                                                        <a href="single.jsp" class="compare-in "><img  src="images/pi7.jpg" alt="" />
								<div class="compare in-compare">
									<span>Add to Compare</span>
									<span>Add to Whislist</span>
								</div></a>	
								<div class="top-content bag">
                                                                    <h5><a href="single.jsp">Onesie</a></h5>
									<div class="white">
                                                                            <a href="single.jsp" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
										<p class="dollar"><span class="in-dollar">$</span><span>6</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div></li>
					
					</ul>
					<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo2").flexisel({
				visibleItems: 4,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	</script>
					</div>
				</div>
				<ul class="start">
					<li ><a href="#"><i></i></a></li>
					<li><span>1</span></li>
					<li class="arrow"><a href="#">2</a></li>
					<li class="arrow"><a href="#">3</a></li>
					<li class="arrow"><a href="#">4</a></li>
					<li class="arrow"><a href="#">5</a></li>
					<li ><a href="#"><i  class="next"> </i></a></li>
				</ul>
			</div>
		</div>
                 <div class="total">
	                        	
	                        </div>
                <!---->
		<div class="footer">
			<div class="footer-top">
				<div class="container">
					<div class="col-md-4 footer-in">
						<h4><i> </i>Suspendisse sed</h4>
						<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
					</div>
					<div class="col-md-4 footer-in">
						<h4><i class="cross"> </i>Suspendisse sed</h4>
						<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
					</div>
					<div class="col-md-4 footer-in">
						<h4><i class="down"> </i>Suspendisse sed</h4>
						<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!---->
			
			<div class="footer-middle">
				<div class=" container">	
					<div class="footer-middle-in">
                                            <h6>Link</h6>
						<ul>
							<li><a href="#">Facebook</a></li>
							<li><a href="#">Zalo</a></li>
							<li><a href="#">Zingme</a></li>
							<li><a href="#">Wechat</a></li>
						</ul>
                                        </div>
                                            <div class="footer-middle-in">
                                            
						<h6>My Account</h6>
						<ul>
							<li><a href="account.html">My Account</a></li>
							<li><a href="#">Order History</a></li>
							<li><a href="wishlist.html">Wish List</a></li>
							<li><a href="#">Newsletter</a></li>
						</ul>
                                            </div>
					<div class="footer-middle-in">
						<h6>Tiện ích</h6>
						<ul>
							<li><a href="#">Nhãn hiệu</a></li>
							<li><a href="#">Quà tặng</a></li>
							<li><a href="#">Chi nhánh</a></li>
							<li><a href="#">Đặc biệt</a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
                </div>
			<p class="footer-class">Copyright © 2017 </p>
			<script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

		</div>
</body>
</html>
    </body>
</html>
