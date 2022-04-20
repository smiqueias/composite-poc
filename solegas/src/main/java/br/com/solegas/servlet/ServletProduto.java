package br.com.solegas.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.solegas.acao.Acao;

/**
 * Servlet implementation class ControleDeAcao
 */
@WebServlet("/produto")
public class ServletProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");

		String NomeDaClasse = "br.com.solegas.acao.produto." + paramAcao;

		String nome;

		try {
			Class classe = Class.forName(NomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		String[] tipoEndereco = nome.split(":");

		if (tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/produto/" + tipoEndereco[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(tipoEndereco[1]);
		}

	}

}
