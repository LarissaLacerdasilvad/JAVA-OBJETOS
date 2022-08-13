package com.generation.paciente.model;

public class Paciente {
	
	private int id;
	private String nome;
	private String cpf;
	private String sintomas;
	private String convenio;
	private int telefone;
	
	public Paciente(int id, String nome, String cpf, String sintomas, String convenio, int telefone) {
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sintomas = sintomas;
		this.convenio = convenio;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void visualizar() {
		System.out.println("\nQual a ID do paciente:"+this.id);
		System.out.println("\nQual o nome do paciente:"+this.nome);
		System.out.println("\nQual o CPF do paciente"+this.cpf);
		System.out.println("\nQuais os sintomas do paciente:"+this.sintomas);
		System.out.println("\nQual o convenio do paciente:"+this.convenio);
		System.out.println("\nQual telefone do paciente"+this.telefone);
	}
	
	


}
