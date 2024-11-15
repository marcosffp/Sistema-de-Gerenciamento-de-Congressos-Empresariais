package pm.br.business;

import java.util.ArrayList;
import java.util.List;

public class PacoteServico {
  private List<ItemServico> itensServico;
  private ItemServicoFactory factory;

  public PacoteServico() {
    itensServico = new ArrayList<>();
  }

  public List<ItemServico> getItensServico() {
    return itensServico;
  }

  public void setItensServico(List<ItemServico> itensServico) {
    this.itensServico = itensServico;
  }

  public ItemServicoFactory getFactory() {
    return factory;
  }

  public void setFactory(ItemServicoFactory factory) {
    this.factory = factory;
  }

  public double calcularCustoTotal() {
    double custoTotal = 0;
    for (ItemServico item : itensServico) {
      custoTotal += item.calcularCustoTotal();
    }
    return custoTotal;
  }
}
