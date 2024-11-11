package pm.br.business;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PacoteServico {
    private String nome;
    private String descricao;
    private List<ItemServico> itens = new ArrayList<>();

    public PacoteServico(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void adicionarItemServico(ItemServico item) {
        itens.add(item);
    }

    public List<ItemServico> listarItemServico() {
        return itens;
    }

    // Não lembro se o Hugo ensinou assim, mas vi um vídeo no youtube que ordena
    // desse jeito.
    // Tanto o de cima quanto o debaixo tem a mesma lógica, na dúvida deixei os dois
    // pra vocês escolherem
    public List<ItemServico> ordenarItensPorCusto() {
        /*
         * Comparator<ItemServico> itensOrdenados = (o1, o2) ->
         * Float.compare(o1.getCusto(), o2.getCusto());
         * itens.sort(itensOrdenados);
         * return itens;
         */

        Comparator<ItemServico> itensOrdenados = Comparator.comparing(ItemServico::getCusto);
        itens.sort(itensOrdenados);
        return itens;

    }

    public List<ItemServico> filtrarItensPorTipo(String tipo) {
        List<ItemServico> filtrados = new ArrayList<>();
        for (ItemServico i : itens) {
            if (i.getTipo().equalsIgnoreCase(tipo)) {
                filtrados.add(i);
            }
        }
        return filtrados;
    }

    public float calcularCustoTotal() {
        float custoTotal = 0;
        for (ItemServico item : itens) {
            custoTotal += item.calcularCustoTotal();
        }
        return custoTotal;
    }

}
