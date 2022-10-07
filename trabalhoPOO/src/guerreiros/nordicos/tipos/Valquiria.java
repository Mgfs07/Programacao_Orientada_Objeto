package guerreiros.nordicos.tipos;

import guerreiros.Guerreiro;
import guerreiros.nordicos.Nordicos;

import java.util.List;

public class Valquiria extends Nordicos {
    public Valquiria(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado ,List<Guerreiro> ladoAdversario) {
        ladoAdversario.get(0).setEnergia(getEnergia() - 20);
        ladoAliado.get(1).setEnergia(getEnergia() + 20);
    }



    /*
    Valquíria: é uma espécie de amazona montada num cavalo branco. Possuem poder de cura e
    seu ataque retira 20 pontos de energia. Após atacar, o aliado que estiver após ela, na fila,
    recupera 20 pontos de energia.
     */
}
