*Utilizando o Scanner.*

Neste artigo abordaremos como utilizar a classe que permite uma interação com o usuário. O Scanner é bem poderoso, com ele dá pra capturar não so o que é digitado no teclado mas também até a posição do mouse, Veremos agora como utilizar a classe Scanner do pacote java.util.Scanner; .
Pra começo de tudo, antes de mais nada você deve importar a classe. Fazemos isso da seguinte maneira:

    *import  java.util.Scanner;*

Depois de importar a classe, no metodo principal(onde tem o main ) devemos instanciar o objeto, ou seja, temos q tipo ‘clonar’ o objeto Scanner pois não se pode manipular ele direto da JVM. Entao fazemos o seguinte:

    Scanner read = new Scanner(System.in);

Neste momento nós instanciamos(clonamos, criamos uma cópia do original) o objeto Scanner e onde Scanner é o nome do Objeto que você quer instanciar, read é um nome de variavel(eu coloquei read pq eu gosto, significa ler em ingles, voce pode colocar o que voce preferir ou o que fica mais facil de identificar) e = new Scanner(System.in) é o novo objeto que voce criou especificando um parametro de entrada de Sistema(System.in). Logo após termos criado o Scanner vamos entao usa-lo né. Para usa-lo fazemos o seguinte:

    int v;
    v = read.nextInt();

Devemos tomar alguns cuidados nessa parte. No exemplo acima eu declarei a variavel v to tipo int(inteiro). Para cada tipo temos um .next , seguei abaixo uma lista dos “.next’s” :

    int -> .nextInt();
    float -> .nextFloat();
    double -> nextDouble();
    char -> nextChar();
    String -> nextLine();

*String não é nextString() e sim nextLine().

Um exemplo pra deixar bem claro:

    public class UsandoScanner {
     public static void main(String[] args) {
        Scanner read = new  Scanner(System.in);
        String nome;
        int idade;
        System.out.print(“Escreva seu nome: “);
        nome = read.nextLine();
        System.out.print(“Escreva sua idade: “);
        idade = read.nextInt();
        System.out.print(nome +” voce tem “+ idade +” anos”);
        }
    }

Salve com o nome da classe(UsandoScanner.java) com a extensão .java e compile . Nunca esqueçam dessa regrinha, todo programa(chamado de classe em java) deve ser salvo com o nome da classe e da extensão do java(.java). Ou seja, NomeDaClasse.java.

Ai depois disso(e das variáveis de ambiente devidamente configuradas) voce abre o prompt, vai na pasta que está o NomeDaClasse.java e da o comando javac NomeDaClasse.java
Feito isso voce terá compilado e gerado o bytecode, para executar o programa de o comando java NomeDaClasse

*Para executar o programa nao precisa escrever a extensão
