package pm.br.business;

public class Profissional extends Pessoa {

  private String papel;
  private String alocacaoTempo;
  private String cpf;

  public Profissional(String nome, String papel, String alocacaoTempo, String cpf) {
    super(nome);
    this.setPapel(papel);
    this.setAlocacaoTempo(alocacaoTempo);
  }

  public String getPapel() {
    return papel;
  }

  public String getAlocacaoTempo() {
    return alocacaoTempo;
  }

  public void setPapel(String papel) {
    this.papel = papel;
  }

  public void setAlocacaoTempo(String alocacaoTempo) {
    this.alocacaoTempo = alocacaoTempo;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("CPF: ").append(this.getCpf()).append("\n");
    sb.append("Papel: ").append(this.getPapel()).append("\n");
    sb.append("Alocacao de tempo: ").append(this.getAlocacaoTempo()).append("\n");
    return sb.toString();
  }
}
