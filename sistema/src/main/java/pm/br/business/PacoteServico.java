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

 
    public List<ItemServico> ordenarItensPorCusto() {

        return itens.stream().sorted(Comparator.comparing(ItemServico::getCusto)).toList();

    }

    public List<ItemServico> filtrarItensPorTipo(String tipo) {
        return itens.stream().filter(i -> i.getTipo().equalsIgnoreCase(tipo)).toList();
    }

    public float calcularCustoTotal() {
        return (float) itens.stream().mapToDouble(ItemServico::calcularCustoTotal).sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.getNome()).append("\n");
        sb.append("Descricao: ").append(this.getDescricao()).append("\n");
        sb.append("Itens: ").append("\n");
        for (ItemServico item : itens) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
