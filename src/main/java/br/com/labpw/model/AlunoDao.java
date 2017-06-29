package br.com.labpw.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.sql.Date;

public class AlunoDao {

	private Connection connection;

	public AlunoDao(Connection connection) {
		this.connection = connection;
	}

	public void inserir(Aluno aluno) {
		String sql = "insert into aluno (MatrAluno, Nome, DataNascimento, Rg, Cpf, "
				+ "NomeMae, Cidade, Bairro, Logradouro, Cep, Numero) " + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Date dataNascimento = new Date(aluno.getDataNascimento().getTimeInMillis());

		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, aluno.getMatricula());
			stmt.setString(2, aluno.getNome());
			stmt.setDate(3, dataNascimento);
			stmt.setString(4, aluno.getRg());
			stmt.setString(5, aluno.getCpf());
			stmt.setString(6, aluno.getNomeMae());
			stmt.setString(7, aluno.getEndereco().getCidade());
			stmt.setString(8, aluno.getEndereco().getBairro());
			stmt.setString(9, aluno.getEndereco().getLogradouro());
			stmt.setString(10, aluno.getEndereco().getCep());
			stmt.setInt(11, aluno.getEndereco().getNumero());

			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

	}

	public Aluno pesquisar(String matricula) {

		String sql = "select * from aluno where MatrAluno = ?";
		Aluno aluno = null;

		try {
			// Cria um PreparedStatement e executa a query de pesquisa
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, matricula);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				aluno = new Aluno();
				// Seta os valores retornados na pesquisa para os atributos de
				// aluno
				aluno.setMatricula(rs.getString("MatrAluno"));
				aluno.setNome(rs.getString("Nome"));
				aluno.setNomeMae(rs.getString("NomeMae"));
				aluno.setRg(rs.getString("Rg"));
				aluno.setCpf(rs.getString("Cpf"));
				aluno.getEndereco().setCidade(rs.getString("Cidade"));
				aluno.getEndereco().setBairro(rs.getString("Bairro"));
				aluno.getEndereco().setLogradouro(rs.getString("Logradouro"));
				aluno.getEndereco().setCep(rs.getString("Cep"));
				aluno.getEndereco().setNumero(rs.getInt("Numero"));

				// Convete a data retornada do banco para o tipo Calendar
				Calendar dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(rs.getDate("DataNascimento"));

				// Seta a data de nascimento do aluno
				aluno.setDataNascimento(dataNascimento);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		}

		return aluno;
	}

	// código para buscar alunos no banco e adicionar na lista
	public List<Aluno> getList() {

		String sql = "select * from aluno";
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno aluno = null;

		try {

			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				aluno = new Aluno();
				// Seta os valores retornados na pesquisa para os atributos de
				// aluno
				aluno.setMatricula(rs.getString("MatrAluno"));
				aluno.setNome(rs.getString("Nome"));
				aluno.setNomeMae(rs.getString("NomeMae"));
				aluno.setRg(rs.getString("Rg"));
				aluno.setCpf(rs.getString("Cpf"));
				aluno.getEndereco().setCidade(rs.getString("Cidade"));
				aluno.getEndereco().setBairro(rs.getString("Bairro"));
				aluno.getEndereco().setLogradouro(rs.getString("Logradouro"));
				aluno.getEndereco().setCep(rs.getString("Cep"));
				aluno.getEndereco().setNumero(rs.getInt("Numero"));

				// Convete a data retornada do banco para o tipo Calendar
				Calendar dataNascimento = Calendar.getInstance();
				dataNascimento.setTime(rs.getDate("DataNascimento"));

				// Seta a data de nascimento do aluno
				aluno.setDataNascimento(dataNascimento);

				alunos.add(aluno);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}

		return alunos;
	}

	public void editar(Aluno aluno) {
		// codigo para atualizar os dados do aluno no banco
	}

}
