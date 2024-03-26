package Lista4;

import java.util.Scanner;

public class vendedor {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		float com = (float) 0.15;
		
		String nome = info.nextLine();
		float salf = info.nextInt();
		float tv = info.nextFloat();
		
		System.out.println("Digite o seu nome");
		System.out.println("Digite o seu salario fixo");
		System.out.println("Digite as suas vendas");
		
		float resultado = salf *com;
		float total = salf + resultado;
		
		System.out.printf("O seu nome é:", nome);
		System.out.printf("O seu salario fixo é de: %.2f%n:", salf);
		System.out.printf("A sua comissão é de: %.2f%n:", resultado);
		System.out.printf("Logo seu salario total é de %.2f%n:", total);

	}
}
