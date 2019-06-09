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


<s:form action="saveProduit" method="POST"  enctype="multipart/form-data" >  
	<p>choose Image</p>	<input type="file" name="image"/><br>
	<label>Name Product</label>	<input type="text" name="nameProd"/><br>
	<label>Price</label>	<input type="text" name="prixVente"/><br>
	<label>Sold</label>	<input type="text" name="prixSolde"/><br>
	<label>description</label>	<input type="text" name="descImage"/><br>
	<label>categories</label>	<input type="text" name="nameCategorie"/><br>
		
		<input type="submit" value="Save">
	
	</s:form>
</body>
</html>