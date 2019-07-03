<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/register.css" rel="stylesheet">
</head>
<body>

<div class="container text-center">
	 <h3>New Registration</h3>
		 <hr>
  <form class="form-horizontal" method="POST" action="/registration">
			<input type="hidden" name="id" value="${user.id }" />
			
			
	 <div class="form-group">
		  <label class="control-label col-md-3">Username</label>
	      <div class="col-md-7">
			   <input type="text" class="form-control" name="username" value="${user.username }" />
		  </div>
	</div>
	
	
	<div class="form-group">
		  <label class="control-label col-md-3">lastname</label>
		  <div class="col-md-7">
		       <input type="text" class="form-control" name="lastname" value="${user.lastname }" />
		  </div>
	</div>
	
	 
	<div class="form-group">
		 <label class="control-label col-md-3">cin</label>
	<div class="col-md-7">
		 <input type="text" class="form-control" name="cin" value="${user.cin }" />
	</div>
	</div>
	
	
	<div class="form-group">
		 <label class="control-label col-md-3">email</label>
		 <div class="col-md-7">
		      <input type="email" class="form-control" name="email" value="${user.email}" />
    </div>
	</div>
	
	
	<div class="form-group">
		 <label class="control-label col-md-3">address </label>
	<div class="col-md-3">
		 <input type="text" class="form-control" name="address"value="${user.address }" />
	</div>
    </div>
    
    
	<div class="form-group">
		 <label class="control-label col-md-3">Password</label>
	<div class="col-md-7">
		 <input type="password" class="form-control" name="password" value="${user.password }" />
	</div>
	</div>
	
	
	
	
	 <!-- pays -->
	<div class="form-group">
		 <label class="control-label col-md-3">pays</label>
	<div class="col-md-7">
		 <input type="text" class="form-control" name="pays" value="${user.pays }" />
	</div>
	</div>
	
	 <!-- ville -->
	<div class="form-group">
		 <label class="control-label col-md-3">ville</label>
	<div class="col-md-7">
		 <input type="text" class="form-control" name="ville" value="${user.ville }" />
	</div>
	</div>
	
	<!-- BUTTON REGISTER -->
	<div class="form-group ">
		<input type="submit" class="btn btn-primary" value="Register" />
	</div>
  </form>
 
</div>

<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>