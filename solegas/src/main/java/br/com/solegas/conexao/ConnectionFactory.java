package br.com.solegas.conexao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	private DataSource datasource;

	public ConnectionFactory() {
		try {
			ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
			comboPooledDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
			comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/solegas?Timezone=true&serverTimezone=UTC");
			comboPooledDataSource.setUser("root");
			comboPooledDataSource.setPassword("1234");
			this.datasource = comboPooledDataSource;
		} catch (Exception e) {
			System.err.println("Erro ao conectar ao banco!");
		}
	}

	public Connection connexao() throws SQLException {
		return this.datasource.getConnection();
	}

}
