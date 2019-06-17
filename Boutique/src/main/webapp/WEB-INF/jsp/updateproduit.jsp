<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>update Produit</title>
</head>
<body>



<div class="container" >
    <div class="row md">
<spring:url var="updateProd" value="/update"></spring:url>
<s:form modelAttribute="Produit" action="${updateProd}"  method="post" >

<div class="form-group" style="margin-top: 48px"> 
<s:hidden path="idProd"/></div>

<div class="form-group" > 
<label>Name product</label>
<s:input type="text" path="nameProd"  class="form-control"/><br></div>

<div class="form-group" > 
<label>price</label>
<s:input type="text" path="prixVente"  class="form-control"/><br></div>
<div class="form-group" > 
<label>sold</label>
<s:input type="text" path="prixSolde"  class="form-control" /><br></div>
<div class="form-group" > 
 <label>description </label>
<s:textarea  rows="7" path="descImage" id="exampleFormControlTextarea3" class="form-control" /><br></div>

<label>categories</label>
<s:input type="text" path="categorie"  class="form-control"/><br>
<label>Date </label>
<input type="date" name="dateAjoute" value=""  class="form-control"> 




<input type="submit" value="update">
</s:form>
</div>
</div>

</body>
</html>