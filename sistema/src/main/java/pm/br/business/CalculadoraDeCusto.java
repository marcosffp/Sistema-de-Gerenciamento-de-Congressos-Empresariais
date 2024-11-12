package pm.br.business;

import java.util.List;

public interface CalculadoraDeCusto {
    public abstract float calcularCusto (List<ItemServico> itemServicos);
}
