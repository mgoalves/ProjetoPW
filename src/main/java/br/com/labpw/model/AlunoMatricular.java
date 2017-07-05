package br.com.labpw.model;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.labpw.connection.ConnectionFactory;

public class AlunoMatricular implements LogicaAluno {
	
	public String executa(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
		
		String operacao = request.getParameter("operacao");
		String paginaRetorno;
		
		if(operacao==null || operacao.isEmpty()){
			paginaRetorno = "erroPage.jsp";
			request.setAttribute("", "Não foi possível recuperar o parâmetro de entrada");
			request.setAttribute("nextPage", "aluno_matricula.jsp");
			request.setAttribute("messageLink", "Tentar novamente...");
			
		}else if(operacao.equals("buscar")){
			String matricula = request.getParameter("matricula");
			
			Connection connection = new ConnectionFactory().getConnection();
			AlunoDao dao = new AlunoDao(connection);
			Aluno aluno = dao.pesquisarPorMatricula(matricula);
			request.setAttribute("aluno", aluno);					
			paginaRetorno = "aluno_matricula.jsp";			
		}
		
		else if(operacao.equals("matricular")){
			//associa matrícula do aluno com o código da diciplina
			//lista todos os alunos matriculados no referido curso
			paginaRetorno = "aluno_matricular.jsp";
			
		}else{
			paginaRetorno = "erroPage.jsp";
			request.setAttribute("", "O parâmetro que especifica a operação a ser realizada não foi passado na requisição");
			request.setAttribute("nextPage", "aluno_matricular.jsp");
			request.setAttribute("messageLink", "Tentar novamente...");
		}
		
		return paginaRetorno;
	}

}
