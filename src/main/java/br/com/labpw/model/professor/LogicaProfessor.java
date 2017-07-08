package br.com.labpw.model.professor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LogicaProfessor {

	String executa(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
}
