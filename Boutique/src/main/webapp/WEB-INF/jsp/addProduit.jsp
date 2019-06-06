<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>


<form action="" enctype="multipart/form-data" method="post">
<input type="file" name="file" >
<input type="submit" value="Upload"><br>
</form>
<spring:url var="save" value="/saveProduit"/>
<s:form modelAttribute="Produit" action="${save}" method="post">






<label>Nom de produit</label>
<s:input type="text" path="nameProd"/><br>

<label>prix de vente</label>
<s:input type="text" path="prixVente" /><br>

<label>solde</label>
<s:input type="text" path="prixSolde" /><br>

 <label>description de produit</label>
<s:input type="text" path="descImage" /><br>
<!-- <label>categorie</label>
<s:input type="text" path="categorie" /><br>
<label>Date d'ajoute</label>
<input type="date" name="dateAjoute" value=""> -->
<input type="submit" value="save">

</s:form>
<!--<spring:url value="/Produit" var="saveProd"></spring:url>
<a href="${saveProd}" role="button" >save</a>-->


</body>
</html>