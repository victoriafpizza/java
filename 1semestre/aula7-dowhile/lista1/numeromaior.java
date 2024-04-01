package dowhile;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner info = new Scanner(System.in);
		System.out.println("Por favot digite quantos numeor voce gostaria de adcionar");
		int numeros = info.nextInt();
		
		int contador = 0;
		double somaDosNumeros = 0;
		while (contador < numeros) {
		    System.out.println("Digite o numero " + (contador + 1) + ":");
		    double nota = info.nextDouble();
		    somaDosNumeros += numeros;
		    int numeroMaior = numeros;
		    contador++;
		    System.out.print("O seu maior numero é ");
		
		}
		
	}

}
