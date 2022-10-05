package guerreiros.atlantes.tipos;

import guerreiros.atlantes.Atlantes;

public class Prometeano extends Atlantes {
    public Prometeano(String nome, Integer idade, Double peso) {
        super(nome, idade, peso);
    }

    /*
    Prometeano: são guerreiros de barro que se dividem em 2 quando morrem (cada um com
    50% da energia original do prometeano e ambos colocados no final da fila do prometeano
    original). Quando um prometeano chega a 1 ponto de energia, quando morre ele
    efetivamente é eliminado. O ataque de um prometeano é de 10 unidades de energia. Peso e
    idade passam do prometado morto para seus descendentes
     */
}
