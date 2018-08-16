<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
	<h1>Registration Form:</h1>
	<form action="/summary" method="POST">
		
  		<div class="registration-input-row">
  			<p class="registration-input-row-header">First Name:<p>
  			<p>(2 character minimum)</p>
  			<input name="first-name" data-validation="length" data-validation-length="min2">
  		</div>
  		<div class="registration-input-row">
  			<p class="registration-input-row-header">Last Name:<p>
  			<p>(2 character minimum)</p>
  			<input name="last-name" data-validation="length" data-validation-length="min2">
  		</div>
  		<div class="registration-input-row">
  			<p class="registration-input-row-header">E-Mail Address:<p>
  			<p>(Valid e-mail address)</p>
  			<input name="email" data-validation="email">
  		</div>
  		<div class="registration-input-row">
  			<p class="registration-input-row-header">Phone Number:<p>
  			<p>(###-###-####)</p>
  			<input type="text" name="phone" data-validation="custom" data-validation-regexp="^[0-9]{3}-[0-9]{3}-[0-9]{4}$">
  		</div>
  		<div class="registration-input-row">
  			<p class="registration-input-row-header">Password:<p>
  			<p>(stuff)</p>
  			<input name="password" type="password" data-validation="strength" data-validation-strength="2">
  		</div>
  		<div class="registration-input-row">
  			<p class="registration-input-row-header">Confirm Password:<p>
  			<p>(stuff)</p>
  			<input name="confirm-password" type="password" data-validation="confirmation" data-validation-confirm="password">
  		</div>
  		
		
		<button>Submit!</button>
	
	</form>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.3.26/jquery.form-validator.min.js"></script>
	<script>$.validate({ lang: 'en' });</script>
	<script>
	$.validate({
	  modules : 'security',
	  onModulesLoaded : function() {
	    var optionalConfig = {
	      fontSize: '12pt',
	      padding: '4px',
	      bad : 'Very bad',
	      weak : 'Weak',
	      good : 'Good',
	      strong : 'Strong'
	    };

	    $('input[name="pass"]').displayPasswordStrength(optionalConfig);
	  }
	});
	</script>
</body>
</html>