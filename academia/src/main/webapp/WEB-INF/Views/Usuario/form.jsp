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
				<label for="nome">Nome do usu�rio: </label>
				<input type="text" name="nome" id="nome"/>
			</div>
			<div>
				<label for="data">Data de nascimento do usu�rio: </label>
				<input type="date" name="nascimento" id="nascimento"/>
			</div>
			<div>
				<label for="peso">Peso do usu�rio: </label>
				<input type="number" name="peso" id="peso"/>
			</div>
			<div>
				<label for="altura">Altura do usu�rio: </label>
				<input type="number" name="altura" id="altura"/>
			</div>
			<div>
				<label for="senha">Senha do usu�rio: </label>
				<input type="password" name="senha" id="senha"/>
			</div>
			<div>
				<label for="privilegio">Privil�gio do usu�rio: </label>
				<input type="number" name="privilegio" id="privilegio"/>
			</div>
			<div>
				<input type="submit" value="Enviar">
			</div>
		</form>
		<a href="/academia/">Voltar para home</a>
	</body>
</html>