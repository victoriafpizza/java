package Lista4;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
		System.out.println("Digite o valor A");
		System.out.println("Digite o valor B");
		
		int a = val.nextInt();
		int b = val.nextInt();
		
		int soma = a + b;
		double produto = a *b;
		double quociente = a/b;
		
		System.out.printf("O valor da soma é de %d:", soma);
		System.out.printf("O valor do produto é de %.2f%n:", produto);
		System.out.printf("O valor do quociente é de %.2f%n:", quociente);

	}
}