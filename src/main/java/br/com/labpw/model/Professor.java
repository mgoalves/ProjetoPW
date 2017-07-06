package br.com.labpw.model;

public class Professor {

	// Atributos da classe professor
	private String rg;
	private String cpf;
	private String nome;
	private int matricula;
	private String dataNascimento;

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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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

}
