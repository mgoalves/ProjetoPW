package br.com.labpw.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		try{
			return DriverManager.getConnection("jdbc:mysql://localhost/projetopw_bd?autoReconnect=true&useSSL=false", "root", "123456");
		}catch(SQLException e){
			throw new RuntimeException("Erro na conexão: " + e);
		}
	}

}
