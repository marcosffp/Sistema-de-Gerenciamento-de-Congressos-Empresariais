package pm.br.business;

public class ItemCatering extends ItemServico {
    private String tipoAlimento;
    private Double precoPorPessoa;

    public ItemCatering(String tipo, int quantidade, String descricao, String tipoAlimento,
            Double precoPorPessoa) {
        super(tipo, quantidade, descricao);
        this.setTipoAlimento(tipoAlimento);
        this.setPrecoPorPessoa(precoPorPessoa);
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    @Override
    public Double getCusto() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(Double precoPorPessoa) {
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public Double calcularCustoTotal() {
        return precoPorPessoa * getQuantidade();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tipo de Alimento: ").append(this.getTipoAlimento()).append("\n");
        sb.append("Preco por Pessoa: ").append(this.getCusto()).append("\n");
        return sb.toString();
    } 

}
