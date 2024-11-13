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

  public List<Atividade> getAtividades() {
    return atividades;
  }

  public void adicionarFornecedor(PessoaJuridica fornecedor) {
    fornecedores.add(fornecedor);
  }

  public void removerFornecedor(PessoaJuridica fornecedor) {
    fornecedores.remove(fornecedor);
  }

  public void removerFornecedorPorNome(String nome) {
    fornecedores.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
  }

  public List<PessoaJuridica> filtrarFornecedoresPorTipoDeServiço(String tipo) {
    return fornecedores.stream().filter(f -> f.getTipoServico().equalsIgnoreCase(tipo)).toList();
  }

  public List<PessoaJuridica> listarFornecedores() {
    return fornecedores;
  }

  public void removerAtividade(Atividade atividade) {
    atividades.remove(atividade);
  }

  public void removerAtividadePorTipo(String tipo) {
    atividades.removeIf(a -> a.getTipo().equalsIgnoreCase(tipo));
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
