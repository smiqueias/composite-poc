<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.solegas.modelo.Categoria"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/produto" var="linkProduto" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Solegas | Produtos</title>
</head>
<body>

	<h1 align="center">INFORME OS DADOS DO PRODUTO</h1>

	<hr>
	<form action="${linkProduto}" method="post" align="center" >
		<p>
			<label for="nome"><input type="text" name="nome" required placeholder="Nome Do Produto"></label>
		</p>
		<p>
			<label for="descricao"><input type="text" name="descricao" required placeholder="Descricao Do Produto"></label>
		</p>
		<p>
			<label for="preco"><input type="text" name="preco" required placeholder="Preço Do Produto"></label>
		</p>
		<label for="categoria">CATEGORIA</label>
		<select name = "categoria" id="categoria">
			<option value="default">selecione...</option>
			<c:forEach items="${listaCategorias}" var="categoria">
					 <option value="${categoria.id}">${categoria.nome}</option>
			</c:forEach>
		</select>
			<input type="hidden" name="acao" value="CadastrarProduto">
		<p>
			<button>Cadastrar Produto</button>
			<button type="reset">Resetar Formulário</button>
		</p>
	</form>
	<hr>
	

</body>
</html>