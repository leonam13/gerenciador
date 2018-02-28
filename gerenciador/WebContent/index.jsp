<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<body>
	Bem vindo ao nosso gerenciador de empresas!
	<c:if test="${usuarioLogado!=null}">
		<p>Você está logado como usuário ${usuarioLogado.email}</p>
		<br/>
	</c:if>
	<form action="executa?tarefa=NovaEmpresa" method="post">
		Empresa: <input type="text" name="nome"> <input type="submit"
			value="Enviar">
	</form>
	<br>
	<form action="login" method="post">
		Email: <input type="email" name="email"><br /> <br /> Senha:
		<input type="password" name="senha"><br /> <br /> <input
			type="submit" value="login">
	</form>
	<br>
	<form action="executa?tarefa=Logout" method="post">
		<input type="submit" value="logout">
	</form>
</body>
</html>