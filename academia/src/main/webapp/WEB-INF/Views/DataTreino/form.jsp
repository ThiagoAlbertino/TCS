<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Formulario de treino</title>
	</head>
	<body>
		<form method="post" action="/academia/DataTreino">
			<div>
				<label for="data">Data do treino: </label>
				<input type="date" name="data" id="data"/>
			</div>
			<div>
				<input type="submit" value="Enviar">
			</div>
		</form>
		<a href="/academia/">Voltar para home</a>
	</body>
</html>