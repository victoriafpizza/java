package switchcase;
import java.util.Scanner;

public class Velocidade {

	public static void main(String[] args) {
		Scanner val = new Scanner(System.in);
		
		System.out.print("Digite sua velocidade permitida na via");
		int velnavia = val.nextInt();
		
		System.out.print("Digite sua velocidade na via");
		int suavel = val.nextInt();
		
		int calc = suavel - velnavia;
		
		if (calc > 10 && calc <= 11) {
			System.out.print("Multa de 80,00 reais");
		} else if (calc >= 11 && calc <= 39){
			System.out.print("Multa de 120,00");
		} else if (calc >= 40){
			System.out.print("Multa de 200,00");
		} else {
			System.out.print("Opção inválida");
		}

	}

}
