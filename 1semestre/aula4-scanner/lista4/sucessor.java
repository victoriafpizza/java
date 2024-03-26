package Lista4;

import java.util.Scanner;

public class sucessor {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
	
		System.out.println("Digite um numero");
		int n1 = num.nextInt();
		
		int suc = n1 + 1;
											// o %d serve para int
		System.out.printf("O sucessor do seu numero é %d:", suc);

	}

}
