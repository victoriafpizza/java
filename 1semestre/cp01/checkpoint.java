import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        cadastrarFilmes();
    }

    public static void cadastrarFilmes() {
        boolean continuarCadastro = true;

        while (continuarCadastro) {
            String codigoFilme = JOptionPane.showInputDialog("Digite o código do filme:");
            String nomeFilme = JOptionPane.showInputDialog("Digite o nome do filme:");
            String generoFilme = JOptionPane.showInputDialog("Digite o gênero do filme:");
            String duracaoFilme = JOptionPane.showInputDialog("Digite a duração do filme:");

            String codigoCategoria = JOptionPane.showInputDialog("Digite o código da categoria:");
            String valorLocacao = JOptionPane.showInputDialog("Digite o valor de locação:");

            String codigoFita = JOptionPane.showInputDialog("Digite o código da fita:");
            String dataCompra = JOptionPane.showInputDialog("Digite a data da compra da fita:");

            String filmeInfo = "Filme cadastrado com sucesso:\n" +
                    "Código: " + codigoFilme + "\nNome: " + nomeFilme + "\nGênero: " + generoFilme + "\nDuração: " + duracaoFilme + "\n" +
                    "Categoria: " + codigoCategoria + "\nValor de Locação: " + valorLocacao + "\n" +
                    "Fita: " + codigoFita + "\nData da Compra: " + dataCompra;

            JOptionPane.showMessageDialog(null, filmeInfo);

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja alugar ou reservar este filme?", "Locação/Reserva", JOptionPane.YES_NO_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {
                String tipoOperacao = JOptionPane.showInputDialog("Digite 'alugar' para alugar a fita ou 'reservar' para reservar o filme:");
                if (tipoOperacao.equalsIgnoreCase("alugar")) {
                    // Lógica para alugar a fita
                    JOptionPane.showMessageDialog(null, "Fita alugada com sucesso!");
                } else if (tipoOperacao.equalsIgnoreCase("reservar")) {
                    // Lógica para reservar o filme
                    JOptionPane.showMessageDialog(null, "Filme reservado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Operação inválida.");
                }
            }

            opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro filme?", "Continuar Cadastro", JOptionPane.YES_NO_OPTION);

            if (opcao != JOptionPane.YES_OPTION) {
                continuarCadastro = false;
            }
        }
    }
}