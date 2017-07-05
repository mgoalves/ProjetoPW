package br.com.labpw.model.disciplina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.labpw.model.Disciplina;

public class DisciplinaDao {
	
	private Connection connection;
	
	public DisciplinaDao(Connection conexao){
		this.connection = conexao;
	}
	
	public void incluir(Disciplina disciplina) throws SQLException{
		String sql = "insert into disciplina (Codigo, Nome, Descricao, CargaHoraria) values (?, ?, ?, ?)";
		
		PreparedStatement stmt = this.connection.prepareStatement(sql);
		stmt.setInt(1, disciplina.getCodigo());
		stmt.setString(2, disciplina.getNome());
		stmt.setString(3, disciplina.getDescricao());
		stmt.setInt(4, disciplina.getCargaHoraria());
		
		stmt.execute();
	}
	
	public Disciplina buscarPorId(int codigo){
		
		//List
		
		return null;
	}
	
	public void alterar(int codigo){
		
	}
	
	public void excluir(int codigo){
		
	}
	
	public ArrayList<Disciplina> listar(){
		return null;
	}

}
