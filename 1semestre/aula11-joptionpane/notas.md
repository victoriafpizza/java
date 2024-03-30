O JOptionPane em Java é uma classe que faz parte da biblioteca Swing e é usada para exibir caixas de diálogo simples em 
aplicações desktop Java. Ele fornece uma maneira fácil de exibir mensagens, solicitar entrada do usuário e exibir opções de 
escolha.

Com o JOptionPane, você pode exibir:

1. **Mensagens informativas:** como mensagens de aviso, informações ou erros.
2. **Solicitações de entrada:** para coletar entrada do usuário, como textos ou números.
3. **Opções de escolha:** como sim/não ou botões de confirmação.

É útil para criar interfaces de usuário simples e interativas em aplicativos desktop Java. Por exemplo, se você quiser 
exibir uma mensagem de boas-vindas quando o aplicativo for iniciado ou solicitar ao usuário que insira seu nome antes de 
prosseguir, você pode usar o JOptionPane para isso.

Exemplo:

import javax.swing.JOptionPane;

public class ExemploJOptionPane {
    public static void main(String[] args) {
        // Exibir uma mensagem de boas-vindas
        JOptionPane.showMessageDialog(null, "Bem-vindo ao meu programa!");
    }
}
