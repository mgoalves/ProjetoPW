package br.com.labpw.model.disciplina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import br.com.labpw.model.Disciplina;

public class DisciplinaDao {

	private Connection connection;

	public DisciplinaDao(Connection conexao) {
		this.connection = conexao;
	}

	public void incluir(Disciplina disciplina) throws SQLException {
		String sql = "insert into disciplina (Codigo, Nome, Descricao, CargaHoraria) values (?, ?, ?, ?)";

		try {

			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setInt(1, disciplina.getCodigo());
			stmt.setString(2, disciplina.getNome());
			stmt.setString(3, disciplina.getDescricao());
			stmt.setInt(4, disciplina.getCargaHoraria());

			stmt.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Disciplina> buscarPorId(int codigo) {
		try {
			List<Disciplina> disciplinas = new ArrayList<Disciplina>();

			//Comando de seleção ao banco de dados
			String sql = "select * from disciplina where codigo like ? ";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			//Converter o codigo de Inteiro para String
			stmt.setString(1, Integer.toString(codigo));
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				Disciplina disciplina = new Disciplina();
				
				// Seta os valores retornados na pesquisa para os atributos de disciplina
				disciplina.setCodigo(rs.getInt("codigo"));
				disciplina.setNome(rs.getString("nome"));
				disciplina.setDescricao(rs.getString("descricao"));
				disciplina.setCargaHoraria(rs.getInt("cargaHoraria"));
			
				disciplinas.add(disciplina);
				
				
			}
			
			return disciplinas;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;

	}

	public void alterar(int codigo) {

	}

	public void excluir(int codigo) {

	}

	public ArrayList<Disciplina> listar() {
		return null;
	}

}
