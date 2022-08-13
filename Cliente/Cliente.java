package com.generation.cliente.model;

public class Cliente {
	
	private String Nome;
	private String Endereço;
	private int telefone;
	public Cliente(String nome, String endereço, int telefone) {
		
		this.Nome = nome;
		this.Endereço = endereço;
		this.telefone = telefone;
	}

public Cliente(){
}
public String getNome() {
	return Nome;
}
 public void setNome(String Nome) {
	 this.Nome = Nome;
 }
 public String getEndereço() {
	 return Endereço;
 }
 public void setEndereço(String Endereço) {
	 this.Endereço = Endereço;
 }
 public int getTelefone() {
	 return telefone;
 }
 public void setTelefone(int Telefone) {
	 this.telefone = Telefone;
 }
 public void visualizar() {
	 
	 System.out.println("*****");
	 System.out.println("Informações do cliente:");
	 System.out.println("Nome do Cliente:" +this.Nome);
	 System.out.println("Endereço do Cliente" +this.Endereço);
	 System.out.println("Telefone do Cliente" +this.telefone);
 }

 
}