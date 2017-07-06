package br.com.labpw.model.aluno;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LogicaAluno {
	
	String executa(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
