import   java.util.Scanner;  // Importa a biblioteca util e a função Scanner 

public class Porcentagem { // Cria a classe Porcentagem

public static void main(String[] args) {  // Inicia bloco de comandos

Scanner gravar = new  Scanner(System.in);  // Cria a função "gravar"  para armazenamento de dados

String nome ; // Cria variavel "nome" do tipo String
int idade;  // Cria  variavel "idade" do tipo inteiro

System.out.print("Escreva seu nome: "); // Mostra informação na tela
nome = gravar.nextLine(); // Armazena resposta na variavel "nome"

System.out.print("Escreva sua idade: "); // Mostra informação na tela
idade = gravar.nextInt(); // Armazena valor na variavel "idade"

System.out.print(nome + " voce tem "  + idade +   " anos  ");  // Concatena variaveis e mensagens

}
}
 