mport java.util.Scanner;
 
public class Main {
 
   
    public static void main(String[] args) {
        Scanner grava =  new Scanner(System.in);
        int cpf, rg, cod , op;
       System.out.println("Menu\n1-Inclusão\n2-Alteração\n3-Exclusão\n4-Sair");
       op =  grava.nextInt();
       if(op == 1){
           System.out.println("Digite o seu RG");
           rg = grava.nextInt();
           System.out.println("Digite o seu CPF");
           cpf = grava.nextInt();
           System.out.println("Digite o seu Código");
           cod = grava.nextInt();
       }else if(op == 2){
           System.out.println("Registro alterado com sucesso");
       }else if(op == 3){
             System.out.println("Registro excluido com sucesso");
       }else if(op == 4){
             System.out.println("Encerrando o sistema");
       }else{
             System.out.println("Opção Inválida");
       }
    }
}