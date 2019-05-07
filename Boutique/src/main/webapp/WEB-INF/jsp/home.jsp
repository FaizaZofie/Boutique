<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link href="css/home.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 
</head>
<body>

<nav class="nave-header">
      <div >
		   <a href="/welcome" class="logo">BoutiqueSHOP</a>
	  </div>	   
	  
	  <div id="search">
	  		<input type="text" name="text" placeholder="Search here" class="search-area">
	  		<input type="submit" name="submit" value="search" class="search-btn">
	  </div>
      
      <div id="welcUser">
	  		<p>Welcome <c:out value="${user.username }"></c:out></p>
      
      </div>
      <div id="logout">
           <a href="<c:url value='/logout' />">Logout</a> 
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
  <a class="carousel-control-next" href="#demo" data-slide="next"  >
    <span class="carousel-control-next-icon"></span>
  </a>
</div>


<nav class="nav-menu">
<ul >
<li><a href="#">Acceuil</a></li>
<li><a href="#">Categories</a>

	<ul >
		<li><a href="#" >Telephones</a></li>
		<li><a href="#" >Sant� et Beaut�</a></li>
		<li><a href="#" >maison et bureau</a></li>
		<li><a href="#" >mode</a></li>
		<li><a href="#" >Produits b�b�</a></li>
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
<li><a href="#">Compte</a></li>
<li><a href="#">Commande</a></li>
<li><a href="/Produit">Produit</a></li>
<li><a href="#">panier</a></li>
<li><a href="#">Favoris</a></li>
<li><a href="#">Contact</a></li>
<li><a href="#">Paiement</a></li>
</ul>
</nav>
</div>



 
</body>
</html>