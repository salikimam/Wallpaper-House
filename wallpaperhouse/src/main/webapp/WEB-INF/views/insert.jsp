<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	  <h1 class="display-6">Welcome to Product Management System</h1>
	  <h2 style="text-align:center;color:blue;" class="display-6">Insert Product Here</h2>
	  <hr class="my-4">
	  
	  <form action="add-product" method="post">
	  <!--  ID: <input type="text" name="id" placeholder="Enter Product Id"><br><br> -->
	  	Product Name: <input type="text" name="productname" placeholder="Enter Product Name"><br><br>
	  	Quantity: <input type="text" name="productquantity" placeholder="Enter Product Quantity"><br><br>
	  	Product Price: <input type="text" name="productprice" placeholder="Enter Product Price"><br><br>
	  	<button type="submit">Add Product</button>
	  </form>
	</div>
</div>
	
</body>
</html>