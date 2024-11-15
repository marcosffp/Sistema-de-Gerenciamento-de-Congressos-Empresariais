package pm.br.business;

import java.util.Map;

public interface ItemServicoFactory {
  ItemServico criarItem(String tipo, Map<String, Object> dados);
}
