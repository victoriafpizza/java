public class exer1{
    public static void main(String [] args){
     
    Scanner grava = new Scanner(System.in);
     
    String nome, meio , sobre;
     
    System.out.println("Digite o seu primeiro nome");
    nome = grava.nextLine();
     
    System.out.println("Digite o seu nome do meio");
    meio = grava.nextLine();
     
    System.out.println("Digite o seu sobrenome");
    sobre = grava.nextLine();
     
    System.out.println(nome+ "   "  + meio+ "  " +sobre);
     
    }
}