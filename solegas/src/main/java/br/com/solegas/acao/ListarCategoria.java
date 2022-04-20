package br.com.solegas.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.CategoriaDAO;
import br.com.solegas.modelo.Categoria;

public class ListarCategoria implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		
		List<Categoria> listaCategorias = categoriaDAO.listarCategorias();
		
		request.setAttribute("listaDeCategoria", listaCategorias);
		
		return "forward:listarCategorias.jsp";
	}

}
