package pm.br.business;

public class ItemCatering extends ItemServico {
  private double precoPorPessoa;

  @Override
  public double calcularCustoTotal() {
    return precoPorPessoa * getQuantidade();
  }

  public ItemCatering(String tipo, int quantidade, String descricao, double precoPorPessoa) {
    super(tipo, quantidade, descricao);
    this.precoPorPessoa = precoPorPessoa;
  }

  @Override
  public double getCusto() {
    return precoPorPessoa;
  }

  @Override
  public String toString() {
    return "ItemCatering{" +
        "tipo='" + getTipo() + '\'' +
        ", quantidade=" + getQuantidade() +
        ", descricao='" + getDescricao() + '\'' +
        ", precoPorPessoa=" + precoPorPessoa +
        '}';
  }

  public double getPrecoPorPessoa() {
    return precoPorPessoa;
  }

  public void setPrecoPorPessoa(double precoPorPessoa) {
    this.precoPorPessoa = precoPorPessoa;
  }
}
