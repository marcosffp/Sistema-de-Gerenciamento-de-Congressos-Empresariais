package pm.br.main;

import javax.swing.JOptionPane;

import pm.br.business.Atividade;
import pm.br.business.Congresso;
import pm.br.business.Fornecedor;
import pm.br.business.ItemAudiovisual;
import pm.br.business.ItemCatering;
import pm.br.business.PacoteServico;
import pm.br.business.PessoaFisica;
import pm.br.business.Profissional;

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
                case 1: cadastrarCongresso();
                    break;
                case 2: cadastrarAtividade();
                    break;
                case 3: cadastrarProfissional();
                    break;
                case 4: cadastrarFornecedor();
                    break;
                case 5: cadastrarPacoteServico();
                    break;
                // case 6 -> calcularCustoTotalPacote();
                // case 7 -> listarAtividades();
                // case 0 -> JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                // default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
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
        String setor = "";
        while (setor.isBlank() || setor == null) {
            setor = JOptionPane.showInputDialog("Informe o setor do congresso:");
        }

        Float valorContratado = null;
        while (valorContratado <= 0 || Float.isNaN(valorContratado) || valorContratado == null) {
            valorContratado = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor contratado:"));
        }

        String especificacoes = "";
        while (especificacoes.isBlank() || especificacoes == null) {
            especificacoes = JOptionPane.showInputDialog("Informe as especificações:");
        }
      
        Congresso congresso = new Congresso(setor, valorContratado, especificacoes);
        congressos.add(congresso);
        JOptionPane.showMessageDialog(null, "Congresso cadastrado com sucesso!");
    }
    
    private static void cadastrarAtividade() {
        String tipo = "";
        while (tipo.isBlank() || tipo == null) {
            tipo = JOptionPane.showInputDialog("Informe o tipo da atividade:");
        }

        String data = "";
        while (data.isBlank() || data == null) {
            data = JOptionPane.showInputDialog("Informe a data da atividade:");
        }

        String local = "";
        while (local.isBlank() || local == null) {
            local = JOptionPane.showInputDialog("Informe o local da atividade:");
        }

        Integer qtdParticipantes = null;
        while (qtdParticipantes <= 0 || qtdParticipantes == null) {
            qtdParticipantes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de participantes:"));
        }

        Atividade atividade = new Atividade(tipo, data, local, qtdParticipantes);

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    Escolha uma opção:
                    1 - Adicionar profissional
                    2 - Listar profissionais
                    0 - Sair
                    """));
            switch (opcao) {
                case 1: adicionarProfissional(atividade);
                    break;
                case 2: listarProfissionais(atividade);
                    break;
                case 0: JOptionPane.showMessageDialog(null, "Saindo do cadastro de atividade...");
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void adicionarProfissional(Atividade atividade) {
        Profissional profissional = cadastrarProfissional();

        atividade.adicionarProfissional(profissional);
        JOptionPane.showMessageDialog(null, "Profissional adicionado com sucesso!");
    }

    private static void listarProfissionais(Atividade atividade) {
        String papel = "";
        while (papel.isBlank() || papel == null) {
            papel = JOptionPane.showInputDialog("Informe o papel do profissional:");
        }

        List<PessoaFisica> profissionaisFiltrados = atividade.filtrarProfissionaisPorPapel(papel);
        if (profissionaisFiltrados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum profissional encontrado com o papel informado!");
        } else {
            String listaProfissionais = "Profissionais com o papel " + papel + ":\n";
            for (PessoaFisica profissional : profissionaisFiltrados) {
                listaProfissionais += profissional.getNome() + "\n";
            }
            JOptionPane.showMessageDialog(null, listaProfissionais);
        }
    }

    private static Profissional cadastrarProfissional() {
        String nome = "";
        while (nome.isBlank() || nome == null) {
            nome = JOptionPane.showInputDialog("Informe o nome do profissional:");
        }

        String papel = "";
        while (papel.isBlank() || papel == null) {
            papel = JOptionPane.showInputDialog("Informe o papel do profissional:");
        }

        String alocacaoTempo = "";
        while (alocacaoTempo.isBlank() || alocacaoTempo == null) {
            alocacaoTempo = JOptionPane.showInputDialog("Informe a alocação de tempo do profissional:");
        }

        String cpf = "";
        while (cpf.isBlank() || cpf == null) {
            cpf = JOptionPane.showInputDialog("Informe o CPF do profissional:");
        }

        Profissional profissional = new Profissional(nome, papel, alocacaoTempo, cpf);
        profissionais.add(profissional);
        JOptionPane.showMessageDialog(null, "Profissional cadastrado com sucesso!");
        return profissional;
    }

    private static void cadastrarFornecedor() {
        String nome = "";
        while (nome.isBlank() || nome == null) {
            nome = JOptionPane.showInputDialog("Informe o nome do fornecedor:");
        }

        String tipoServico = "";
        while (tipoServico.isBlank() || tipoServico == null) {
            tipoServico = JOptionPane.showInputDialog("Informe o tipo de serviço do fornecedor:");
        }

        String cnpj = "";
        while (cnpj.isBlank() || cnpj == null) {
            cnpj = JOptionPane.showInputDialog("Informe o CNPJ do fornecedor:");
        }

        String endereco = "";
        while (endereco.isBlank() || endereco == null) {
            endereco = JOptionPane.showInputDialog("Informe o endereço do fornecedor:");
        }

        Fornecedor fornecedor = new Fornecedor(nome,tipoServico ,cnpj, endereco);
        fornecedores.add(fornecedor);
        JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!");
    }
    
    private static void cadastrarPacoteServico() {
        
        String nome = "";
        while (nome.isBlank() || nome == null) {
            nome = JOptionPane.showInputDialog("Informe o nome do pacote de serviço:");
        }
        
        String descricao = "";
        while (descricao.isBlank() || descricao == null) {
            descricao = JOptionPane.showInputDialog("Informe a descrição do pacote de serviço:");
        }
        
        PacoteServico pacoteServico = new PacoteServico(nome , descricao);
        pacotesServicos.add(pacoteServico);

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    Escolha uma opção:
                    1 - Adicionar item de serviço
                    2 - Listar itens de serviço
                    0 - Sair
                    """));
            switch (opcao) {
                case 1: adicionarItemServico(pacoteServico);
                    break;
                case 2: listarItensServico(pacoteServico);
                    break;
                case 0: JOptionPane.showMessageDialog(null, "Saindo do cadastro de pacote de serviço...");
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 0);

        JOptionPane.showMessageDialog(null, "Pacote de serviço cadastrado com sucesso!");
    }

    private static void adicionarItemServico(PacoteServico pacoteServico) {
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                Escolha uma opção:
                1 - Adicionar item de catering
                2 - Adicionar item de Audiovisual
                0 - Sair
                """));
        
        String nome = "";
        while (nome.isBlank() || nome == null) {
            nome = JOptionPane.showInputDialog("Informe o nome do item de serviço:");
        }

       int quantidade = 0;
        while (quantidade <= 0) {
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do item de serviço:"));
        }

        String descricao = "";
        while (descricao.isBlank() || descricao == null) {
            descricao = JOptionPane.showInputDialog("Informe a descrição do item de serviço:");
        }

        if (opcao == 1 ) {
            String tipoAlimento = "";
            while (tipoAlimento.isBlank() || tipoAlimento == null) {
                tipoAlimento = JOptionPane.showInputDialog("Informe o tipo de alimento:");
            }

            Double precoPorPessoa = 0.0;
            while (precoPorPessoa <= 0 || precoPorPessoa == null) {
                precoPorPessoa = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço por pessoa:"));
            }
            
            pacoteServico.adicionarItemServico(new ItemCatering(nome, quantidade, descricao, tipoAlimento, precoPorPessoa));
        } 
        if (opcao == 2) {
            String equipamento = "";
            while (equipamento.isBlank() || equipamento == null) {
                equipamento = JOptionPane.showInputDialog("Informe o equipamento:");
            }

            Double precoUnitario = 0.0;
            while (precoUnitario <= 0 || precoUnitario == null) {
                precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço unitário:"));
            }
            
            pacoteServico.adicionarItemServico(new ItemAudiovisual(nome, quantidade, descricao, equipamento, precoUnitario));
        }
        if (opcao == 0) {
            JOptionPane.showMessageDialog(null, "Saindo do cadastro de item de serviço...");
        }
        else {
            JOptionPane.showMessageDialog(null, "Opção inválida!");
        }

       
        JOptionPane.showMessageDialog(null, "Item de serviço adicionado com sucesso!");
    }

    private static void listarItensServico(PacoteServico pacoteServico) {
        pacoteServico.toString();
    }
}
