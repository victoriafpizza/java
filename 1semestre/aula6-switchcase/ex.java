package switchcase;

import java.util.Scanner;

public class exmedalhas {

	public static void main(String[] args) {
		 Scanner ver = new Scanner(System.in);
		
		System.out.println("Digite sua posição na classificação");
		
		int posicao=ver.nextInt();
		
		switch(posicao) {
		case 1:
			System.out.printf("%s%n", "medalha de ouro");
			break;
		case 2:
			System.out.printf("%s%n", "medalha de bronze");
			break;
		case 3:
			System.out.printf("%s%n", "medalha de prata");
			break;
		default: 
			System.out.printf("%s%n", "Sem medalha");
			
		}
		
	}

}
