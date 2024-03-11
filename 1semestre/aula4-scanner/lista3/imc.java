public class Calc1{
    public static void main(String [] args){
     
    Scanner grava = new Scanner(System.in);
    Double peso, altura;
    String nome;
     
    System.out.println("Digite o seu primeiro nome");
    nome = grava.nextLine();
     
    System.out.println("Digite o seu peso");
    peso = grava.nextDouble();
     
    System.out.println("Digite sua altura");
    altura = grava.nextDouble();

    imc = (peso/altura) * altura;
     
    System.out.println(imc);
     
    }
}