<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/produit.css" rel="stylesheet" type="text/css">
<title>Produit</title>
</head>
<body>

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
	
	
    <div>
	
	
	<c:forEach items="${produit}" var="produit" >
		<c:if test="${message}"></c:if>
		<h6>${message}</h6>
	      <tr>
	     <td>${produit.nameProd}</td> 
	      <td>${produit.prixVente}</td>
	      <td>${produit.prixSolde}</td>
	      <td>${produit.descImage}</td>
	     <!--  <li>${produit.dateAjoute}</li>  
	      <td>${produit.categorie}</td>-->
	      </tr>
	     
	      <spring:url value="/updateProduit/${produit.idProd }"  var="updateProd"></spring:url>
	      <a href="${updateProd}" role="button"  >Update</a>
	      
	      <spring:url value="/deleteProduit/${produit.idProd }" var="deleteProd"></spring:url>
	      <a href="${deleteProd}" role="button" >delete</a>
	</c:forEach>
	</div> 
	
	


	



</body>
</html>