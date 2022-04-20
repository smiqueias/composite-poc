package br.com.solegas.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.CategoriaDAO;

public class NovaCategoria implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.cadastrar(nome);

		return "redirect:/solegas/entrada?acao=ListarCategoria";
	}

}
