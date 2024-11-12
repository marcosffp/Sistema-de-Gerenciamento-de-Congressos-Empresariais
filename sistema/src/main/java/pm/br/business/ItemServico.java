package pm.br.business;

public abstract class ItemServico {
    private String tipo;
    private Double custo;
    private int quantidade;
    private String descricao;

    public ItemServico(String tipo, Double custo, int quantidade, String descricao) {
        this.setTipo(tipo);
        this.setCusto(custo);
        this.setQuantidade(quantidade);
        this.setDescricao(descricao);
    }

    public abstract Double calcularCustoTotal();

    public String getTipo() {
        return tipo;
    }

    public Double getCusto() {
        return custo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo: ").append(this.getTipo()).append("\n");
        sb.append("Custo: ").append(this.getCusto()).append("\n");
        sb.append("Quantidade: ").append(this.getQuantidade()).append("\n");
        sb.append("Descricao: ").append(this.getDescricao()).append("\n");
        return sb.toString();
    }
}
