public class Gasto{
    public static void main(String [] args){
     
    Scanner grava = new Scanner(System.in);
    Double litro, km, tempo;

    System.out.println("Digite quanto tempo");
    tempo = grava.nextLine();
     
    System.out.println("Digite os km");
    km = grava.nextDouble();
     
    litros = km / tempo;

    System.out.println(litros);
     
    }
}