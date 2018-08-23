<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Item Form</title>
</head>
<body>
	<h1>${ title }</h1>
	<form method="post">
		<p>Item Name: <input required name="name" value="${ item.name }"></p>
		<p>Item Description: <input required type="text" name="description" value="${ item.description }"></p>
		<p>Item Quantity (1-100): <input required type="number" name="quantity" min="1" max="100" value="${ item.quantity }"></p>
		<p>Item Price: <input required type="number" name="price" min="0" step="0.01" value="${ item.price }"></p>
		<button>Submit +</button>
	</form>
</body>
</html>