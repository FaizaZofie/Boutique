<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Produit</title>
</head>
<body>




<spring:url var="updateProd" value="/updateProduit/{idProd}(idProd=${produit.idProd })"></spring:url>
<s:form modelAttribute="produit" action="${updateProd }" >

<input type="file" name="file">
<input type="submit" value="Upload"><br>

<label>Nom de produit</label>
<input type="text" value="${nameProd}"/><br>

<label>prix de vente</label>
<input type="text" value="${prixVente}" /><br>

<label>solde</label>
<input type="text" value="${prixSolde}" /><br>

 <label>description de produit</label>
<input type="text" value="${descImage}" /><br>
 <label>categorie</label>
<input type="text" value="${categorie}" /><br>
<!--<label>Date d'ajoute</label>
<input type="date" name="dateAjoute" value=""> -->




<input type="submit" value="update">
</s:form>


</body>
</html>