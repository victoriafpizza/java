WHILE

While é uma estrutura de repetição. While executa uma comparação com a variável. Se a comparação
 for verdadeira, ele executa o bloco de instruções ( { } ) ou apenas a próxima linha de código 
 logo abaixo. Procedemos da seguinte maneira:

WHILE (comparação)

O problema com estruturas de repetição, principalmente com while, é o que chamamos de looping 
infinito. Damos esse nome ao fato de que o programa fica repetindo a mesma sequência de códigos 
esperando por um resultado que nunca irá acontecer. Portanto, é imprescindível que uma 
determinada variável seja modificada de acordo com cada loop. Veja o exemplo

public class ExemploWhile {
    public static void main(String args[]) {
        int contador = 0;
        while (contador < 50) {
            System.out.println("Repetição nr: " + contador);
            contador++;
        }
    }
} 

Como podemos ver, existe a variável contador que é iniciada valendo 0, a cada loop executado 
(repetição) é somado 1 ao contador. Perceba que o while irá manter a repetição enquanto a
variável contador for menor que 50. Outro ponto importante é que a variável contador é
inicializada antes de chegar ao while, porque o while irá comparar a sentença e só depois permitirá a execução do bloco. Se quisermos fazer todo o bloco primeiro e só depois fazer a comparação, devemos utilizar o comando DO WHILE

DO WHILE

DO WHILE é uma estrutura de repetição, tal como o próprio while. A principal diferença entre os dois é que DO WHILE irá fazer a comparação apenas no final do bloco de código, sendo representado da seguinte forma:

        DO { código } WHILE (comparação);

Neste caso, devemos ter as mesmas precauções quanto while, no que diz respeito a looping 
infinito. Mas não é necessário inicializar a variável antes do bloco de código como acontece com
while, pois a comparação só será feita após todo o código ter sido executado

        import javax.swing.JOptionPane;

        public class Estudos{
        public static void main(String[] args) {
            int valor =1;
            int soma = 0;

            // Lê continuamente até o usuário informar 0
            do{
            // efetua a próxima leitura
            String str = JOptionPane.showInputDialog(null, 
                "Informe um valor inteiro:\n(ou 0 para sair)",
                "Estudos", JOptionPane.QUESTION_MESSAGE);

            valor = Integer.parseInt(str);

            soma += valor;
            }while(valor != 0);

            JOptionPane.showMessageDialog(null, "A soma é: " + soma,
            "Estudos", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
Use o laço do-while quando você tiver instruções dentro do laço que precisem ser executadas no mínimo uma vez.
