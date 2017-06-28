package br.com.labpw.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {

	private Connection connection;

	public UsuarioDao(Connection connection) {
		this.connection = connection;
	}

	public boolean autenticar(Usuario usuario) {
		try {
			String sql = "select usuario, senha from usuarios where usuario=? and senha=?";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			throw new RuntimeException("Ocorreu um erro ao autenticar o usuário: " + e);
		}
		return false;
	}
}
