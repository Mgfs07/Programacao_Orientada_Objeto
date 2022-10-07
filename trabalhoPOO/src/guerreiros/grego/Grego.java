package guerreiros.grego;

import guerreiros.Guerreiro;

import java.util.List;

public abstract class Grego extends Guerreiro {
    protected Grego(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        System.out.println("Um Grego esta atacando");
    }

    /*
   Ciclope: um gigante de um olho só. Promove um ataque que retira 40 pontos de energia e
    depois “joga” o adversário para o final de sua fila (na prática se for o primeiro a atacar não
    vai permitir que o adversário ataque, se for o segundo, esse efeito não terá qualquer impacto
    no que refere a dano ao adversário).
    */
}
