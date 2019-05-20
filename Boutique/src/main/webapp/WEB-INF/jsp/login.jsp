<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<title>Login</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">

</head>
<body>
<c:choose>
<c:when test="${mode=='MODE_LOGIN' }">
	<div class="container text-center">
		 <h3>User Login</h3>
		 <hr>
	<form class="form-horizontal" method="POST" action="/login-user">
		  <c:if test="${not empty error }">
		  <div class= "alert alert-danger">
			   <c:out value="${error }"></c:out>
		  </div>
		  </c:if>
					
		  <div class="form-group">
			   <label class="control-label col-md-3">Username</label>
			   <div class="col-md-7">
					<input type="text" class="form-control" name="username"	value="${user.username }" />
			   </div>
	      </div>
		  <div class="form-group">
			   <label class="control-label col-md-3">Password</label>
			   <div class="col-md-7">
			   <input type="password" class="form-control" name="password" value="${user.password }" />
			   </div>
	     </div>
		 <div class="form-group ">
			  <input type="submit" class="btn btn-primary" value="Login" />
		 </div>
		 
		 </form>
  </div>
</c:when>
</c:choose>

<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>
</html>