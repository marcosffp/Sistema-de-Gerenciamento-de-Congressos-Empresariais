package pm.br.business;

public class ItemAudiovisual extends ItemServico {
  private double precoUnitario;

  @Override
  public double calcularCustoTotal() {
    return precoUnitario * getQuantidade();
  }

  public ItemAudiovisual(String tipo, int quantidade, String descricao, double precoUnitario) {
    super(tipo, quantidade, descricao);
    this.precoUnitario = precoUnitario;
  }

  @Override
  public double getCusto() {
    return precoUnitario;
  }

  @Override
  public String toString() {
    return "ItemAudiovisual{" +
        "tipo='" + getTipo() + '\'' +
        ", quantidade=" + getQuantidade() +
        ", descricao='" + getDescricao() + '\'' +
        ", precoUnitario=" + precoUnitario +
        '}';
  }

  public double getPrecoUnitario() {
    return precoUnitario;
  }

  public void setPrecoUnitario(double precoUnitario) {
    this.precoUnitario = precoUnitario;
  }
}