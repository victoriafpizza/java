import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // Inicialização do scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declaração das variáveis para armazenar a idade, respostas corretas e a pontuação final
        int age, score = 0;
        String answer;
        
        // Solicita ao usuário que informe sua idade
        System.out.print("Por favor, informe sua idade: ");
        age = scanner.nextInt();
        
        // Determina a categoria de acordo com a idade fornecida
        String category;
        if (age >= 1 && age <= 10) {
            category = "infantil";
        } else if (age >= 11 && age <= 13) {
            category = "infanto-juvenil";
        } else if (age >= 14 && age <= 17) {
            category = "pré-adolescente";
        } else {
            category = "adulto";
        }
        
        // Após a leitura da idade, limpa o buffer do scanner
        scanner.nextLine();
        
        // Pergunta 1
        System.out.println("\nCategoria: " + category);
        System.out.println("\n1. Qual é a capital do Brasil?");
        System.out.println("a) Rio de Janeiro");
        System.out.println("b) São Paulo");
        System.out.println("c) Brasília");
        System.out.print("Resposta: ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("c")) {
            score++;
        }
        
        // Pergunta 2
        System.out.println("\n2. Qual é o maior planeta do sistema solar?");
        System.out.println("a) Terra");
        System.out.println("b) Júpiter");
        System.out.println("c) Saturno");
        System.out.print("Resposta: ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("b")) {
            score++;
        }
        
        // Pergunta 3
        System.out.println("\n3. Quem escreveu 'Dom Quixote'?");
        System.out.println("a) Miguel de Cervantes");
        System.out.println("b) William Shakespeare");
        System.out.println("c) Machado de Assis");
        System.out.print("Resposta: ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("a")) {
            score++;
        }
        
        // Pergunta 4
        System.out.println("\n4. Qual é o elemento químico com símbolo 'O'?");
        System.out.println("a) Oxigênio");
        System.out.println("b) Ouro");
        System.out.println("c) Ferro");
        System.out.print("Resposta: ");
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("a")) {
            score++;
        }
        
        // Exibição da pontuação final
        System.out.println("\nPontuação final: " + score + "/4");
        
        // Fechamento do scanner
        scanner.close();
    }
}
