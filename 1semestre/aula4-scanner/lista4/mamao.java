package Lista4;

import java.util.Scanner;

public class mamao {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu produto");
		double valor = val.nextDouble();
		
		double prest = valor /5;
		
		System.out.printf("suas prestações são de %.2f%n", prest);

	}

}
