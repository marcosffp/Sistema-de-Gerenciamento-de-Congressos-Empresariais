package pm.br.business;

public class Fornecedor extends Pessoa {

  private String tipoServico;
  private String cnpj;

  public Fornecedor(String nome, String tipoServico, String cnpj) {
    super(nome);
    this.setTipoServico(tipoServico);
    this.setCnpj(cnpj);
  }

  public String getTipoServico() {
    return tipoServico;
  }

  public void setTipoServico(String tipoServico) {
    this.tipoServico = tipoServico;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("Tipo de Servico: ").append(this.getTipoServico()).append("\n");
    return sb.toString();
  }
}
