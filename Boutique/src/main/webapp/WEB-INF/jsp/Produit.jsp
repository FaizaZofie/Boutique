<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/produit.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
</style>
<title>Produit</title>
</head>
<body class="w3-light-grey w3-content" style="max-width:1600px">

<nav class="nave-header">
      <div >
		   <h1 class="logo"> BoutiqueSHOP </h1>
	  </div>	   
	  
	  <div id="search">
	  		<input type="text" name="text" placeholder="Search here" class="search-area">
	  		<input type="submit" name="submit" value="search" class="search-btn">
	  </div>
</nav>



<form action="/addProduit">
<spring:url value="/addProduit" var="addProd"    ></spring:url>
<a href="${addProd}" role="button" role="button">ajouter un produit</a>

 
</form>
	
	<div class="w3-main" style="margin-left:300px">
 
	
	<div class="w3-row-padding">
	
	
	 <c:forEach items="${produit}" var="produit" >
		<c:if test="${message}"></c:if>
		<h6>${message}</h6>
	<div class="w3-row-padding">
    <div class="w3-third w3-container w3-margin-bottom">
      <div class="w3-hover-opacity">
       <img src="${getImage">
      </div>
      <div class="w3-container w3-white">
	     <p>Name Product ${produit.nameProd}</p><br>
	     <p>	Price:${produit.prixVente} </p><br>
	      <p>	Sold :${produit.prixSolde }</p><br>
	      <p>	Description: ${produit.descImage} </p><br>
	     <!--  <li>${produit.dateAjoute}</li>  
	      <td>${produit.categorie}</td>-->
	       
	     
	      <spring:url value="/updateProduit/${produit.idProd }"  var="updateProd"></spring:url>
	      <a href="${updateProd}" role="button"  >Update</a>
	      
	      <spring:url value="/deleteProduit/${produit.idProd }" var="deleteProd"></spring:url>
	      <a href="${deleteProd}" role="button" >delete</a>
	       </div>
    </div>
    </div>
	</c:forEach>
	</div>
	
	
	
	
	
	
	
	
	 

<div class="w3-center w3-padding-32">
    <div class="w3-bar">
      <a href="#" class="w3-bar-item w3-button w3-hover-black">«</a>
      <a href="#" class="w3-bar-item w3-black w3-button">1</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-black">2</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-black">3</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-black">4</a>
      <a href="#" class="w3-bar-item w3-button w3-hover-black">»</a>
    </div>
  </div>
</div>
	



</body>
</html>