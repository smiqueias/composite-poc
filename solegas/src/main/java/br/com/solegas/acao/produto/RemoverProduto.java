package br.com.solegas.acao.produto;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.ProdutoDao;
import br.com.solegas.acao.Acao;

public class RemoverProduto implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramId = request.getParameter("id");
		int id = Integer.valueOf(paramId);
		
		ProdutoDao pd = new ProdutoDao();
		pd.remover(id);
		
		return "redirect:produto?acao=ListarProdutos";
	}

}
