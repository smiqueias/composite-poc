<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.solegas.modelo.Categoria"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/produto" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

	<h2 align="center">Lista de Produtos</h2>

	<table border="1" width="600" align="center">
		<tr>
			<th>Id</th>
			<th><a href="/solegas/produto?acao=ListarProdutos&ordenacao=nome">Nome</a></th>
			<th>Descrição</th>
			<th><a href="/solegas/produto?acao=ListarProdutos&ordenacao=preco">Preço</a></th>
			<th>Editar</th>
			<th>Excluir</th>
		</tr>

		<c:forEach items="${listaProdutos}" var="produto">
			<tr text align="center">
				<td>${produto.id}</td>
				<td>${produto.nome}</td>
				<td>${produto.descricao}</td>
				<td>${produto.preco}</td>
				<td><button><a a href="#">Editar</a></button></td>
				<td><button><a a href="/solegas/produto?acao=RemoverProduto&id=${produto.id}">Excluir</a></button></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>