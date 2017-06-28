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

	public boolean autenticar2(Usuario usuario) {
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

	public Usuario autenticar(Usuario usuario) {
		Usuario usuarioAutenticado = null;
		try {
			String sql = "select usuario, senha from usuarios where usuario=? and senha=?";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getSenha());
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				usuarioAutenticado = new Usuario();
				usuarioAutenticado.setNome(rs.getString("usuario"));
				usuarioAutenticado.setSenha(rs.getString("senha"));
			}
		} catch (SQLException e) {
			throw new RuntimeException("Ocorreu um erro ao autenticar o usuário: " + e);
		}
		return usuarioAutenticado;
	}
}
