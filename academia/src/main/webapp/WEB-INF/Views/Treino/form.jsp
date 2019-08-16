<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Formulario de treino</title>
	</head>
	<body>
		<form method="post" action="/academia/Categoria">
			<div>
				<label for="nome">Número de séries do treino: </label>
				<input type="number" name="series" id="series"/>
			</div>
			<div>
				<input type="submit">
			</div>
		</form>
		<a href="/academia/">Voltar para home</a>
	</body>
</html>