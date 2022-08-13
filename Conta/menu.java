package com.genaration.conta;

import com.genaration.conta.model.conta;

public class menu {

	public static void main(String[] args) {
		
		conta c1 = new conta(123456, "123", "CC", "João Da Silva", 2000.50f);
		c1.visualizar();
		conta c2 = new conta(123457, "123", "CC", "Amanda Da Silva", 200000.0f);
		c2.visualizar();
		
		System.out.println("Saldo da conta C1:"+c1.getSaldo());
		System.out.println("Saldo da conta C2:"+c2.getSaldo());
		
		
		c1.setSaldo(3000.0f);
		c1.visualizar();
		System.out.println("Saldo atualizado da conta c1:"+c1.getSaldo());
		
		c2.setTitular("Amanda Giacometti");
		System.out.println("Nome atualizado da conta c2:"+c2.getTitular());
		
		conta c3 = new conta();
		c3.visualizar();
		
		c3.setNumero(123458);
		c3.setTitular("Gabi");
		c3.setSaldo(500000.0f);
		c3.visualizar();

		if (c2.sacar(1000.0f)== true)
		    c2.visualizar();
		else
			System.out.println("Saldo insuficiente" );
		
		
		
		
	}
}
