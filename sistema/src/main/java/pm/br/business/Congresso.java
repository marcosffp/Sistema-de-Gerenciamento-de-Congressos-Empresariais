package pm.br.business;

import java.util.ArrayList;
import java.util.List;

public class Congresso {
    private String setor;
    private float valorContratado;
    private String especificacoes;
    private List<Atividade> atividades = new ArrayList<>();
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public Congresso(String setor, float valorContratado, String especificacoes) {
        this.setor = setor;
        this.valorContratado = valorContratado;
        this.especificacoes = especificacoes;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getValorContratado() {
        return valorContratado;
    }

    public void setValorContratado(float valorContratado) {
        this.valorContratado = valorContratado;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }

    public void adicionarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void adicionarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public List<Atividade> filtrarAtividadesPorData(String data) {
        List<Atividade> filtradas = new ArrayList<>();
        for (Atividade a : atividades) {
            if (a.getData().equalsIgnoreCase(data)) {
                filtradas.add(a);
            }
        }

        return filtradas;
    }

    public List<Atividade> listarAtividades() {
        return atividades;
    }

}
