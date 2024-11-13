package pm.br.business;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Atividade {
  private String tipo;
  private String data;
  private String local;
  private int qtdParticipantes;
  private List<PessoaFisica> profissionais;

  public Atividade(String tipo, String data, String local, int qtdParticipantes) {
    this.setTipo(tipo);
    this.setData(data);
    this.setLocal(local);
    this.setQtdParticipantes(qtdParticipantes);
    this.profissionais = new ArrayList<>();
  }

  public String getTipo() {
    return tipo;
  }

  public String getData() {
    return data;
  }

  public String getLocal() {
    return local;
  }

  public int getQtdParticipantes() {
    return qtdParticipantes;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setData(String data) {
    this.data = data;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public void setQtdParticipantes(int qtdParticipantes) {
    this.qtdParticipantes = qtdParticipantes;
  }

  public void adicionarProfissional(PessoaFisica profissional) {
    profissionais.add(profissional);
  }

  public List<PessoaFisica> filtrarProfissionaisPorPapel(String papel) {
    return profissionais.stream()
        .filter(profissional -> profissional.getPapel().equals(papel))
        .toList();
  }

  public List<PessoaFisica> listaProfissionals() {
    return profissionais;
  }

  // Não lembro se o Hugo ensinou assim, mas vi um vídeo no youtube que ordena
  // desse jeito.
  // adicionei o de baixo
  public List<PessoaFisica> ordenarProfissionaisPorAlocacaoTempo() {

    /*
    Comparator<Profissional> profissionalOrdenado =
        Comparator.comparing(Profissional::getAlocacaoTempo);
    profissionais.sort(profissionalOrdenado);
    return profissionais;
    */

    return profissionais.stream()
        .sorted(Comparator.comparing(PessoaFisica::getAlocacaoTempo))
        .toList();
  }

  public List<PessoaFisica> ordenarProfissionaisPorPapel() {
    /*
    Comparator<Profissional> profissionalOrdenado = Comparator.comparing(Profissional::getPapel);
    profissionais.sort(profissionalOrdenado);
    return profissionais;
    */

    return profissionais.stream().sorted(Comparator.comparing(PessoaFisica::getPapel)).toList();
  }

  @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo: ").append(this.getTipo()).append("\n");
        sb.append("Data: ").append(this.getData()).append("\n");
        sb.append("Local: ").append(this.getLocal()).append("\n");
        sb.append("Quantidade de participantes: ").append(this.getQtdParticipantes()).append("\n");
        return sb.toString();
    }

}
