package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3307/byte_bank?user=root&password=Alura123");

			System.out.println("Recuperei a conexão");

			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}
}
