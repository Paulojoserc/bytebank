package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection recuperarConexao() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3307/byte_bank?user=root&password=Alura123");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
