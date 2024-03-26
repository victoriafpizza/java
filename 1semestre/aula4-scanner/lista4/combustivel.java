package Lista4;

import java.util.Scanner;

public class combustivel {
	public static void main(String[] args) {
		Scanner verificar = new Scanner(System.in);
		float valor = 0;
		float resultado = 0;
		
		System.out.println("Digite o valor gasto em combustivel no mes por dia em reais");
		float valor1 = verificar.nextFloat();
		
		resultado = (valor1 *30);
		
		System.out.printf("o seu valor gasto em reais por dia é %.2f%n:",resultado);
	}
}
