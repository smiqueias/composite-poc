package br.com.solegas.acao.produto;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.ProdutoDao;
import br.com.solegas.acao.Acao;
import br.com.solegas.modelo.Produto;

public class ListarProdutos implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String paramOrdenacao = request.getParameter("ordenacao");
		
		ProdutoDao pd = new ProdutoDao();
		
		List<Produto> lista = pd.listar(paramOrdenacao);
		
		request.setAttribute("listaProdutos", lista);

		return "forward:listarProdutos.jsp";
	}

}
