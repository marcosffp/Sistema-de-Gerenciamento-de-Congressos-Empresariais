package pm.br.business;

public class Fornecedor extends PessoaJuridica {

  private String tipoServico;
  private String endereco;

  public Fornecedor(String nome, String cnpj, String tipoServico, String endereco) {
    super(nome, cnpj);
    this.tipoServico = tipoServico;
    this.endereco = endereco;
  }

  @Override
  public String getTipoServico() {
    return tipoServico;
  }

  public void setTipoServico(String tipoServico) {
    this.tipoServico = tipoServico;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("Tipo de Servico: ").append(this.getTipoServico()).append("\n");
    sb.append("Endereço: ").append(this.getEndereco()).append("\n");
    return sb.toString();
  }
}
