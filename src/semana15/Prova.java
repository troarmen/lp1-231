package semana15;

import java.util.ArrayList;
import java.util.List;

public class Prova {
    private List<Questao> questoes;
    private int pontuacaoMaxima;

    public Prova() {
        questoes = new ArrayList<>();
        pontuacaoMaxima = 0;
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
        pontuacaoMaxima++;
    }

    public int getPontuacaoMaxima() {
        return pontuacaoMaxima;
    }

    public int corrigirProva(List<Questao> respostas) {
        int pontuacao = 0;
        for (Questao questao : respostas) {
            if (questoes.contains(questao)) {
                pontuacao++;
            }
        }
        return pontuacao;
    }
}
