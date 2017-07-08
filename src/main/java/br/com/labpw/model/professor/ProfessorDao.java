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
		try {
			List<Professor> professores = new ArrayList<Professor>();

			String sql = "select * from professor where nome like ? '%'";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Professor professor = new Professor();

				// Dados do professor
				professor.setRg(rs.getString("rg"));
				professor.setCpf(rs.getString("cpf"));
				professor.setNome(rs.getString("nome"));
				professor.setMatricula(rs.getInt("matricula"));

				// Dados do endereço
				professor.getEnd().setCidade(rs.getString("cidade"));
				professor.getEnd().setBairro(rs.getString("bairro"));
				professor.getEnd().setLogradouro(rs.getString("logradouro"));
				professor.getEnd().setCep(rs.getString("cep"));
				professor.getEnd().setNumero(rs.getInt("numero"));

				// Dados da graduação
				professor.getForm().setMestrado(rs.getString("mestrado"));
				professor.getForm().setGraduacao(rs.getString("mestrado"));
				professor.getForm().setPosGraduacao("posGraduacao");

				// Data de nascimento
				Calendar dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(rs.getDate("dataNascimento"));
				professor.setDataNascimento(dataNascimento);

				professores.add(professor);

			}

			return professores;

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	// PESQUISAR POR MATRICULA
	public Professor pesquisarPorMatricula(String matricula) {
		Professor professor = null;

		try {

			// Select pro banco de dados
			String sql = "select *  from professor where matricula=? '%'";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, matricula);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				// Seta os valores de calendario
				professor = new Professor();
				Calendar dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(rs.getDate("dataNascimento"));

				// Seta os valores retornados na pesquisa para os atributos de
				// professor
				professor.setMatricula(rs.getInt("matricula"));
				professor.setNome(rs.getString("nome"));
				professor.setRg(rs.getString("rg"));
				professor.setCpf(rs.getString("cpf"));
				professor.setDataNascimento(dataNascimento);
				professor.getEnd().setCidade(rs.getString("cidade"));
				professor.getEnd().setBairro(rs.getString("bairro"));
				professor.getEnd().setLogradouro(rs.getString("logradouro"));
				professor.getEnd().setCep(rs.getString("cep"));
				professor.getEnd().setNumero(rs.getInt("numero"));
				professor.getForm().setMestrado(rs.getString("mestrado"));
				professor.getForm().setGraduacao(rs.getString("graduacao"));
				professor.getForm().setPosGraduacao(rs.getString("posGraduacao"));

			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return professor;
	}

	public List<Professor> getLista() {

		List<Professor> professores = new ArrayList<Professor>();

		try {

			String sql = "";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Professor professor = new Professor();

				Calendar dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(rs.getDate("dataNascimento"));

				// Seta os valores retornados na pesquisa para os atributos de
				// professor
				professor.setMatricula(rs.getInt("matricula"));
				professor.setNome(rs.getString("nome"));
				professor.setRg(rs.getString("rg"));
				professor.setCpf(rs.getString("cpf"));
				professor.setDataNascimento(dataNascimento);
				professor.getEnd().setCidade(rs.getString("cidade"));
				professor.getEnd().setBairro(rs.getString("bairro"));
				professor.getEnd().setLogradouro(rs.getString("logradouro"));
				professor.getEnd().setCep(rs.getString("cep"));
				professor.getEnd().setNumero(rs.getInt("numero"));
				professor.getForm().setMestrado(rs.getString("mestrado"));
				professor.getForm().setGraduacao(rs.getString("graduacao"));
				professor.getForm().setPosGraduacao(rs.getString("posGraduacao"));
				
				professores.add(professor);

			}

			return professores;

		} catch (SQLException e) {

			throw new RuntimeException(e);
		}
	}

	
	//Função que recebe os dados do professor 
	public boolean editar(Professor professor) throws SQLException {

		String sql = "update professor set nome=? rg=? cpf=? matricula=? dataNascimento=? "
				+ "cidade=? bairro=? logradouro=? cep=? numero=? mestrado=? graduacao=? posGraduacao=?";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
	
		//Dados do professor
		stmt.setString(1, professor.getRg());
		stmt.setString(2, professor.getCpf());
		stmt.setString(3, professor.getNome());
		stmt.setInt(4, professor.getMatricula());
		stmt.setDate(5, new Date(professor.getDataNascimento().getTimeInMillis()));
		
		//Dados de Endereço
		stmt.setString(6, professor.getEnd().getCidade());
		stmt.setString(7, professor.getEnd().getBairro());
		stmt.setString(8, professor.getEnd().getLogradouro());
		stmt.setString(9, professor.getEnd().getCep());
		stmt.setInt(10, professor.getEnd().getNumero());
		
		//Dados de Formação
		stmt.setString(11, professor.getForm().getMestrado());
		stmt.setString(12, professor.getForm().getGraduacao());
		stmt.setString(13, professor.getForm().getPosGraduacao());
		
		return stmt.execute();

	}

	//Função que recebe a matricula e exclui o cadastro do banco
	public boolean excluir(int matricula) throws SQLException {
		
		String sql = "delete from professor where matricula=?";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, matricula);
		
		return stmt.execute();
	}

}
