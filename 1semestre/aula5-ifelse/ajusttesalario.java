package ifelse;
import java.util.Scanner;

public class ajusteSalario {
	
	    public static void main(String[] args) {
	        Scanner avalia = new Scanner(System.in);

	        System.out.print("Digite o salário do colaborador: ");
	        double salario = avalia.nextDouble();

	        double percentualAumento;
	        if (salario <= 280.00) {
	            percentualAumento = 0.20;
	        } else if (salario <= 700.00) {
	            percentualAumento = 0.15;
	        } else if (salario <= 1500.00) {
	            percentualAumento = 0.10;
	        } else {
	            percentualAumento = 0.5;
	        }

	        double aumento = (percentualAumento / 100) * salario;
	        double novoSalario = salario + aumento;

	        System.out.println("Salário antes do reajuste: R$" + salario);
	        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
	        System.out.println("Valor do aumento: R$" + aumento);
	        System.out.println("Novo salário, após o aumento: R$" + novoSalario);

	    }
	}
