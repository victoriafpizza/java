package switchcase;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		
		Scanner idade = new Scanner(System.in);
		
		System.out.print("Por favor informe sua idade");
		int age = idade.nextInt();
		
		if (age < 10) {
			System.out.print("Categoria Infantil");
		} else if (age >= 11 && age <= 13){
			System.out.print("Categoria Infanto-Juvenil");
		} else if (age >= 14 && age <= 17){
			System.out.print("Categoria Pre-Adolescente");
		} else if (age > 18){
			System.out.print("ADULTO");
		} else {
			System.out.print("Opção inválida");
		}
	}
} 
