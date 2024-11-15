package pm.br.business;

import java.util.Date;

public class PessoaFisica extends Pessoa {
  private String cpf;
  private Date dataNascimento;
  private Papel papel;

  public PessoaFisica(String nome, String endereco, String contato, String cpf, Date dataNascimento, Papel papel) {
    super(nome, contato, endereco);
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
    this.papel = papel;
  }

  public Papel getPapel() {
    return papel;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public void setPapel(Papel papel) {
    this.papel = papel;
  }

  @Override
  public String toString() {
    return "PessoaFisica{" +
        "nome='" + nome + '\'' +
        ", contato='" + contato + '\'' +
        ", endereco='" + endereco + '\'' +
        ", cpf='" + cpf + '\'' +
        ", dataNascimento=" + dataNascimento +
        ", papel=" + papel +
        '}';
  }
}
