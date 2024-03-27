package ifelse;

import java.util.Scanner;

public class negativo {
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		
		System.out.print("Digite o numero 1");
		int n1 = val.nextInt();
		
		
		if (n1 < 0) {
			System.out.print("O numero é negativo");
		} else {
			System.out.print("o numero é positivo");
			}
		}
	
	}
