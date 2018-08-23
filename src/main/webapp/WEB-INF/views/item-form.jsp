<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>${ title }</title>
<!-- Link the bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<!-- Or in this case, a variation theme... -->
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" />
 --><!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<main class="container">
		<h1 class="col-4">${ title }</h1>
		<form class="form col-5" method="post">
			
			<div class="form-group">
			    <label for="name">Name</label>
			    <!-- pre-populate the input value from the existing food (if any) -->
			    <input class="form-control" id="name" name="name" value="${ item.name }" type="text" required minlength="2" autocomplete="off">
			</div>
			
			<div class="form-group">
			    <label for="name">Description</label>
			    <!-- pre-populate the input value from the existing food (if any) -->
			    <textarea class="form-control" id="description" name="description" value="${ item.description }" required rows="5" minlength="2" autocomplete="off"></textarea>
			</div>
			
			<div class="form-group">
			    <label for="name">Quantity</label>
			    <!-- pre-populate the input value from the existing food (if any) -->
			    <input class="form-control" id="quantity" name="quantity" value="${ item.quantity }" required type="number" min="1" max="100" autocomplete="off">
			</div>
			
			<div class="form-group">
			    <label for="name">Price</label>
			    <!-- pre-populate the input value from the existing food (if any) -->
			    <input class="form-control" id="price" name="price" value="${ item.price }" required type="number" min="0.01" step="0.01" autocomplete="off">
			</div>
			
			<button class="btn btn-primary mb-2 mr-2">Submit +</button>
		</form>
	</main>
</body>
</html>