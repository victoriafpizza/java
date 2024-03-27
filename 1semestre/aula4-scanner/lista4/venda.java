package Lista4;

import java.util.Scanner;

public class vendas {

    public static void main(String[] args) {
        Scanner vend = new Scanner(System.in);
        
        System.out.print("Digite o valor do seu produto: ");
        double prod = vend.nextDouble();
        
        System.out.print("Digite a porcentagem: ");
        double percent = vend.nextDouble();
        
        double valTotal = prod + (percent / 100 * prod);
        
        System.out.printf("Seu valor total é de %.2f%n", valTotal);
    }

}