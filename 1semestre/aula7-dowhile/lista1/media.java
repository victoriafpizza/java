package dowhile;

import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		Scanner al  = new Scanner(System.in);
		
		System.out.print("Quantos alunos voce tem?");
		int alunos = al.nextInt();
		
		int contador = 0;
		double somaDasNotas = 0;
		while (contador < alunos) {
		    System.out.println("Digite a nota do aluno " + (contador + 1) + ":");
		    double nota = al.nextDouble();
		    somaDasNotas += alunos;
		    contador++;
		}
		
		double media = somaDasNotas / alunos;
		System.out.println("A média das notas da turma é: " + media);
	}

}
