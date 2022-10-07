package guerreiros.nordicos;

import guerreiros.Guerreiro;

import java.util.List;

public abstract class Nordicos extends Guerreiro {

    protected Nordicos(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        System.out.println("Um Nórdico esta atacando");
    }
}
