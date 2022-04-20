package br.com.solegas.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.solegas.conexao.ConnectionFactory;
import br.com.solegas.modelo.Produto;

public class ProdutoDao {

	ConnectionFactory cf = new ConnectionFactory();

	public void cadastrar(Produto p) {

		try (Connection conn = cf.connexao()) {

			String sql = "INSERT INTO produtos (nome, descricao, preco, id_categoria) VALUES (?,?,?,?)";

			try (PreparedStatement pstm = conn.prepareStatement(sql)) {
				pstm.setString(1, p.getNome());
				pstm.setString(2, p.getDescricao());
				pstm.setDouble(3, p.getPreco());
				pstm.setInt(4, p.getId_categoria());

				CategoriaDAO cd = new CategoriaDAO();
				cd.buscarCategoriaPorID(p.getId_categoria()).setProdutos(p);

				pstm.execute();
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Não foi possivel cadastrar!");
		}

	}

	public List<Produto> listar(String ordenacao) {

		String sql = "Select * from produtos";

		/*
		 * Se o parametro for igual a algum filtro de ordenação, a string sql será
		 * alterada passando o argumento na query
		 * 
		 */

		if ("nome".equals(ordenacao)) {
			sql = "Select * from produtos order by nome";
		} else if ("preco".equals(ordenacao)) {
			sql = "Select * from produtos order by preco";
		}

		List<Produto> listaProdutos = new ArrayList<>();

		try (Connection conn = cf.connexao();) {
			try (PreparedStatement pstm = conn.prepareStatement(sql)) {
				pstm.execute();
				try (ResultSet rst = pstm.getResultSet()) {
					while (rst.next()) {
						/*
						 * Equanto houver itens no resultado da query, vou adicionando a lista de
						 * produtos
						 * 
						 */
						listaProdutos.add(new Produto(rst.getInt("id_produto"), rst.getString("nome"),
								rst.getString("descricao"), rst.getDouble("preco")));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaProdutos;

	}

	public void remover(int id) {
		String sql = "DELETE FROM  produtos WHERE id_produto = ?";

		try (Connection conn = cf.connexao()) {
			try (PreparedStatement pstm = conn.prepareStatement(sql)) {
				pstm.setInt(1, id);
				pstm.execute();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Produto buscarPorId(int id) {
		String sql = "SELECT * FROM produtos WHERE id_produto=? ";
		Produto p = null;
		try (Connection conn = cf.connexao()) {
			try (PreparedStatement pstm = conn.prepareStatement(sql)) {
				pstm.setInt(1, id);
				pstm.execute();
				try (ResultSet rst = pstm.getResultSet()) {
					if(rst.next()) {
						p = new Produto(rst.getInt("id_produto"), rst.getString("nome"), rst.getString("descricao"),
								rst.getDouble("preco"));
						p.setId_categoria(rst.getInt("id_categoria"));
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
}
