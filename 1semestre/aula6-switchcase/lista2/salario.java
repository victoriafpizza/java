package switchcase;

import java.util.Scanner;

public class Salario {
	
	public static void main(String[] args) {
	
	Scanner info = new Scanner(System.in);
	System.out.println("Digite seu salario");
	double sal = info.nextDouble();
	
	double vt = sal * 0.02;
	double tr = sal * 0.06;
	double ir = sal * 0.07;
	
	double saldesc = sal - (vt + tr + ir);
	
	if (saldesc > 1200) {
		double quinzeporcent = ir * 0.15;
		double salliq = sal - quinzeporcent;
		System.out.printf("Seu salário é de %.2f%n", salliq);
	} else {
		System.out.print("não houve desconto");
	}
	}
}