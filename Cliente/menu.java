package com.generation.cliente;

import com.generation.cliente.model.Cliente;

public class menu {
	public static void main(String[]args) {
		
		Cliente c1 = new Cliente("Vilckson","Rio Guaíba", 981984807);
		
		System.out.println("Quem é o cliente:"+c1.getNome());
		
		
		c1.visualizar();
		c1.setNome("Vilckson");
		c1.setEndereço("Rio Guaiba");
		c1.setTelefone(981984807);
	}

	
	

}
