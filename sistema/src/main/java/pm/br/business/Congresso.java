package pm.br.business;

import java.util.ArrayList;
import java.util.List;

public class Congresso {
  private String setor;
  private float valorContratado;
  private String especificacoes;
  private List<Atividade> atividades;
  private List<PessoaJuridica> fornecedores;

  public Congresso(String setor, float valorContratado, String especificacoes) {
    this.setSetor(setor);
    this.setValorContratado(valorContratado);
    this.setEspecificacoes(especificacoes);
    this.atividades = new ArrayList<>();
    this.fornecedores = new ArrayList<>();
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

  public List<PessoaJuridica> getFornecedores() {
    return fornecedores;
  }

  public void adicionarFornecedor(Fornecedor fornecedor) {
    fornecedores.add(fornecedor);
  }

  public void removerFornecedor(Fornecedor fornecedor) {
    fornecedores.remove(fornecedor);
  }

  public void removerFornecedorPorNome(String nome) {
    for (PessoaJuridica f : fornecedores) {
      if (f.getNome().equalsIgnoreCase(nome)) {
        fornecedores.remove(f);
        break;
      }
    }
  }

  public List<PessoaJuridica> filtrarFornecedoresPorTipoDeServiço(String tipo) {
    return fornecedores.stream().filter(f -> f.getTipoServico().equalsIgnoreCase(tipo)).toList();
  }

  public void removerAtividade(Atividade atividade) {
    atividades.remove(atividade);
  }

  public void removerAtividadePorTipo(String tipo) {
    for (Atividade a : atividades) {
      if (a.getTipo().equalsIgnoreCase(tipo)) {
        atividades.remove(a);
        break;
      }
    }
  }

  public void adicionarAtividade(Atividade atividade) {
    atividades.add(atividade);
  }

  public List<Atividade> filtrarAtividadesPorData(String data) {
    return atividades.stream().filter(a -> a.getData().equalsIgnoreCase(data)).toList();
  }

  public List<Atividade> listarAtividades() {
    return atividades;
  }
}
