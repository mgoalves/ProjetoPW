package br.com.labpw.model.aluno;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;

public class AlunoExcluir implements LogicaAluno {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String MatriculaStr = request.getParameter("matricula");
		
		if(MatriculaStr==null || MatriculaStr.isEmpty()){
			return "servletaluno?logica=AlunoPesquisar";
		}else{
			
			try{
				Connection connection = new ConnectionFactory().getConnection();
				AlunoDao dao = new AlunoDao(connection);
				int matricula = Integer.parseInt(MatriculaStr);
				dao.excluir(matricula);
				connection.close();
			}catch(SQLException e){
				request.setAttribute("erro", "Erro ao exluir (AlunoDao - excluir()): " + e);
				request.setAttribute("nextPage", "servletaluno?logica=AlunoPesquisar");
				request.setAttribute("messageLink", "Listar");
			}catch(NumberFormatException nfe){
				request.setAttribute("erro", "Erro ao converter a matrícula em inteiro: " + nfe);
				request.setAttribute("nextPage", "servletaluno?logica=AlunoPesquisar");
				request.setAttribute("messageLink", "Listar");
			}
		}
		return "servletaluno?logica=AlunoPesquisar";
	}

}
