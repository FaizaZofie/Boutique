<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"/>
<title>Login</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}
</style>

</head>
<body>

	<div class="container text-center">
		 <h3>User Login</h3>
		 <hr>
		 <c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		
		<s:url var="registration" value="/registration" />
			<sf:form modelAttribute="user" action="${registration}" method="get">
				<button class="btn btn-info" type="Submit">Go To Registration Page</button>
 			</sf:form>
 			
 			
	<form class="form-horizontal" method="post" action="/login">
		  
					
		  <div class="form-group">
			   <label class="control-label col-md-3">Username</label>
			   <div class="col-md-7">
					<input type="text" class="form-control" name="username"	value="${user.username }" placeholder="username" />
			   </div>
	      </div>
		  <div class="form-group">
			   <label class="control-label col-md-3">Password</label>
			   <div class="col-md-7">
			   <input type="password" class="form-control" name="password" value="${user.password }" placeholder="password"/>
			   </div>
	     </div>
	    
	     
		 <div class="form-group ">
			  <input type="submit" class="btn btn-primary" value="Login" />
			 
		 </div>
		 
		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		 </form>
		 <c:if test="${not empty param.login_error}">
        <div class="error">
            <br />
            <spring:message code="login.error" />
            <br />
            <spring:message code="login.errorReason" />:
            <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
        </div>
    </c:if>
  </div>


<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>
</html>