 As instruções if e if...else do Java

Instruções if e if...else permitem executar trechos de códigos baseado em condições. Veja um exemplo: 

    public class Estudos{
    public static void main(String args[]){
        int valor = 5;
        
        if(valor > 3)
        System.out.println("Valor maior que 3");
    }
    }

Neste programa, a instrução:


    System.out.println("Valor maior que 3");

será executada somente se o teste (valor > 3) for verdadeiro. Observe que a expressão de teste deverá sempre ser do tipo boolean (true ou false).

Neste exemplo temos apenas uma instrução a ser executada. Isso dispensa o uso das chaves ao redor do bloco de códigos. Se o bloco contiver mais de uma instrução, as chaves são necessárias. Veja:

    public class Estudos{
    public static void main(String args[]){
        int valor = 5;
        
        if(valor > 3){
        System.out.println("Valor maior que 3");
        System.out.println("O valor é: " + valor);
        }
    }
    } 

A instrução if...else (se...senão) é usada quando queremos fornecer um caminho alternativo ao código. Veja: 

        public class Estudos{
        public static void main(String args[]){
            int valor = 1;
            if(valor > 3)
            System.out.println("Valor maior que 3");
            else
            System.out.println("Valor menor que 3");
        
        }
        }


Você pode ainda usar [if...else if...else] (se...senão se...senão). Veja: 


        public class Estudos{
        public static void main(String args[]){
            int valor = 3;
            
            if(valor > 3)
            System.out.println("Valor maior que 3");
            else if(valor < 3)
            System.out.println("Valor menor que 3");
            else
            System.out.println("Valor é igual a 3");
        }
        } 

