package switchcase;

import java.util.Scanner;

public class cadastrocliente {

	public static void main(String[] args) {
		
		Scanner cadastro = new Scanner(System.in);
		
		System.out.print("Insira seu cpf");
		int cpf = cadastro.nextInt();
		
		System.out.print("Insira seu rg");
		int rg = cadastro.nextInt();
		
		System.out.print("Deseja fazer alterações onde no seus dados?");
		String alteracao = cadastro.next();
		
		switch(alteracao) {
		case "sim":
			System.out.print("Ok, qual deles voce gostaria de alterar?");
			String alterado = cadastro.next();
			switch(alterado) {
			case "cpf": 
				System.out.printf("digite a alteração no seu cpf");
				int cpf2 = cadastro.nextInt();
				System.out.printf("Seu  cpf alterado é %d:", cpf2);
				break;
			case "rg":
				System.out.printf("digite seu rg alterado");
				int rg2 = cadastro.nextInt();
				System.out.printf("Seu rg alterado é %d:", rg2);
				break;
			}
		case "não":
			System.out.printf("Okay, obrigada por seus dados");
			break;
		default: 
			System.out.printf("Por favor insira dados validos para serem lidos");
			
		}
		
	}

}

