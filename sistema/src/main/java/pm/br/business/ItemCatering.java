package pm.br.business;

public class ItemCatering extends ItemServico {
    private String tipoAlimento;
    private float precoPorPessoa;

    public ItemCatering(String tipo, float custo, int quantidade, String descricao, String tipoAlimento,
            float precoPorPessoa) {
        super(tipo, custo, quantidade, descricao);
        this.tipoAlimento = tipoAlimento;
        this.precoPorPessoa = precoPorPessoa;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public float getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(float precoPorPessoa) {
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public float calcularCustoTotal() {
        return precoPorPessoa * getQuantidade();
    }

}
