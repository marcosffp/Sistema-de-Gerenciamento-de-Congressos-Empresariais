package pm.br.business;

import java.time.LocalDate;

public class Atribuicao {

    private LocalDate dataAtribuicao;
    private int cargaHoraria;
    private PessoaFisica profissional;
    private Atividade atividade;

    public Atribuicao(LocalDate dataAtribuicao, int cargaHoraria, PessoaFisica profissional, Atividade atividade) {
        this.setDataAtribuicao(dataAtribuicao);
        this.setCargaHoraria(cargaHoraria);
        this.setProfissional(profissional);
        this.setAtividade(atividade);
    }

    public LocalDate getDataAtribuicao() {
        return dataAtribuicao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public PessoaFisica getProfissional() {
        return profissional;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setDataAtribuicao(LocalDate dataAtribuicao) {
        this.dataAtribuicao = dataAtribuicao;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setProfissional(PessoaFisica profissional) {
        this.profissional = profissional;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data de atribuicao: ").append(this.getDataAtribuicao()).append("\n");
        sb.append("Carga horaria: ").append(this.getCargaHoraria()).append("\n");
        sb.append("Profissional: ").append(this.getProfissional().getNome()).append("\n");
        sb.append("Atividade: ").append(this.getAtividade().getTipo()).append("\n");
        return sb.toString();
    }



}
