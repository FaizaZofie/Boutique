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




<spring:url var="updateProd" value="/updateProduit"></spring:url>
<s:form modelAttribute="Produit" action="${updateProd}"  method="post" >


<s:hidden path="idProd"/>

<label>Nom de produit</label>
<s:input type="text" path="nameProd"/><br>

<label>prix de vente</label>
<s:input type="text" path="prixVente" /><br>

<label>solde</label>
<s:input type="text" path="prixSolde" /><br>

 <label>description de produit</label>
<s:input type="text" path="descImage" /><br>
<label>categorie</label>
<s:input type="text" path="categorie" /><br>
<label>Date d'ajoute</label>
<input type="date" name="dateAjoute" value=""> 




<input type="submit" value="update">
</s:form>


</body>
</html>