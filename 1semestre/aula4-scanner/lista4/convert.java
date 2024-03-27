package Lista4;

import java.util.Scanner;

public class dolares {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		double real = info.nextDouble();
		System.out.println("Digite quantos dolares voce gostaria de convertes");
		
		double dol = real * 5;
		
		System.out.printf("Voce tem %.2f%n", dol);
		

	}

}
