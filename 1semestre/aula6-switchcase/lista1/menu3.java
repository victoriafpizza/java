package switchcase;

import java.util.Scanner;

public class menu3 {

	public static void main(String[] args) {
		
		Scanner opcoes = new Scanner(System.in);
	
		System.out.println("Ola, gostaria de ver o que no nosso sistema?");
		String op = opcoes.next();
	
	switch(op) {
	case "mensagem": 
		System.out.print("Voce é lindoo");
		System.out.print("Okay, obrigada por vir aqui. Bye");
		break;
	case "valor":
		System.out.printf("digite seu  valor");
		int val = opcoes.nextInt();
		double dezporcent = val * 0.10;
		System.out.printf("Seu valor é %.2f%n", dezporcent);
		System.out.print("Okay, obrigada por vir aqui. Bye");
		break;
	case "sair":
		System.out.print("Okay, obrigada por vir aqui");
		break;
	default: 
		System.out.printf("Digite uma opção válida");

	}
}
	
}
