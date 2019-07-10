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



<title>Add Product</title>
</head>
<body >
<nav class="navbar navbar-light bg-light">
  <a class="navbar-brand" href="#">
    <img src="images/icons/logo1.png">
  </a>
  <p>Add Product</p>
  <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
    
</nav>
<div class="container" >
    <div class="row-md-4">
<s:form action="saveProduit" method="POST"  enctype="multipart/form-data" class="col-md-6 offset-md-3"> 
<div class="form-group" style="margin-top: 48px"> 
	<p>choose Image</p>	<input type="file" name="image" class="form-control"/><br></div>
	<div class="form-group">
	<label>Name Product</label>	<input type="text" name="nameProd" class="form-control"/><br></div>
	<div class="form-group">
	<label>Price</label>	    <input type="text" name="prixVente" class="form-control"/><br></div>
	<div class="form-group">
	<label>Balance</label>	        <input type="text" name="prixSolde" class="form-control"/><br></div>
	<div class="form-group">
	<label>description</label><textarea  rows="7" name="descImage"  id="exampleFormControlTextarea3" class="form-control"></textarea>	<br></div>
	  
	<label>Date </label>        <input type="date" name="dateAjoute"   class="form-control"> 	<br>
		<input type="submit" value="Save"  class="btn btn-primary topBtn">
		
	<div>
	<br>
	<br>
	</div>
	</s:form>
	</div>
	<!--  <label>categories</label>	<input type="text" name="nameCategorie" class="form-control"/><br></div> -->
	</div>
	
	
	
	
	<script>
var x, i, j, selElmnt, a, b, c;
/*look for any elements with the class "custom-select":*/
x = document.getElementsByClassName("custom-select");
for (i = 0; i < x.length; i++) {
  selElmnt = x[i].getElementsByTagName("select")[0];
  /*for each element, create a new DIV that will act as the selected item:*/
  a = document.createElement("DIV");
  a.setAttribute("class", "select-selected");
  a.innerHTML = selElmnt.options[selElmnt.selectedIndex].innerHTML;
  x[i].appendChild(a);
  /*for each element, create a new DIV that will contain the option list:*/
  b = document.createElement("DIV");
  b.setAttribute("class", "select-items select-hide");
  for (j = 1; j < selElmnt.length; j++) {
    /*for each option in the original select element,
    create a new DIV that will act as an option item:*/
    c = document.createElement("DIV");
    c.innerHTML = selElmnt.options[j].innerHTML;
    c.addEventListener("click", function(e) {
        /*when an item is clicked, update the original select box,
        and the selected item:*/
        var y, i, k, s, h;
        s = this.parentNode.parentNode.getElementsByTagName("select")[0];
        h = this.parentNode.previousSibling;
        for (i = 0; i < s.length; i++) {
          if (s.options[i].innerHTML == this.innerHTML) {
            s.selectedIndex = i;
            h.innerHTML = this.innerHTML;
            y = this.parentNode.getElementsByClassName("same-as-selected");
            for (k = 0; k < y.length; k++) {
              y[k].removeAttribute("class");
            }
            this.setAttribute("class", "same-as-selected");
            break;
          }
        }
        h.click();
    });
    b.appendChild(c);
  }
  x[i].appendChild(b);
  a.addEventListener("click", function(e) {
      /*when the select box is clicked, close any other select boxes,
      and open/close the current select box:*/
      e.stopPropagation();
      closeAllSelect(this);
      this.nextSibling.classList.toggle("select-hide");
      this.classList.toggle("select-arrow-active");
    });
}
function closeAllSelect(elmnt) {
  /*a function that will close all select boxes in the document,
  except the current select box:*/
  var x, y, i, arrNo = [];
  x = document.getElementsByClassName("select-items");
  y = document.getElementsByClassName("select-selected");
  for (i = 0; i < y.length; i++) {
    if (elmnt == y[i]) {
      arrNo.push(i)
    } else {
      y[i].classList.remove("select-arrow-active");
    }
  }
  for (i = 0; i < x.length; i++) {
    if (arrNo.indexOf(i)) {
      x[i].classList.add("select-hide");
    }
  }
}
/*if the user clicks anywhere outside the select box,
then close all select boxes:*/
document.addEventListener("click", closeAllSelect);
</script>
	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>