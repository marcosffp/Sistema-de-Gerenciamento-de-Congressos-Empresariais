package pm.br.business;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends PessoaJuridica {

  private String tipoServico;
  private List<PacoteServico> pacotesServico;
  private String endereco;

  public Fornecedor(String nome, String cnpj, String tipoServico, String endereco) {
    super(nome, cnpj);
    this.tipoServico = tipoServico;
    this.endereco = endereco;
    pacotesServico = new ArrayList<>();
  }

  @Override
  public String getTipoServico() {
    return tipoServico;
  }

  public void setTipoServico(String tipoServico) {
    this.tipoServico = tipoServico;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void adicionarPacoteServico(PacoteServico pacote) {
    pacotesServico.add(pacote);
  }

  public void removerPacoteServico(PacoteServico pacote) {
    pacotesServico.remove(pacote);
  }

  public List<PacoteServico> listarPacotesServico() {
    return pacotesServico;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append("Tipo de Servico: ").append(this.getTipoServico()).append("\n");
    sb.append("Endereço: ").append(this.getEndereco()).append("\n");
    sb.append("Pacotes de Serviço: \n");
    for (PacoteServico pacote : pacotesServico) {
      sb.append(pacote.toString()).append("\n");
    }
    return sb.toString();
  }
}
