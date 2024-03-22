import javax.swing.JOptionPane;

public class Filme {
    private int codigo;
    private String nome;
    private String genero;
    private int duracao;

    // Métodos construtores, getters e setters podem ser adicionados aqui
}

class CategoriaFilme {
    private int codigo;
    private double valorLocacao;
}

class Fita {
    private int codigo;
    private String dataCompra;
}

public class Main {
    public static void main(String[] args) {
        cadastrarFilmes();
    }

    public static void cadastrarFilmes() {
        boolean continuarCadastro = true;

        while (continuarCadastro) {
            cadastrarFilme();

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro filme?", "Continuar Cadastro", JOptionPane.YES_NO_OPTION);

            if (opcao != JOptionPane.YES_OPTION) {
                continuarCadastro = false;
            }
        }
    }

    public static void cadastrarFilme() {
        String codigo = JOptionPane.showInputDialog("Digite o código do filme:");
        String nome = JOptionPane.showInputDialog("Digite o nome do filme:");
        String genero = JOptionPane.showInputDialog("Digite o gênero do filme:");
        String duracao = JOptionPane.showInputDialog("Digite a duração do filme:");

        Filme filme = new Filme();
        filme.setCodigo(Integer.parseInt(codigo));
        filme.setNome(nome);
        filme.setGenero(genero);
        filme.setDuracao(Integer.parseInt(duracao));

        JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso:\n" + filme.toString());
    }
}