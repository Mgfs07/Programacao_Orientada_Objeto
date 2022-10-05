package guerreiros.egipcios.tipos;

import guerreiros.egipcios.Egipcios;

public class Anubita extends Egipcios {
    public Anubita(String nome, Integer idade, Double peso) {
        super(nome, idade, peso);
    }

    /*
    Anubita: possui ataque de 15 pontos de energia, mas ataca 2 vezes. Ataca o primeiro
    guerreiro e depois salta para o final da fila e ataca o último guerreiro da fila adversária.
     */
}
