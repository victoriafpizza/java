A instrução switch do Java

Quando precisamos escolher entre múltiplos caminhos alternativos e esta escolha pode ser baseada em um valor inteiro, a instrução switch é uma boa opção. Veja seu uso: 

        public class Estudos{
        public static void main(String[] args){
            int valor = 4;

            switch(valor){
            case 1:
                System.out.println("Valor é 1"); 
                break;
            case 2:
                System.out.println("Valor é 2"); 
                break;
            case 3:
                System.out.println("Valor é 3"); 
                break;
            default:
                System.out.println("Valor diferente de 1, 2 e 3"); 
                break;
            }   
        }
    }


A variável fornecida à instrução switch deve ser do tipo byte, short, char, ou int. Ela não pode ser long, float, double, boolean ou referência a objetos. Veja o que acontece quando tentamos usar uma variável do tipo long: 

Estudos.java:5: possible loss of precision
found   : long
required: int
    switch(valor){
           ^
1 error

