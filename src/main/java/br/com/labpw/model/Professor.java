package br.com.labpw.model;

import java.util.Calendar;
import java.util.Date;

public class Professor {

	// Atributos da classe professor
	private String rg = null;
	private String cpf = null;
	private String nome = null;
	private int matricula = 0;
	private Calendar dataNascimento = null;

	// Atributos importados
	private Endereco end;
	private Formacao form;
	
	
	//Getters and Setters
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Endereco getEnd() {
		return end;
	}
	public void setEnd(Endereco end) {
		this.end = end;
	}
	public Formacao getForm() {
		return form;
	}
	public void setForm(Formacao form) {
		this.form = form;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	


}
