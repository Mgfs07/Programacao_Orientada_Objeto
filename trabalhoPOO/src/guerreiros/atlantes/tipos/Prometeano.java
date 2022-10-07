package guerreiros.atlantes.tipos;

import guerreiros.Guerreiro;
import guerreiros.atlantes.Atlantes;

import java.util.List;

public class Prometeano extends Atlantes {
    public Prometeano(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {

    }

    @Override
    public void setDano(Integer dano) {
        super.setDano(10);
    }

    /*
    Prometeano: são guerreiros de barro que se dividem em 2 quando morrem (cada um com
    50% da energia original do prometeano e ambos colocados no final da fila do prometeano
    original). Quando um prometeano chega a 1 ponto de energia, quando morre ele
    efetivamente é eliminado. O ataque de um prometeano é de 10 unidades de energia. Peso e
    idade passam do prometado morto para seus descendentes
     */
}
