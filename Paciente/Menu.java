package com.generation.paciente;

import com.generation.paciente.model.Paciente;

public class Menu {
	public static void main(String[]args) {
		
		Paciente p1 = new Paciente(321, "Joana", "123.321.456-3", "Febre, dor de cabeça, coriza", "Unimed", 988775432 );
		
		p1.visualizar();
		p1.setId(321);
		p1.setNome("Joana da Silva");
		p1.setCpf("123.321.456-3");
		p1.setSintomas("Febre,dor de cabeça, coriza");
		p1.setConvenio("Unimed");
		p1.setTelefone(988775432);
		
		
	}
	

}
