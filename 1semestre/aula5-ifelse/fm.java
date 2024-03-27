package ifelse;

import java.util.Scanner;

public class fm {

    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);
        
        System.out.print("Digite o seu gênero: ");
        String gen = ver.nextLine();

        if (gen.equals("F")) {
            System.out.print("Você é do sexo feminino");
        } else if (gen.equals("M")) {
            System.out.print("Você é do sexo masculino");
        } else {
            System.out.print("Gênero não identificado");
        }   
    }
}