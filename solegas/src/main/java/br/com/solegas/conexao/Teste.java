package br.com.solegas.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conn = new ConnectionFactory();
		
		Connection con = conn.connexao();
		
		con.close();
		
		
	}
}
