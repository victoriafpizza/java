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

    //Lista das coisas que eu não sei usar (e não sei para que elas servem)
    // - JOptionPane
    // - showMessageDialog
    // null

    // Não esquece de adcionar as listas de exercicios 