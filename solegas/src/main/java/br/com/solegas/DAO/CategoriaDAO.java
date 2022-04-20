package br.com.solegas.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.solegas.conexao.ConnectionFactory;
import br.com.solegas.modelo.Categoria;

public class CategoriaDAO {

	ConnectionFactory cf = new ConnectionFactory();

	public void cadastrar(String nome) {
		System.out.println("Antes de conectar");
		try (Connection conn = cf.connexao()) {

			String sql = "INSERT INTO categorias (nome) VALUES (?)";

			try (PreparedStatement pstm = conn.prepareStatement(sql)) {
				pstm.setString(1, nome);
				pstm.execute();

			}

		} catch (SQLException e) {
			System.err.println("Não foi possivel cadastrar a categoria");
			// conn.rollback();
		}

	}

	public Categoria buscarCategoriaPorID(Integer id) {
		Categoria categoria = null;
		try (Connection conn = cf.connexao()) {
			String sql = "SELECT * FROM categorias where id_categoria = ?";
			try (PreparedStatement pstm = conn.prepareStatement(sql)) {
				pstm.setInt(1, id);
				pstm.execute();
				try (ResultSet rst = pstm.getResultSet()) {
					if (rst.next()) {
						categoria = new Categoria(); // Instancio a entidade que havia sido declarada no inicio do
														// método
						categoria.setId(rst.getInt("id_categoria"));
						categoria.setNome(rst.getString("nome"));
					}
				}

			}

			return categoria;

		} catch (Exception e) {
			System.err.println("Não foi possível buscar a categoria!!");
			return null;
		}

	}

	public List<Categoria> listarCategorias() {

		List<Categoria> listaCategoria = new ArrayList<>();

		try (Connection conn = cf.connexao()) {

			String sql = "Select * from categorias";

			try (PreparedStatement pstm = conn.prepareStatement(sql)) {
				pstm.execute();

				try (ResultSet rst = pstm.getResultSet()) {
					while (rst.next()) {
						listaCategoria.add(new Categoria(rst.getInt("id_categoria"), rst.getString("nome")));
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Opa estamos com problema!!");
		}
		return listaCategoria;
	}

	public void removerCategoriaPorID(Integer id) {

		String sql = "DELETE FROM categorias WHERE id_categoria = ?";

		try (Connection conn = cf.connexao()) {

			try (PreparedStatement pstm = conn.prepareStatement(sql)) {
				pstm.setInt(1, id);
				pstm.execute();
			}

		} catch (Exception e) {
			System.err.println("Não foi possível excluir a categoria");
		}

	}

	public void atualizarCategoriaPorId(Categoria categoria) {

		String sql = "UPDATE categorias SET nome = ? WHERE id_categoria = ?";

		try (Connection conn = cf.connexao()) {

			try (PreparedStatement pstm = conn.prepareStatement(sql)) {
				pstm.setInt(2, categoria.getId());
				pstm.setString(1, categoria.getNome());
				pstm.execute();
			}
		} catch (Exception e) {
			System.err.println("Não foi possivel atualizar os dados");
		}
	}
}
