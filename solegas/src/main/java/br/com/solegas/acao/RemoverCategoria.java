package br.com.solegas.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.CategoriaDAO;

public class RemoverCategoria implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		CategoriaDAO categoriaDAO = new CategoriaDAO();
		categoriaDAO.removerCategoriaPorID(id);

		return "redirect:entrada?acao=ListarCategoria";
	}

}
