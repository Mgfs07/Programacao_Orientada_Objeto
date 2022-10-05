package guerreiros.egipcios.tipos;

import guerreiros.egipcios.Egipcios;

public class Mumia extends Egipcios {
    public Mumia(String nome, Integer idade, Double peso) {
        super(nome, idade, peso);
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
