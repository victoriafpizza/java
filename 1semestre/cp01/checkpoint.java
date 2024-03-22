import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        cadastrarFilmes();
    }

    public static void cadastrarFilmes() {
        boolean continuarCadastro = true;

        while (continuarCadastro) {
            String codigo = JOptionPane.showInputDialog("Digite o código do filme:");
            String nome = JOptionPane.showInputDialog("Digite o nome do filme:");
            String genero = JOptionPane.showInputDialog("Digite o gênero do filme:");
            String duracao = JOptionPane.showInputDialog("Digite a duração do filme");

            String filmeInfo = "Código: " + codigo + "\nNome: " + nome + "\nGênero: " + genero + "\nDuração: " + duracao;

            JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso:\n" + filmeInfo);

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro filme?", "Continuar Cadastro", JOptionPane.YES_NO_OPTION);

            if (opcao != JOptionPane.YES_OPTION) {
                continuarCadastro = false;
            }
        }
    }
}