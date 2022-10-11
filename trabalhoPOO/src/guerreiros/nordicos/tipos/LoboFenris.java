package guerreiros.nordicos.tipos;

import guerreiros.Guerreiro;
import guerreiros.nordicos.Nordicos;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LoboFenris extends Nordicos {
    public LoboFenris(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {

    }

    @Override
    public void setDano(Integer dano) {
        super.setDano(40);
    }

    private void verificarLobos(List<Guerreiro> listaGuerreiros){
        AtomicInteger countador = new AtomicInteger();
        String primeiroElemento = "LoboFenris";
        listaGuerreiros.forEach(g -> {
            if(g.getClass().getName().equals(primeiroElemento)){
                countador.getAndIncrement();
            }
        });

    }

    /*
    Lobo de Fenris: são lobos gigantes ferozes. Seu ataque é de 40 pontos de energia. Entretanto
    seu ataque aumenta em 20% para cada Lobo de Fenris que estiver atrás dele. Ou seja, se
    houverem 2 lobos na sequência na fila, o Lobo atual ganha mais 16 pontos de ataque (8 para
    cada lobo) totalizando 56 pontos de ataque.
     */
}
