package Lista4;

import java.util.Scanner;

public class rendimento {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		double juros = 0.70;
	
		System.out.println("Digite o seu valor depositado no mes");
		double dinheiro = val.nextDouble();
		
		double rendimento = dinheiro * juros;
											
		System.out.printf("O seu rendimento foi de %.2f%n", rendimento);
	}

}
