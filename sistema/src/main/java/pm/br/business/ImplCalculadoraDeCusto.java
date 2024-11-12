package pm.br.business;

import java.util.List;

public class ImplCalculadoraDeCusto implements CalculadoraDeCusto {

    @Override
    public float calcularCusto(List<ItemServico> itemServicos) {
       return (float) itemServicos.stream()
       .mapToDouble(ItemServico::calcularCustoTotal)
       .reduce(0, (a, b) -> a + b);
    }
}
