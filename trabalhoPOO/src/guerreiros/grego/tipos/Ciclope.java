package guerreiros.grego.tipos;

import guerreiros.Guerreiro;
import guerreiros.grego.Grego;

import java.util.List;

public class Ciclope extends Grego {
    public Ciclope(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void setDano(Integer dano) {
        super.setDano(40);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        tirarEnergiaAdversario(ladoAdversario, PRIMEIRA_POSICAO);
    }

    /*
    Ciclope: um gigante de um olho só. Promove um ataque que retira 40 pontos de energia e
    depois “joga” o adversário para o final de sua fila (na prática se for o primeiro a atacar não
    vai permitir que o adversário ataque, se for o segundo, esse efeito não terá qualquer impacto
    no que refere a dano ao adversário).
     */
}
