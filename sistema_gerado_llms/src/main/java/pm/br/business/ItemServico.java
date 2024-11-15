package pm.br.business;

public abstract class ItemServico {
  private String tipo;
  private int quantidade;
  private String descricao;

  public abstract double calcularCustoTotal();

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public ItemServico(String tipo, int quantidade, String descricao) {
    this.tipo = tipo;
    this.quantidade = quantidade;
    this.descricao = descricao;
  }

  public abstract double getCusto();

  public String getTipo() {
    return tipo;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public String getDescricao() {
    return descricao;
  }

  @Override
  public String toString() {
    return "ItemServico{" +
        "tipo='" + tipo + '\'' +
        ", quantidade=" + quantidade +
        ", descricao='" + descricao + '\'' +
        '}';
  }
}
