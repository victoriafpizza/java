public static void main(String[] args){
    Scanner grava = new Scanner(System.in);
    double n1,n2,n3,calculo;
    String nome;

    System.out.println("Digite a primeira nota");
    a = grava.nextDouble();

    System.out.println("Digite a segunda nota");
    b = grava.nextDouble();

    System.out.println("Digite a segunda nota");
    c = grava.nextDouble();

    calculo = ((a + b + c) * 10) / 2;

    System.out.println(calculo);
}