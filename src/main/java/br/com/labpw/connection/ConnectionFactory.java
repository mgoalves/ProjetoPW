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
			//return DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:" + port + "/sql10182540", "sql10182540", "49pngUsrFb");
		}catch(SQLException e){
			throw new RuntimeException("Erro na conex�o: " + e);
		}
	}

}

