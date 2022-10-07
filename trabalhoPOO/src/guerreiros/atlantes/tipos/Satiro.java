package guerreiros.atlantes.tipos;

import guerreiros.Guerreiro;
import guerreiros.atlantes.Atlantes;

import java.util.List;

public class Satiro extends Atlantes {
    public Satiro(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        super.ataque(ladoAliado, ladoAdversario);
        ladoAdversario.forEach(u -> setEnergia(u.getEnergia() - 5));
    }

    @Override
    public void setDano(Integer dano) {
        super.setDano(5);
    }

    /*
    Sátiro: são guerreiros que utilizam lanças para atacar a distância. Quando atacam tiram
    apenas 5 pontos de energia, entretanto acertam todos os guerreiros da fila adversária.
     */
}
