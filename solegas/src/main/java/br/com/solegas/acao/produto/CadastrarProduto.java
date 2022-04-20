package br.com.solegas.acao.produto;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.DAO.ProdutoDao;
import br.com.solegas.acao.Acao;
import br.com.solegas.modelo.Produto;

public class CadastrarProduto implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String paramPreco = request.getParameter("preco");
		Double preco = Double.valueOf(paramPreco);
		String paramIdCategoria = request.getParameter("categoria");
		int idCategoria = Integer.valueOf(paramIdCategoria);
		
		ProdutoDao pd = new ProdutoDao();
		pd.cadastrar(new Produto(nome, descricao, preco, idCategoria));
		
		
		return "redirect:produto?acao=ListarProdutos";
	}

}
