package guerreiros.egipcios.tipos;

import guerreiros.Guerreiro;
import guerreiros.egipcios.Egipcios;

import java.util.List;

public class Mumia extends Egipcios {
    public Mumia(String nome, Integer idade, Integer peso) {
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
        if (lista.get(posicao).getEnergia() <= 0) {
            removerDaFila(lista, posicao);
        }else{
            enviarGuerreiroFinalFila(lista, lista.get(PRIMEIRA_POSICAO));
        }
    }

    private void criarMortoVivo(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        int indice = 0;
        MortoVivo mortoVivo = new MortoVivo()
    }

    /*
    Múmia: são antigos faraós mortos. Possuem ataque de 50 pontos de energia. Quando mata
    um adversário gera um morto vivo e acrescenta em sua fila. Esse morto vivo possui ataque
    de 5 pontos de energia e começa com 100 pontos de energia (assim como a maioria dos
    guerreiros). Quando uma Múmia morre ela invoca 4 Anubitas para vinga-la (sendo
    colocadas no final da fila de seus aliados). O morto-vivo “nasce” com o nome, idade e peso
    do guerreiro adversário morto. Já os Anubitas vingadores “nascem” com o nome da múmia
    morta, idade = 0 e peso = 60.
    */
}
