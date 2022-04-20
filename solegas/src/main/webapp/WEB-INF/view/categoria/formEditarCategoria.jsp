<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.solegas.modelo.Categoria"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/categoria" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Solegas | Categorias</title>
</head>
<body>

	<h1 align="center">Atualizando os dados da categoria</h1>

	
	<form action="${linkEntradaServlet}" method="post">
		<p>
			
			<label for="nome"> 
			<input type="text" name="nome" value="${categoria.nome}" required> 
			</label>
			<input type="hidden" name="id" value="${categoria.id}">
			<input type="hidden" name="acao" value="EditarCategoria">
			
		</p>
		<p>
			<button>Editar Categoria</button>
		</p>
	</form>
	<hr>
	

</body>
</html>