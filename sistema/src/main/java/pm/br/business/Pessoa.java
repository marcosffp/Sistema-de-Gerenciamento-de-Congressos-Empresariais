package pm.br.business;

public abstract class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.getNome());
        return sb.toString();
    }

}
