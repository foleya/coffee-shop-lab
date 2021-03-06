<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Items</title>
<!-- Link the bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<!-- Or in this case, a variation theme... -->
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" />
 --><!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<main class="container">
		<h1>Coffee Shop Inventory</h1>
		
		<form class="form-inline" action="/" autocomplete="off">
		  <label class="sr-only" for="keyword">Keyword</label>
		  <input type="text" value="${param.keyword}" class="form-control mb-2 mr-sm-2" id="keyword" name="keyword" placeholder="Keyword">
		
		  <button type="submit" class="btn btn-primary mb-2 mr-2">Search</button>
		  <c:if test="${not empty param.keyword}">
		    <%-- c:if determines whether its contents should show or not --%>
		  	<a href="/" class="btn btn-secondary mb-2">Clear</a>
	  	  </c:if>
		</form>
		
		<table class="table">
			<thead>
				<tr>
					<th>Item</th><th>Description</th><th>Quantity</th><th>Price</th><th>Edit</th><th>Delete<th>	
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${ items }">
				<tr>
					<td>${ item.name }</td>
					<td>${ item.description }</td>
					<td>${ item.quantity }</td>
					<td>$${ item.price }</td>
					<td><a href="/item/${ item.itemId }/update">Edit</td>
					<td><a href="/delete-item/${ item.itemId }" onclick="return confirm('Are you sure you want to delete this?')">Delete</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<button class="btn btn-link"><a href="/item/create">Create Item +</a></button>
	</main>
</body>
</html>