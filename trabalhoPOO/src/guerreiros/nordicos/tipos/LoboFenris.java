package guerreiros.nordicos.tipos;

import guerreiros.nordicos.Nordicos;

public class LoboFenris extends Nordicos {
    public LoboFenris(String nome, Integer idade, Double peso) {
        super(nome, idade, peso);
    }

    /*
    Lobo de Fenris: são lobos gigantes ferozes. Seu ataque é de 40 pontos de energia. Entretanto
    seu ataque aumenta em 20% para cada Lobo de Fenris que estiver atrás dele. Ou seja, se
    houverem 2 lobos na sequência na fila, o Lobo atual ganha mais 16 pontos de ataque (8 para
    cada lobo) totalizando 56 pontos de ataque.
     */
}
