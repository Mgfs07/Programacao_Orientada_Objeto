package guerreiros.grego.tipos;

import guerreiros.Guerreiro;
import guerreiros.grego.Grego;

import java.util.List;

public class Hidra extends Grego {
    public Hidra(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void setDano(Integer dano) {
        super.setDano(50);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        super.ataque(ladoAliado, ladoAdversario);
    }

    @Override
    public void morte(List<Guerreiro> lista, Integer posicao) {
        if (lista.get(PRIMEIRA_POSICAO).getEnergia() <= 0) {
            removerDaFila(lista, posicao);
            this.setDano(getDano() + 10);
            recuperacao();
        }else{
            enviarGuerreiroFinalFila(lista, lista.get(PRIMEIRA_POSICAO));
        }
    }

    private void recuperacao(){
        if(getEnergia() < 100){
            setEnergia(getEnergia()+ 10);
        }
    }

    /*
    Hidra: parece um dinossauro aquático, ganha uma cabeça para cada inimigo que mata. Seu
    ataque inicial é de 50 pontos de energia, mas ganha mais 10 pontos de ataque para cada
    cabeça nova gerada, além de mais 10 pontos de recuperação de energia para si mesmo (se a
    hidra não tiver sido atacada ainda, ou seja, tiver os 100 pontos de energia, nada acontece).
     */
}
