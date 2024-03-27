package Lista4;

import java.util.Scanner;

public class vendedor {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        float com = 100 / 15;

        System.out.println("Digite o seu nome:");
        String nome = info.nextLine();

        System.out.println("Digite o seu salario fixo:");
        float salf = info.nextFloat();

        System.out.println("Digite as suas vendas:");
        float tv = info.nextFloat();

        float resultado = tv * com;
        float total = salf + resultado;

        System.out.println("O seu nome é: " + nome);
        System.out.printf("O seu salario fixo é de: %.2f%n", salf);
        System.out.printf("A sua comissão é de: %.2f%n", resultado);
        System.out.printf("Logo seu salario total é de %.2f%n", total);
    }
}