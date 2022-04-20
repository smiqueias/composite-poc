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
<title>Solegas | Produtos</title>
</head>
<body>

	<h1 align="center">Atualizando dados do produto</h1>


	<form action="${linkEntradaServlet}" method="post">
		<p>
			<label for="nome"> Nome<input type="text" name="nome"
				id="nome" value="${produto.nome}" required>

			</label>
		</p>
		<p>
			<label for="desc">Descricao<input type="text" id="desc"
				name="descricao" value="${produto.descricao}" required>
			</label>
		</p>
		<p>
			<label for="preco">Preço <input type="text" id="preco"
				name="preco" value="${produto.preco}" required>
			</label>
		</p>
		<p>
			<label for="categoria">Categoria <input type="text" id="categoria"
				name="preco" value="${produto.id_categoria}" required>
			</label>
		</p>
		<input type="hidden" name="id" value="${produto.id}"> <input
			type="hidden" name="acao" value="EditarProduto">
		<p>
			<button>Editar Produto</button>
		</p>
	</form>
	<hr>


</body>
</html>