<!DOCTYPE html >
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<link href="css/welcome.css" rel="stylesheet" type="text/css">
<link href="css/jquery.bxslider.css" rel="stylesheet" type="text/css">


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 
 
<title>Boutique SHOP</title>

</head>

<body>

<div role="navigation">
<nav class="nave-header">
      <div >
		   <a href="/welcome" class="logo">BoutiqueSHOP</a>
	  </div>	   
	  
	  <div id="search">
	  		<input type="text" name="text" placeholder="Search here" class="search-area">
	  		<input type="submit" name="submit" value="search" class="search-btn">
	  </div>
      
      <div>
	  <ul class="sign" >
		    <li><a href="/login" style="color:#F5F5DC;">Login</a></li>
			<li><a href="/register" style="color:#F5F5DC;">register</a></li>
	     </ul>		
      
      </div>
	    
</nav> 



<div id="demo" class="carousel slide" data-ride="carousel" >
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="images/img2.jpg" alt="Los Angeles">   
    </div>
    <div class="carousel-item">
      <img src="images/img1.jpg" alt="Chicago" >   
    </div>
    <div class="carousel-item">
      <img src="images/img3.jpg" alt="New York" >   
    </div>
    <div class="carousel-item">
      <img src="images/img4.jpg" alt="New York" >   
    </div>
  </div>
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next" style="background: linear-gradient(to bottom left, #000000 1%, #669999 100%); " >
    <span class="carousel-control-next-icon"></span>
  </a>
</div>




<nav class="nav-menu">
<ul >
<li><a href="#">Acceuil</a></li>
<li><a href="#">Categories</a>

	<ul >
		<li><a href="#" >Telephones</a></li>
		<li><a href="#" >Santé et Beauté</a></li>
		<li><a href="#" >maison et bureau</a></li>
		<li><a href="#" >mode</a></li>
		<li><a href="#" >Produits bébé</a></li>
		<li><a href="#" >Electroniques</a></li>
		<li><a href="#" >Informatiques</a></li>
		<li><a href="#" >voitures</a></li>
		<li><a href="#" >Sports</a></li>
		<li><a href="#" >Autres</a></li>
		
	</ul>
	
</li>
<li><a href="#">Nouveau</a></li>
</ul> 
</nav>


<nav class=nav-menuLeft>
<ul id="LeftMenu">
<li><a href="/login">Compte</a></li>
<li><a href="/login">Commande</a></li>
<li><a href="/login">Produit</a></li>
<li><a href="/login">panier</a></li>
<li><a href="/login">Favoris</a></li>
<li><a href="/login">Contact</a></li>
<li><a href="/login">Paiement</a></li>
</ul>
</nav>
</div>
  
  
  
  
  
  
  
  
  
  
 

<!-- HOME -->
<c:choose>
<c:when test="${mode=='MODE_HOME' }">











</c:when>
</c:choose>
<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS 
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>-->
	
	
</body>
</html>