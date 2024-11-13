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

  public void adicionarAtividade(Atividade atividade) {
    atividades.add(atividade);
  }

  public List<Atividade> filtrarAtividadesPorData(String data) {
    return atividades.stream().filter(a -> a.getData().equalsIgnoreCase(data)).toList();
  }

  public List<Atividade> listarAtividades() {
    return atividades;
  }

  public List<Atividade> filtrarAtividadesPorLocal(String local) {
    return atividades.stream().filter(a -> a.getLocal().equalsIgnoreCase(local)).toList();
  }

  public List<Atividade> filtrarAtividadesPorDescricao(String descricao) {
    return atividades.stream().filter(a -> a.getDescricao().equalsIgnoreCase(descricao)).toList();
  }

  public List<Atividade> filtrarAtividadesPorQtdParticipantes(int qtdParticipantes) {
    return atividades.stream().filter(a -> a.getQtdParticipantes() == qtdParticipantes).toList();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Setor: ").append(this.getSetor()).append("\n");
    sb.append("Valor contratado: ").append(this.getValorContratado()).append("\n");
    sb.append("Especificacoes: ").append(this.getEspecificacoes()).append("\n");
    sb.append("Fornecedores: ").append("\n");
    fornecedores.forEach(f -> sb.append(f.getNome()).append("\n"));
    sb.append("Atividades: ").append("\n");
    atividades.forEach(a -> sb.append(a.getDescricao()).append("\n"));
    return sb.toString();
  }





}
