<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="insert-product">Insert Product</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="display-product">View Product</a>
      </li>
    </ul>
  </div>
</nav>
<br><br>
<div style="margin-left: 250px; margin-right: 250px">
	<div class="jumbotron">
	  <h1 class="display-6">Display All Products</h1>
	  <hr class="my-4">
	  
	<!-- ${data} -->  
	  
  <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Quantity</th>
      <th scope="col">Product Price</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach var="p" items="${data}">
        <tr>
	      <th scope="row">${p.id}</th>
	      <td>${p.productname}</td>
	      <td>${p.productquantity}</td>
	      <td>${p.productprice}</td>
	      <td><a href="update-product?id=${p.id}" class="btn btn-warning">UPDATE</a> &nbsp;&nbsp; <a href="delete-product?id=${p.id}" class="btn btn-danger">DELETE</a></td>
    	</tr>
   </c:forEach>
  </tbody>
  
</table>
	</div>
</div>
	
</body>
</html>