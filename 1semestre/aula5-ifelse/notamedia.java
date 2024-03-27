package ifelse;

import java.util.Scanner;

public class notamedia {

	public static void main(String[] args) {
		 Scanner ver = new Scanner(System.in);
	        
	        System.out.print("Digite sua media");
	        int nota = ver.nextInt();

	        if (nota == 10) {
	            System.out.print("Você foi aprovado com distinção");
	        } else if (nota >= 7) {
	            System.out.print("voce foi aprovado");
	        } else {
	            System.out.print("Voce foi reprovado");
	        }   

	}

}
