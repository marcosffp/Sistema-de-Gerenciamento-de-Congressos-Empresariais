package pm.br.business;

public class ItemAudiovisual extends ItemServico {
    private String equipamento;
    private Double precoUnitario;

    public ItemAudiovisual(String tipo, int quantidade, String descricao, String equipamento, Double precoUnitario) {
        super(tipo, quantidade, descricao);
        this.setEquipamento(equipamento);
        this.setPrecoUnitario(precoUnitario);
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    @Override
    public Double getCusto() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Equipamento: ").append(this.getEquipamento()).append("\n");
        sb.append("Preco Unitario: ").append(this.getCusto()).append("\n");
        return sb.toString();
    }
    
    @Override
    public Double calcularCustoTotal(){
        return this.getCusto() * this.getQuantidade();
    }

}
