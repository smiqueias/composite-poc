<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,br.com.solegas.modelo.Categoria"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<c:import url="formNovaCategoria.jsp"></c:import>

	<h2 align="center">Lista de Categorias</h2>

	<ul>
		<c:if test="${empty listaDeCategoria }">
			 <h1>SEM CATEGORIA PARA LSITAR</h1>
		</c:if>
		<c:forEach items="${listaDeCategoria}" var="categoria">
			<li>
				${categoria.id}
				<a href="/solegas/entrada?acao=RemoverCategoria&id=${categoria.id}">${categoria.nome}</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>