package pm.br.business;

public class Fornecedor extends Pessoa {

    private String tipoServico;

    public Fornecedor(String nome, String tipoServico) {
        super(nome);
       this.setTipoServico(tipoServico);
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Tipo de Servico: ").append(this.getTipoServico()).append("\n");
        return sb.toString();
    }
}
