package br.com.labpw.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		String port = System.getProperty("mysqlport");
		port = port == null ? "3306" : port;
		try{
			return DriverManager.getConnection("jdbc:mysql://localhost:" + port + "/projetopw_bd", "root", "123456");
		}catch(SQLException e){
			throw new RuntimeException("Erro na conexão: " + e);
		}
	}

}
