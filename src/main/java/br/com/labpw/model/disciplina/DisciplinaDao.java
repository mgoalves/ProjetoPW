package br.com.labpw.model.disciplina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.labpw.model.Disciplina;

public class DisciplinaDao {

	private Connection connection;

	public DisciplinaDao(Connection conexao) {
		this.connection = conexao;
	}

	public void incluir(Disciplina disciplina) throws SQLException {
		String sql = "insert into disciplina (codigo, nome, descricao, cargaHoraria) values (?, ?, ?, ?)";

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

	public Disciplina buscarPorId(int codigo) {

		Disciplina disciplina = null;

		try {
			
			//Comando para buscar no banco 
			String sql = "select * from disciplina where codigo=?";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, Integer.toString(codigo));
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()){
				
				disciplina = new Disciplina();
				
				//Seta os valores dentro do obejeto.
				disciplina.setCodigo(rs.getInt("codigo"));
				disciplina.setNome(rs.getString("nome"));
				disciplina.setDescricao(rs.getString("descricao"));
				disciplina.setCargaHoraria(rs.getInt("cargaHoraria"));
			
			}

		} catch (SQLException e) {

			throw new RuntimeException(e.getMessage());
		}

		return disciplina;

	}
	
	//Fun��o que permite a altera��o dos valores de disciplina
	//Exceto o codigo de disciplina, este n�o pode ser alterado
	public void alterar(Disciplina disciplina) throws SQLException {
		
		String sql = "update disciplina set nome=? decricao=? cargaHoraria=? where codigo=?";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setString(1, disciplina.getNome());	
		stmt.setString(2, disciplina.getDescricao());
		stmt.setInt(3, disciplina.getCargaHoraria());
		stmt.setInt(4, disciplina.getCodigo());
		stmt.executeQuery();
		
	}

	//Fun��o que exclui a tupla de acordo com o codigo fornecido
	public void excluir(int codigo) throws SQLException {
		
		String sql = "delete from disciplina where codigo=?";
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, codigo);
		stmt.executeQuery();

	}

	// Fun��o que retorna todas tuplas de Disciplinas
	public List<Disciplina> listar() {
		try {
			List<Disciplina> disciplinas = new ArrayList<Disciplina>();

			// Comando de sele��o ao banco de dados
			String sql = "select * from disciplina";
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Disciplina disciplina = new Disciplina();

				// Seta os valores retornados na pesquisa para os atributos de
				// disciplina
				disciplina.setCodigo(rs.getInt("codigo"));
				disciplina.setNome(rs.getString("nome"));
				disciplina.setDescricao(rs.getString("descricao"));
				disciplina.setCargaHoraria(rs.getInt("cargaHoraria"));

				disciplinas.add(disciplina);

			}

			return disciplinas;

		} catch (SQLException e) {
			throw new RuntimeException("Erro na listagem de disciplinas: " + e);
		}
	}

}
