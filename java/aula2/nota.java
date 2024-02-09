public static void main(String[] args){
    Scanner grava = new Scanner(System.in);
    double n1,n2,n3,media;
    String nome;

    System.out.println("Digite a primeira nota");
    n1 = grava.nextDouble();

    System.out.println("Digite a segunda nota");
    n2 = grava.nextDouble();

    System.out.println("Digite a terceira nota");
    n3 = grava.nextDouble();

    media = (n1+n2+n3)/3;

    System.out.println("O aluno" + nome + "teve a media" + media);
}