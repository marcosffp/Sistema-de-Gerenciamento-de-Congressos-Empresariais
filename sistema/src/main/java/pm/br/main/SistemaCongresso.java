package pm.br.main;

import javax.swing.JOptionPane;

import pm.br.business.Congresso;
import pm.br.business.Fornecedor;
import pm.br.business.ItemAudiovisual;
import pm.br.business.ItemCatering;
import pm.br.business.PacoteServico;
import pm.br.business.Profissional;
import pm.br.business.Atividade;

import java.util.ArrayList;
import java.util.List;

public class SistemaCongresso {

    private static List<Congresso> congressos = new ArrayList<>();
    private static List<Fornecedor> fornecedores = new ArrayList<>();
    private static List<Profissional> profissionais = new ArrayList<>();
    private static List<PacoteServico> pacotesServicos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = mostrarMenu();
            switch (opcao) {
                case 1 -> cadastrarCongresso();
                // case 2 -> cadastrarAtividade();
                // case 3 -> cadastrarProfissional();
                // case 4 -> cadastrarFornecedor();
                // case 5 -> cadastrarPacoteServico();
                // case 6 -> calcularCustoTotalPacote();
                // case 7 -> listarAtividades();
                case 0 -> JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static int mostrarMenu() {
        String menu = """
                Escolha uma opção:
                1 - Cadastrar Congresso
                2 - Cadastrar Atividade
                3 - Cadastrar Profissional
                4 - Cadastrar Fornecedor
                5 - Cadastrar Pacote de Serviço
                6 - Calcular Custo Total do Pacote de Serviço
                7 - Listar Atividades
                0 - Sair
                """;
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    private static void cadastrarCongresso() {
        String setor = JOptionPane.showInputDialog("Informe o setor do congresso:");
        float valorContratado = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor contratado:"));
        String especificacoes = JOptionPane.showInputDialog("Informe as especificações:");

        Congresso congresso = new Congresso(setor, valorContratado, especificacoes);
        congressos.add(congresso);
        JOptionPane.showMessageDialog(null, "Congresso cadastrado com sucesso!");
    }

}
