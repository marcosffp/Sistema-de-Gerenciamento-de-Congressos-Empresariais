package pm.br.business;

import java.util.List;

public class ImplCalculadoraDeCusto implements CalculadoraDeCusto {

    @Override
    public float calcularCusto(List<ItemServico> itemServicos) {
        float total = 0;
        for (ItemServico item : itemServicos) {
            total += item.calcularCustoTotal();
        }
        return total;
    }

}
