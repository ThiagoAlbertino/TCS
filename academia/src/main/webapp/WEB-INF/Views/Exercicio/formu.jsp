<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Formulario de exerc�cio</title>
	</head>
	<body>
		<form method="post" action="/academia/Categoria">
			<div>
				<label for="nome">Nome do exerc�cio: </label>
				<input type="text" name="nome" id="nome"/>
			</div>
			<div>
				<label for="categoria">Categoria do exerc�cio: </label>
				<input type="number" name="categoria" id="categoria"/>
			</div>
			<div>
				<label for="description">Descri��o</label>
				<textarea rows="10" cols="20" name="description" id="description"></textarea>
			</div>
			<div>
				<input type="submit" value="Enviar">
			</div>
		</form>
		<a href="/academia/">Voltar para home</a>
	</body>
</html>