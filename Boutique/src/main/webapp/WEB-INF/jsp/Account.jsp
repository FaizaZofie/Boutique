<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Account</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/register.css" rel="stylesheet">
</head>
<body>

<div class="container text-center">
<form class="form-horizontal" method="POST" action="#">


	 <h3>Update your Account</h3> <hr>
<!--  		
 <div class="form-group" style="margin-top: 48px"> 
			<s:hidden path="id"/></div>-->
			
			
	 <div class="form-group">
		  <label class="control-label col-md-3">Username</label>
	      <div class="col-md-7">
			   <s:input type="text" class="form-control" path="username" />
		  </div>
	</div>
	
	
	<div class="form-group">
		  <label class="control-label col-md-3">lastname</label>
		  <div class="col-md-7">
		       <s:input type="text" class="form-control" path="lastname"  />
		  </div>
	</div>
	
	 
	<div class="form-group">
		 <label class="control-label col-md-3">cin</label>
	<div class="col-md-7">
		 <s:input type="text" class="form-control" path="cin"  />
	</div>
	</div>
	
	
	<div class="form-group">
		 <label class="control-label col-md-3">email</label>
		 <div class="col-md-7">
		      <s:input type="email" class="form-control" path="email"  />
    </div>
	</div>
	
	
	<div class="form-group">
		 <label class="control-label col-md-3">address </label>
	<div class="col-md-3">
		 <s:input type="text" class="form-control" path="address" />
	</div>
    </div>
    
    
	<div class="form-group">
		 <label class="control-label col-md-3">Password</label>
	<div class="col-md-7">
		 <s:input type="password" class="form-control" path="password"  />
	</div>
	</div>
	
	
	
	<div class="form-group">
		 <label class="control-label col-md-3">Confirm Password</label>
	<div class="col-md-7">
		 <s:input type="password" class="form-control" path="confirmPassword"  />
	</div>
	</div>
	
	 <!-- pays -->
	<div class="form-group">
		 <label class="control-label col-md-3">pays</label>
	<div class="col-md-7">
		 <s:input type="text" class="form-control" path="pays"  />
	</div>
	</div>
	
	 <!-- ville -->
	<div class="form-group">
		 <label class="control-label col-md-3">ville</label>
	<div class="col-md-7">
		 <s:input type="text" class="form-control" path="ville"  />
	</div>
	</div>
	
	<!-- BUTTON Update -->
	<div class="form-group ">
		<input type="submit" class="btn btn-primary" value="Update" />
	</div>
  </form>
 
</div>


<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>