package br.com.labpw.model;

import java.util.Calendar;

/**
 *
 * @author Hitallo, Jones, Marcello e Reinaldo.
 */

public class Aluno {

	// Atributos de um objeto do tipo Aluno
	private String matricula;
	private String nome;
	private Calendar dataNascimento;
	private String rg;
	private String cpf;
	private String nomeMae;
	private Endereco endereco;
	
	
	// Métodos acessores dos atributos de um objeto Aluno
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
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
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
