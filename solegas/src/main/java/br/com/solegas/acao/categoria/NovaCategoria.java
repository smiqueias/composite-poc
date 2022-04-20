package br.com.solegas.acao.categoria;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.CategoriaDAO;
import br.com.solegas.acao.Acao;

public class NovaCategoria implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.cadastrar(nome);
		response.setHeader("Cadastrado", "1");
		return "redirect:categoria?acao=ListarCategoria";
	}

}
