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

	<h1 align="center">Gerenciador | Categoria</h1>


	<form action="${linkEntradaServlet}" method="post">
		<p>
			<label for="nome"> <input type="text" name="nome" required
				placeholder="nome da categoria"> <input type="hidden"
				name="acao" value="NovaCategoria">
			</label>
		</p>
		<p>
			<button>Cadastrar Categoria</button>
		</p>
	</form>
	<hr>
	

</body>
</html>