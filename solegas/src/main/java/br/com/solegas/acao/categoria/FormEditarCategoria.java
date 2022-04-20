package br.com.solegas.acao.categoria;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.CategoriaDAO;
import br.com.solegas.acao.Acao;
import br.com.solegas.modelo.Categoria;

public class FormEditarCategoria implements Acao{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		
		Integer id = Integer.valueOf(paramId);
		
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		Categoria categoria = categoriaDAO.buscarCategoriaPorID(id);
		
		request.setAttribute("categoria", categoria);
		
		return "forward:formEditarCategoria.jsp";
	}	
}
