package pm.br.business;

public class ItemAudiovisual extends ItemServico {
    private String equipamento;

    public ItemAudiovisual(String tipo, float custo, int quantidade, String descricao, String equipamento) {
        super(tipo, custo, quantidade, descricao);
        this.equipamento = equipamento;
    }

    public String getEquipamento() {
        return equipamento;
    }

}
