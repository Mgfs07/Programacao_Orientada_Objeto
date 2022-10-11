package guerreiros.atlantes.tipos;

import guerreiros.Guerreiro;
import guerreiros.atlantes.Atlantes;

import java.util.List;

public class Argus extends Atlantes {

    public Argus(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        enviarGuerreiroFinalFila(ladoAliado, ladoAliado.get(0));
        removerDaFila(ladoAdversario, PRIMEIRA_POSICAO);
    }

    @Override
    public void setEnergia(Integer energia) {
        super.setEnergia(60);
    }


    /*
    Argus: guerreiro atlante monstruoso, ele ataca com uma bolha de ácido que mata o inimigo
    imediatamente independente da energia do inimigo. Argus também é frágil e sua energia
    começa em 60 pontos.
     */
}
