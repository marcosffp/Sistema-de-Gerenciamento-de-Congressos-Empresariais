package pm.br.business;

public class Profissional extends PessoaFisica {

  private String papel;
  private String alocacaoTempo;
  

  public Profissional(String nome, String cpf, String papel, String alocacaoTempo) {
    super(nome, cpf);
    this.papel = papel;
    this.alocacaoTempo = alocacaoTempo;
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("Papel: ").append(this.getPapel()).append("\n");
    sb.append("Alocacao de tempo: ").append(this.getAlocacaoTempo()).append("\n");
    return sb.toString();
  }
}
