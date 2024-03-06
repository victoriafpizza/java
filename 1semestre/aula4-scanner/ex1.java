package main;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
    int op=0;
        do{
        //-> inicio código    
        System.out.println("**** Exercicios *****");    
        System.out.println("1 - Calculo do IMC"); 
        System.out.println("2 - Ordenação"); 
        System.out.println("3 - Categoria");
        System.out.println("4 - Fechar"); 
        op = grava.nextInt();

        switch(op){
            case 1 :
            //->inicio
                double peso, altura,imc=0;
                System.out.println("Digite o seu peso");
                peso = grava.nextDouble();
                System.out.println("Digite a sua altura");
                altura = grava.nextDouble();
                imc = peso / (altura*altura);
                if(imc <= 18){
                }
                //-> termino

                break;
            case 2 :
                int a , b , c,temp, cont=0;
                System.out.println("digite o primeiro valor");
                a = grava.nextInt();
                System.out.println("digite o segundo valor");
                b = grava.nextInt();
                System.out.println("digite o terceiro valor");
                c = grava.nextInt();
                while(cont < 5){
                    if(a > b){
                        temp=a;
                        a = b;
                        b = temp;
                    }else if(b > c){
                        temp=b;
                        b = c;
                        c = temp;
                    }
                    System.out.println(a + " - " + b + " - " + c);
                }
                break;

            case 3:
                int idade =0;
                System.out.println("Digite a sua idade");
                idade = grava.nextInt();
                if(idade <= 0){
                    System.out.println("Idade Inválida");
               }else if(idade <=10){
                }
                break;

            case 4 :
                System.out.println("Encerrando o sistema");
                break;
            default :
                System.out.println("Opção Inválida");
                break;
        }    


        //-> termino codigo    
        }while(op != 4);

    }

}
