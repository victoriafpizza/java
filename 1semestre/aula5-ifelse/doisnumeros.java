package ifelse;

import java.util.Scanner;

public class doisnumeros {
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		
		System.out.print("Digite o numero 1");
		int n1 = val.nextInt();
		
		System.out.print("Digite o numero 2");
		int n2 = val.nextInt();
		
		if (n1 > n2) {
			System.out.print(n1);
		} else {
			System.out.print(n2);
			}
		}
	
	}
