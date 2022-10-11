package guerreiros.egipcios.tipos;

import guerreiros.Guerreiro;
import guerreiros.egipcios.Egipcios;

import java.util.List;

public class Anubita extends Egipcios {
    public Anubita(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void setDano(Integer dano) {
        super.setDano(15);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        tirarEnergiaAdversario(ladoAdversario, PRIMEIRA_POSICAO);
        enviarGuerreiroFinalFila(ladoAliado, ladoAdversario.get(PRIMEIRA_POSICAO));
        tirarEnergiaAdversario(ladoAdversario, ultimoLista(ladoAdversario));
        tirarEnergiaAdversario(ladoAliado, PRIMEIRA_POSICAO);
        enviarGuerreiroFinalFila(ladoAdversario, ladoAdversario.get(PRIMEIRA_POSICAO));
    }


    /*
    Anubita: possui ataque de 15 pontos de energia, mas ataca 2 vezes. Ataca o primeiro
    guerreiro e depois salta para o final da fila e ataca o último guerreiro da fila adversária.
     */
}
