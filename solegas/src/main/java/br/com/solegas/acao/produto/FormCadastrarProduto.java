package br.com.solegas.acao.produto;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.CategoriaDAO;
import br.com.solegas.acao.Acao;
import br.com.solegas.modelo.Categoria;

public class FormCadastrarProduto implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		List<Categoria> listaDeCategoria = categoriaDAO.listarCategorias();
		
		request.setAttribute("listaCategorias", listaDeCategoria);
		
		return "forward:cadastrarProduto.jsp";
	}
}
