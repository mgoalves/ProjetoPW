package br.com.labpw.model.professor;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.labpw.model.Professor;
import br.com.labpw.model.Endereco;

public class ProfessorDao {

	private Connection connection;

	public ProfessorDao(Connection connection) {
		this.connection = connection;
	}

	public void inserir(Professor professor) {

		String sql = "insert into professor "
				+ "(rg, cpf, nome, matricula, dataNascimento, cidade, bairro, logradouro, "
				+ "cep, numero, mestrado, graduacao, posGraduacao) " + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Date dataNascmento = new Date(professor.getDataNascimento().getTimeInMillis());

		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, professor.getRg());
			stmt.setString(2, professor.getCpf());
			stmt.setString(3, professor.getNome());
			stmt.setInt(4, professor.getMatricula());
			stmt.setDate(5, dataNascmento);
			stmt.setString(6, professor.getEnd().getCidade());
			stmt.setString(7, professor.getEnd().getBairro());
			stmt.setString(8, professor.getEnd().getLogradouro());
			stmt.setString(9, professor.getEnd().getCep());
			stmt.setInt(10, professor.getEnd().getNumero());
			stmt.setString(11, professor.getForm().getMestrado());
			stmt.setString(12, professor.getForm().getGraduacao());
			stmt.setString(13, professor.getForm().getPosGraduacao());

			stmt.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Professor> pesquisarPorNome(String nome) {
		return null;

	}

	// PESQUISAR POR MATRICULA
	public Professor pesquisarPorMatricula(String matricula) {
		return null;
	}

	public List<Professor> getLista() {
		return null;
	}

	public boolean editar() {
		return false;

	}

}
