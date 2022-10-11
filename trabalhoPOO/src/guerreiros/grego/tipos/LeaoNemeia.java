package guerreiros.grego.tipos;

import guerreiros.Guerreiro;
import guerreiros.grego.Grego;

import java.util.List;

public class LeaoNemeia extends Grego {
    public LeaoNemeia(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void setDano(Integer dano) {
        super.setDano(30);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        tirarEnergiaAdversario(ladoAdversario, PRIMEIRA_POSICAO);
        setDano(15);
        tirarEnergiaAdversario(ladoAdversario, SEGUNDA_POSICAO);
        setDano(5);
        tirarEnergiaAdversario(ladoAdversario, TERCEIRA_POSICAO);
        setDano(30);
    }


    /*
    Leão da Nemeia: um leão muito forte e com rugido poderoso. Seu ataque é um grande
rugido que não afeta apenas o adversário sendo atacado, mas também seu sucessor e quem
sucedê-lo. Esse rugido afeta em 30 pontos de energia o adversário atacado, em 15 quem
estiver atrás dele na fila e em 5 quem estiver na terceira posição.
     */
}
