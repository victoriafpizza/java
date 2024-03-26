package Lista4;

import java.util.Scanner;

public class valor {

	public static void main(String[] args) {
		Scanner verificar = new Scanner(System.in);
		double resultado = 0;
		
		System.out.println("Digite o seu valor");
		double valor = verificar.nextInt();
		
		resultado = (((2/50) * (valor/49)+2*2)/48);
		
		System.out.printf("seu valor é %2f",resultado);

	}
}
