package Lista4;

import java.util.Scanner;

public class latao {
	
	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		double zinco = 0.30;
		double cobre = 0.70;
	
		System.out.println("Digite o seu valor usado em latão");
		double lat = val.nextInt();
		
		double lataoz = zinco*lat;
		double lataoc = cobre*lat;
											
		System.out.printf("O seu latão tem em cobre %.2f%n", lataoc);
		System.out.printf("O seu latão tem em zinco %.2f%n", lataoz);
		
	}
}
