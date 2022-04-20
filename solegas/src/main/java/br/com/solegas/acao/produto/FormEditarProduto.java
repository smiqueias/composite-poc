package br.com.solegas.acao.produto;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.ProdutoDao;
import br.com.solegas.acao.Acao;
import br.com.solegas.modelo.Produto;

public class FormEditarProduto implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramId = request.getParameter("id");
		int id = Integer.valueOf(paramId);

		ProdutoDao pd = new ProdutoDao();
		Produto produto = pd.buscarPorId(id);
		request.setAttribute("produto",produto);
		
		return "forward:formEditarProduto.jsp";
	}

}
