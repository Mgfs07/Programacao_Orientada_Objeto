package guerreiros.atlantes;

import guerreiros.Guerreiro;

import java.util.List;

public abstract class Atlantes extends Guerreiro {


    protected Atlantes(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        System.out.println("Um Atlante esta atacando");
    }
}
