package guerreiros.grego.tipos;

import guerreiros.grego.Grego;

public class Hidra extends Grego {
    public Hidra(String nome, Integer idade, Double peso) {
        super(nome, idade, peso);
    }

    /*
    Hidra: parece um dinossauro aquático, ganha uma cabeça para cada inimigo que mata. Seu
    ataque inicial é de 50 pontos de energia, mas ganha mais 10 pontos de ataque para cada
    cabeça nova gerada, além de mais 10 pontos de recuperação de energia para si mesmo (se a
    hidra não tiver sido atacada ainda, ou seja, tiver os 100 pontos de energia, nada acontece).
     */
}
