package pm.br.business;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PacoteServico {
    private String nome;
    private String descricao;
    private List<ItemServico> itens;

    public PacoteServico(String nome, String descricao) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    // pra vocês escolherem]
    // ACHO QUE O DE CIMA É MAIS LEGÍVEL - vitor
    // adicionei mais um q acho q fica melhor com stream - vitor
    public List<ItemServico> ordenarItensPorCusto() {
        /*
         * Comparator<ItemServico> itensOrdenados = (o1, o2) ->
         * Float.compare(o1.getCusto(), o2.getCusto());
         * itens.sort(itensOrdenados);
         * return itens;
         */


        // return itens.stream().sorted(Comparator.comparing(ItemServico::getCusto)).toList();

        Comparator<ItemServico> itensOrdenados = Comparator.comparing(ItemServico::getCusto);
        itens.sort(itensOrdenados);
        return itens;

    }

    public List<ItemServico> filtrarItensPorTipo(String tipo) {
        return itens.stream().filter(i -> i.getTipo().equalsIgnoreCase(tipo)).toList();
    }

    public float calcularCustoTotal() {
        return (float) itens.stream().mapToDouble(ItemServico::calcularCustoTotal).sum();
    }

}
