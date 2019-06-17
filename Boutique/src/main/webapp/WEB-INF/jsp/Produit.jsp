<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/produit.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- Bootstrap 
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<!-- jquerry -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>



<title>Products</title>
</head>
<body>
 
<nav class="navbar navbar-dark bg-dark">
      <div >
		   <h1 style="color:white"> BoutiqueSHOP </h1>
	  </div>	   
	  
	  <div id="search">
	  		<input type="text" name="text" placeholder="Search here" class="search-area">
	  		<input type="submit" name="submit" value="search" class="search-btn">
	  </div>
</nav>



<a href="/addProduit"> Add Product </a> <br/>

	  <c:forEach items="${produit}" var="produit" >
	
 <div class="card mb-3" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
    <img src="getProduitPhoto/<c:out value='${produit.idProd}'/>" class="card-img-top" alt="..." >
    </div>
    <div class="col-md-8">
      <div class="card-body">
      <h5 class="card-title">${produit.nameProd}</h5>
      <p class="card-text">Price:${produit.prixVente}</p>
     <p class="card-text">Balance :${produit.prixSolde } </p>
      <p class="card-text"> Description:</p><p> ${produit.descImage}</p>
       <p class="card-text"> Date: ${produit.dateAjoute}</p>
     </div>
    </div>
    </div>
    </div>
 
	       
	     
	      <spring:url value="/updateProduit/${produit.idProd }"  var="updateProd" ></spring:url>
	      <a href="${updateProd}" role="button" >Update</a>
	      
	      <spring:url value="/deleteProduit/${produit.idProd }" var="deleteProd"></spring:url>
	      <a href="${deleteProd}" role="button" >delete</a>
	       
   
   

	</c:forEach>

	
	
	
	 

<div class="w3-center w3-padding-32">
    <div class="w3-bar">
      <a href="#" class="w3-bar-item w3-button w3-hover-black">�</a>
      <a href="#" class="w3-bar-item w3-black w3-button">1</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-black">2</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-black">3</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-black">4</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-black">�</a>
    </div>
  </div>



</body>
</html>