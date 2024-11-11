package pm.br.business;

import java.time.LocalDate;

public class Atribuicao {

    private LocalDate dataAtribuicao;
    private int cargaHoraria;
    private Profissional profissional;
    private Atividade atividade;

    public Atribuicao(LocalDate dataAtribuicao, int cargaHoraria, Profissional profissional, Atividade atividade) {
        this.dataAtribuicao = dataAtribuicao;
        this.cargaHoraria = cargaHoraria;
        this.profissional = profissional;
        this.atividade = atividade;
    }

    public LocalDate getDataAtribuicao() {
        return dataAtribuicao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public Atividade getAtividade() {
        return atividade;
    }

}
