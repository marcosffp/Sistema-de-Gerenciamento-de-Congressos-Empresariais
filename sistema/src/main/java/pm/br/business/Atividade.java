package pm.br.business;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Atividade {
    private String tipo;
    private String data;
    private String local;
    private int qtdParticipantes;
    private List<Profissional> profissionais = new ArrayList<>();

    public Atividade(String tipo, String data, String local, int qtdParticipantes) {
        this.tipo = tipo;
        this.data = data;
        this.local = local;
        this.qtdParticipantes = qtdParticipantes;
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getQtdParticipantes() {
        return qtdParticipantes;
    }

    public void adicionarProfissional(Profissional profissional) {
        profissionais.add(profissional);
    }

    public List<Profissional> filtrarProfissionaisPorPapel(String papel) {
        List<Profissional> filtrados = new ArrayList<>();
        for (Profissional p : profissionais) {
            if (p.getPapel().equalsIgnoreCase(papel)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public List<Profissional> listaProfissionals() {
        return profissionais;
    }

    // Não lembro se o Hugo ensinou assim, mas vi um vídeo no youtube que ordena
    // desse jeito.
    public List<Profissional> ordenarProfissionaisPorAlocacaoTempo() {
        Comparator<Profissional> profissionalOrdenado = Comparator.comparing(Profissional::getAlocacaoTempo);
        profissionais.sort(profissionalOrdenado);
        return profissionais;
    }

    public List<Profissional> ordenarProfissionaisPorPapel() {
        Comparator<Profissional> profissionalOrdenado = Comparator.comparing(Profissional::getPapel);
        profissionais.sort(profissionalOrdenado);
        return profissionais;
    }

}