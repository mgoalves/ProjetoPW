package br.com.labpw.model.disciplina;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LogicaDiscipina {

	String executa(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
