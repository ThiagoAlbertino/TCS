<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Formulario de categoria</title>
	</head>
	<body>
		<form method="post" action="/academia/Categoria">
			<div>
				<label for="nome">Nome da categoria: </label>
				<input type="text" name="nome" id="nome"/>
			</div>
			<div>
				<input type="submit">
			</div>
		</form>
	</body>
</html>