<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Curso JSP</title>
<style type="text/css">
form {
	position: absolute;
	top: 40%;
	left: 33%;
}

h5 {
	color: red;
}
</style>


</head>
<body>

	<nav class="navbar navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="/docs/5.1/assets/brand/bootstrap-logo.svg" alt="" width="30"
				height="24" class="d-inline-block align-text-top"> Bem vindo
				ao curso do JSP
			</a>
		</div>
	</nav>

	<div class="container-md">

		<form action="ServletLogin" method="post" class="row g-3 needs-validation" novalidate>

			<input type="hidden" value="<%=request.getParameter("url")%>"
				name="url">

			<div class="col-md-6">
				<label class="form-label">Login:</label> 
				<input name="Login" type="text" class="form-control" required>
				<div class="valid-feedback">
      			Login ok!
    			</div>
    			<div class="invalid-feedback">
        		Por favor, informe o Login.
     			</div>
			</div>

			<div class="col-md-6">
				<label class="form-label">Senha:</label> 
				<input name="Senha"	type="password" class="form-control" required>
				<div class="valid-feedback">
      			Senha ok!
    			</div>
    			<div class="invalid-feedback">
        		Por favor, informe a senha.
     			</div>
			</div>

			<div class="col-12">
				<input type="submit" class="btn btn-primary" value="enviar">
			</div>
			<div class="col-md-6">
				<h5>${msg}</h5>
			</div>

		</form>
	</div>



	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
	
	<script type="text/javascript">
	// Example starter JavaScript for disabling form submissions if there are invalid fields
	(function () {
	  'use strict'

	  // Fetch all the forms we want to apply custom Bootstrap validation styles to
	  var forms = document.querySelectorAll('.needs-validation')

	  // Loop over them and prevent submission
	  Array.prototype.slice.call(forms)
	    .forEach(function (form) {
	      form.addEventListener('submit', function (event) {
	        if (!form.checkValidity()) {
	          event.preventDefault()
	          event.stopPropagation()
	        }

	        form.classList.add('was-validated')
	      }, false)
	    })
	})()
	</script>
</body>
</html>